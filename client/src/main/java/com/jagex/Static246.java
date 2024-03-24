package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "com.jagex.client!oc", name = "c", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "com.jagex.client!oc", name = "d", descriptor = "I")
	public static int anInt4505 = 0;

	@OriginalMember(owner = "com.jagex.client!oc", name = "a", descriptor = "(ZI)Z")
	public static boolean method4251(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
