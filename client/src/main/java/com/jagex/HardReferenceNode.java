package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!pn")
public final class HardReferenceNode extends ReferenceNodeWithInterface {

	@OriginalMember(owner = "com.jagex.client!pn", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object reference;

	@OriginalMember(owner = "com.jagex.client!pn", name = "<init>", descriptor = "(Lclient!iq;Ljava/lang/Object;I)V")
	public HardReferenceNode(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.reference = arg1;
	}

	@OriginalMember(owner = "com.jagex.client!pn", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object get() {
		return this.reference;
	}

	@OriginalMember(owner = "com.jagex.client!pn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean isSoft() {
		return false;
	}
}
