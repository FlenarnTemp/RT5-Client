package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!sk")
public final class ClanMember {

	@OriginalMember(owner = "com.jagex.client!sk", name = "j", descriptor = "Ljava/lang/String;")
	public String username2;

	@OriginalMember(owner = "com.jagex.client!sk", name = "m", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "com.jagex.client!sk", name = "o", descriptor = "Ljava/lang/String;")
	public String username;

	@OriginalMember(owner = "com.jagex.client!sk", name = "p", descriptor = "I")
	public int world;

	@OriginalMember(owner = "com.jagex.client!sk", name = "q", descriptor = "B")
	public byte rank;

	@OriginalMember(owner = "com.jagex.client!sk", name = "t", descriptor = "Ljava/lang/String;")
	public String worldName;
}
