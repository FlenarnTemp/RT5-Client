package com.jagex;

import com.jagex.game.config.seqtype.SeqType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "com.jagex.client!is", name = "i", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "com.jagex.client!is", name = "k", descriptor = "I")
	public static int rect_debug = 0;

	@OriginalMember(owner = "com.jagex.client!is", name = "m", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "com.jagex.client!is", name = "a", descriptor = "(Lclient!kb;III[Z)V")
	public static void method2780(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Scene.aClass6Array4 == Scene.aClass6Array2) {
			return;
		}
		@Pc(9) int local9 = Scene.aClass6Array3[arg1].method5728(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class6 local22 = Scene.aClass6Array3[local11];
				if (local22 != null) {
					local22.method5724(arg0, arg2, local9 - local22.method5728(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!is", name = "a", descriptor = "(II)V")
	public static void method2783(@OriginalArg(0) int arg0) {
		Static199.anInt5756 = arg0;
		@Pc(7) LruHashTable local7 = Static98.aClass98_10;
		synchronized (Static98.aClass98_10) {
			Static98.aClass98_10.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!is", name = "a", descriptor = "([I[I[IILclient!nh;)V")
	public static void method2785(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Player arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) int local11 = arg0[local3];
			@Pc(15) int local15 = arg1[local3];
			@Pc(19) int local19 = arg2[local3];
			for (@Pc(21) int local21 = 0; local15 != 0 && local21 < arg3.aClass20Array3.length; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg3.aClass20Array3[local21] = null;
					} else {
						@Pc(46) SeqType local46 = client.SeqTypes.method2371(local11);
						@Pc(49) int local49 = local46.anInt4022;
						@Pc(54) Class20 local54 = arg3.aClass20Array3[local21];
						if (local54 != null) {
							if (local54.anInt624 == local11) {
								if (local49 == 0) {
									local54 = arg3.aClass20Array3[local21] = null;
								} else if (local49 == 1) {
									local54.anInt628 = 0;
									local54.anInt629 = local19;
									local54.anInt625 = 0;
									local54.anInt627 = 1;
									local54.anInt626 = 0;
									Static1.method4(local46, PlayerList.self == arg3, arg3.plane, arg3.xFine, arg3.zFine, 0);
								} else if (local49 == 2) {
									local54.anInt626 = 0;
								}
							} else if (local46.priority >= client.SeqTypes.method2371(local54.anInt624).priority) {
								local54 = arg3.aClass20Array3[local21] = null;
							}
						}
						if (local54 == null) {
							local54 = arg3.aClass20Array3[local21] = new Class20();
							local54.anInt627 = 1;
							local54.anInt624 = local11;
							local54.anInt628 = 0;
							local54.anInt626 = 0;
							local54.anInt625 = 0;
							local54.anInt629 = local19;
							Static1.method4(local46, PlayerList.self == arg3, arg3.plane, arg3.xFine, arg3.zFine, 0);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}
}
