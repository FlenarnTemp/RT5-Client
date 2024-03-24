package com.jagex;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "com.jagex.client!dn", name = "a", descriptor = "I")
	public static int anInt1549 = -1;

	@OriginalMember(owner = "com.jagex.client!dn", name = "a", descriptor = "(Z)Lclient!kp;")
	public static MouseWheel method1702() {
		try {
			return (MouseWheel) Class.forName("com.jagex.JavaMouseWheel").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

}
