package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "com.jagex.client!se", name = "t", descriptor = "I")
	public static int anInt5930;

	@OriginalMember(owner = "com.jagex.client!se", name = "b", descriptor = "(B)V")
	public static void method5381() {
		Static295.aClass135_32.clear();
		for (@Pc(13) Class2_Sub5 local13 = (Class2_Sub5) Static129.aClass135_19.head(); local13 != null; local13 = (Class2_Sub5) Static129.aClass135_19.next()) {
			if (local13.anInt1005 < 1000) {
				local13.remove();
				Static295.aClass135_32.addTail(local13);
			}
		}
		Static295.aClass135_32.method3542(Static129.aClass135_19);
		@Pc(41) int local41 = -1;
		if (Mouse.clickButton != null) {
			local41 = Mouse.clickButton.method5247();
		}
		if (!Static375.aBoolean477) {
			if (local41 == 0 && (Static232.anInt4087 == 1 && Static268.anInt4959 > 2 || Static208.method3710())) {
				local41 = 2;
			}
			if (local41 == 2 && Static268.anInt4959 > 0 && Mouse.clickButton != null) {
				if (Cs1ScriptRunner.aClass161_14 == null && InterfaceList.anInt6449 == 0) {
					Static388.method6439(Mouse.clickButton.getY(), Mouse.clickButton.getX());
				} else {
					Static116.anInt2357 = 2;
				}
			}
			if (local41 == 0 && Static268.anInt4959 > 0) {
				Static145.method2695();
			}
			if (Cs1ScriptRunner.aClass161_14 == null && InterfaceList.anInt6449 == 0) {
				Static116.anInt2357 = 0;
				Static32.aClass2_Sub5_2 = null;
			}
			return;
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		if (local41 == -1) {
			local57 = Mouse.instance.method3304();
			local61 = Mouse.instance.method3313();
			if (local57 < Static305.anInt5743 - 10 || local57 > Static107.anInt2220 + Static305.anInt5743 + 10 || local61 < Static363.anInt6801 - 10 || local61 > Static363.anInt6801 + Static352.anInt6519 + 10) {
				Static375.aBoolean477 = false;
				Static369.method6221(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
			}
		}
		if (local41 != 0) {
			return;
		}
		local57 = Static305.anInt5743;
		local61 = Static363.anInt6801;
		@Pc(117) int local117 = Static107.anInt2220;
		@Pc(121) int local121 = Mouse.clickButton.getY();
		@Pc(125) int local125 = Mouse.clickButton.getX();
		@Pc(127) int local127 = -1;
		@Pc(145) int local145;
		for (@Pc(129) int local129 = 0; local129 < Static268.anInt4959; local129++) {
			if (InterfaceList.aBoolean371) {
				local145 = local61 + (Static268.anInt4959 - (local129 + 1)) * 16 + 33;
				if (local57 < local121 && local57 + local117 > local121 && local125 > local145 - 13 && local145 + 4 > local125) {
					local127 = local129;
				}
			} else {
				local145 = local61 + (-local129 + -1 + Static268.anInt4959) * 16 + 31;
				if (local57 < local121 && local121 < local117 + local57 && local145 - 13 < local125 && local125 < local145 + 3) {
					local127 = local129;
				}
			}
		}
		if (local127 != -1) {
			local145 = 0;
			@Pc(232) Class75 local232 = new Class75(Static129.aClass135_19);
			for (@Pc(237) Class2_Sub5 local237 = (Class2_Sub5) local232.method2181(); local237 != null; local237 = (Class2_Sub5) local232.method2178()) {
				if (local145 == local127) {
					Protocol.method4427(local237, local121, local125);
				}
				local145++;
			}
		}
		Static375.aBoolean477 = false;
		Static369.method6221(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
	}

	@OriginalMember(owner = "com.jagex.client!se", name = "c", descriptor = "(B)Lclient!oo;")
	public static Class12_Sub6 method5383() {
		@Pc(8) Class12_Sub6 local8 = (Class12_Sub6) Static352.aClass36_9.method1424();
		if (local8 == null) {
			return new Class12_Sub6();
		} else {
			Static285.anInt5374--;
			return local8;
		}
	}
}
