package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!wj")
public abstract class ReferenceNodeFactory {

	@OriginalMember(owner = "com.jagex.client!qf", name = "f", descriptor = "Lclient!wj;")
	public static final ReferenceNodeFactory SOFT_REFERENCE_NODE_FACTORY = createSoftReferenceNodeFactory();

	@OriginalMember(owner = "com.jagex.client!at", name = "c", descriptor = "(B)Lclient!wj;")
	public static ReferenceNodeFactory createSoftReferenceNodeFactory() {
		try {
			return (ReferenceNodeFactory) Class.forName("com.jagex.SoftReferenceNodeFactory").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex.client!wj", name = "a", descriptor = "(ILclient!bq;)Lclient!bq;")
	public abstract ReferenceNodeWithInterface create(@OriginalArg(1) ReferenceNodeWithInterface arg0);
}
