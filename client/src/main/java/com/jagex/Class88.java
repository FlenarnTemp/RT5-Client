package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!gt")
public final class Class88 {

	@OriginalMember(owner = "com.jagex.client!gt", name = "b", descriptor = "I")
	public final int anInt2388;

	@OriginalMember(owner = "com.jagex.client!gt", name = "d", descriptor = "I")
	public int anInt2389;

	@OriginalMember(owner = "com.jagex.client!gt", name = "a", descriptor = "[I")
	public final int[] anIntArray153;

	@OriginalMember(owner = "com.jagex.client!gt", name = "c", descriptor = "[I")
	public final int[] anIntArray154;

	@OriginalMember(owner = "com.jagex.client!gt", name = "<init>", descriptor = "()V")
	public Class88() {
		Static267.read(16);
		this.anInt2388 = Static267.readBit() == 0 ? 1 : Static267.read(4) + 1;
		if (Static267.readBit() != 0) {
			Static267.read(8);
		}
		Static267.read(2);
		if (this.anInt2388 > 1) {
			this.anInt2389 = Static267.read(4);
		}
		this.anIntArray153 = new int[this.anInt2388];
		this.anIntArray154 = new int[this.anInt2388];
		for (@Pc(42) int local42 = 0; local42 < this.anInt2388; local42++) {
			Static267.read(8);
			this.anIntArray153[local42] = Static267.read(8);
			this.anIntArray154[local42] = Static267.read(8);
		}
	}
}
