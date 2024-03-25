package com.jagex.game.config.lighttype;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!et")
public final class LightType {

	@OriginalMember(owner = "com.jagex.client!et", name = "a", descriptor = "I")
	public int anInt1877 = 0;

	@OriginalMember(owner = "com.jagex.client!et", name = "e", descriptor = "I")
	public int anInt1880 = 0;

	@OriginalMember(owner = "com.jagex.client!et", name = "c", descriptor = "I")
	public int anInt1879 = 2048;

	@OriginalMember(owner = "com.jagex.client!et", name = "h", descriptor = "I")
	public int anInt1883 = 2048;

	@OriginalMember(owner = "com.jagex.client!et", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(9) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!et", name = "a", descriptor = "(Lclient!bt;IZ)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(1) int code) {
		if (code == 1) {
			this.anInt1877 = buf.g1();
		} else if (code == 2) {
			this.anInt1883 = buf.g2();
		} else if (code == 3) {
			this.anInt1879 = buf.g2();
		} else if (code == 4) {
			this.anInt1880 = buf.g2s();
		}
	}
}