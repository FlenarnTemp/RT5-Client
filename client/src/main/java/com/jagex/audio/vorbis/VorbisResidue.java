package com.jagex.audio.vorbis;

import com.jagex.Static267;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!pt")
public final class VorbisResidue {

	@OriginalMember(owner = "com.jagex.client!pt", name = "b", descriptor = "I")
	private final int anInt5099 = Static267.read(16);

	@OriginalMember(owner = "com.jagex.client!pt", name = "c", descriptor = "I")
	private final int begin = Static267.read(24);

	@OriginalMember(owner = "com.jagex.client!pt", name = "f", descriptor = "I")
	private final int anInt5103 = Static267.read(24);

	@OriginalMember(owner = "com.jagex.client!pt", name = "d", descriptor = "I")
	private final int partitionSize = Static267.read(24) + 1;

	@OriginalMember(owner = "com.jagex.client!pt", name = "g", descriptor = "I")
	private final int classifications = Static267.read(6) + 1;

	@OriginalMember(owner = "com.jagex.client!pt", name = "e", descriptor = "I")
	private final int classBook = Static267.read(8);

	@OriginalMember(owner = "com.jagex.client!pt", name = "a", descriptor = "[I")
	private final int[] books;

	@OriginalMember(owner = "com.jagex.client!pt", name = "<init>", descriptor = "()V")
	public VorbisResidue() {
		@Pc(33) int[] cascade = new int[this.classifications];
		@Pc(38) int highBits;
		for (@Pc(35) int index = 0; index < this.classifications; index++) {
			highBits = 0;
			@Pc(41) int lowBits = Static267.read(3);
			@Pc(47) boolean flag = Static267.readBit() != 0;
			if (flag) {
				highBits = Static267.read(5);
			}
			cascade[index] = highBits << 3 | lowBits;
		}
		this.books = new int[this.classifications * 8];
		for (int index = 0; index < this.classifications * 8; index++) {
			this.books[index] = (cascade[index >> 3] & 0x1 << (index & 0x7)) == 0 ? -1 : Static267.read(8);
		}
	}

	@OriginalMember(owner = "com.jagex.client!pt", name = "a", descriptor = "([FIZ)V")
	public void synthesize(@OriginalArg(0) float[] vector, @OriginalArg(1) int arg1, @OriginalArg(2) boolean noDecode) {
		for (@Pc(1) int index = 0; index < arg1; index++) {
			vector[index] = 0.0F;
		}
		if (noDecode) {
			return;
		}
		@Pc(19) int classwordPerCodeword = Static267.codebooks[this.classBook].dimensions;
		@Pc(25) int local25 = this.anInt5103 - this.begin;
		@Pc(30) int local30 = local25 / this.partitionSize;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static267.codebooks[this.classBook].decodeScalar();
					for (local51 = classwordPerCodeword - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.classifications;
						}
						local47 /= this.classifications;
					}
				}
				for (local47 = 0; local47 < classwordPerCodeword; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.books[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.begin + local38 * this.partitionSize;
						@Pc(104) VorbisCodeBook local104 = Static267.codebooks[local90];
						@Pc(113) int local113;
						if (this.anInt5099 == 0) {
							local113 = this.partitionSize / local104.dimensions;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.decodeVq();
								for (@Pc(121) int local121 = 0; local121 < local104.dimensions; local121++) {
									vector[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.partitionSize) {
								@Pc(153) float[] local153 = local104.decodeVq();
								for (@Pc(155) int local155 = 0; local155 < local104.dimensions; local155++) {
									vector[local100 + local113] += local153[local155];
									local113++;
								}
							}
						}
					}
					local38++;
					if (local38 >= local30) {
						break;
					}
				}
			}
		}
	}
}
