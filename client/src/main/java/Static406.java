import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!r;II)Lclient!sl;")
	public static Class2_Sub34 method5447(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method5088(arg2, arg1);
		return local5 == null ? null : new Class2_Sub34(new Class2_Sub4(local5));
	}
}