import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static232 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[Lclient!oi;")
	public static Class169[] aClass169Array1;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "Lclient!on;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array17;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_86 = new Class4(16);

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public static int anInt4087 = 0;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!rt;")
	public static Class209 aClass209_3 = new Class209("LIVE", 0);

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
	public static void method4026(@OriginalArg(1) int arg0) {
		Static90.anInt6637 = 100;
		Static243.anInt4495 = 3;
		Static236.anInt4301 = arg0;
		Static225.anInt3979 = -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method4027(@OriginalArg(1) int arg0) {
		if (Static222.method3915(arg0)) {
			Static181.method3377(Static26.aClass161ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
	public static void method4031() {
		aClass169Array1 = null;
		aClass209_3 = null;
		aByteArrayArray9 = null;
		aClass4_86 = null;
		aClass14_4 = null;
		aClass13Array17 = null;
	}
}
