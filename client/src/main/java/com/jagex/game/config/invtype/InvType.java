package com.jagex.game.config.invtype;

import com.jagex.SecondaryNode;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!hl")
public final class InvType extends SecondaryNode {

	@OriginalMember(owner = "com.jagex.client!hl", name = "G", descriptor = "I")
	public int size = 0;

	@OriginalMember(owner = "com.jagex.client!hl", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(10) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!hl", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet buf, @OriginalArg(2) int code) {
		if (code == 2) {
			this.size = buf.g2();
		}
	}
}
