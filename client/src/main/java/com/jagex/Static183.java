package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "com.jagex.client!kl", name = "k", descriptor = "[I")
	public static final int[] anIntArray2 = new int[1000];

	@OriginalMember(owner = "com.jagex.client!kl", name = "o", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "com.jagex.client!kl", name = "p", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "com.jagex.client!kl", name = "a", descriptor = "(Z)V")
	public static void method68() {
		if (client.preferences.method4495(Static77.anInt1762) || Static44.anInt1115 == Static355.anInt6585) {
			Static239.method4156(Rasteriser.instance);
			if (Static272.anInt5022 != Static355.anInt6585) {
				Static226.method3982();
			}
		} else {
			Static373.method6267(false, Static105.anInt2187, false, Static9.anInt212);
		}
	}
}
