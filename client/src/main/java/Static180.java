import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Lclient!gd;")
	public static final LocalisedText A_TRANSLATABLE_STRING___74 = new LocalisedText("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt3408 = 0;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	public static final int anInt3410 = 205;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZIILclient!r;)V")
	public static void method3366(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Js5 arg3) {
		Static384.aBoolean485 = false;
		Static116.aJs5_26 = arg3;
		Static105.anInt2183 = arg0;
		Static341.anInt6376 = 0;
		Static356.anInt6641 = arg2;
		Static235.anInt3365 = 1;
		Static28.anInt672 = Static91.aClass2_Sub12_Sub3_1.method4302() / arg1;
		if (Static28.anInt672 < 1) {
			Static28.anInt672 = 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!bt;)V")
	public static void method3367(@OriginalArg(1) Buffer arg0) {
		if (arg0.data.length - arg0.offset < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.g1();
		if (local21 < 0 || local21 > 1 || arg0.data.length - arg0.offset < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.g2();
		if (arg0.data.length - arg0.offset != local43 * 6) {
			return;
		}
		while (true) {
			@Pc(59) int local59;
			@Pc(63) int local63;
			do {
				do {
					do {
						if (arg0.offset >= arg0.data.length) {
							return;
						}
						local59 = arg0.g2();
						local63 = arg0.mg4();
					} while (Static75.anIntArray117.length <= local59);
				} while (!Static89.aBooleanArray18[local59]);
			} while (Static162.aClass45_1.method1623(local59).aChar2 == '1' && (local63 < -1 || local63 > 1));
			Static75.anIntArray117[local59] = local63;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!r;Lclient!od;I)Z")
	public static boolean method3368(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Class2_Sub12_Sub3 arg3) {
		Static91.aClass2_Sub12_Sub3_1 = arg3;
		Static123.aJs5_30 = arg2;
		Static177.aJs5_48 = arg0;
		Static111.aJs5_25 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public static void method3369() {
		Static133.A_SOFT_LRU_HASH_TABLE___17.clean(5);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)[Lclient!vr;")
	public static Class242[] method3370() {
		return new Class242[] { Static43.aClass242_1, Static43.aClass242_2, Static43.aClass242_3, Static43.aClass242_4, Static43.aClass242_5, Static43.aClass242_6, Static43.aClass242_7, Static43.aClass242_8, Static43.aClass242_9, Static43.aClass242_10 };
	}
}
