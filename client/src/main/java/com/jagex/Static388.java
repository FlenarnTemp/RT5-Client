package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "com.jagex.client!wn", name = "h", descriptor = "Lclient!jm;")
	public static final Class116 aClass116_8 = new Class116(64);

	@OriginalMember(owner = "com.jagex.client!wn", name = "l", descriptor = "[I")
	public static final int[] anIntArray494 = new int[1000];

	@OriginalMember(owner = "com.jagex.client!wn", name = "a", descriptor = "(Lclient!ci;IBLjava/awt/Canvas;)Lclient!wm;")
	public static Renderer method6437(@OriginalArg(0) TextureProviderInterface arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class19_Sub2(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "com.jagex.client!wn", name = "a", descriptor = "(IZI)V")
	public static void method6439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static113.aClass239_2.method6126(Static180.aClass79_74.getLocalized(client.language));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) Static129.aClass135_19.head(); local18 != null; local18 = (Class2_Sub5) Static129.aClass135_19.next()) {
			local24 = Static218.method1096(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static268.anInt4959 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > GameShell.canvasWidth) {
			local54 = GameShell.canvasWidth - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(77) int local77 = arg1;
		if (GameShell.canvasHeight < local24 + arg1) {
			local77 = GameShell.canvasHeight - local24;
		}
		if (local77 < 0) {
			local77 = 0;
		}
		Static305.anInt5743 = local54;
		Static107.anInt2220 = local13;
		Static352.anInt6519 = Static268.anInt4959 * 16 + (InterfaceList.aBoolean371 ? 26 : 22);
		Static363.anInt6801 = local77;
		Static375.aBoolean477 = true;
	}
}
