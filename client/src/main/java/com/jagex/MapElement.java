package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!jg")
public final class MapElement extends Node {

	@OriginalMember(owner = "com.jagex.client!jg", name = "u", descriptor = "I")
	public int anInt2944;

	@OriginalMember(owner = "com.jagex.client!jg", name = "w", descriptor = "I")
	public int level;

	@OriginalMember(owner = "com.jagex.client!jg", name = "y", descriptor = "I")
	public int anInt2948;

	@OriginalMember(owner = "com.jagex.client!jg", name = "z", descriptor = "I")
	public int x;

	@OriginalMember(owner = "com.jagex.client!jg", name = "D", descriptor = "I")
	public int z;

	@OriginalMember(owner = "com.jagex.client!jg", name = "x", descriptor = "I")
	public int id = -1;

	@OriginalMember(owner = "com.jagex.client!jg", name = "s", descriptor = "Z")
	public boolean aBoolean207 = false;

	@OriginalMember(owner = "com.jagex.client!jg", name = "<init>", descriptor = "(I)V")
	public MapElement(@OriginalArg(0) int arg0) {
		this.id = arg0;
	}
}
