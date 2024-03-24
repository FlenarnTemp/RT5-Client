package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;

public class PlayerList {

	@OriginalMember(owner = "com.jagex.client!ep", name = "a", descriptor = "[I")
	public static final int[] anIntArray121 = new int[2048];
	@OriginalMember(owner = "com.jagex.client!c", name = "f", descriptor = "[B")
	public static final byte[] aByteArray7 = new byte[2048];
	@OriginalMember(owner = "com.jagex.client!nn", name = "C", descriptor = "[I")
	public static final int[] anIntArray284 = new int[2048];
	@OriginalMember(owner = "com.jagex.client!am", name = "a", descriptor = "[Lclient!nh;")
	public static final Player[] players = new Player[2048];
	@OriginalMember(owner = "com.jagex.client!ni", name = "E", descriptor = "I")
	public static int selfId = -1;

	@OriginalMember(owner = "com.jagex.client!bp", name = "u", descriptor = "I")
	public static int anInt751 = 0;

	@OriginalMember(owner = "com.jagex.client!l", name = "h", descriptor = "I")
	public static int anInt3547 = 0;

	@OriginalMember(owner = "com.jagex.client!at", name = "N", descriptor = "Lclient!nh;")
	public static Player self;

}
