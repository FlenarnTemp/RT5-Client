package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!jf")
public final class Class114 {

	@OriginalMember(owner = "com.jagex.client!jf", name = "b", descriptor = "I")
	public int anInt2915;

	@OriginalMember(owner = "com.jagex.client!jf", name = "c", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "com.jagex.client!jf", name = "d", descriptor = "Lclient!jf;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "com.jagex.client!jf", name = "h", descriptor = "I")
	public int anInt2919;

	@OriginalMember(owner = "com.jagex.client!jf", name = "j", descriptor = "I")
	public int anInt2921;

	@OriginalMember(owner = "com.jagex.client!jf", name = "k", descriptor = "I")
	public int anInt2922;

	@OriginalMember(owner = "com.jagex.client!jf", name = "m", descriptor = "I")
	public int anInt2924;

	@OriginalMember(owner = "com.jagex.client!jf", name = "n", descriptor = "I")
	public int anInt2925;

	@OriginalMember(owner = "com.jagex.client!jf", name = "s", descriptor = "I")
	public int anInt2928;

	@OriginalMember(owner = "com.jagex.client!jf", name = "t", descriptor = "I")
	public int anInt2929;

	@OriginalMember(owner = "com.jagex.client!jf", name = "i", descriptor = "I")
	public final int anInt2920;

	@OriginalMember(owner = "com.jagex.client!jf", name = "a", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "com.jagex.client!jf", name = "g", descriptor = "I")
	public final int anInt2918;

	@OriginalMember(owner = "com.jagex.client!jf", name = "o", descriptor = "I")
	public final int anInt2926;

	@OriginalMember(owner = "com.jagex.client!jf", name = "u", descriptor = "I")
	public final int anInt2930;

	@OriginalMember(owner = "com.jagex.client!jf", name = "<init>", descriptor = "(IIIIB)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2920 = arg3;
		this.aByte26 = arg4;
		this.anInt2918 = arg1;
		this.anInt2926 = arg2;
		this.anInt2930 = arg0;
	}

	@OriginalMember(owner = "com.jagex.client!jf", name = "<init>", descriptor = "(Lclient!jf;I)V")
	public Class114(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1) {
		this.aClass114_1 = arg0;
		this.anInt2920 = arg1 + this.aClass114_1.anInt2920;
		this.aByte26 = this.aClass114_1.aByte26;
		this.anInt2926 = arg1 + this.aClass114_1.anInt2926;
		this.anInt2930 = this.aClass114_1.anInt2930;
		this.anInt2918 = this.aClass114_1.anInt2918 + arg1;
	}
}
