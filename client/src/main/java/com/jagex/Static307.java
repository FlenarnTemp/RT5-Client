package com.jagex;

import java.awt.Point;

import com.jagex.game.config.cursortype.CursorType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "com.jagex.client!rq", name = "l", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_121 = new LocalizedString("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "com.jagex.client!rq", name = "n", descriptor = "I")
	public static int anInt5780 = 0;

	@OriginalMember(owner = "com.jagex.client!rq", name = "a", descriptor = "(IZ)V")
	public static void method5255(@OriginalArg(0) int arg0) {
		if (!client.preferences.cursorsEnabled) {
			arg0 = -1;
		}
		if (Static29.anInt721 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) CursorType local25 = client.CursorTypes.method3731(arg0);
			@Pc(29) SpriteData local29 = local25.getCursor();
			if (local29 == null) {
				arg0 = -1;
			} else {
				GameShell.signlink.setCursor(local29.method1680(), new Point(local25.hotspotx, local25.hotspoty), local29.method1685(), GameShell.canvas, local29.method1683());
				Static29.anInt721 = arg0;
			}
		}
		if (arg0 == -1 && Static29.anInt721 != -1) {
			GameShell.signlink.setCursor(-1, new Point(), null, GameShell.canvas, -1);
			Static29.anInt721 = -1;
		}
	}

	@OriginalMember(owner = "com.jagex.client!rq", name = "a", descriptor = "(ILclient!oe;BI)V")
	public static void method5256(@OriginalArg(0) int arg0, @OriginalArg(1) Npc arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt4597 && arg0 != -1) {
			@Pc(78) Class157 local78 = client.SeqTypes.method2371(arg0);
			@Pc(81) int local81 = local78.anInt4022;
			if (local81 == 1) {
				arg1.anInt4592 = 1;
				arg1.anInt4624 = 0;
				arg1.anInt4607 = 0;
				arg1.anInt4590 = arg2;
				arg1.anInt4598 = 0;
				Static1.method4(local78, false, arg1.plane, arg1.xFine, arg1.zFine, arg1.anInt4607);
			}
			if (local81 == 2) {
				arg1.anInt4598 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4597 == -1 || client.SeqTypes.method2371(arg0).anInt4023 >= client.SeqTypes.method2371(arg1.anInt4597).anInt4023) {
			arg1.anInt4597 = arg0;
			arg1.anInt4598 = 0;
			arg1.anInt4607 = 0;
			arg1.anInt4624 = 0;
			arg1.anInt4592 = 1;
			arg1.anInt4590 = arg2;
			arg1.anInt4642 = arg1.anInt4643;
			if (arg1.anInt4597 != -1) {
				Static1.method4(client.SeqTypes.method2371(arg1.anInt4597), false, arg1.plane, arg1.xFine, arg1.zFine, arg1.anInt4607);
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!rq", name = "a", descriptor = "(Z)J")
	public static long method5257() {
		return Static316.aClass5_1.method4405();
	}
}
