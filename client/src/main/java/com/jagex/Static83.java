package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "com.jagex.client!en", name = "d", descriptor = "I")
	public static final int anInt1838 = 2;

	@OriginalMember(owner = "com.jagex.client!en", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method1906(@OriginalArg(1) ChangeLocRequest arg0) {
		if (Scene.aClass67ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt6491 == 0) {
			local8 = (Interface6) Static12.method283(arg0.anInt6481, arg0.anInt6484, arg0.anInt6486);
		}
		if (arg0.anInt6491 == 1) {
			local8 = (Interface6) Static28.method893(arg0.anInt6481, arg0.anInt6484, arg0.anInt6486);
		}
		if (arg0.anInt6491 == 2) {
			local8 = (Interface6) Static105.method2207(arg0.anInt6481, arg0.anInt6484, arg0.anInt6486, Interface6.class);
		}
		if (arg0.anInt6491 == 3) {
			local8 = (Interface6) Static26.method865(arg0.anInt6481, arg0.anInt6484, arg0.anInt6486);
		}
		if (local8 == null) {
			arg0.anInt6493 = 0;
			arg0.anInt6482 = 0;
			arg0.anInt6492 = -1;
		} else {
			arg0.anInt6492 = local8.method6085();
			arg0.anInt6482 = local8.method6081();
			arg0.anInt6493 = local8.method6084();
		}
	}
}
