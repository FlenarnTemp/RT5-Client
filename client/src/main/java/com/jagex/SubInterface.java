package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!cu")
public final class SubInterface extends Node {

	@OriginalMember(owner = "com.jagex.client!cu", name = "x", descriptor = "I")
	public int id;

	@OriginalMember(owner = "com.jagex.client!cu", name = "A", descriptor = "I")
	public int anInt1373;
}
