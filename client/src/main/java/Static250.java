import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public static int anInt4665;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_6 = new Class16("", 12);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	public static void method4342(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5412(5, arg0);
		local8.method2312();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLclient!mr;IIII)V")
	public static void method4343(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub5_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static324.method5540(arg0, arg1.anInt6783, arg1.aByte78, 0, arg2, arg1.anInt6781, arg3);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)V")
	public static void method4345(@OriginalArg(0) int arg0) {
		Static44.anInt1106 = 1000 / arg0;
	}
}
