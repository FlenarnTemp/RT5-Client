package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "com.jagex.client!us", name = "B", descriptor = "I")
	public static int anInt6697;

	@OriginalMember(owner = "com.jagex.client!us", name = "H", descriptor = "I")
	public static int anInt6702;

	@OriginalMember(owner = "com.jagex.client!us", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "com.jagex.client!us", name = "y", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_140 = new LocalizedString(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "com.jagex.client!us", name = "b", descriptor = "(Z)V")
	public static void method6009() {
		@Pc(12) DelayedStateChange local12 = Static316.method5413(15, 0);
		local12.method2312();
	}
}
