import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!h;")
	public static Class89 aClass89_248 = new Class89(94, 3);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIILclient!nk;)V")
	public static void method6334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class161 arg2) {
		if (Static375.aClass161_14 != null || Static375.aBoolean477 || (arg2 == null || Static207.method3702(arg2) == null)) {
			return;
		}
		Static375.aClass161_14 = arg2;
		Static301.aClass161_13 = Static207.method3702(arg2);
		Static129.anInt2458 = 0;
		Static57.aBoolean124 = false;
		Static392.anInt7228 = arg1;
		Static18.anInt530 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method6339() {
		aClass89_248 = null;
	}
}