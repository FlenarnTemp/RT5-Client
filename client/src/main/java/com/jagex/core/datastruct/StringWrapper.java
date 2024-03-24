package com.jagex.core.datastruct;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!vh")
public final class StringWrapper extends Node {

	@OriginalMember(owner = "com.jagex.client!vh", name = "u", descriptor = "Ljava/lang/String;")
	public final String value;

	@OriginalMember(owner = "com.jagex.client!vh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public StringWrapper(@OriginalArg(0) String value) {
		this.value = value;
	}
}
