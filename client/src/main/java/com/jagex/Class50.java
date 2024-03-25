package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!dn")
public final class Class50 {

	@OriginalMember(owner = "com.jagex.client!dn", name = "e", descriptor = "Ljava/lang/String;")
	public final String name;

	@OriginalMember(owner = "com.jagex.client!dn", name = "f", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "com.jagex.client!dn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class50(@OriginalArg(0) String name, @OriginalArg(1) int id) {
		this.name = name;
		this.id = id;
	}

	@OriginalMember(owner = "com.jagex.client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
