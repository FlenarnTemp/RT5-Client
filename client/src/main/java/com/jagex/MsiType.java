package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!md")
public final class MsiType {

	@OriginalMember(owner = "com.jagex.client!md", name = "f", descriptor = "Lclient!ii;")
	public MsiTypeList aClass104_1;

	@OriginalMember(owner = "com.jagex.client!md", name = "h", descriptor = "I")
	public int anInt3751;

	@OriginalMember(owner = "com.jagex.client!md", name = "j", descriptor = "I")
	public int anInt3752;

	@OriginalMember(owner = "com.jagex.client!md", name = "i", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "com.jagex.client!md", name = "a", descriptor = "(ILclient!bt;)V")
	public void decode(@OriginalArg(1) Packet buf) {
		while (true) {
			@Pc(13) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(code, buf);
		}
	}

	@OriginalMember(owner = "com.jagex.client!md", name = "a", descriptor = "(Z)Z")
	public boolean method3708() {
		return this.aClass104_1.aClass197_39.requestDownload(this.anInt3751);
	}

	@OriginalMember(owner = "com.jagex.client!md", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 1) {
			this.anInt3751 = buf.g2();
		} else if (code == 2) {
			this.anInt3752 = buf.g3();
		} else if (code == 3) {
			this.aBoolean243 = true;
		} else if (code == 4) {
			this.anInt3751 = -1;
		}
	}

	@OriginalMember(owner = "com.jagex.client!md", name = "a", descriptor = "(ZZILclient!wm;)Lclient!jd;")
	public Sprite method3711(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Renderer arg2) {
		@Pc(24) long local24 = (long) (this.anInt3751 | arg1 << 16 | (arg0 ? 262144 : 0) | arg2.anInt2836 << 19);
		@Pc(32) Sprite local32 = (Sprite) this.aClass104_1.aClass98_20.get(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass104_1.aClass197_39.requestDownload(this.anInt3751)) {
			@Pc(54) SpriteData local54 = Static396.method1682(this.aClass104_1.aClass197_39, this.anInt3751, 0);
			if (local54 != null) {
				local54.anInt1534 = local54.anInt1535 = local54.anInt1532 = local54.anInt1530 = 0;
				if (arg0) {
					local54.method1687();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method1675();
				}
			}
			local32 = arg2.method2891(local54);
			if (local32 != null) {
				this.aClass104_1.aClass98_20.put(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}
}
