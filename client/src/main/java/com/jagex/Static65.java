package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "com.jagex.client!dq", name = "O", descriptor = "I")
	public static int anInt1584;

	@OriginalMember(owner = "com.jagex.client!dq", name = "P", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "com.jagex.client!dq", name = "R", descriptor = "Lclient!wm;")
	public static Renderer aClass19_3;

	@OriginalMember(owner = "com.jagex.client!dq", name = "Z", descriptor = "I")
	public static int anInt1593;

	@OriginalMember(owner = "com.jagex.client!dq", name = "U", descriptor = "I")
	public static int anInt1588 = 1;

	@OriginalMember(owner = "com.jagex.client!dq", name = "b", descriptor = "(II)I")
	public static int method1732(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "com.jagex.client!dq", name = "a", descriptor = "(IIII)Z")
	public static boolean method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static35.method1106(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Scene.scale;
			@Pc(14) int local14 = arg2 << Scene.scale;
			return Static46.method1423(local10 + 1, Scene.aClass6Array4[arg0].method5719(arg1, arg2) + arg3, local14 + 1) && Static46.method1423(local10 + Scene.anInt4716 - 1, Scene.aClass6Array4[arg0].method5719(arg1 + 1, arg2) + arg3, local14 + 1) && Static46.method1423(local10 + Scene.anInt4716 - 1, Scene.aClass6Array4[arg0].method5719(arg1 + 1, arg2 + 1) + arg3, local14 + Scene.anInt4716 - 1) && Static46.method1423(local10 + 1, Scene.aClass6Array4[arg0].method5719(arg1, arg2 + 1) + arg3, local14 + Scene.anInt4716 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "com.jagex.client!dq", name = "a", descriptor = "(IILclient!nk;I)V")
	public static void method1735(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		Static164.aClass161_5 = arg1;
		Static129.anInt2460 = arg0;
		Static288.anInt5464 = arg2;
	}

	@OriginalMember(owner = "com.jagex.client!dq", name = "a", descriptor = "(Lclient!bu;I[[B)V")
	public static void method1737(@OriginalArg(0) SceneBuilder arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt912; local3++) {
			client.audioLogic();
			for (@Pc(9) int local9 = 0; local9 < Static373.buildAreaLimitX >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static242.buildAreaLimitZ >> 3; local13++) {
					@Pc(23) int local23 = Static310.anIntArrayArrayArray12[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean73 || local32 == 0) {
							@Pc(43) int local43 = local23 >> 1 & 0x3;
							@Pc(49) int local49 = local23 >> 14 & 0x3FF;
							@Pc(55) int local55 = local23 >> 3 & 0x7FF;
							@Pc(65) int local65 = (local49 / 8 << 8) + local55 / 8;
							for (@Pc(67) int local67 = 0; local67 < Static291.mapSquares.length; local67++) {
								if (Static291.mapSquares[local67] == local65 && arg1[local67] != null) {
									arg0.method1107(local43, local32, local3, (local49 & 0x7) * 8, arg1[local67], local9 * 8, Rasteriser.instance, Static171.collisionMaps, local13 * 8, (local55 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

}
