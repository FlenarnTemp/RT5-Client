package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!jp")
public final class Class118 {

	@OriginalMember(owner = "com.jagex.client!jp", name = "c", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "com.jagex.client!jp", name = "d", descriptor = "I")
	public int anInt3194;

	@OriginalMember(owner = "com.jagex.client!jp", name = "e", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "com.jagex.client!jp", name = "f", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "com.jagex.client!jp", name = "g", descriptor = "I")
	private int anInt3195;

	@OriginalMember(owner = "com.jagex.client!jp", name = "h", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "com.jagex.client!jp", name = "i", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "com.jagex.client!jp", name = "b", descriptor = "Lclient!bt;")
	private final Packet aClass2_Sub4_4 = new Packet(null);

	@OriginalMember(owner = "com.jagex.client!jp", name = "<init>", descriptor = "()V")
	public Class118() {
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "<init>", descriptor = "([B)V")
	public Class118(@OriginalArg(0) byte[] arg0) {
		this.method3203(arg0);
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "a", descriptor = "(I)V")
	public void method3192(@OriginalArg(0) int arg0) {
		this.anIntArray196[arg0] = this.aClass2_Sub4_4.pos;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "a", descriptor = "()I")
	public int method3193() {
		return this.anIntArray196.length;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "b", descriptor = "()V")
	public void method3194() {
		this.aClass2_Sub4_4.pos = -1;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "b", descriptor = "(I)V")
	public void method3195(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub4_4.gVarInt();
		this.anIntArray195[arg0] += local4;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "c", descriptor = "()Z")
	public boolean method3196() {
		@Pc(3) int local3 = this.anIntArray196.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray196[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "e", descriptor = "()I")
	public int method3198() {
		@Pc(3) int local3 = this.anIntArray196.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray196[local9] >= 0 && this.anIntArray195[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray195[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "f", descriptor = "()Z")
	public boolean method3199() {
		return this.aClass2_Sub4_4.data != null;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "c", descriptor = "(I)J")
	public long method3200(@OriginalArg(0) int arg0) {
		return this.aLong108 + (long) arg0 * (long) this.anInt3195;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "a", descriptor = "(II)I")
	private int method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static167.aByteArray32[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub4_4.g1() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub4_4.g1() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub4_4.g1();
		local12 = this.aClass2_Sub4_4.gVarInt();
		if (local7 == 47) {
			this.aClass2_Sub4_4.pos += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub4_4.g3();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray195[arg0];
			this.aLong108 += (long) local38 * (long) (this.anInt3195 - local32);
			this.anInt3195 = local32;
			this.aClass2_Sub4_4.pos += local12;
			return 2;
		} else {
			this.aClass2_Sub4_4.pos += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "d", descriptor = "(I)I")
	private int method3202(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub4_4.data[this.aClass2_Sub4_4.pos];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray197[arg0] = local13;
			this.aClass2_Sub4_4.pos++;
		} else {
			local13 = this.anIntArray197[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3201(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub4_4.gVarInt();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub4_4.data[this.aClass2_Sub4_4.pos] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub4_4.pos++;
				this.anIntArray197[arg0] = local57;
				return this.method3201(arg0, local57);
			}
		}
		this.aClass2_Sub4_4.pos += local42;
		return 0;
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "a", descriptor = "([B)V")
	public void method3203(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub4_4.data = arg0;
		this.aClass2_Sub4_4.pos = 10;
		@Pc(12) int local12 = this.aClass2_Sub4_4.g2();
		this.anInt3194 = this.aClass2_Sub4_4.g2();
		this.anInt3195 = 500000;
		this.anIntArray198 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub4_4.g4();
			@Pc(38) int local38 = this.aClass2_Sub4_4.g4();
			if (local33 == 1297379947) {
				this.anIntArray198[local27] = this.aClass2_Sub4_4.pos;
				local27++;
			}
			this.aClass2_Sub4_4.pos += local38;
		}
		this.aLong108 = 0L;
		this.anIntArray196 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray196[local33] = this.anIntArray198[local33];
		}
		this.anIntArray195 = new int[local12];
		this.anIntArray197 = new int[local12];
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "a", descriptor = "(J)V")
	public void method3204(@OriginalArg(0) long arg0) {
		this.aLong108 = arg0;
		@Pc(6) int local6 = this.anIntArray196.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray195[local8] = 0;
			this.anIntArray197[local8] = 0;
			this.aClass2_Sub4_4.pos = this.anIntArray198[local8];
			this.method3195(local8);
			this.anIntArray196[local8] = this.aClass2_Sub4_4.pos;
		}
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "e", descriptor = "(I)I")
	public int method3205(@OriginalArg(0) int arg0) {
		return this.method3202(arg0);
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "f", descriptor = "(I)V")
	public void method3206(@OriginalArg(0) int arg0) {
		this.aClass2_Sub4_4.pos = this.anIntArray196[arg0];
	}

	@OriginalMember(owner = "com.jagex.client!jp", name = "g", descriptor = "()V")
	public void method3207() {
		this.aClass2_Sub4_4.data = null;
		this.anIntArray198 = null;
		this.anIntArray196 = null;
		this.anIntArray195 = null;
		this.anIntArray197 = null;
	}
}
