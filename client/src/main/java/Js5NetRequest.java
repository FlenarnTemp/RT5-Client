import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Js5NetRequest extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public int anInt3083;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "Lclient!bt;")
	public Buffer aClass2_Sub4_3;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method5647() {
		if (super.aBoolean416 || this.aClass2_Sub4_3.offset < this.aClass2_Sub4_3.data.length - this.aByte27) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub4_3.data;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I")
	@Override
	public int method5650() {
		return this.aClass2_Sub4_3 == null ? 0 : this.aClass2_Sub4_3.offset * 100 / (this.aClass2_Sub4_3.data.length - this.aByte27);
	}
}
