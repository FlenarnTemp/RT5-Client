import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public static int anInt6446;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "[B")
	public static final byte[] aByteArray94 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	public static int anInt6448 = 0;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public static int anInt6449 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method5827() {
		Static237.aBoolean297 = true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!r;Lclient!wm;)V")
	public static void method5829(@OriginalArg(1) Class197 arg0, @OriginalArg(2) Class19 arg1) {
		if (Static283.loaded) {
			return;
		}
		arg1.method2867(0);
		Static252.aClass13_14 = arg1.method2891(Static396.method1676(arg0, Static75.anInt1736));
		Static252.aClass13_14.method6384((Static250.anInt4665 - Static252.aClass13_14.method6398()) / 2, (Static172.anInt3299 - Static252.aClass13_14.method6383()) / 2);
		Static333.aClass13_21 = arg1.method2891(Static396.method1676(arg0, Static265.anInt4856));
		Static333.aClass13_21.method6384((Static250.anInt4665 - Static333.aClass13_21.method6398()) / 2, 18);
		Static283.loaded = true;
	}
}
