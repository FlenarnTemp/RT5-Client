package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!sm")
public final class Class2_Sub35 extends Node {

	@OriginalMember(owner = "com.jagex.client!sm", name = "x", descriptor = "J")
	public long aLong183;

	@OriginalMember(owner = "com.jagex.client!sm", name = "<init>", descriptor = "(J)V")
	public Class2_Sub35(@OriginalArg(0) long arg0) {
		this.aLong183 = arg0;
	}
}
