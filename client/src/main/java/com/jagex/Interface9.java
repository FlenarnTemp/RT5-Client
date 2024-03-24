package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!o")
public interface Interface9 {

	@OriginalMember(owner = "com.jagex.client!o", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	String method2360(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}
