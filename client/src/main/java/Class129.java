import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class129 implements Runnable {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!ml;")
	public Class152 aClass152_3;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "[Lclient!tg;")
	public final Class221[] aClass221Array1 = new Class221[2];

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Z")
	public volatile boolean aBoolean227 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Z")
	public volatile boolean aBoolean226 = false;

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean226 = true;
		try {
			while (!this.aBoolean227) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class221 local19 = this.aClass221Array1[local12];
					if (local19 != null) {
						local19.method6315();
					}
				}
				Static231.method4022(10L);
				Static283.method4875(this.aClass152_3, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static262.method6252(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean226 = false;
		}
	}
}
