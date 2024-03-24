package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!bq")
public abstract class ReferenceNodeWithInterface extends SecondaryNode {

	@OriginalMember(owner = "com.jagex.client!bq", name = "C", descriptor = "Lclient!iq;")
	public final Interface7 anInterface7_3;

	@OriginalMember(owner = "com.jagex.client!bq", name = "D", descriptor = "I")
	public final int anInt5040;

	@OriginalMember(owner = "com.jagex.client!bq", name = "<init>", descriptor = "(Lclient!iq;I)V")
	protected ReferenceNodeWithInterface(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1) {
		this.anInterface7_3 = arg0;
		this.anInt5040 = arg1;
	}

	@OriginalMember(owner = "com.jagex.client!bq", name = "b", descriptor = "(I)Z")
	public abstract boolean isSoft();

	@OriginalMember(owner = "com.jagex.client!bq", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object get();
}
