package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!iq")
public interface Interface7 {

	@OriginalMember(owner = "com.jagex.client!iq", name = "a", descriptor = "(BLclient!iq;)Z")
	boolean method1778(@OriginalArg(1) Interface7 arg0);

	@OriginalMember(owner = "com.jagex.client!iq", name = "a", descriptor = "(I)J")
	long method1779();
}
