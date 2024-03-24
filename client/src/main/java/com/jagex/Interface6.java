package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!id")
public interface Interface6 {

	@OriginalMember(owner = "com.jagex.client!id", name = "a", descriptor = "(I)I")
	int method6081();

	@OriginalMember(owner = "com.jagex.client!id", name = "b", descriptor = "(I)V")
	void method6082();

	@OriginalMember(owner = "com.jagex.client!id", name = "a", descriptor = "(Lclient!wm;I)V")
	void method6083(@OriginalArg(0) Renderer arg0);

	@OriginalMember(owner = "com.jagex.client!id", name = "c", descriptor = "(I)I")
	int method6084();

	@OriginalMember(owner = "com.jagex.client!id", name = "d", descriptor = "(I)I")
	int method6085();

	@OriginalMember(owner = "com.jagex.client!id", name = "a", descriptor = "(Z)Z")
	boolean method6086();

	@OriginalMember(owner = "com.jagex.client!id", name = "a", descriptor = "(BLclient!wm;)V")
	void method6087(@OriginalArg(1) Renderer arg0);

	@OriginalMember(owner = "com.jagex.client!id", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	Model method6088(@OriginalArg(0) int arg0, @OriginalArg(1) Renderer arg1);
}
