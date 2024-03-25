package com.jagex;

import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.npctype.NPCType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "com.jagex.client!gp", name = "m", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "com.jagex.client!gp", name = "p", descriptor = "I")
	public static int anInt2375;

	@OriginalMember(owner = "com.jagex.client!gp", name = "c", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_47 = new LocalizedString("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "com.jagex.client!gp", name = "o", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_48 = new LocalizedString("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "com.jagex.client!gp", name = "s", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_49 = new LocalizedString("Loading sprites - ", "Lade com.jagex.Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "com.jagex.client!gp", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method2367(@OriginalArg(1) Renderer arg0) {
		@Pc(7) int local7 = Static305.anInt5743;
		@Pc(9) int local9 = Static363.anInt6801;
		@Pc(11) int local11 = Static107.anInt2220;
		@Pc(15) int local15 = Static352.anInt6519 - 3;
		if (Static197.aClass13_12 == null || Static138.aClass13_8 == null) {
			if (client.jsArchive8.requestDownload(LoginManager.anInt3731) && client.jsArchive8.requestDownload(LoginManager.anInt1636)) {
				Static197.aClass13_12 = arg0.createSprite(Static396.method1682(client.jsArchive8, LoginManager.anInt3731, 0));
				@Pc(44) SpriteData local44 = Static396.method1682(client.jsArchive8, LoginManager.anInt1636, 0);
				Static138.aClass13_8 = arg0.createSprite(local44);
				local44.method1684();
				Static75.aClass13_5 = arg0.createSprite(local44);
			} else {
				arg0.method2901(local7, local9, local11, 20, 255 - LoginManager.anInt6717 << 24 | LoginManager.anInt4446, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static197.aClass13_12 != null && Static138.aClass13_8 != null) {
			local87 = (local11 - Static138.aClass13_8.method6389() * 2) / Static197.aClass13_12.method6389();
			for (local89 = 0; local89 < local87; local89++) {
				Static197.aClass13_12.method6385(local7 + Static138.aClass13_8.method6389() + Static197.aClass13_12.method6389() * local89, local9);
			}
			Static138.aClass13_8.method6385(local7, local9);
			Static75.aClass13_5.method6385(local7 + local11 - Static75.aClass13_5.method6389(), local9);
		}
		Static52.aClass130_1.method5897(local7 + 3, -1, local9 + 14, LoginManager.anInt6030 | 0xFF000000, Static180.aClass79_74.getLocalized(client.language));
		arg0.method2901(local7, local9 + 20, local11, local15 - 20, -LoginManager.anInt6717 + 255 << 24 | LoginManager.anInt4446, 1);
		local87 = Mouse.instance.method3304();
		local89 = Mouse.instance.method3313();
		@Pc(169) int local169 = 0;
		@Pc(192) int local192;
		for (@Pc(174) Class2_Sub5 local174 = (Class2_Sub5) Static129.aClass135_19.head(); local174 != null; local174 = (Class2_Sub5) Static129.aClass135_19.next()) {
			local192 = local9 + (-local169 + -1 + Static268.anInt4959) * 16 + 33;
			local169++;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local192 - 13 && local192 + 4 > local89 && local174.aBoolean83) {
				arg0.method2901(local7, local192 - 12, local11, 16, LoginManager.anInt3697 | 255 - LoginManager.anInt1868 << 24, 1);
			}
		}
		if ((Static337.aClass13_17 == null || Static211.aClass13_13 == null || Static35.aClass13_3 == null) && client.jsArchive8.requestDownload(LoginManager.anInt1722) && client.jsArchive8.requestDownload(LoginManager.anInt6804) && client.jsArchive8.requestDownload(LoginManager.anInt7211)) {
			@Pc(275) SpriteData local275 = Static396.method1682(client.jsArchive8, LoginManager.anInt6804, 0);
			Static211.aClass13_13 = arg0.createSprite(local275);
			local275.method1684();
			Static339.aClass13_18 = arg0.createSprite(local275);
			Static337.aClass13_17 = arg0.createSprite(Static396.method1682(client.jsArchive8, LoginManager.anInt1722, 0));
			@Pc(300) SpriteData local300 = Static396.method1682(client.jsArchive8, LoginManager.anInt7211, 0);
			Static35.aClass13_3 = arg0.createSprite(local300);
			local300.method1684();
			Static110.aClass13_6 = arg0.createSprite(local300);
		}
		local169 = 0;
		@Pc(368) int local368;
		@Pc(333) int local333;
		if (Static337.aClass13_17 != null && Static211.aClass13_13 != null && Static35.aClass13_3 != null) {
			local192 = (local11 - Static35.aClass13_3.method6389() * 2) / Static337.aClass13_17.method6389();
			for (local333 = 0; local333 < local192; local333++) {
				Static337.aClass13_17.method6385(Static35.aClass13_3.method6389() + local7 + local333 * Static337.aClass13_17.method6389(), local9 + local15 - Static337.aClass13_17.method6382());
			}
			local368 = (local15 - Static35.aClass13_3.method6382() - 20) / Static211.aClass13_13.method6382();
			for (@Pc(370) int local370 = 0; local370 < local368; local370++) {
				Static211.aClass13_13.method6385(local7, local9 + local370 * Static211.aClass13_13.method6382() + 20);
				Static339.aClass13_18.method6385(local11 + local7 - Static339.aClass13_18.method6389(), local370 * Static211.aClass13_13.method6382() + 20 + local9);
			}
			Static35.aClass13_3.method6385(local7, local9 + local15 - Static35.aClass13_3.method6382());
			Static110.aClass13_6.method6385(local7 + local11 - Static35.aClass13_3.method6389(), local15 + local9 + -Static35.aClass13_3.method6382());
		}
		for (@Pc(436) Class2_Sub5 local436 = (Class2_Sub5) Static129.aClass135_19.head(); local436 != null; local436 = (Class2_Sub5) Static129.aClass135_19.next()) {
			local333 = (Static268.anInt4959 - local169 - 1) * 16 + local9 + 13 + 20;
			local368 = LoginManager.anInt6030 | 0xFF000000;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local333 - 13 && local89 < local333 + 4 && local436.aBoolean83) {
				local368 = LoginManager.anInt7118 | 0xFF000000;
			}
			@Pc(499) int[] local499 = null;
			if (Static298.method2425(local436.anInt1005)) {
				local499 = client.ObjTypes.get((int) local436.aLong30).anIntArray364;
			} else if (local436.anInt1008 != -1) {
				local499 = client.ObjTypes.get(local436.anInt1008).anIntArray364;
			} else if (Static297.method5111(local436.anInt1005)) {
				@Pc(572) NPC local572 = NPCList.NPCS[(int) local436.aLong30];
				if (local572 != null) {
					@Pc(577) NPCType local577 = local572.type;
					if (local577.multinpc != null) {
						local577 = local577.getMultiNpc(VarpDomain.instance);
					}
					if (local577 != null) {
						local499 = local577.quests;
					}
				}
			} else if (Static241.method4190(local436.anInt1005)) {
				@Pc(540) LocType local540;
				if (local436.anInt1005 == 1010) {
					local540 = client.LocTypes.get((int) local436.aLong30);
				} else {
					local540 = client.LocTypes.get((int) (local436.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local540.multiloc != null) {
					local540 = local540.method1533(VarpDomain.instance);
				}
				if (local540 != null) {
					local499 = local540.quests;
				}
			}
			@Pc(607) String local607 = Static318.method5421(local436);
			if (local499 != null) {
				local607 = local607 + Static158.method2939(local499);
			}
			Static52.aClass130_1.method5901(Static72.anIntArray114, Static134.aClass13Array12, local7 + 3, local607, local333, local368);
			local169++;
			if (local436.aBoolean82) {
				Static119.aClass13_7.method6385(local7 + Static113.aClass239_2.method6126(local607) + 5, local333 + -12);
			}
		}
		Static148.method2710(Static363.anInt6801, Static305.anInt5743, Static352.anInt6519, Static107.anInt2220);
	}

	@OriginalMember(owner = "com.jagex.client!gp", name = "b", descriptor = "(II)I")
	public static int method2370(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

}
