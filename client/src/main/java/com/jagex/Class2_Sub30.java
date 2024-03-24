package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!qa")
public abstract class Class2_Sub30 extends Node {

	@OriginalMember(owner = "com.jagex.client!qa", name = "s", descriptor = "I")
	public int anInt5127;

	@OriginalMember(owner = "com.jagex.client!qa", name = "a", descriptor = "()V")
	public abstract void method4695();

	@OriginalMember(owner = "com.jagex.client!qa", name = "a", descriptor = "(Lclient!fi;)I")
	public abstract int method4696(@OriginalArg(0) MixerPcmStream arg0);
}
