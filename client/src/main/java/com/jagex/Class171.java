package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ok")
public final class Class171 {

	@OriginalMember(owner = "com.jagex.client!ok", name = "h", descriptor = "I")
	public int anInt4700 = 0;

	@OriginalMember(owner = "com.jagex.client!ok", name = "a", descriptor = "(ILclient!bt;)V")
	public void method4370(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 == 0) {
				return;
			}
			this.method4374(local12, arg0);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ok", name = "a", descriptor = "(IILclient!bt;)V")
	private void method4374(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 5) {
			this.anInt4700 = arg1.g2();
		}
	}
}
