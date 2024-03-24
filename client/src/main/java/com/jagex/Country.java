package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!kh")
public final class Country {

	@OriginalMember(owner = "com.jagex.client!kh", name = "f", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "com.jagex.client!kh", name = "g", descriptor = "I")
	public int flag;
}
