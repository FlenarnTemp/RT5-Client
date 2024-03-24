package com.jagex;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!kp")
public abstract class MouseWheel {

	@OriginalMember(owner = "com.jagex.client!tk", name = "f", descriptor = "Lclient!kp;")
	public static MouseWheel instance;
	@OriginalMember(owner = "com.jagex.client!sp", name = "S", descriptor = "I")
	public static int wheelRotation = 0;

	@OriginalMember(owner = "com.jagex.client!kp", name = "a", descriptor = "(ILjava/awt/com.jagex.Component;)V")
	public abstract void stop(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "com.jagex.client!kp", name = "a", descriptor = "(BLjava/awt/com.jagex.Component;)V")
	public abstract void start(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "com.jagex.client!kp", name = "a", descriptor = "(I)I")
	public abstract int getRotation();
}
