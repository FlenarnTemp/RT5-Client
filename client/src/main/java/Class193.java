import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class193 {

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "Lclient!r;")
	private final Class197 aClass197_72;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public final int anInt5494;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public Class193(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		new SoftLruHashTable(64);
		this.aClass197_72 = arg2;
		this.anInt5494 = this.aClass197_72.method5080(15);
	}
}
