package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "com.jagex.client!fl", name = "a", descriptor = "[Lclient!ns;")
	public static Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array1;

	@OriginalMember(owner = "com.jagex.client!fl", name = "f", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_10 = new LruHashTable(32);

	@OriginalMember(owner = "com.jagex.client!fl", name = "a", descriptor = "(II)I")
	public static int method2104(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "com.jagex.client!fl", name = "c", descriptor = "(B)V")
	public static void method2107() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static357.aBooleanArray59[local11] = true;
		}
	}
}
