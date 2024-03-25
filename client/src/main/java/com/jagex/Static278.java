package com.jagex;

import com.jagex.core.utils.Cp1252;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "com.jagex.client!qb", name = "T", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "com.jagex.client!qb", name = "V", descriptor = "[Lclient!bp;")
	public static final Class28[] aClass28Array1 = new Class28[16];

	@OriginalMember(owner = "com.jagex.client!qb", name = "X", descriptor = "[I")
	public static final int[] anIntArray362 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "com.jagex.client!qb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int getHash(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Cp1252.encode(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

}
