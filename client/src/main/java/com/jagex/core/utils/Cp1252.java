package com.jagex.core.utils;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Cp1252 {

	@OriginalMember(owner = "com.jagex.client!ju", name = "S", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "com.jagex.client!co", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String decodeString(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg1[arg0 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(44) char local44 = aCharArray2[local28 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local28 = local44;
				}
				local8[local15++] = (char) local28;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "com.jagex.client!ue", name = "a", descriptor = "(BILjava/lang/String;[BII)I")
	public static int encodeString(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(22) char local22 = arg1.charAt(local15);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				arg2[local15 + arg3] = (byte) local22;
			} else if (local22 == '€') {
				arg2[local15 + arg3] = -128;
			} else if (local22 == '‚') {
				arg2[arg3 + local15] = -126;
			} else if (local22 == 'ƒ') {
				arg2[arg3 + local15] = -125;
			} else if (local22 == '„') {
				arg2[local15 + arg3] = -124;
			} else if (local22 == '…') {
				arg2[arg3 + local15] = -123;
			} else if (local22 == '†') {
				arg2[arg3 + local15] = -122;
			} else if (local22 == '‡') {
				arg2[arg3 + local15] = -121;
			} else if (local22 == 'ˆ') {
				arg2[local15 + arg3] = -120;
			} else if (local22 == '‰') {
				arg2[local15 + arg3] = -119;
			} else if (local22 == 'Š') {
				arg2[arg3 + local15] = -118;
			} else if (local22 == '‹') {
				arg2[local15 + arg3] = -117;
			} else if (local22 == 'Œ') {
				arg2[local15 + arg3] = -116;
			} else if (local22 == 'Ž') {
				arg2[local15 + arg3] = -114;
			} else if (local22 == '‘') {
				arg2[local15 + arg3] = -111;
			} else if (local22 == '’') {
				arg2[local15 + arg3] = -110;
			} else if (local22 == '“') {
				arg2[arg3 + local15] = -109;
			} else if (local22 == '”') {
				arg2[local15 + arg3] = -108;
			} else if (local22 == '•') {
				arg2[local15 + arg3] = -107;
			} else if (local22 == '–') {
				arg2[local15 + arg3] = -106;
			} else if (local22 == '—') {
				arg2[local15 + arg3] = -105;
			} else if (local22 == '˜') {
				arg2[local15 + arg3] = -104;
			} else if (local22 == '™') {
				arg2[arg3 + local15] = -103;
			} else if (local22 == 'š') {
				arg2[local15 + arg3] = -102;
			} else if (local22 == '›') {
				arg2[arg3 + local15] = -101;
			} else if (local22 == 'œ') {
				arg2[arg3 + local15] = -100;
			} else if (local22 == 'ž') {
				arg2[arg3 + local15] = -98;
			} else if (local22 == 'Ÿ') {
				arg2[local15 + arg3] = -97;
			} else {
				arg2[local15 + arg3] = 63;
			}
		}
		return local8;
	}

    @OriginalMember(owner = "com.jagex.client!ni", name = "a", descriptor = "(CI)B")
    public static byte encode(@OriginalArg(0) char arg0) {
        @Pc(28) byte local28;
        if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
            local28 = (byte) arg0;
        } else if (arg0 == '€') {
            local28 = -128;
        } else if (arg0 == '‚') {
            local28 = -126;
        } else if (arg0 == 'ƒ') {
            local28 = -125;
        } else if (arg0 == '„') {
            local28 = -124;
        } else if (arg0 == '…') {
            local28 = -123;
        } else if (arg0 == '†') {
            local28 = -122;
        } else if (arg0 == '‡') {
            local28 = -121;
        } else if (arg0 == 'ˆ') {
            local28 = -120;
        } else if (arg0 == '‰') {
            local28 = -119;
        } else if (arg0 == 'Š') {
            local28 = -118;
        } else if (arg0 == '‹') {
            local28 = -117;
        } else if (arg0 == 'Œ') {
            local28 = -116;
        } else if (arg0 == 'Ž') {
            local28 = -114;
        } else if (arg0 == '‘') {
            local28 = -111;
        } else if (arg0 == '’') {
            local28 = -110;
        } else if (arg0 == '“') {
            local28 = -109;
        } else if (arg0 == '”') {
            local28 = -108;
        } else if (arg0 == '•') {
            local28 = -107;
        } else if (arg0 == '–') {
            local28 = -106;
        } else if (arg0 == '—') {
            local28 = -105;
        } else if (arg0 == '˜') {
            local28 = -104;
        } else if (arg0 == '™') {
            local28 = -103;
        } else if (arg0 == 'š') {
            local28 = -102;
        } else if (arg0 == '›') {
            local28 = -101;
        } else if (arg0 == 'œ') {
            local28 = -100;
        } else if (arg0 == 'ž') {
            local28 = -98;
        } else if (arg0 == 'Ÿ') {
            local28 = -97;
        } else {
            local28 = 63;
        }
        return local28;
    }
}