import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static394 {

	@OriginalMember(owner = "client!wt", name = "X", descriptor = "Lclient!h;")
	public static final Class89 aClass89_258 = new Class89(26, 28);

	@OriginalMember(owner = "client!wt", name = "ab", descriptor = "I")
	public static int anInt7263 = -1;

	@OriginalMember(owner = "client!wt", name = "bb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_259 = new Class89(6, -2);

	@OriginalMember(owner = "client!wt", name = "cb", descriptor = "I")
	public static int anInt7264 = 0;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(IZI)B")
	public static byte method6486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
