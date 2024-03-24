package com.jagex;

import java.awt.Component;

import com.jagex.game.config.bastype.BASType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "com.jagex.client!bb", name = "z", descriptor = "Lclient!rq;")
	public static Cache aClass207_1;

	@OriginalMember(owner = "com.jagex.client!bb", name = "F", descriptor = "Lclient!cc;")
	public static PrivilegedRequest aClass32_2;

	@OriginalMember(owner = "com.jagex.client!bb", name = "k", descriptor = "Lclient!ti;")
	public static final BASType aClass222_1 = new BASType();

	@OriginalMember(owner = "com.jagex.client!bb", name = "m", descriptor = "I")
	public static int anInt519 = -1;

	@OriginalMember(owner = "com.jagex.client!bb", name = "q", descriptor = "Z")
	public static boolean qa_op_test = false;

	@OriginalMember(owner = "com.jagex.client!bb", name = "y", descriptor = "[I")
	public static final int[] MSG_TIMESTAMPS = new int[100]; // total guess... not used...

	@OriginalMember(owner = "com.jagex.client!bb", name = "A", descriptor = "I")
	public static int anInt530 = 0;

	@OriginalMember(owner = "com.jagex.client!bb", name = "a", descriptor = "(ILjava/awt/com.jagex.Component;)Lclient!nj;")
	public static KeyboardBase method556(@OriginalArg(1) Component arg0) {
		return new Keyboard(arg0);
	}
}
