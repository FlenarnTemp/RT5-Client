import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class MapElement extends Node {

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
	public int anInt2944;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
	public int anInt2948;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
	public int id = -1;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "Z")
	public boolean aBoolean207 = false;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public MapElement(@OriginalArg(0) int arg0) {
		this.id = arg0;
	}
}
