package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "com.jagex.client!ut", name = "D", descriptor = "[I")
	public static final int[] anIntArray421 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "com.jagex.client!ut", name = "J", descriptor = "[I")
	public static final int[] anIntArray422 = new int[2048];

	@OriginalMember(owner = "com.jagex.client!ut", name = "c", descriptor = "(Z)V")
	public static void method5646() {
		WorldMap.visibleMapElementIds.clear();
		WorldMap.visibleMapElementCategories.clear();
	}

	@OriginalMember(owner = "com.jagex.client!ut", name = "a", descriptor = "(IIIBII)Z")
	public static boolean method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg3; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg2; local11++) {
				if (Static319.anIntArrayArray51[local7][local11] == arg0 && Static301.anIntArrayArray50[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
