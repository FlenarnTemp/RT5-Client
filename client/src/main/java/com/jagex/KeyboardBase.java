package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!nj")
public abstract class KeyboardBase {

	@OriginalMember(owner = "com.jagex.client!nj", name = "<init>", descriptor = "()V")
	protected KeyboardBase() {
	}

	@OriginalMember(owner = "com.jagex.client!nj", name = "b", descriptor = "(I)V")
	public abstract void mainLogic();

	@OriginalMember(owner = "com.jagex.client!nj", name = "c", descriptor = "(I)V")
	public abstract void method3338();

	@OriginalMember(owner = "com.jagex.client!nj", name = "a", descriptor = "(Z)Lclient!rk;")
	public abstract Class37 method3342();

	@OriginalMember(owner = "com.jagex.client!nj", name = "a", descriptor = "(BI)Z")
	public abstract boolean isPressed(@OriginalArg(1) int arg0);
}
