import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class173 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	protected final int anInt6998;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public final int anInt6997;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public final int anInt6996;

	static {
		new Class79("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
	protected Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6998 = arg2;
		this.anInt6997 = arg0;
		this.anInt6996 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
	public abstract void method6247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public abstract void method6249(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
	public abstract void method6250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
