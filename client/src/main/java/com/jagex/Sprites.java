package com.jagex;

import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class Sprites {

	@OriginalMember(owner = "com.jagex.client!kl", name = "n", descriptor = "I")
	public static int p11FullId;
	@OriginalMember(owner = "com.jagex.client!vo", name = "B", descriptor = "I")
	public static int p12FullId;
	@OriginalMember(owner = "com.jagex.client!ek", name = "Z", descriptor = "I")
	public static int b12FullId;
	@OriginalMember(owner = "com.jagex.client!vq", name = "g", descriptor = "I")
	public static int hitMarksId;
	@OriginalMember(owner = "com.jagex.client!l", name = "f", descriptor = "I")
	public static int hitBarDefaultId;
	@OriginalMember(owner = "com.jagex.client!om", name = "ob", descriptor = "I")
	public static int timerBarDefaultId;
	@OriginalMember(owner = "com.jagex.client!we", name = "E", descriptor = "I")
	public static int headIconsPkId;
	@OriginalMember(owner = "com.jagex.client!jo", name = "w", descriptor = "I")
	public static int headIconsPrayerId;
	@OriginalMember(owner = "com.jagex.client!wp", name = "a", descriptor = "I")
	public static int hintHeadIconsId;
	@OriginalMember(owner = "com.jagex.client!vf", name = "E", descriptor = "I")
	public static int hintMapMarkersId;
	@OriginalMember(owner = "com.jagex.client!nl", name = "h", descriptor = "I")
	public static int mapFlagId;
	@OriginalMember(owner = "com.jagex.client!it", name = "d", descriptor = "I")
	public static int crossId;
	@OriginalMember(owner = "com.jagex.client!ss", name = "h", descriptor = "I")
	public static int mapDotsId;
	@OriginalMember(owner = "com.jagex.client!jr", name = "p", descriptor = "I")
	public static int scrollbarId;
	@OriginalMember(owner = "com.jagex.client!fp", name = "r", descriptor = "I")
	public static int nameIconsId;
	@OriginalMember(owner = "com.jagex.client!br", name = "R", descriptor = "I")
	public static int floorShadowsId;
	@OriginalMember(owner = "com.jagex.client!hs", name = "v", descriptor = "I")
	public static int compassId;
	@OriginalMember(owner = "com.jagex.client!so", name = "j", descriptor = "I")
	public static int otherLevelId;
	@OriginalMember(owner = "com.jagex.client!vq", name = "j", descriptor = "I")
	public static int hintMapEdgeId;

	@OriginalMember(owner = "com.jagex.client!dm", name = "a", descriptor = "(BLclient!r;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		p11FullId = archive.getGroupId("p11_full");
		p12FullId = archive.getGroupId("p12_full");
		b12FullId = archive.getGroupId("b12_full");
		hitMarksId = archive.getGroupId("hitmarks");
		hitBarDefaultId = archive.getGroupId("hitbar_default");
		timerBarDefaultId = archive.getGroupId("timerbar_default");
		headIconsPkId = archive.getGroupId("headicons_pk");
		headIconsPrayerId = archive.getGroupId("headicons_prayer");
		hintHeadIconsId = archive.getGroupId("hint_headicons");
		hintMapMarkersId = archive.getGroupId("hint_mapmarkers");
		mapFlagId = archive.getGroupId("mapflag");
		crossId = archive.getGroupId("cross");
		mapDotsId = archive.getGroupId("mapdots");
		scrollbarId = archive.getGroupId("scrollbar");
		nameIconsId = archive.getGroupId("name_icons");
		floorShadowsId = archive.getGroupId("floorshadows");
		compassId = archive.getGroupId("compass");
		otherLevelId = archive.getGroupId("otherlevel");
		hintMapEdgeId = archive.getGroupId("hint_mapedge");
	}

}
