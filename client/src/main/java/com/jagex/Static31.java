package com.jagex;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "com.jagex.client!bp", name = "s", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "com.jagex.client!bp", name = "v", descriptor = "I")
	public static int anInt752 = -1;

	@OriginalMember(owner = "com.jagex.client!bp", name = "a", descriptor = "(ZI)V")
	public static void method944() {
		@Pc(5) LruHashTable local5 = Static92.aClass98_9;
		synchronized (Static92.aClass98_9) {
			Static92.aClass98_9.clean(5);
		}
		local5 = Static349.aClass98_58;
		synchronized (Static349.aClass98_58) {
			Static349.aClass98_58.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!bp", name = "a", descriptor = "(ZLjava/awt/com.jagex.Component;I)Lclient!lh;")
	public static Class119 method948(@OriginalArg(1) Component arg0) {
		return new Class119_Sub1(arg0, true);
	}
}
