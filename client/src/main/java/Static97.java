import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
	public static int anInt2034;

	@OriginalMember(owner = "client!fk", name = "xb", descriptor = "I")
	public static int anInt2049;

	@OriginalMember(owner = "client!fk", name = "Ab", descriptor = "I")
	public static int anInt2052;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public static int anInt2005 = 0;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "Z")
	public static final boolean aBoolean144 = false;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "Lclient!h;")
	public static Class89 aClass89_82 = new Class89(9, 8);

	@OriginalMember(owner = "client!fk", name = "lb", descriptor = "I")
	public static int anInt2040 = -50;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
	public static void method2087(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static374.aString70 = arg1;
		Static202.anInt3714 = arg2;
		Static16.aString51 = arg0;
		if (Static374.aString70.equals("") || Static16.aString51.equals("")) {
			Static41.anInt1046 = 3;
		} else if (Static120.anInt2385 == -1) {
			Static60.anInt666 = 0;
			Static154.anInt2803 = 1;
			Static41.anInt1046 = -3;
			Static193.anInt3557 = 0;
			@Pc(40) Class2_Sub4 local40 = new Class2_Sub4(128);
			local40.method4841(10);
			local40.method4812((int) (Math.random() * 9.9999999E7D));
			local40.method4831(Static80.method5984(Static374.aString70));
			local40.method4812((int) (Math.random() * 9.9999999E7D));
			local40.method4821(Static16.aString51);
			local40.method4812((int) (Math.random() * 9.9999999E7D));
			local40.method4833(Static320.aBigInteger2, Static194.aBigInteger1);
			Static257.aClass2_Sub4_Sub2_4.anInt5300 = 0;
			Static257.aClass2_Sub4_Sub2_4.method4841(Static43.aClass242_10.anInt7038);
			Static257.aClass2_Sub4_Sub2_4.method4841(local40.anInt5300 + 2);
			Static257.aClass2_Sub4_Sub2_4.method4842(578);
			Static257.aClass2_Sub4_Sub2_4.method4856(local40.aByteArray73, local40.anInt5300);
		} else {
			Static230.method4013();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method2092() {
		aClass89_82 = null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2095(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIII)V")
	public static void method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static28.anInt675 <= arg5 - arg0 && arg5 + arg0 <= Static82.anInt1837 && arg4 - arg0 >= Static365.anInt6832 && Static161.anInt2954 >= arg0 + arg4) {
			Static37.method1136(arg3, arg5, arg1, arg4, arg0, arg2);
		} else {
			Static260.method6015(arg1, arg4, arg0, arg3, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ag;BLclient!ag;)V")
	public static void method2100(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_244 != null) {
			arg0.method6467();
		}
		arg0.aClass2_244 = arg1.aClass2_244;
		arg0.aClass2_243 = arg1;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)I")
	public static int method2101(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static376.method6284(arg0);
	}
}
