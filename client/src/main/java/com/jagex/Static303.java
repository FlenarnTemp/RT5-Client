package com.jagex;

import com.jagex.game.config.meltype.MapElementType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "com.jagex.client!rm", name = "a", descriptor = "(Lclient!ld;BLclient!wm;II)V")
	public static void method5208(@OriginalArg(0) LinkedList arg0, @OriginalArg(2) Renderer arg1) {
		Static197.aClass135_24.clear();
		if (WorldMap.aBoolean225) {
			return;
		}
		for (@Pc(20) MapElement local20 = (MapElement) arg0.head(); local20 != null; local20 = (MapElement) arg0.next()) {
			@Pc(28) MapElementType local28 = MapList.aClass125_4.get(local20.id);
			if (Static101.method2164(local28)) {
				@Pc(40) boolean local40 = Static286.method4923(local20, arg1, local28);
				if (local40) {
					Static240.method4184(local20, local28, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!rm", name = "c", descriptor = "(III)I")
	public static int method5209(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return (arg0 & 0xFF80) + local22;
	}

	@OriginalMember(owner = "com.jagex.client!rm", name = "b", descriptor = "(Z)V")
	public static void method5210() {
		@Pc(11) int local11 = PlayerList.anInt751;
		@Pc(13) int[] local13 = PlayerList.anIntArray121;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Player local23 = PlayerList.players[local13[local15]];
			if (local23 != null && local23.anInt4636 > 0) {
				local23.anInt4636--;
				if (local23.anInt4636 == 0) {
					local23.aString50 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < NpcList.size; local49++) {
			@Pc(55) int local55 = NpcList.ids[local49];
			@Pc(59) Npc local59 = NpcList.npcs[local55];
			if (local59 != null && local59.anInt4636 > 0) {
				local59.anInt4636--;
				if (local59.anInt4636 == 0) {
					local59.aString50 = null;
				}
			}
		}
	}

}
