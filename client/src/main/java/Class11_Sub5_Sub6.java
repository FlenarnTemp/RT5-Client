import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class11_Sub5_Sub6 extends Class11_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "Lclient!hb;")
	public Class11_Sub5 aClass11_Sub5_2;

	static {
		new LocalisedText("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIIIIIILclient!hb;)V")
	public Class11_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class11_Sub5 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static356.method5955(arg1, arg0));
		this.aClass11_Sub5_2 = arg10;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	@Override
	public void method6068() {
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I")
	@Override
	public int method6084() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6086(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6085() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)I")
	@Override
	public int method6079() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6087(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I")
	@Override
	public int method6083() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6072(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	@Override
	public void method6081() {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6082(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6075() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6069(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	@Override
	public int method6080() {
		return 0;
	}
}
