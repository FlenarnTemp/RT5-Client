package com.jagex;

import java.awt.Rectangle;

import com.jagex.game.config.idktype.IDKTypeList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "com.jagex.client!vm", name = "O", descriptor = "Lclient!je;")
	public static Class113 aClass113_9;

	@OriginalMember(owner = "com.jagex.client!vm", name = "N", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "com.jagex.client!vm", name = "S", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_144 = new LocalizedString("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "com.jagex.client!vm", name = "Z", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "com.jagex.client!vm", name = "f", descriptor = "(I)V")
	public static void method6217() {
		@Pc(5) LruHashTable local5 = Static98.aClass98_10;
		synchronized (Static98.aClass98_10) {
			Static98.aClass98_10.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!vm", name = "a", descriptor = "(IIIII)V")
	public static void method6221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static154.anInt2806; local3++) {
			@Pc(9) Rectangle local9 = IDKTypeList.aRectangleArray1[local3];
			if (local9.x + local9.width > arg1 && local9.x < arg0 + arg1 && arg3 < local9.y + local9.height && local9.y < arg2 + arg3) {
				Static357.aBooleanArray59[local3] = true;
			}
		}
	}
}
