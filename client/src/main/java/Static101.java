import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!r;")
	public static Class197 aClass197_23;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!gd;")
	public static Class79 aClass79_44 = new Class79("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Lclient!mc;")
	public static Class145 aClass145_75 = new Class145(8, 6);

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public static void method2162() {
		aClass197_23 = null;
		aClass145_75 = null;
		aClass79_44 = null;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IIII)V")
	public static void method2163(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg3 < local15) {
			@Pc(19) int local19 = arg3 + 1;
			arg1[local19] = arg2;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg2;
			arg3 = local49 + 1;
			arg1[arg3] = arg2;
		}
		while (arg3 < local12) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!np;)Z")
	public static boolean method2164(@OriginalArg(1) Class164 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean305) {
			return false;
		} else if (!arg0.method4179(Static344.anInterface11_2)) {
			return false;
		} else if (Static220.aClass4_83.method90((long) arg0.anInt4430) == null) {
			return Static141.aClass4_58.method90((long) arg0.anInt4424) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILclient!r;)Lclient!vi;")
	public static Class239 method2165(@OriginalArg(2) int arg0, @OriginalArg(3) Class197 arg1) {
		@Pc(13) byte[] local13 = arg1.method5088(0, arg0);
		return local13 == null ? null : new Class239(local13);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
	public static int method2166(@OriginalArg(1) int arg0) {
		if (Static335.aClass111_4 != null) {
			Static335.aClass111_4.method2799();
			Static335.aClass111_4 = null;
		}
		Static12.anInt270++;
		if (Static12.anInt270 > 4) {
			Static12.anInt270 = 0;
			Static77.anInt1751 = 0;
			return arg0;
		}
		Static77.anInt1751 = 0;
		if (Static278.anInt5154 == Static392.anInt7225) {
			Static278.anInt5154 = Static35.anInt920;
		} else {
			Static278.anInt5154 = Static392.anInt7225;
		}
		return -1;
	}
}