import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class240 {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public int anInt7023;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
	public boolean aBoolean476 = true;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method6260(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4814();
			if (local5 == 0) {
				return;
			}
			this.method6263(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Z")
	public boolean method6262() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!bt;)V")
	private void method6263(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static78.method5697(arg1.method4824());
		} else if (arg0 == 2) {
			this.anInt7023 = arg1.method4835();
		} else if (arg0 == 4) {
			this.aBoolean476 = false;
		} else if (arg0 == 5) {
			this.aString69 = arg1.method4808();
		}
	}
}
