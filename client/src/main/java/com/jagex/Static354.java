package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static354 {

	@OriginalMember(owner = "com.jagex.client!un", name = "h", descriptor = "Z")
	public static boolean stereo;

	@OriginalMember(owner = "com.jagex.client!un", name = "L", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "com.jagex.client!un", name = "M", descriptor = "Z")
	private static boolean aBoolean97;

	@OriginalMember(owner = "com.jagex.client!un", name = "N", descriptor = "I")
	private static int anInt1182;

	@OriginalMember(owner = "com.jagex.client!un", name = "O", descriptor = "Z")
	private static boolean aBoolean98;

	@OriginalMember(owner = "com.jagex.client!un", name = "a", descriptor = "(ZLclient!bt;)Lclient!oq;")
	public static Class173_Sub1 method1393(@OriginalArg(1) Packet arg0) {
		return new Class173_Sub1(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g3(), arg0.g1());
	}
}
