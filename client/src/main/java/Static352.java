import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array25;

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
	public static int anInt6519;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_9 = new Class36();

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "J")
	public static long aLong202 = -1L;

	@OriginalMember(owner = "client!uh", name = "W", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
	public static void method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static257.aClass2_Sub4_Sub2_4.offset = 0;
		Static257.aClass2_Sub4_Sub2_4.p1(Static43.aClass242_6.anInt7038);
		Static257.aClass2_Sub4_Sub2_4.p1(arg2);
		Static257.aClass2_Sub4_Sub2_4.p1(arg3);
		Static257.aClass2_Sub4_Sub2_4.p2(arg1);
		Static257.aClass2_Sub4_Sub2_4.p2(arg0);
		Static327.anInt6109 = 0;
		Static66.anInt1625 = 0;
		Static318.anInt5968 = -3;
		Static141.anInt2652 = 1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method5876() {
		if (Static363.aFrame2 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (GameShell.frame == null) {
			local13 = GameShell.signlink.applet;
		} else {
			local13 = GameShell.frame;
		}
		Static142.anInt2663 = local13.getSize().width;
		Static178.anInt2319 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (local13 == GameShell.frame) {
			local31 = GameShell.frame.getInsets();
			Static178.anInt2319 -= local31.bottom + local31.top;
			Static142.anInt2663 -= local31.right + local31.left;
		}
		if (Static144.method2692() == 1) {
			Static172.anInt3299 = Static263.anInt4834;
			Static250.anInt4665 = Static254.anInt4701;
			Static68.anInt1646 = 0;
			Static84.anInt1842 = (Static142.anInt2663 - Static254.anInt4701) / 2;
		} else if (GameShell.maxMemory < 96 && Static77.anInt1762 == 0) {
			@Pc(70) int local70 = Static142.anInt2663 > 1024 ? 1024 : Static142.anInt2663;
			@Pc(79) int local79 = Static178.anInt2319 > 768 ? 768 : Static178.anInt2319;
			Static250.anInt4665 = local70;
			Static84.anInt1842 = (Static142.anInt2663 - local70) / 2;
			Static68.anInt1646 = 0;
			Static172.anInt3299 = local79;
		} else {
			Static172.anInt3299 = Static178.anInt2319;
			Static250.anInt4665 = Static142.anInt2663;
			Static68.anInt1646 = 0;
			Static84.anInt1842 = 0;
		}
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			@Pc(130) boolean local130;
			if (Static250.anInt4665 < 1024 && Static172.anInt3299 < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		GameShell.canvas.setSize(Static250.anInt4665, Static172.anInt3299);
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2803();
		}
		if (local13 == GameShell.frame) {
			local31 = GameShell.frame.getInsets();
			GameShell.canvas.setLocation(Static84.anInt1842 + local31.left, local31.top - -Static68.anInt1646);
		} else {
			GameShell.canvas.setLocation(Static84.anInt1842, Static68.anInt1646);
		}
		if (Static139.anInt2595 != -1) {
			Static60.method891(true);
		}
		Static372.method6259();
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V")
	public static void method5879() {
		if (Static369.aBoolean471) {
			return;
		}
		Static100.aBoolean156 = true;
		if (Static218.aClass177_Sub1_2.aBoolean351) {
			Static277.aFloat67 = (int) Static277.aFloat67 + 191 & 0xFFFFFF80;
		} else {
			Static184.aFloat39 += (24.0F - Static184.aFloat39) / 2.0F;
		}
		Static369.aBoolean471 = true;
	}
}
