package com.jagex;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "com.jagex.client!qt", name = "u", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_117 = new LocalizedString("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "com.jagex.client!qt", name = "E", descriptor = "Z")
	public static boolean renderprofile = false;

	@OriginalMember(owner = "com.jagex.client!qt", name = "a", descriptor = "(IILclient!r;)Lclient!ne;")
	public static MidiInstrument method5062(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(15) byte[] local15 = arg1.method5082(arg0);
		return local15 == null ? null : new MidiInstrument(local15);
	}

	@OriginalMember(owner = "com.jagex.client!qt", name = "a", descriptor = "(Lclient!bt;II)V")
	public static void method5065(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (Static317.aClass205_6 == null) {
			return;
		}
		try {
			Static317.aClass205_6.method5214(0L);
			Static317.aClass205_6.method5215(arg1, arg0.data, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
