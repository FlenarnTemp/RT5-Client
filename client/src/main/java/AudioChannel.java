import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

public class AudioChannel {

	@OriginalMember(owner = "client!up", name = "T", descriptor = "I")
	public static int sampleRate;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILclient!ml;Ljava/awt/Component;I)Lclient!tg;")
	public static Class221 create(@OriginalArg(1) int arg0, @OriginalArg(2) Signlink arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (sampleRate == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class221 local33 = (Class221) Class.forName("Class221_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt7096 = arg3;
			local33.anIntArray485 = new int[(Static354.aBoolean93 ? 2 : 1) * 256];
			local33.method6327(arg2);
			local33.anInt7099 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt7099 > 16384) {
				local33.anInt7099 = 16384;
			}
			local33.method6332(local33.anInt7099);
			if (Static200.anInt3698 > 0 && Static67.aClass129_1 == null) {
				Static67.aClass129_1 = new Class129();
				Static67.aClass129_1.aClass152_3 = arg1;
				arg1.startThread(Static200.anInt3698, Static67.aClass129_1);
			}
			if (Static67.aClass129_1 != null) {
				if (Static67.aClass129_1.aClass221Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static67.aClass129_1.aClass221Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class221_Sub2 local112 = new Class221_Sub2(arg1, arg0);
				local112.anInt7096 = arg3;
				local112.anIntArray485 = new int[(Static354.aBoolean93 ? 2 : 1) * 256];
				local112.method6327(arg2);
				local112.anInt7099 = 16384;
				local112.method6332(local112.anInt7099);
				if (Static200.anInt3698 > 0 && Static67.aClass129_1 == null) {
					Static67.aClass129_1 = new Class129();
					Static67.aClass129_1.aClass152_3 = arg1;
					arg1.startThread(Static200.anInt3698, Static67.aClass129_1);
				}
				if (Static67.aClass129_1 != null) {
					if (Static67.aClass129_1.aClass221Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static67.aClass129_1.aClass221Array1[arg0] = local112;
				}
				return local112;
			} catch (@Pc(186) Throwable local186) {
				return new Class221();
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZ)V")
	public static void init(@OriginalArg(3) boolean arg0) {
		Static354.aBoolean93 = arg0;
		Static200.anInt3698 = 2;
		sampleRate = 22050;
	}

}
