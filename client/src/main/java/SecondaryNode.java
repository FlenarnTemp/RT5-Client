import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class SecondaryNode extends Node {

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "Lclient!tl;")
	public SecondaryNode secondaryNext;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "J")
	public long secondaryKey;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "Lclient!tl;")
	public SecondaryNode secondaryPrev;

	static {
		new LocalizedString("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Z")
	public final boolean islinkedSecondary() {
		return this.secondaryPrev != null;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
	public final void unlinkSecondary() {
		if (this.secondaryPrev != null) {
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryNext = null;
			this.secondaryPrev = null;
		}
	}
}
