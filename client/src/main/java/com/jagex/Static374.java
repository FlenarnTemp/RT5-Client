package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "com.jagex.client!vr", name = "i", descriptor = "[I")
	public static int[] locGroupIds;

	@OriginalMember(owner = "com.jagex.client!vr", name = "a", descriptor = "(B)I")
	public static int method6273() {
		@Pc(15) Renderer local15 = Rasteriser.instance;
		@Pc(17) boolean local17 = false;
		if (Static77.anInt1762 != 0) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(100, 100);
			local17 = true;
			local15 = Static387.method2822(0, null, null, local26, 0);
		}
		@Pc(43) long local43 = MonotonicClock.currentTimeMillis();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local15.method2853();
		}
		@Pc(72) int local72 = (int) (MonotonicClock.currentTimeMillis() - local43);
		local15.method2868(100, 0, 0, -16777216, 100);
		if (local17) {
			local15.method2825();
		}
		return local72;
	}

	@OriginalMember(owner = "com.jagex.client!vr", name = "a", descriptor = "(ILclient!nk;II)V")
	public static void method6274(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		Static63.anInt1549 = arg0;
		Static290.anInt5498 = arg2;
		Static179.aClass161_6 = arg1;
	}

	@OriginalMember(owner = "com.jagex.client!vr", name = "a", descriptor = "(ZII)Lclient!we;")
	public static Class2_Sub41 method6275(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub41) Static353.aClass4_136.getNode(local12);
	}
}