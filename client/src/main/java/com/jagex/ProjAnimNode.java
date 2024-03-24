package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!im")
public final class ProjAnimNode extends SecondaryNode {

	@OriginalMember(owner = "com.jagex.client!im", name = "F", descriptor = "Lclient!om;")
	public final ProjAnim aClass11_Sub5_Sub3_1;

	@OriginalMember(owner = "com.jagex.client!im", name = "<init>", descriptor = "(Lclient!om;)V")
	public ProjAnimNode(@OriginalArg(0) ProjAnim arg0) {
		this.aClass11_Sub5_Sub3_1 = arg0;
	}
}
