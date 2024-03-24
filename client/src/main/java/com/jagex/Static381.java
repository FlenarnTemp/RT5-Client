package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static381 {

	@OriginalMember(owner = "com.jagex.client!wd", name = "m", descriptor = "I")
	public static int anInt7117 = 0;

	@OriginalMember(owner = "com.jagex.client!wd", name = "a", descriptor = "(II)I")
	public static int method6348(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
