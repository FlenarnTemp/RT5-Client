import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!h;")
	public static Class89 aClass89_199 = new Class89(98, -2);

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "F")
	public static float aFloat68 = 0.0F;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
	public static int[] anIntArray381 = new int[14];

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_109 = new Class4(16);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!hc;IIIII)V")
	public static void method5102(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7113 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub26_Sub1Array3[local4] != null) {
				arg0.anInt7113++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt7113; local22++) {
			@Pc(31) long local31 = Static51.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class2_Sub26_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static306.aClass2_Sub26_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub26_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static51.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static306.aClass2_Sub26_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub26_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt7113 - 1; local91++) {
				arg0.aClass2_Sub26_Sub1Array3[local91] = arg0.aClass2_Sub26_Sub1Array3[local91 + 1];
			}
			arg0.anInt7113--;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method5103() {
		Static174.aClass123_2.method3337();
		Static226.aClass119_1.method3311();
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3690(Static21.aCanvas1);
		}
		Static144.aClient1.method1379();
		Static21.aCanvas1.setBackground(Color.black);
		Static29.anInt721 = -1;
		Static174.aClass123_2 = Static18.method556(Static21.aCanvas1);
		Static226.aClass119_1 = Static31.method948(Static21.aCanvas1);
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3691(Static21.aCanvas1);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static void method5105() {
		aClass4_109 = null;
		anIntArray381 = null;
		aClass89_199 = null;
	}
}