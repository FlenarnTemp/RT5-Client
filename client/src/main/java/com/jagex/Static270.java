package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "com.jagex.client!pi", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "com.jagex.client!pi", name = "d", descriptor = "I")
	public static int anInt4966;

	@OriginalMember(owner = "com.jagex.client!pi", name = "b", descriptor = "I")
	public static final int anInt4964 = 1407;

	@OriginalMember(owner = "com.jagex.client!pi", name = "a", descriptor = "(BJ)V")
	public static void method4553(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}

	@OriginalMember(owner = "com.jagex.client!pi", name = "a", descriptor = "(I)Z")
	public static boolean method4555() {
		return Static268.anInt4959 > 0;
	}
}
