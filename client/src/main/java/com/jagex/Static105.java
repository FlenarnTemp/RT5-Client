package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "com.jagex.client!ft", name = "V", descriptor = "I")
	public static int anInt2183;

	@OriginalMember(owner = "com.jagex.client!ft", name = "ab", descriptor = "I")
	public static int anInt2187;

	@OriginalMember(owner = "com.jagex.client!ft", name = "X", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "com.jagex.client!ft", name = "bb", descriptor = "[I")
	public static final int[] anIntArray134 = new int[5];

	@OriginalMember(owner = "com.jagex.client!ft", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!hb;")
	public static Entity method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class67 local7 = Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class22 local14 = local7.aClass22_2; local14 != null; local14 = local14.aClass22_1) {
			@Pc(18) Entity local18 = local14.aClass11_Sub5_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort103 == arg1 && local18.aShort101 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "com.jagex.client!ft", name = "b", descriptor = "(B)V")
	public static void method2209() {
		if (MouseWheel.wheelRotation != 0) {
			Static177.anInt3385 -= MouseWheel.wheelRotation * 5;
			if (Static177.anInt3385 >= Static368.anInt6917) {
				Static177.anInt3385 = Static368.anInt6917 - 1;
			}
			if (Static177.anInt3385 < 0) {
				Static177.anInt3385 = 0;
			}
			MouseWheel.wheelRotation = 0;
		}
		if (Static214.anInt3793 < 102) {
			Static214.anInt3793 += 6;
		}
		@Pc(43) int local43;
		for (@Pc(35) int local35 = 0; local35 < Static6.anInt159; local35++) {
			local43 = Static156.aClass37Array1[local35].method1461();
			@Pc(49) char local49 = Static156.aClass37Array1[local35].method1456();
			if (local43 == 84) {
				Static59.method1642();
			} else if (Keyboard.instance.isPressed(82) && local43 == 66) {
				if (Static23.aClipboard1 != null) {
					@Pc(340) String local340 = "";
					for (@Pc(345) int local345 = Static124.aStringArray65.length - 1; local345 >= 0; local345--) {
						if (Static124.aStringArray65[local345] != null && Static124.aStringArray65[local345].length() > 0) {
							local340 = local340 + Static124.aStringArray65[local345] + '\n';
						}
					}
					Static23.aClipboard1.setContents(new StringSelection(local340), null);
				}
			} else if (Keyboard.instance.isPressed(82) && local43 == 67) {
				if (Static23.aClipboard1 != null) {
					@Pc(76) Transferable local76 = Static23.aClipboard1.getContents(null);
					if (local76 != null) {
						try {
							@Pc(83) String local83 = (String) local76.getTransferData(DataFlavor.stringFlavor);
							if (local83 != null) {
								@Pc(90) String[] local90 = Static200.method3643('\n', local83);
								if (local90.length <= 1) {
									Static25.aString9 = Static25.aString9 + local83;
								} else {
									for (@Pc(107) int local107 = 0; local107 < local90.length; local107++) {
										Static25.aString9 = local90[local107];
										Static59.method1642();
									}
								}
							}
						} catch (@Pc(122) Exception local122) {
						}
					}
				}
			} else if (local43 == 85 && Static357.anInt6683 > 0) {
				Static25.aString9 = Static25.aString9.substring(0, Static357.anInt6683 - 1) + Static25.aString9.substring(Static357.anInt6683);
				Static357.anInt6683--;
			} else if (local43 == 101 && Static357.anInt6683 < Static25.aString9.length()) {
				Static25.aString9 = Static25.aString9.substring(0, Static357.anInt6683) + Static25.aString9.substring(Static357.anInt6683 + 1);
			} else if (local43 == 96 && Static357.anInt6683 > 0) {
				Static357.anInt6683--;
			} else if (local43 == 97 && Static357.anInt6683 < Static25.aString9.length()) {
				Static357.anInt6683++;
			} else if (local43 == 102) {
				Static357.anInt6683 = 0;
			} else if (local43 == 103) {
				Static357.anInt6683 = Static25.aString9.length();
			} else if (local43 == 104 && Static124.aStringArray65.length > Static141.anInt2653) {
				Static141.anInt2653++;
				Static141.method2655();
				Static357.anInt6683 = Static25.aString9.length();
			} else if (local43 == 105 && Static141.anInt2653 > 0) {
				Static141.anInt2653--;
				Static141.method2655();
				Static357.anInt6683 = Static25.aString9.length();
			} else if (StringUtils.isAlphanumeric(local49) || local49 == ':' || local49 == ',' || local49 == ' ' || local49 == '_' || local49 == '-' || local49 == '+' || local49 == '[' || local49 == ']') {
				Static25.aString9 = Static25.aString9.substring(0, Static357.anInt6683) + Static156.aClass37Array1[local35].method1456() + Static25.aString9.substring(Static357.anInt6683);
				Static357.anInt6683++;
			}
		}
		Static6.anInt159 = 0;
		for (local43 = 0; local43 < 100; local43++) {
			Static121.anIntArray156[local43] += Static313.anIntArray388[local43];
			if (Static121.anIntArray156[local43] >> 4 >= 350) {
				Static121.anIntArray157[local43] = (int) (Math.random() * (double) GameShell.canvasWidth) << 4;
				Static121.anIntArray156[local43] = 0;
				Static353.anIntArray450[local43] = (int) (Math.random() * 102.0D) + 51;
				Static313.anIntArray388[local43] = (int) (Math.random() * 48.0D) + 8;
			}
		}
		Static98.method2107();
	}
}
