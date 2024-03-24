package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;

public class NpcList {

	@OriginalMember(owner = "com.jagex.client!mh", name = "e", descriptor = "[I")
	public static final int[] ids = new int[1024];
	@OriginalMember(owner = "com.jagex.client!vh", name = "s", descriptor = "[Lclient!oe;")
	public static final Npc[] npcs = new Npc[32768];
	@OriginalMember(owner = "com.jagex.client!jo", name = "m", descriptor = "I")
	public static int size = 0;

}
