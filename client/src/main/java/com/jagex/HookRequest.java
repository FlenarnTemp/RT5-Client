package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!fn")
public final class HookRequest extends Node {

	@OriginalMember(owner = "com.jagex.client!fn", name = "t", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray4;

	@OriginalMember(owner = "com.jagex.client!fn", name = "u", descriptor = "Lclient!nk;")
	public Component source;

	@OriginalMember(owner = "com.jagex.client!fn", name = "x", descriptor = "I")
	public int anInt2114;

	@OriginalMember(owner = "com.jagex.client!fn", name = "y", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "com.jagex.client!fn", name = "z", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "com.jagex.client!fn", name = "B", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "com.jagex.client!fn", name = "C", descriptor = "Lclient!nk;")
	public Component aClass161_4;

	@OriginalMember(owner = "com.jagex.client!fn", name = "E", descriptor = "I")
	public int anInt2118;

	@OriginalMember(owner = "com.jagex.client!fn", name = "G", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "com.jagex.client!fn", name = "H", descriptor = "Z")
	public boolean aBoolean157;
}
