package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ac")
public final class World extends AbstractWorld {

	@OriginalMember(owner = "com.jagex.client!ac", name = "q", descriptor = "I")
	public int id;

	@OriginalMember(owner = "com.jagex.client!ac", name = "s", descriptor = "Ljava/lang/String;")
	public String activity;

	@OriginalMember(owner = "com.jagex.client!ac", name = "v", descriptor = "Ljava/lang/String;")
	public String hostname;

	@OriginalMember(owner = "com.jagex.client!ac", name = "t", descriptor = "I")
	public int ping = -1;

	@OriginalMember(owner = "com.jagex.client!ac", name = "f", descriptor = "(I)Lclient!kh;")
	public Country getCountry() {
		return WorldList.countries[super.country];
	}
}
