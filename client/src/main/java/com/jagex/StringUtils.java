package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class StringUtils {

	@OriginalMember(owner = "com.jagex.client!nh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)I")
	public static int compare(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local15 - local24 < local11) {
			if (local13 - local22 >= local8) {
				return -1;
			}
			if (local15 - local24 >= local11) {
				return 1;
			}
			@Pc(61) char local61;
			if (local22 == '\u0000') {
				local61 = arg1.charAt(local13++);
			} else {
				local61 = local22;
			}
			@Pc(74) char local74;
			if (local24 == '\u0000') {
				local74 = arg0.charAt(local15++);
			} else {
				local74 = local24;
			}
			local22 = Static391.method6455(local61);
			local24 = Static391.method6455(local74);
			local61 = Static135.method2536(arg2, local61);
			local74 = Static135.method2536(arg2, local74);
			if (local61 != local74 && Character.toUpperCase(local61) != Character.toUpperCase(local74)) {
				local61 = Character.toLowerCase(local61);
				local74 = Character.toLowerCase(local74);
				if (local61 != local74) {
					return Static172.method3288(local61, arg2) - Static172.method3288(local74, arg2);
				}
			}
		}
		@Pc(145) int local145 = Math.min(local8, local11);
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			if (arg2 == 2) {
				local15 = local11 - local147 - 1;
				local13 = local8 - local147 - 1;
			} else {
				local15 = local147;
				local13 = local147;
			}
			@Pc(178) char local178 = arg1.charAt(local13);
			@Pc(182) char local182 = arg0.charAt(local15);
			if (local182 != local178 && Character.toUpperCase(local178) != Character.toUpperCase(local182)) {
				local178 = Character.toLowerCase(local178);
				local182 = Character.toLowerCase(local182);
				if (local178 != local182) {
					return Static172.method3288(local178, arg2) - Static172.method3288(local182, arg2);
				}
			}
		}
		@Pc(226) int local226 = local8 - local11;
		if (local226 != 0) {
			return local226;
		}
		for (@Pc(235) int local235 = 0; local235 < local145; local235++) {
			@Pc(241) char local241 = arg1.charAt(local235);
			@Pc(245) char local245 = arg0.charAt(local235);
			if (local245 != local241) {
				return Static172.method3288(local241, arg2) - Static172.method3288(local245, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "com.jagex.client!lq", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String fromBase37(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local45.append(Static349.aCharArray6[(int) (local52 - arg0 * 37L)]);
			}
			return local45.reverse().toString();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ek", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long toBase37(@OriginalArg(1) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(19) char local19 = arg0.charAt(local10);
			if (local19 >= 'A' && local19 <= 'Z') {
				local5 += local19 + 1 - 65;
			} else if (local19 >= 'a' && local19 <= 'z') {
				local5 += local19 - 96;
			} else if (local19 >= '0' && local19 <= '9') {
				local5 += local19 + 27 - 48;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "com.jagex.client!td", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String toTitleCase(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static170.method3229(toBase37(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}

	@OriginalMember(owner = "com.jagex.client!hk", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean isInt(@OriginalArg(1) String arg0) {
		return Static340.method5766(arg0);
	}

	@OriginalMember(owner = "com.jagex.client!ih", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int parseInt(@OriginalArg(1) String arg0) {
		return Static319.method5433(10, arg0);
	}

	@OriginalMember(owner = "com.jagex.client!il", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String formatIp(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

    @OriginalMember(owner = "com.jagex.client!ip", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String escape(@OriginalArg(1) String arg0) {
        @Pc(8) int local8 = arg0.length();
        @Pc(10) int local10 = 0;
        for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
            @Pc(18) char local18 = arg0.charAt(local12);
            if (local18 == '<' || local18 == '>') {
                local10 += 3;
            }
        }
        @Pc(40) StringBuffer local40 = new StringBuffer(local8 + local10);
        for (@Pc(50) int local50 = 0; local50 < local8; local50++) {
            @Pc(56) char local56 = arg0.charAt(local50);
            if (local56 == '<') {
                local40.append("<lt>");
            } else if (local56 == '>') {
                local40.append("<gt>");
            } else {
                local40.append(local56);
            }
        }
        return local40.toString();
    }

	@OriginalMember(owner = "com.jagex.client!ih", name = "a", descriptor = "(CI)Z")
	public static boolean isPrintable(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "com.jagex.client!et", name = "a", descriptor = "(IC)Z")
	public static boolean isAlphanumeric(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "com.jagex.client!bu", name = "a", descriptor = "(IC)Z")
	public static boolean isAlpha(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "com.jagex.client!tb", name = "a", descriptor = "(BC)Z")
	public static boolean isNumeric(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
