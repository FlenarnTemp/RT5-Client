package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ef")
public final class Class2_Sub9 extends Node {

	@OriginalMember(owner = "com.jagex.client!ef", name = "v", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "com.jagex.client!ef", name = "<init>", descriptor = "(S)V")
	public Class2_Sub9(@OriginalArg(0) short arg0) {
		this.aShort20 = arg0;
	}
}
