package com.jagex;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "com.jagex.client!mo", name = "C", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "com.jagex.client!mo", name = "a", descriptor = "(IZLclient!r;)Lclient!vi;")
	public static Class239 method1088(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(13) byte[] local13 = arg1.method5082(arg0);
		return local13 == null ? null : new Class239(local13);
	}

	@OriginalMember(owner = "com.jagex.client!mo", name = "a", descriptor = "(Z)I")
	public static int method1090() {
		return 6;
	}

	@OriginalMember(owner = "com.jagex.client!mo", name = "a", descriptor = "(ILclient!cf;)I")
	public static int method1096(@OriginalArg(1) Class2_Sub5 arg0) {
		@Pc(12) String local12 = Static318.method5421(arg0);
		@Pc(14) int[] local14 = null;
		if (Static298.method2425(arg0.anInt1005)) {
			local14 = client.ObjTypes.get((int) arg0.aLong30).anIntArray364;
		} else if (arg0.anInt1008 != -1) {
			local14 = client.ObjTypes.get(arg0.anInt1008).anIntArray364;
		} else if (Static297.method5111(arg0.anInt1005)) {
			@Pc(46) NPC local46 = NPCList.NPCS[(int) arg0.aLong30];
			if (local46 != null) {
				@Pc(51) NPCType local51 = local46.type;
				if (local51.multinpc != null) {
					local51 = local51.getMultiNpc(VarpDomain.instance);
				}
				if (local51 != null) {
					local14 = local51.quests;
				}
			}
		} else if (Static241.method4190(arg0.anInt1005)) {
			@Pc(83) LocType local83;
			if (arg0.anInt1005 == 1010) {
				local83 = client.LocTypes.get((int) arg0.aLong30);
			} else {
				local83 = client.LocTypes.get((int) (arg0.aLong30 >>> 32 & 0x7FFFFFFFL));
			}
			if (local83.multiloc != null) {
				local83 = local83.method1533(VarpDomain.instance);
			}
			if (local83 != null) {
				local14 = local83.quests;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static158.method2939(local14);
		}
		@Pc(135) int local135 = Static113.aClass239_2.method6127(Static134.aClass13Array12, local12);
		if (arg0.aBoolean82) {
			local135 += Static119.aClass13_7.method6389() + 4;
		}
		return local135;
	}
}
