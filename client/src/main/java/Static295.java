import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "[Lclient!ac;")
	public static Class3_Sub1[] aClass3_Sub1Array1;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public static int anInt5567 = 0;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_32 = new Class135();

	@OriginalMember(owner = "client!r", name = "M", descriptor = "I")
	public static int anInt5581 = 0;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "[I")
	public static final int[] anIntArray375 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(B)V")
	public static void method5093() {
		Static65.anIntArray110 = null;
		Static274.anIntArray352 = null;
		Static322.anIntArray404 = null;
		Static263.aBoolean330 = false;
		Static375.anIntArray481 = null;
		Static332.anIntArray428 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nk;ZLclient!nk;)V")
	public static void method5095(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class161 arg1) {
		Static91.method1960(Static387.aClass145_110);
		Static257.aClass2_Sub4_Sub2_4.p4(arg1.anInt4317);
		Static257.aClass2_Sub4_Sub2_4.ip2add(arg1.anInt4300);
		Static257.aClass2_Sub4_Sub2_4.p2add(arg1.anInt4297);
		Static257.aClass2_Sub4_Sub2_4.mp4(arg0.anInt4317);
		Static257.aClass2_Sub4_Sub2_4.ip2add(arg0.anInt4300);
		Static257.aClass2_Sub4_Sub2_4.ip2_dup(arg0.anInt4297);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I")
	public static int method5098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)Lclient!js;")
	public static Class2_Sub2_Sub11 method5099(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub2_Sub11 local15 = (Class2_Sub2_Sub11) Static261.aClass116_7.method3151((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static195.aClass197_54.fetchFile(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static214.method3744(local25);
			Static261.aClass116_7.method3154(local15, (long) arg0);
			return local15;
		}
	}
}
