import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array12;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "[I")
	public static int[] anIntArray163 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
	public static int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!gd;")
	public static Class79 aClass79_59 = new Class79("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public static void method2508() {
		aClass13Array12 = null;
		anIntArray164 = null;
		anIntArray163 = null;
		aClass79_59 = null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!r;)I")
	public static int method2509(@OriginalArg(1) Class197 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5086(Static373.anInt7028)) {
			local5++;
		}
		if (arg0.method5086(Static192.anInt3545)) {
			local5++;
		}
		if (arg0.method5086(Static256.anInt4745)) {
			local5++;
		}
		if (arg0.method5086(Static382.anInt7140)) {
			local5++;
		}
		if (arg0.method5086(Static166.anInt3193)) {
			local5++;
		}
		if (arg0.method5086(Static390.anInt7206)) {
			local5++;
		}
		if (arg0.method5086(Static363.anInt6792)) {
			local5++;
		}
		if (arg0.method5086(Static237.anInt4324)) {
			local5++;
		}
		if (arg0.method5086(Static155.anInt2811)) {
			local5++;
		}
		if (arg0.method5086(Static326.anInt6236)) {
			local5++;
		}
		if (arg0.method5086(Static169.anInt3205)) {
			local5++;
		}
		if (arg0.method5086(Static102.anInt3590)) {
			local5++;
		}
		if (arg0.method5086(Static32.anInt798)) {
			local5++;
		}
		if (arg0.method5086(Static139.anInt2594)) {
			local5++;
		}
		if (arg0.method5086(Static322.anInt6031)) {
			local5++;
		}
		if (arg0.method5086(Static373.anInt7030)) {
			local5++;
		}
		return local5;
	}
}