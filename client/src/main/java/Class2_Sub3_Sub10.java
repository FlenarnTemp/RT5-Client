import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public class Class2_Sub3_Sub10 extends TextureOp {

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
	protected int anInt6672;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "[I")
	protected int[] anIntArray463;

	@OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
	protected int anInt6680;

	@OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
	private int anInt6675 = -1;

	static {
		new LocalisedText(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public final void method6483(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt6675 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
	protected final boolean method5982() {
		if (this.anIntArray463 != null) {
			return true;
		} else if (this.anInt6675 >= 0) {
			@Pc(34) Class48 local34 = Static123.anInt2421 >= 0 ? Static396.method1682(Static111.aClass197_24, Static123.anInt2421, this.anInt6675) : Static396.method1676(Static111.aClass197_24, this.anInt6675);
			local34.method1681();
			this.anIntArray463 = local34.method1685();
			this.anInt6680 = local34.anInt1533;
			this.anInt6672 = local34.anInt1531;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	@Override
	public final void method6476() {
		super.method6476();
		this.anIntArray463 = null;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	@Override
	public final int method6477() {
		return this.anInt6675;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6478(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass243_41.method6276(arg0);
		if (super.aClass243_41.aBoolean478 && this.method5982()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(57) int local57 = this.anInt6672 * (Static24.anInt638 == this.anInt6680 ? arg0 : arg0 * this.anInt6680 / Static24.anInt638);
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (this.anInt6672 == Static227.anInt4036) {
				for (local67 = 0; local67 < Static227.anInt4036; local67++) {
					local75 = this.anIntArray463[local57++];
					local37[local67] = (local75 & 0xFF) << 4;
					local33[local67] = local75 >> 4 & 0xFF0;
					local29[local67] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static227.anInt4036; local67++) {
					local75 = local67 * this.anInt6672 / Static227.anInt4036;
					@Pc(124) int local124 = this.anIntArray463[local57 + local75];
					local37[local67] = (local124 & 0xFF) << 4;
					local33[local67] = local124 >> 4 & 0xFF0;
					local29[local67] = local124 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}
}
