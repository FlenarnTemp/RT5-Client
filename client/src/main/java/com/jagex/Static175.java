package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "com.jagex.client!kc", name = "b", descriptor = "I")
	public static int anInt3348;

	@OriginalMember(owner = "com.jagex.client!kc", name = "g", descriptor = "I")
	public static int anInt3351;

	@OriginalMember(owner = "com.jagex.client!kc", name = "h", descriptor = "Lclient!je;")
	public static Class113 aClass113_6;

	@OriginalMember(owner = "com.jagex.client!kc", name = "c", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[520];

	@OriginalMember(owner = "com.jagex.client!kc", name = "a", descriptor = "([[[Lclient!f;B)V")
	public static void method3325(@OriginalArg(0) Class67[][][] arg0) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(15) Class67[][] local15 = arg0[local9];
			for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
				for (@Pc(21) int local21 = 0; local21 < local15[local17].length; local21++) {
					@Pc(29) Class67 local29 = local15[local17][local21];
					if (local29 != null) {
						if (local29.aClass11_Sub2_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub2_2).method6082();
						}
						if (local29.aClass11_Sub3_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub3_2).method6082();
						}
						if (local29.aClass11_Sub3_3 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub3_3).method6082();
						}
						if (local29.aClass11_Sub1_3 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub1_3).method6082();
						}
						if (local29.aClass11_Sub1_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub1_2).method6082();
						}
						for (@Pc(81) Class22 local81 = local29.aClass22_2; local81 != null; local81 = local81.aClass22_1) {
							@Pc(86) Entity local86 = local81.aClass11_Sub5_1;
							if (local86 instanceof Interface6) {
								((Interface6) local86).method6082();
							}
						}
					}
				}
			}
		}
	}
}
