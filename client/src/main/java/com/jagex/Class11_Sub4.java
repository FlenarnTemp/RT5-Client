package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!da")
public abstract class Class11_Sub4 extends BaseEntity {

	@OriginalMember(owner = "com.jagex.client!da", name = "g", descriptor = "I")
	public int anInt3965;

	@OriginalMember(owner = "com.jagex.client!da", name = "h", descriptor = "Z")
	public boolean aBoolean259;

	@OriginalMember(owner = "com.jagex.client!da", name = "j", descriptor = "I")
	public int anInt3967;

	@OriginalMember(owner = "com.jagex.client!da", name = "k", descriptor = "I")
	public int anInt3968;

	@OriginalMember(owner = "com.jagex.client!da", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "com.jagex.client!da", name = "e", descriptor = "(I)V")
	@Override
	public final void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "com.jagex.client!da", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public final void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Renderer arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5) {
		throw new IllegalStateException();
	}
}
