package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!gl")
public final class Class2_Sub15 extends Node {

	@OriginalMember(owner = "com.jagex.client!gl", name = "u", descriptor = "I")
	public int anInt2335 = Integer.MAX_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "y", descriptor = "I")
	public int anInt2338 = Integer.MAX_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "t", descriptor = "I")
	public int anInt2334 = Integer.MAX_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "B", descriptor = "I")
	public int anInt2341 = Integer.MAX_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "F", descriptor = "I")
	public int anInt2343 = Integer.MIN_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "E", descriptor = "I")
	public int anInt2342 = Integer.MIN_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "w", descriptor = "I")
	public int anInt2336 = Integer.MIN_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "A", descriptor = "I")
	public int anInt2340 = Integer.MIN_VALUE;

	@OriginalMember(owner = "com.jagex.client!gl", name = "C", descriptor = "Lclient!jg;")
	public final MapElement aClass2_Sub20_1;

	@OriginalMember(owner = "com.jagex.client!gl", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class2_Sub15(@OriginalArg(0) MapElement arg0) {
		this.aClass2_Sub20_1 = arg0;
	}

	@OriginalMember(owner = "com.jagex.client!gl", name = "a", descriptor = "(IBI)Z")
	public boolean method2357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt2338 && arg0 <= this.anInt2340 && this.anInt2341 <= arg1 && arg1 <= this.anInt2336) {
			return true;
		} else {
			return this.anInt2335 <= arg0 && arg0 <= this.anInt2342 && this.anInt2334 <= arg1 && arg1 <= this.anInt2343;
		}
	}
}
