import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!h;")
	public static Class89 aClass89_144 = new Class89(103, 0);

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!gd;")
	public static Class79 aClass79_76 = new Class79("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Lclient!gd;")
	public static Class79 aClass79_77 = new Class79("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(CZ)Z")
	public static boolean method3454(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public static void method3455() {
		aClass79_77 = null;
		aClass79_76 = null;
		aClass89_144 = null;
		anIntArrayArray25 = null;
	}
}
