package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static347 {

	@OriginalMember(owner = "com.jagex.client!ub", name = "ab", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "com.jagex.client!ub", name = "S", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_134 = new LocalizedString("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "com.jagex.client!ub", name = "cb", descriptor = "I")
	public static int anInt6443 = 0;

	@OriginalMember(owner = "com.jagex.client!ub", name = "c", descriptor = "(Z)V")
	public static void method5827() {
		if (client.gameState == 10) {
			client.setGameState(28);
		}
		if (client.gameState == 30) {
			client.setGameState(25);
		}
	}
}
