package com.jagex;

import com.jagex.game.config.seqtype.SeqType;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static114 {

	@OriginalMember(owner = "com.jagex.client!gm", name = "a", descriptor = "I")
	public static int anInt2344 = 0;

	@OriginalMember(owner = "com.jagex.client!gm", name = "d", descriptor = "I")
	public static int anInt2346 = -60;

	@OriginalMember(owner = "com.jagex.client!gm", name = "g", descriptor = "[Lclient!nb;")
	public static final SeqType[] A_SEQ_TYPE_ARRAY_14 = new SeqType[14];

	@OriginalMember(owner = "com.jagex.client!gm", name = "a", descriptor = "(B)V")
	public static void method2362() {
		Static241.method4192(false);
		if (Static33.anInt4462 >= 0 && Static33.anInt4462 != 0) {
			Static78.method5701(Static33.anInt4462);
			Static33.anInt4462 = -1;
		}
	}
}
