package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "com.jagex.client!ie", name = "j", descriptor = "I")
	public static int anInt2694 = 0;

	@OriginalMember(owner = "com.jagex.client!ie", name = "a", descriptor = "(Z)V")
	public static void method2690() {
		for (@Pc(14) ChangeLocRequest local14 = (ChangeLocRequest) Static207.aClass135_26.head(); local14 != null; local14 = (ChangeLocRequest) Static207.aClass135_26.next()) {
			if (local14.anInt6485 == -1) {
				local14.anInt6488 = 0;
				Static83.method1906(local14);
			} else {
				local14.remove();
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ie", name = "a", descriptor = "([Lclient!jd;I)V")
	public static void method2691(@OriginalArg(0) Sprite[] arg0) {
		Static361.anInt6770 = arg0.length;
		Static134.aClass13Array12 = new Sprite[Static361.anInt6770 + 10];
		Static72.anIntArray114 = new int[Static361.anInt6770 + 10];
		ArrayUtil.method4609(arg0, 0, Static134.aClass13Array12, 0, Static361.anInt6770);
		for (@Pc(31) int local31 = 0; local31 < Static361.anInt6770; local31++) {
			Static72.anIntArray114[local31] = Static134.aClass13Array12[local31].method6384();
		}
		for (@Pc(50) int local50 = Static361.anInt6770; local50 < Static134.aClass13Array12.length; local50++) {
			Static72.anIntArray114[local50] = 12;
		}
	}

}
