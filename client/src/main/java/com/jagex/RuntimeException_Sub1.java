package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!hk")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "com.jagex.client!hk", name = "a", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "com.jagex.client!hk", name = "c", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "com.jagex.client!hk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString23 = arg1;
		this.aThrowable1 = arg0;
	}
}
