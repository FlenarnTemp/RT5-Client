package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!wi")
public final class ByteArrayNode extends Node {

	@OriginalMember(owner = "com.jagex.client!wi", name = "t", descriptor = "[B")
	public final byte[] aByteArray99;

	@OriginalMember(owner = "com.jagex.client!wi", name = "<init>", descriptor = "([B)V")
	public ByteArrayNode(@OriginalArg(0) byte[] arg0) {
		this.aByteArray99 = arg0;
	}
}
