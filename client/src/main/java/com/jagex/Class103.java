package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ih")
public final class Class103 {

	@OriginalMember(owner = "com.jagex.client!ih", name = "d", descriptor = "I")
	public int anInt2702;

	@OriginalMember(owner = "com.jagex.client!ih", name = "e", descriptor = "[I")
	public final int[] anIntArray171;

	@OriginalMember(owner = "com.jagex.client!ih", name = "c", descriptor = "[I")
	public final int[] anIntArray170;

	@OriginalMember(owner = "com.jagex.client!ih", name = "<init>", descriptor = "(I)V")
	public Class103(@OriginalArg(0) int arg0) {
		this.anInt2702 = arg0;
		this.anIntArray171 = new int[this.anInt2702];
		this.anIntArray170 = new int[this.anInt2702];
	}
}
