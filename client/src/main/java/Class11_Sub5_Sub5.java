import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class11_Sub5_Sub5 extends Class11_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!us", name = "J", descriptor = "Lclient!ql;")
	public final Class192 aClass192_4;

	@OriginalMember(owner = "client!us", name = "E", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIZIIIIIII)V")
	public Class11_Sub5_Sub5(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1354 == 1, Static330.method5652(arg13, arg12));
		this.aClass192_4 = new Class192(arg0, arg1, arg12, arg13, super.aByte78, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean459 = arg1.anInt1335 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
	@Override
	public void method6081() {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6072(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Model local16 = this.aClass192_4.method4940(true, false, arg0, 1024, super.anInt6783, super.anInt6781);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class14 local23 = arg0.method2808();
		local23.method3921(super.anInt6781, super.anInt6782, super.anInt6783);
		@Pc(38) Class12_Sub4 local38 = null;
		if (this.aBoolean459) {
			local38 = Static147.method2706(1);
		}
		if (this.aClass192_4.aClass12_Sub5_5 == null) {
			local16.method3834(local23, local38 == null ? null : local38.aClass12_Sub2Array1[0], 0);
		} else {
			@Pc(54) Class224 local54 = this.aClass192_4.aClass12_Sub5_5.method4357();
			arg0.method2824(local16, local54, local23, local38 == null ? null : local38.aClass12_Sub2Array1[0]);
		}
		this.aClass192_4.method4934(arg0, super.aShort101, local16, super.aShort103, super.aShort102, true, super.aShort104);
		return local38;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
	@Override
	public int method6080() {
		return this.aClass192_4.anInt5433;
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(I)I")
	@Override
	public int method6079() {
		return this.aClass192_4.method4935();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6085() {
		return this.aClass192_4.method4937();
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
	@Override
	public void method6068() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)I")
	@Override
	public int method6083() {
		return this.aClass192_4.anInt5429;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6069(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Model local16 = this.aClass192_4.method4940(true, true, arg0, 131072, super.anInt6783, super.anInt6781);
		if (local16 != null) {
			this.aClass192_4.method4934(arg0, super.aShort101, local16, super.aShort103, super.aShort102, false, super.aShort104);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6086(@OriginalArg(1) Class19 arg0) {
		this.aClass192_4.method4929(arg0);
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(I)I")
	@Override
	public int method6084() {
		return this.aClass192_4.anInt5432;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(23) Model local23 = this.aClass192_4.method4940(false, false, arg2, 65536, super.anInt6783, super.anInt6781);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class14 local30 = arg2.method2808();
			local30.method3921(super.anInt6781, super.anInt6782, super.anInt6783);
			return local23.method3819(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass192_4.method4940(false, false, arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6082(@OriginalArg(0) Class19 arg0) {
		this.aClass192_4.method4939(arg0);
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6075() {
		return false;
	}
}
