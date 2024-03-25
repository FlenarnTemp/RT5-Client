package com.jagex;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.graphics.BitmapFont;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "com.jagex.client!jm", name = "j", descriptor = "Lclient!vi;")
	public static Class239 aClass239_3;

	@OriginalMember(owner = "com.jagex.client!jm", name = "a", descriptor = "(IBLclient!hb;)Lclient!bi;")
	public static Class22 method3149(@OriginalArg(0) int arg0, @OriginalArg(2) Entity arg1) {
		@Pc(9) Class22 local9;
		if (Static290.aClass22_3 == null) {
			local9 = new Class22();
		} else {
			local9 = Static290.aClass22_3;
			Static290.aClass22_3 = Static290.aClass22_3.aClass22_1;
			Static222.anInt3944--;
			local9.aClass22_1 = null;
		}
		local9.aClass11_Sub5_1 = arg1;
		local9.anInt645 = arg0;
		return local9;
	}

	@OriginalMember(owner = "com.jagex.client!jm", name = "a", descriptor = "(IIII)V")
	public static void sortObjStack(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Scene.aClass67ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg1 << 28 | arg2 << 14);
		@Pc(27) Class2_Sub32 local27 = (Class2_Sub32) Static120.objStacks.getNode(local19);
		if (local27 == null) {
			Static166.method3190(arg1, arg0, arg2);
			return;
		}
		@Pc(41) ObjStack local41 = (ObjStack) local27.aClass135_34.head();
		if (local41 == null) {
			Static166.method3190(arg1, arg0, arg2);
			return;
		}
		@Pc(55) Class11_Sub4_Sub1 local55 = (Class11_Sub4_Sub1) Static166.method3190(arg1, arg0, arg2);
		if (local55 == null) {
			local55 = new Class11_Sub4_Sub1();
		} else {
			local55.anInt3980 = local55.anInt3981 = -1;
		}
		local55.anInt3984 = local41.count;
		local55.anInt3985 = local41.type;
		label44: while (true) {
			@Pc(85) ObjStack local85 = (ObjStack) local27.aClass135_34.next();
			if (local85 == null) {
				break;
			}
			if (local55.anInt3985 != local85.type) {
				local55.anInt3978 = local85.count;
				local55.anInt3980 = local85.type;
				while (true) {
					@Pc(110) ObjStack local110 = (ObjStack) local27.aClass135_34.next();
					if (local110 == null) {
						break label44;
					}
					if (local110.type != local55.anInt3985 && local55.anInt3980 != local110.type) {
						local55.anInt3982 = local110.count;
						local55.anInt3981 = local110.type;
					}
				}
			}
		}
		@Pc(155) int local155 = Scene.getTileHeight((arg0 << 7) + 64, (arg2 << 7) + 64, arg1);
		Static26.method866(arg1, arg0, arg2, local155, local55);
	}

	@OriginalMember(owner = "com.jagex.client!jm", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method3156(@OriginalArg(1) Renderer arg0) {
		if (Static268.anInt4959 < 2 && !Static330.aBoolean419 || Cs1ScriptRunner.aClass161_14 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static330.aBoolean419 && Static268.anInt4959 < 2) {
			local41 = Static91.aString18 + Static161.aClass79_67.getLocalized(client.language) + Static371.aString68 + " ->";
		} else if (Static148.shiftClickMod && Keyboard.instance.isPressed(81) && Static268.anInt4959 > 2) {
			local41 = Static318.method5421((Class2_Sub5) Static129.aClass135_19.aClass2_130.next.next);
		} else {
			@Pc(68) Class2_Sub5 local68 = (Class2_Sub5) Static129.aClass135_19.aClass2_130.next;
			local41 = Static318.method5421(local68);
			@Pc(74) int[] local74 = null;
			if (Static298.method2425(local68.anInt1005)) {
				local74 = client.ObjTypes.get((int) local68.aLong30).anIntArray364;
			} else if (local68.anInt1008 != -1) {
				local74 = client.ObjTypes.get(local68.anInt1008).anIntArray364;
			} else if (Static297.method5111(local68.anInt1005)) {
				@Pc(140) NPC local140 = NPCList.NPCS[(int) local68.aLong30];
				if (local140 != null) {
					@Pc(145) NPCType local145 = local140.type;
					if (local145.multinpc != null) {
						local145 = local145.getMultiNpc(VarpDomain.instance);
					}
					if (local145 != null) {
						local74 = local145.quests;
					}
				}
			} else if (Static241.method4190(local68.anInt1005)) {
				@Pc(108) LocType local108;
				if (local68.anInt1005 == 1010) {
					local108 = client.LocTypes.get((int) local68.aLong30);
				} else {
					local108 = client.LocTypes.get((int) (local68.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local108.multiloc != null) {
					local108 = local108.method1533(VarpDomain.instance);
				}
				if (local108 != null) {
					local74 = local108.quests;
				}
			}
			if (local74 != null) {
				local41 = local41 + Static158.method2939(local74);
			}
		}
		if (Static268.anInt4959 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static268.anInt4959 - 2) + Static328.aClass79_127.getLocalized(client.language);
		}
		if (Static164.aClass161_5 != null) {
			@Pc(218) BitmapFont local218 = Static164.aClass161_5.method4101(arg0);
			if (local218 == null) {
				local218 = Static52.aClass130_1;
			}
			local218.method5903(Static129.anInt2460, local41, Static288.anInt5464, client.random, Static164.aClass161_5.valign, Static210.anIntArray229, Static164.aClass161_5.shadowColor, Static164.aClass161_5.width, Static164.aClass161_5.color, MiniMenu.gregorianDateSeed, Static134.aClass13Array12, Static164.aClass161_5.height, Static164.aClass161_5.halign, Static72.anIntArray114);
			Static369.method6221(Static210.anIntArray229[2], Static210.anIntArray229[0], Static210.anIntArray229[3], Static210.anIntArray229[1]);
		} else if (Static179.aClass161_6 != null && client.GAME_RS == client.game) {
			@Pc(287) int local287 = Static52.aClass130_1.method5899(Static290.anInt5498 + 4, MiniMenu.gregorianDateSeed, Static134.aClass13Array12, client.random, Static63.anInt1549 + 16, Static72.anIntArray114, local41);
			Static369.method6221(Static113.aClass239_2.method6126(local41) + local287, Static290.anInt5498 + 4, 16, Static63.anInt1549);
		}
	}
}
