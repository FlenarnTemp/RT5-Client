import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt7079;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_43 = new Class135();

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static int anInt7077 = 0;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_146 = new Class79("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lclient!vj;")
	public static Class2_Sub2_Sub17 method6311() {
		return Static344.aClass2_Sub2_Sub17_3;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
	public static boolean method6313(@OriginalArg(1) int arg0) {
		Static1.aBoolean1 = true;
		Static292.anInt5510 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
