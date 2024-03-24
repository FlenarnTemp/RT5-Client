package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ha")
public final class Class2_Sub16 extends Node {

	@OriginalMember(owner = "com.jagex.client!ha", name = "v", descriptor = "I")
	public volatile int anInt2419 = -1;

	@OriginalMember(owner = "com.jagex.client!ha", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "com.jagex.client!ha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub16(@OriginalArg(0) String arg0) {
		this.aString22 = arg0;
	}
}
