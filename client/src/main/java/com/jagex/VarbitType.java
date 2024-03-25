package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!la")
public final class VarbitType {

	@OriginalMember(owner = "com.jagex.client!la", name = "a", descriptor = "I")
	public int startbit;

	@OriginalMember(owner = "com.jagex.client!la", name = "b", descriptor = "I")
	public int endbit;

	@OriginalMember(owner = "com.jagex.client!la", name = "h", descriptor = "I")
	public int basevar;

	@OriginalMember(owner = "com.jagex.client!la", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(16) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(code, buf);
		}
	}

	@OriginalMember(owner = "com.jagex.client!la", name = "a", descriptor = "(IILclient!bt;)V")
	private void decode(@OriginalArg(1) int code, @OriginalArg(2) Packet buf) {
		if (code == 1) {
			this.basevar = buf.g2();
			this.startbit = buf.g1();
			this.endbit = buf.g1();
		}
	}
}
