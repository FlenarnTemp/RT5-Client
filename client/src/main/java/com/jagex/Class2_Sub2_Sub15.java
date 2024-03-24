package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!sn")
public final class Class2_Sub2_Sub15 extends SecondaryNode {

	@OriginalMember(owner = "com.jagex.client!sn", name = "B", descriptor = "[B")
	public final byte[] aByteArray78;

	@OriginalMember(owner = "com.jagex.client!sn", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray78 = arg0;
	}
}
