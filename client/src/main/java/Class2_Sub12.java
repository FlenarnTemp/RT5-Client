import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "Lclient!ll;")
	public Class2_Sub12 aClass2_Sub12_5;

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	public int anInt5476;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "Lclient!ls;")
	public Class2_Sub21 aClass2_Sub21_5;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "Z")
	public volatile boolean aBoolean389 = true;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()Lclient!ll;")
	public abstract Class2_Sub12 method4971();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([III)V")
	public abstract void method4972(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public abstract void method4973(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "([III)V")
	protected final void method4974(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean389) {
			this.method4972(arg0, arg1, arg2);
		} else {
			this.method4973(arg2);
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "()I")
	public int method4975() {
		return 255;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "()I")
	public abstract int method4976();

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "()Lclient!ll;")
	public abstract Class2_Sub12 method4977();
}
