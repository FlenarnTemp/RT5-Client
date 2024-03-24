package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!pj")
public final class Class2_Sub28 extends Node {

	@OriginalMember(owner = "com.jagex.client!pj", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "com.jagex.client!pj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub28(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString54 = arg0;
	}
}
