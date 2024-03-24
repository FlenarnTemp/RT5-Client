package com.jagex;

import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "com.jagex.client!hn", name = "e", descriptor = "[Lclient!jd;")
	public static Sprite[] aClass13Array12;

	@OriginalMember(owner = "com.jagex.client!hn", name = "f", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "com.jagex.client!hn", name = "b", descriptor = "[I")
	public static final int[] anIntArray163 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "com.jagex.client!hn", name = "c", descriptor = "[I")
	public static final int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "com.jagex.client!hn", name = "d", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_59 = new LocalizedString("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "com.jagex.client!hn", name = "a", descriptor = "(BLclient!r;)I")
	public static int method2509(@OriginalArg(1) Js5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.requestDownload(Sprites.hitMarksId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.hitBarDefaultId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.timerBarDefaultId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.headIconsPkId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.headIconsPrayerId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.hintHeadIconsId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.hintMapMarkersId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.mapFlagId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.crossId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.mapDotsId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.scrollbarId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.nameIconsId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.floorShadowsId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.compassId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.otherLevelId)) {
			local5++;
		}
		if (arg0.requestDownload(Sprites.hintMapEdgeId)) {
			local5++;
		}
		return local5;
	}
}
