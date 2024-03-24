package com.jagex;

import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!qo")
public final class Class193 {

	@OriginalMember(owner = "com.jagex.client!qo", name = "g", descriptor = "Lclient!r;")
	private final Js5 aClass197_72;

	@OriginalMember(owner = "com.jagex.client!qo", name = "e", descriptor = "I")
	public final int anInt5494;

	@OriginalMember(owner = "com.jagex.client!qo", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class193(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		new LruHashTable(64);
		this.aClass197_72 = arg2;
		this.anInt5494 = this.aClass197_72.getGroupCapacity(15);
	}
}
