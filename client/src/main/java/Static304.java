import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!mc;")
	public static Class145 aClass145_200 = new Class145(7, 4);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)Z")
	public static boolean method5212(@OriginalArg(1) int arg0) {
		return arg0 == 45 || arg0 == 11 || arg0 == 1011 || arg0 == 49 || arg0 == 30;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
	public static void method5220() {
		aClass145_200 = null;
	}
}
