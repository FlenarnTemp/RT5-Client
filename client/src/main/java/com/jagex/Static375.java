package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "com.jagex.client!vs", name = "j", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "com.jagex.client!vs", name = "v", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "com.jagex.client!vs", name = "z", descriptor = "J")
	public static long aLong222;

	@OriginalMember(owner = "com.jagex.client!vs", name = "c", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "com.jagex.client!vs", name = "m", descriptor = "[I")
	public static final int[] anIntArray482 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "com.jagex.client!vs", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray64 = new boolean[100];

	@OriginalMember(owner = "com.jagex.client!vs", name = "p", descriptor = "J")
	public static long aLong221 = -1L;

	@OriginalMember(owner = "com.jagex.client!vs", name = "u", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "com.jagex.client!vs", name = "y", descriptor = "I")
	public static int anInt7051 = 0;

	@OriginalMember(owner = "com.jagex.client!vs", name = "b", descriptor = "(I)V")
	public static void method6281() {
		Static263.aBoolean330 = true;
	}

	@OriginalMember(owner = "com.jagex.client!vs", name = "a", descriptor = "(BII)V")
	public static void method6282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) DelayedStateChange local8 = Static316.method5413(13, arg1);
		local8.method2311();
		local8.intArg1 = arg0;
	}
}
