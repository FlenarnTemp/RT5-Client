import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class Class119 {

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	protected Class119() {
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z")
	protected abstract boolean method3302();

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
	public abstract int method3303();

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Z")
	public final boolean method3304() {
		return this.method3310() || this.method3308() || this.method3302();
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public abstract void method3306();

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Lclient!lm;")
	public abstract Class2_Sub24 method3307();

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Z")
	protected abstract boolean method3308();

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Z")
	public abstract boolean method3310();

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
	public abstract void method3311();

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I")
	public abstract int method3312();
}
