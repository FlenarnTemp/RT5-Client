package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "com.jagex.client!fe", name = "a", descriptor = "I")
	public static int anInt1946;

	@OriginalMember(owner = "com.jagex.client!fe", name = "a", descriptor = "(Lclient!mr;II)V")
	public static void method1999(@OriginalArg(0) PathingEntity arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt4622 > client.cycle) {
			Static297.method5113(arg0);
		} else if (arg0.anInt4584 < client.cycle) {
			Static317.method5548(arg0, false);
			local9 = Static16.anInt4756;
			local7 = Static170.anInt3229;
		} else {
			Static277.method4682(arg0);
		}
		if (arg0.xFine < 128 || arg0.zFine < 128 || Static373.buildAreaLimitX * 128 - 128 <= arg0.xFine || arg0.zFine >= (Static242.buildAreaLimitZ - 1) * 128) {
			arg0.anInt4597 = -1;
			arg0.anInt4622 = 0;
			local7 = -1;
			arg0.anInt4584 = 0;
			local9 = 0;
			arg0.anInt4594 = -1;
			arg0.xFine = arg0.movementQueueX[0] * 128 + arg0.getSize() * 64;
			arg0.zFine = arg0.movementQueueZ[0] * 128 + arg0.getSize() * 64;
			arg0.method4331();
		}
		if (PlayerList.self == arg0 && (arg0.xFine < 1536 || arg0.zFine < 1536 || Static373.buildAreaLimitX * 128 - 1536 <= arg0.xFine || arg0.zFine >= (Static242.buildAreaLimitZ - 12) * 128)) {
			arg0.anInt4594 = -1;
			arg0.anInt4597 = -1;
			local9 = 0;
			local7 = -1;
			arg0.anInt4584 = 0;
			arg0.anInt4622 = 0;
			arg0.xFine = arg0.movementQueueX[0] * 128 + arg0.getSize() * 64;
			arg0.zFine = arg0.movementQueueZ[0] * 128 + arg0.getSize() * 64;
			arg0.method4331();
		}
		@Pc(209) int local209 = Static71.method6019(arg0);
		Static100.method2160(local209, local9, local7, arg0);
		Static173.method3315(arg0);
	}

	@OriginalMember(owner = "com.jagex.client!fe", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method2000(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "com.jagex.client!fe", name = "a", descriptor = "(III)Lclient!cj;")
	public static Class11_Sub3 method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_3;
	}

	@OriginalMember(owner = "com.jagex.client!fe", name = "a", descriptor = "()V")
	public static void method2003() {
		Static285.method4893(Scene.anInt1914);
	}
}
