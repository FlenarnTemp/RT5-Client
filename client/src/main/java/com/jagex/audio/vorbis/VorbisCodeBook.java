package com.jagex.audio.vorbis;

import com.jagex.Static267;
import com.jagex.Static287;
import com.jagex.Static403;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!p")
public final class VorbisCodeBook {

	@OriginalMember(owner = "com.jagex.client!p", name = "f", descriptor = "[I")
	private int[] entryTree;

	@OriginalMember(owner = "com.jagex.client!p", name = "b", descriptor = "I")
	public final int dimensions;

	@OriginalMember(owner = "com.jagex.client!p", name = "d", descriptor = "I")
	private final int entries;

	@OriginalMember(owner = "com.jagex.client!p", name = "e", descriptor = "[I")
	private final int[] lengthlist;

	@OriginalMember(owner = "com.jagex.client!p", name = "a", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "com.jagex.client!p", name = "c", descriptor = "[[F")
	private float[][] valueVector;

	@OriginalMember(owner = "com.jagex.client!p", name = "<init>", descriptor = "()V")
	public VorbisCodeBook() {
		Static267.read(24);
		this.dimensions = Static267.read(16);
		this.entries = Static267.read(24);
		this.lengthlist = new int[this.entries];
		@Pc(23) boolean local23 = Static267.readBit() != 0;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (local23) {
			local27 = 0;
			local32 = Static267.read(5) + 1;
			while (local27 < this.entries) {
				@Pc(41) int local41 = Static267.read(Static287.ilog(this.entries - local27));
				for (local43 = 0; local43 < local41; local43++) {
					this.lengthlist[local27++] = local32;
				}
				local32++;
			}
		} else {
			@Pc(66) boolean local66 = Static267.readBit() != 0;
			for (local32 = 0; local32 < this.entries; local32++) {
				if (local66 && Static267.readBit() == 0) {
					this.lengthlist[local32] = 0;
				} else {
					this.lengthlist[local32] = Static267.read(5) + 1;
				}
			}
		}

		this.makeWords();

		local27 = Static267.read(4);

		if (local27 > 0) {
			@Pc(103) float local103 = Static267.float32Unpack(Static267.read(32));
			@Pc(107) float local107 = Static267.float32Unpack(Static267.read(32));
			local43 = Static267.read(4) + 1;
			@Pc(118) boolean local118 = Static267.readBit() != 0;
			@Pc(127) int local127;
			if (local27 == 1) {
				local127 = Static403.method4441(this.entries, this.dimensions);
			} else {
				local127 = this.entries * this.dimensions;
			}
			this.anIntArray328 = new int[local127];
			for (@Pc(140) int local140 = 0; local140 < local127; local140++) {
				this.anIntArray328[local140] = Static267.read(local43);
			}
			this.valueVector = new float[this.entries][this.dimensions];
			@Pc(163) int local163;
			@Pc(166) float local166;
			@Pc(168) int local168;
			@Pc(170) int local170;
			if (local27 == 1) {
				for (local163 = 0; local163 < this.entries; local163++) {
					local166 = 0.0F;
					local168 = 1;
					for (local170 = 0; local170 < this.dimensions; local170++) {
						@Pc(177) int local177 = local163 / local168 % local127;
						@Pc(189) float local189 = (float) this.anIntArray328[local177] * local107 + local103 + local166;
						this.valueVector[local163][local170] = local189;
						if (local118) {
							local166 = local189;
						}
						local168 *= local127;
					}
				}
				return;
			}
			for (local163 = 0; local163 < this.entries; local163++) {
				local166 = 0.0F;
				local168 = local163 * this.dimensions;
				for (local170 = 0; local170 < this.dimensions; local170++) {
					@Pc(240) float local240 = (float) this.anIntArray328[local168] * local107 + local103 + local166;
					this.valueVector[local163][local170] = local240;
					if (local118) {
						local166 = local240;
					}
					local168++;
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!p", name = "a", descriptor = "()[F")
	public float[] decodeVq() {
		return this.valueVector[this.decodeScalar()];
	}

	@OriginalMember(owner = "com.jagex.client!p", name = "b", descriptor = "()I")
	public int decodeScalar() {
		@Pc(1) int index;
		for (index = 0; this.entryTree[index] >= 0; index = Static267.readBit() == 0 ? index + 1 : this.entryTree[index]) {
		}
		return ~this.entryTree[index];
	}

	@OriginalMember(owner = "com.jagex.client!p", name = "c", descriptor = "()V")
	private void makeWords() {
		@Pc(3) int[] r = new int[this.entries];
		@Pc(6) int[] marker = new int[33];

		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(40) int local40;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(63) int local63;
		for (@Pc(8) int i = 0; i < this.entries; i++) {
			int length = this.lengthlist[i];
			if (length != 0) {
				local22 = 0x1 << 32 - length;
				int entry = marker[length];
				r[i] = entry;

				if ((entry & local22) == 0) {
					local40 = entry | local22;
					for (local49 = length - 1; local49 >= 1; local49--) {
						local54 = marker[local49];
						if (local54 != entry) {
							break;
						}
						local63 = 0x1 << 32 - local49;
						if ((local54 & local63) != 0) {
							marker[local49] = marker[local49 - 1];
							break;
						}
						marker[local49] = local54 | local63;
					}
				} else {
					local40 = marker[length - 1];
				}
				marker[length] = local40;
				for (int j = length + 1; j <= 32; j++) {
					local54 = marker[j];
					if (local54 == entry) {
						marker[j] = local40;
					}
				}
			}
		}

		/*
		 * Bit-reverse the words
		 */
		this.entryTree = new int[8];

		local14 = 0;
		for (int i = 0; i < this.entries; i++) {
			int length = this.lengthlist[i];
			if (length != 0) {
				local40 = r[i];
				local49 = 0;

				for (int j = 0; j < length; j++) {
					local63 = Integer.MIN_VALUE >>> j;
					if ((local40 & local63) == 0) {
						local49++;
					} else {
						if (this.entryTree[local49] == 0) {
							this.entryTree[local49] = local14;
						}
						local49 = this.entryTree[local49];
					}
					if (local49 >= this.entryTree.length) {
						@Pc(178) int[] local178 = new int[this.entryTree.length * 2];
						for (@Pc(180) int k = 0; k < this.entryTree.length; k++) {
							local178[k] = this.entryTree[k];
						}
						this.entryTree = local178;
					}
				}
				this.entryTree[local49] = ~i;
				if (local49 >= local14) {
					local14 = local49 + 1;
				}
			}
		}
	}
}
