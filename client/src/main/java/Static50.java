import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "Lclient!h;")
	public static Class89 aClass89_46 = new Class89(39, 17);

	@OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
	public static int anInt1332 = 0;

	@OriginalMember(owner = "client!ct", name = "xb", descriptor = "[Lclient!go;")
	public static Class84[] aClass84Array1 = new Class84[8];

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public static void method1517() {
		aClass84Array1 = null;
		aClass89_46 = null;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZZ)V")
	public static void method1525(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static139.anInt2595 != -1) {
				Static162.method2978(Static139.anInt2595);
			}
			for (@Pc(19) Class2_Sub7 local19 = (Class2_Sub7) Static329.aClass4_130.method80(); local19 != null; local19 = (Class2_Sub7) Static329.aClass4_130.method79()) {
				if (!local19.method6461()) {
					local19 = (Class2_Sub7) Static329.aClass4_130.method80();
					if (local19 == null) {
						break;
					}
				}
				Static276.method4654(false, local19, true);
			}
			Static139.anInt2595 = -1;
			Static329.aClass4_130 = new Class4(8);
			Static210.method3719();
			Static139.anInt2595 = Static391.anInt7216;
			Static60.method891(false);
			Static98.method2107();
			Static198.method3597(Static139.anInt2595);
		}
		Static310.method5282();
		Static107.anInt2219 = -1;
		Static307.method5254(Static394.anInt7263);
		Static17.aClass11_Sub5_Sub2_Sub1_3 = new Class11_Sub5_Sub2_Sub1();
		Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781 = 6656;
		Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] = 52;
		Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783 = 6656;
		Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] = 52;
		Static211.anInt3777 = 0;
		Static136.anInt6778 = 0;
		if (Static314.anInt5911 == 2) {
			Static211.anInt3777 = Static19.anInt535 << 7;
			Static136.anInt6778 = Static311.anInt5810 << 7;
		} else {
			Static199.method5248();
		}
		Static348.method5827();
		if (Static136.anInt6778 == 0 || Static211.anInt3777 == 0) {
			Static336.method5704(10);
		} else {
			Static262.method6253();
			Static336.method5704(28);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBIIIII)I")
	public static int method1528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(17) int local17 = arg3;
			arg3 = arg4;
			arg4 = local17;
		}
		@Pc(25) int local25 = arg1 & 0x3;
		if (local25 == 0) {
			return arg0;
		} else if (local25 == 1) {
			return arg5;
		} else if (local25 == 2) {
			return 7 + 1 - arg0 - arg3;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(B)V")
	public static void method1530() {
		Static65.aClass19_3.method2879(Static99.anInt2095, Static218.aClass177_Sub1_2.aBoolean348 ? Static364.anInt6817 + 256 : -1);
	}
}