import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	public static int anInt6309;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "Lclient!r;")
	public static Class197 aClass197_89;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!h;")
	public static Class89 aClass89_223 = new Class89(15, 10);

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "[S")
	public static short[] aShortArray123 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!gd;")
	public static Class79 aClass79_128 = new Class79("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "S")
	public static short aShort86 = 1;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Lclient!gd;")
	public static Class79 aClass79_129 = new Class79("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!h;")
	public static Class89 aClass89_224 = new Class89(31, 8);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V")
	public static void method5696(@OriginalArg(1) int arg0) {
		Static77.anInt1763 = -1;
		Static96.anInt2003 = arg0;
		Static77.anInt1763 = -1;
		Static298.method2422();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)C")
	public static char method5697(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(43) char local43 = Static172.aCharArray2[local12 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local12 = local43;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!wm;ILclient!mg;)I")
	public static int method5698(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class148 arg1) {
		if (arg1.anInt3757 != -1) {
			return arg1.anInt3757;
		}
		if (arg1.anInt3762 != -1) {
			@Pc(30) Class229 local30 = arg0.anInterface2_5.method2658(arg0.method2871() ? arg1.anInt3762 : arg1.anInt3759);
			if (!local30.aBoolean438) {
				return local30.aShort87;
			}
		}
		return arg1.anInt3769;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method5699() {
		aClass89_224 = null;
		aClass79_128 = null;
		aClass197_89 = null;
		aShortArray123 = null;
		aClass79_129 = null;
		aClass89_223 = null;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)V")
	public static void method5700(@OriginalArg(0) int arg0) {
		Static335.method5693();
		Static296.method5103();
		Static252.method4364(true, arg0);
		Static236.method4101(Static30.aClass197_5, Static255.aClass197_64, Static190.aClass19_8);
		Static44.method1358(Static190.aClass19_8, Static30.aClass197_5);
		Static144.method2691(Static124.aClass13Array27);
		Static190.method3501();
		Static98.method2107();
		if (Static347.anInt6442 == 10) {
			Static50.method1525(false);
		} else if (Static347.anInt6442 == 30) {
			Static336.method5704(25);
			return;
		} else if (Static347.anInt6442 == 5) {
			Static348.method5829(Static30.aClass197_5, Static190.aClass19_8);
			return;
		}
	}
}