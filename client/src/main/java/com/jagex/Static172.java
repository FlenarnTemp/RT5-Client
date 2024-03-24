package com.jagex;

import com.jagex.game.config.loctype.LocType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "com.jagex.client!ju", name = "R", descriptor = "I")
	public static int anInt3298;

	@OriginalMember(owner = "com.jagex.client!ju", name = "a", descriptor = "(BIIIII)V")
	public static void method3284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static25.method861(Static365.anInt6832, arg3, Static161.anInt2954);
		@Pc(22) int local22 = Static25.method861(Static365.anInt6832, arg2, Static161.anInt2954);
		@Pc(28) int local28 = Static25.method861(Static28.anInt675, arg4, Static82.anInt1837);
		@Pc(34) int local34 = Static25.method861(Static28.anInt675, arg1, Static82.anInt1837);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static101.method2163(local34, Static357.anIntArrayArray58[local36], arg0, local28);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ju", name = "a", descriptor = "(BIJI)V")
	public static void method3285(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static322.method5482(true, local10, arg0, 0, 0, arg2, 0, local22);
			return;
		}
		@Pc(59) LocType local59 = client.LocTypes.get(local29);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local22 == 0 || local22 == 2) {
			local72 = local59.length;
			local75 = local59.width;
		} else {
			local72 = local59.width;
			local75 = local59.length;
		}
		@Pc(86) int local86 = local59.forceapproach;
		if (local22 != 0) {
			local86 = (local86 << local22 & 0xF) + (local86 >> 4 - local22);
		}
		Static322.method5482(true, 0, arg0, local86, local72, arg2, local75, 0);
	}

	@OriginalMember(owner = "com.jagex.client!ju", name = "a", descriptor = "(ICI)I")
	public static int method3288(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "com.jagex.client!ju", name = "a", descriptor = "(JIZZI)Ljava/lang/String;")
	public static String fixedPointToString(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local25 = true;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		@Pc(51) int local51;
		if (arg3 > 0) {
			for (local46 = 0; local46 < arg3; local46++) {
				local51 = (int) arg0;
				arg0 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg0 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			local51 = (int) arg0;
			arg0 /= 10L;
			local39.append((char) (local51 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg2) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ju", name = "c", descriptor = "(B)Lclient!hi;")
	public static Class93 method3291() {
		try {
			return (Class93) Class.forName("com.jagex.Class93_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
