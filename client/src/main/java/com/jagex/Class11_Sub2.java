package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!el")
public abstract class Class11_Sub2 extends BaseEntity {

	@OriginalMember(owner = "com.jagex.client!el", name = "g", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "com.jagex.client!el", name = "k", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "com.jagex.client!el", name = "m", descriptor = "I")
	protected int anInt3710;

	@OriginalMember(owner = "com.jagex.client!el", name = "f", descriptor = "I")
	protected final int anInt3706;

	@OriginalMember(owner = "com.jagex.client!el", name = "i", descriptor = "I")
	protected int anInt3708;

	@OriginalMember(owner = "com.jagex.client!el", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean238 = arg4;
		this.anInt3710 = arg0;
		this.aBoolean239 = arg3;
		this.anInt3706 = arg1;
		this.anInt3708 = arg2;
	}
}
