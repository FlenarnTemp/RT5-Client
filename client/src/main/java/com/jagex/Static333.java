package com.jagex;

import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "com.jagex.client!tg", name = "F", descriptor = "Lclient!jd;")
	public static Sprite aClass13_21;

	@OriginalMember(owner = "com.jagex.client!tg", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] playerNames2;

	@OriginalMember(owner = "com.jagex.client!tg", name = "m", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_65 = new LruHashTable(20);

	@OriginalMember(owner = "com.jagex.client!tg", name = "a", descriptor = "(B)Z")
	public static boolean method6318() {
		return Static14.aBoolean24;
	}

	@OriginalMember(owner = "com.jagex.client!tg", name = "a", descriptor = "(ILclient!r;)I")
	public static int method6333(@OriginalArg(1) Js5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.requestDownload(Static75.anInt1736)) {
			local5++;
		}
		if (arg0.requestDownload(Static265.anInt4856)) {
			local5++;
		}
		return local5;
	}
}
