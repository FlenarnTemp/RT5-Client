import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!we", name = "E", descriptor = "I")
	public static int anInt7140;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public static int anInt7141;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "[I")
	public static int[] anIntArray490 = new int[13];

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!gd;")
	public static Class79 aClass79_147 = new Class79("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!we", name = "D", descriptor = "Lclient!mc;")
	public static Class145 aClass145_258 = new Class145(49, -1);

	@OriginalMember(owner = "client!we", name = "F", descriptor = "Lclient!mc;")
	public static Class145 aClass145_259 = new Class145(50, 3);

	@OriginalMember(owner = "client!we", name = "G", descriptor = "Lclient!mc;")
	public static Class145 aClass145_260 = new Class145(47, 7);

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Lclient!mc;")
	public static Class145 aClass145_261 = new Class145(1, -1);

	@OriginalMember(owner = "client!we", name = "J", descriptor = "Lclient!mc;")
	public static Class145 aClass145_262 = new Class145(79, 7);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method6360(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static246.method4250(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static11.method244(arg0, local45);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6361(@OriginalArg(0) Class197 arg0) {
		Static146.anInt2706 = 0;
		Static82.anInt1835 = 0;
		Static131.aClass36_4 = new Class36();
		Static98.aClass12_Sub1_Sub1_Sub1Array1 = new Class12_Sub1_Sub1_Sub1[1024];
		Static285.method4894(arg0);
		Static152.method2768(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hk;")
	public static RuntimeException_Sub1 method6363(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString23 = local9.aString23 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZI)Lclient!cu;")
	public static Class2_Sub7 method6364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub7 local7 = new Class2_Sub7();
		local7.anInt1370 = arg3;
		local7.anInt1373 = arg1;
		Static329.aClass4_130.method87(local7, (long) arg0);
		Static160.method2956(arg3);
		@Pc(26) Class161 local26 = Static6.method140(arg0);
		if (local26 != null) {
			Static200.method3644(local26);
		}
		if (Static192.aClass161_8 != null) {
			Static200.method3644(Static192.aClass161_8);
			Static192.aClass161_8 = null;
		}
		Static227.method3988();
		if (local26 != null) {
			Static85.method1911(!arg2, local26);
		}
		if (!arg2) {
			Static198.method3597(arg3);
		}
		if (!arg2 && Static139.anInt2595 != -1) {
			Static392.method6459(Static139.anInt2595, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method6365() {
		anIntArray490 = null;
		aClass145_262 = null;
		aClass145_261 = null;
		aClass145_260 = null;
		aClass79_147 = null;
		aClass145_259 = null;
		aClass145_258 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
	public static int method6366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}
}
