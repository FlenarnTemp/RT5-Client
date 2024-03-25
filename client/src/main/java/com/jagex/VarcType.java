package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!cr")
public final class VarcType {

	@OriginalMember(owner = "com.jagex.client!cr", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "com.jagex.client!cr", name = "c", descriptor = "I")
	public int anInt1258 = 1;

	@OriginalMember(owner = "com.jagex.client!cr", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(17) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!cr", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(1) int code) {
		if (code == 1) {
			this.aChar2 = Static78.forCharKey(buf.g1b());
		} else if (code == 2) {
			this.anInt1258 = 0;
		}
	}
}