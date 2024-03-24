package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;

public class Mouse {

	@OriginalMember(owner = "com.jagex.client!na", name = "Y", descriptor = "Lclient!lh;")
	public static Class119 instance;

	@OriginalMember(owner = "com.jagex.client!vn", name = "V", descriptor = "Lclient!lm;")
	public static MouseRecorder clickButton;

	@OriginalMember(owner = "com.jagex.client!pj", name = "v", descriptor = "J")
	public static long prevClickTime = -1L;

}
