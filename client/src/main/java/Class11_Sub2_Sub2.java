import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!el;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIILclient!el;)V")
	public Class11_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass11_Sub2_1 = arg3;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I")
	@Override
	public int method6083() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6082(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6069(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	@Override
	public void method6081() {
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
	@Override
	public void method6068() {
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6072(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6085() {
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I")
	@Override
	public int method6080() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6086(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6075() {
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
	@Override
	public int method6084() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Class31 method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}
}
