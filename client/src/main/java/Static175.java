import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public static int anInt3348;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt3351;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!je;")
	public static WorldMapFont font17;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_132 = new Class145(9, 15);

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!rt;")
	public static final Class209 aClass209_1 = new Class209("RC", 1);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void method3323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 * Static218.aClass177_Sub1_2.musicVolume >> 8;
		if (local15 != 0 && arg0 != -1) {
			Static94.method2042(local15, arg0, Static216.aJs5_58);
			Static393.aBoolean486 = true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[[Lclient!f;B)V")
	public static void method3324(@OriginalArg(0) Class67[][][] arg0) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(15) Class67[][] local15 = arg0[local9];
			for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
				for (@Pc(21) int local21 = 0; local21 < local15[local17].length; local21++) {
					@Pc(29) Class67 local29 = local15[local17][local21];
					if (local29 != null) {
						if (local29.aClass11_Sub2_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub2_2).method6081();
						}
						if (local29.aClass11_Sub3_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub3_2).method6081();
						}
						if (local29.aClass11_Sub3_3 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub3_3).method6081();
						}
						if (local29.aClass11_Sub1_3 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub1_3).method6081();
						}
						if (local29.aClass11_Sub1_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub1_2).method6081();
						}
						for (@Pc(81) Class22 local81 = local29.aClass22_2; local81 != null; local81 = local81.aClass22_1) {
							@Pc(86) Class11_Sub5 local86 = local81.aClass11_Sub5_1;
							if (local86 instanceof Interface6) {
								((Interface6) local86).method6081();
							}
						}
					}
				}
			}
		}
	}
}
