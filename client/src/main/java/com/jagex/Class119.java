package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!lh")
public abstract class Class119 {

	@OriginalMember(owner = "com.jagex.client!lh", name = "<init>", descriptor = "()V")
	protected Class119() {
	}

	@OriginalMember(owner = "com.jagex.client!lh", name = "a", descriptor = "(I)Z")
	protected abstract boolean method3303();

	@OriginalMember(owner = "com.jagex.client!lh", name = "a", descriptor = "(B)I")
	public abstract int method3304();

	@OriginalMember(owner = "com.jagex.client!lh", name = "b", descriptor = "(B)Z")
	public final boolean method3305() {
		return this.method3311() || this.method3309() || this.method3303();
	}

	@OriginalMember(owner = "com.jagex.client!lh", name = "c", descriptor = "(I)V")
	public abstract void mainLogic();

	@OriginalMember(owner = "com.jagex.client!lh", name = "d", descriptor = "(I)Lclient!lm;")
	public abstract MouseRecorder method3308();

	@OriginalMember(owner = "com.jagex.client!lh", name = "c", descriptor = "(B)Z")
	protected abstract boolean method3309();

	@OriginalMember(owner = "com.jagex.client!lh", name = "f", descriptor = "(I)Z")
	public abstract boolean method3311();

	@OriginalMember(owner = "com.jagex.client!lh", name = "g", descriptor = "(I)V")
	public abstract void method3312();

	@OriginalMember(owner = "com.jagex.client!lh", name = "h", descriptor = "(I)I")
	public abstract int method3313();
}
