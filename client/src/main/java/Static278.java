import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	public static int anInt5154;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!ng;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!gd;")
	public static Class79 aClass79_110 = new Class79("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "[Lclient!bp;")
	public static Class28[] aClass28Array1 = new Class28[16];

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "[I")
	public static int[] anIntArray362 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public static void method4720() {
		anIntArray362 = null;
		aClass79_110 = null;
		aClass160_1 = null;
		aClass28Array1 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4721(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static234.method4098(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public static void method4722(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static316.method5412(6, arg0);
		local12.method2312();
	}
}
