package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ab")
public final class SpotAnimNode extends SecondaryNode {

	@OriginalMember(owner = "com.jagex.client!ab", name = "C", descriptor = "Lclient!uh;")
	public final SpotAnim aClass11_Sub5_Sub4_1;

	@OriginalMember(owner = "com.jagex.client!ab", name = "<init>", descriptor = "(Lclient!uh;)V")
	public SpotAnimNode(@OriginalArg(0) SpotAnim arg0) {
		this.aClass11_Sub5_Sub4_1 = arg0;
	}
}
