import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub3_Sub33 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
	private int anInt5917 = 0;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
	private int anInt5916 = 2048;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
	private int anInt5910 = 10;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	@Override
	public void method6479() {
		this.method5368();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6483(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt5910 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt5916 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt5917 = arg1.g1();
		}
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
	private void method5368() {
		@Pc(7) int local7 = 0;
		this.anIntArray389 = new int[this.anInt5910 + 1];
		this.anIntArray390 = new int[this.anInt5910 + 1];
		@Pc(32) int local32 = 4096 / this.anInt5910;
		@Pc(39) int local39 = local32 * this.anInt5916 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt5910; local41++) {
			this.anIntArray389[local41] = local7;
			this.anIntArray390[local41] = local7 + local39;
			local7 += local32;
		}
		this.anIntArray389[this.anInt5910] = 4096;
		this.anIntArray390[this.anInt5910] = this.anIntArray390[0] + 4096;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6484(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass158_41.method3995(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(25) int local25 = Static16.anIntArray322[arg0];
			@Pc(34) int local34;
			if (this.anInt5917 == 0) {
				@Pc(138) short local138 = 0;
				for (local34 = 0; local34 < this.anInt5910; local34++) {
					if (local25 >= this.anIntArray389[local34] && this.anIntArray389[local34 + 1] > local25) {
						if (local25 < this.anIntArray390[local34]) {
							local138 = 4096;
						}
						break;
					}
				}
				Static403.method4609(local17, 0, Static227.anInt4036, local138);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static227.anInt4036; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static334.anIntArray424[local30];
					@Pc(43) int local43 = this.anInt5917;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local40 + local25 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt5910; local43++) {
						if (this.anIntArray389[local43] <= local34 && local34 < this.anIntArray389[local43 + 1]) {
							if (this.anIntArray390[local43] > local34) {
								local36 = 4096;
							}
							break;
						}
					}
					local17[local30] = local36;
				}
			}
		}
		return local17;
	}
}
