package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;

public class VarcDomain {

	@OriginalMember(owner = "com.jagex.client!hu", name = "x", descriptor = "[I")
	public static final int[] updatedVarcs = new int[32];
	@OriginalMember(owner = "com.jagex.client!ud", name = "z", descriptor = "[I")
	public static final int[] anIntArray444 = new int[32];
	@OriginalMember(owner = "com.jagex.client!ef", name = "w", descriptor = "[I")
	public static int[] varcs;

	@OriginalMember(owner = "com.jagex.client!pn", name = "E", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "com.jagex.client!mn", name = "B", descriptor = "I")
	public static int updatedVarcsWriterIndex = 0;

	@OriginalMember(owner = "com.jagex.client!dg", name = "r", descriptor = "I")
	public static int updatedVarcstrsWriterIndex = 0;

	@OriginalMember(owner = "com.jagex.client!ef", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] varcstrs;

}
