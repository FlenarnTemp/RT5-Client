package com.jagex;

import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "com.jagex.client!ra", name = "r", descriptor = "F")
	public static float aFloat68 = 0.0F;

	@OriginalMember(owner = "com.jagex.client!ra", name = "s", descriptor = "[I")
	public static final int[] anIntArray381 = new int[14];

	@OriginalMember(owner = "com.jagex.client!ra", name = "u", descriptor = "Lclient!ad;")
	public static final HashTable aClass4_109 = new HashTable(16);

	@OriginalMember(owner = "com.jagex.client!ra", name = "a", descriptor = "(Lclient!hc;IIIII)V")
	public static void method5103(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7113 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub26_Sub1Array3[local4] != null) {
				arg0.anInt7113++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt7113; local22++) {
			@Pc(31) long local31 = Scene.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class2_Sub26_Sub1 local41;
			while (local31 != 0L) {
				local41 = Scene.aClass2_Sub26_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub26_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Scene.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Scene.aClass2_Sub26_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub26_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt7113 - 1; local91++) {
				arg0.aClass2_Sub26_Sub1Array3[local91] = arg0.aClass2_Sub26_Sub1Array3[local91 + 1];
			}
			arg0.anInt7113--;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ra", name = "a", descriptor = "(I)V")
	public static void method5104() {
		Keyboard.instance.method3338();
		Mouse.instance.method3312();
		if (MouseWheel.instance != null) {
			MouseWheel.instance.stop(GameShell.canvas);
		}
		client.instance.method1379();
		GameShell.canvas.setBackground(Color.black);
		Static29.anInt721 = -1;
		Keyboard.instance = Static18.method556(GameShell.canvas);
		Mouse.instance = Static31.method948(GameShell.canvas);
		if (MouseWheel.instance != null) {
			MouseWheel.instance.start(GameShell.canvas);
		}
	}
}
