import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static328 {

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	public static int anInt6127;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Lclient!ml;")
	public static Class152 aClass152_5;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!gd;")
	public static Class79 aClass79_127 = new Class79(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
	public static int[] anIntArray416 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Z")
	public static volatile boolean aBoolean412 = true;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
	public static void method5594() {
		aClass79_127 = null;
		aClass152_5 = null;
		anIntArray416 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BC)Z")
	public static boolean method5597(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
