import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!us", name = "B", descriptor = "I")
	public static int anInt6697;

	@OriginalMember(owner = "client!us", name = "H", descriptor = "I")
	public static int anInt6702;

	@OriginalMember(owner = "client!us", name = "S", descriptor = "Lclient!rh;")
	public static Class202 aClass202_4;

	@OriginalMember(owner = "client!us", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "Lclient!gd;")
	public static Class79 aClass79_140 = new Class79(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!us", name = "R", descriptor = "Lclient!s;")
	public static Class210 aClass210_14 = new Class210(14, 14);

	@OriginalMember(owner = "client!us", name = "T", descriptor = "Lclient!rt;")
	public static Class209 aClass209_4 = new Class209("WIP", 2);

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)V")
	public static void method6008() {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static316.method5412(15, 0);
		local12.method2312();
	}

	@OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V")
	public static void method6009() {
		aClass202_4 = null;
		aClass210_14 = null;
		aClass209_4 = null;
		aByteArrayArrayArray16 = null;
		aClass79_140 = null;
	}
}
