package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!di")
public abstract class Js5ResourceProvider {

	@OriginalMember(owner = "com.jagex.client!di", name = "<init>", descriptor = "()V")
	protected Js5ResourceProvider() {
	}

	@OriginalMember(owner = "com.jagex.client!di", name = "a", descriptor = "(Z)Lclient!ra;")
	public abstract Js5Index fetchIndex();

	@OriginalMember(owner = "com.jagex.client!di", name = "a", descriptor = "(II)V")
	public abstract void prefetchGroup(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "com.jagex.client!di", name = "a", descriptor = "(IB)I")
	public abstract int getPercentageComplete(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "com.jagex.client!di", name = "b", descriptor = "(II)[B")
	public abstract byte[] fetchGroup(@OriginalArg(0) int arg0);
}
