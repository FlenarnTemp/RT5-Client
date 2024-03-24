package com.jagex.core.datastruct;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!vg")
public final class IntWrapper extends Node {

	@OriginalMember(owner = "com.jagex.client!vg", name = "x", descriptor = "I")
	public final int value;

	@OriginalMember(owner = "com.jagex.client!vg", name = "<init>", descriptor = "(I)V")
	public IntWrapper(@OriginalArg(0) int value) {
		this.value = value;
	}
}
