import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class154 {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!bt;")
	private Class2_Sub4 aClass2_Sub4_6;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "[Lclient!bl;")
	private Class25_Sub1[] aClass25_Sub1Array1;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Lclient!ro;")
	private final Class206 aClass206_3;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!pp;")
	private final Class183 aClass183_2;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!jj;")
	private Class2_Sub2_Sub10_Sub1 aClass2_Sub2_Sub10_Sub1_1;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!pp;Lclient!ro;)V")
	public Class154(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class206 arg1) {
		this.aClass206_3 = arg1;
		this.aClass183_2 = arg0;
		if (!this.aClass183_2.method4643()) {
			this.aClass2_Sub2_Sub10_Sub1_1 = this.aClass183_2.method4641(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!rq;ILclient!rq;)Lclient!bl;")
	public Class25_Sub1 method3870(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(3) Class207 arg2) {
		return this.method3874(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Z")
	public boolean method3871() {
		if (this.aClass2_Sub4_6 != null) {
			return true;
		}
		if (this.aClass2_Sub2_Sub10_Sub1_1 == null) {
			if (this.aClass183_2.method4643()) {
				return false;
			}
			this.aClass2_Sub2_Sub10_Sub1_1 = this.aClass183_2.method4641(true, 255, (byte) 0, 255);
		}
		if (this.aClass2_Sub2_Sub10_Sub1_1.aBoolean416) {
			return false;
		} else {
			this.aClass2_Sub4_6 = new Class2_Sub4(this.aClass2_Sub2_Sub10_Sub1_1.method5647());
			this.aClass25_Sub1Array1 = new Class25_Sub1[(this.aClass2_Sub4_6.aByteArray73.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZLclient!rq;Lclient!rq;I)Lclient!bl;")
	private Class25_Sub1 method3874(@OriginalArg(0) int arg0, @OriginalArg(2) Class207 arg1, @OriginalArg(3) Class207 arg2) {
		if (this.aClass2_Sub4_6 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub4_6.anInt5300 = arg0 * 8 + 5;
		if (this.aClass2_Sub4_6.anInt5300 >= this.aClass2_Sub4_6.aByteArray73.length) {
			throw new RuntimeException();
		} else if (this.aClass25_Sub1Array1[arg0] == null) {
			@Pc(45) int local45 = this.aClass2_Sub4_6.method4835();
			@Pc(50) int local50 = this.aClass2_Sub4_6.method4835();
			@Pc(64) Class25_Sub1 local64 = new Class25_Sub1(arg0, arg1, arg2, this.aClass183_2, this.aClass206_3, local45, local50, true);
			this.aClass25_Sub1Array1[arg0] = local64;
			return local64;
		} else {
			return this.aClass25_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
	public void method3876() {
		if (this.aClass25_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass25_Sub1Array1.length; local11++) {
			if (this.aClass25_Sub1Array1[local11] != null) {
				this.aClass25_Sub1Array1[local11].method892();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass25_Sub1Array1.length; local38++) {
			if (this.aClass25_Sub1Array1[local38] != null) {
				this.aClass25_Sub1Array1[local38].method894();
			}
		}
	}
}