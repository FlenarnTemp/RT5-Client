package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!lg")
public final class Class137 {

	@OriginalMember(owner = "com.jagex.client!lg", name = "f", descriptor = "Lclient!ag;")
	private Node aClass2_132;

	@OriginalMember(owner = "com.jagex.client!lg", name = "a", descriptor = "I")
	private int anInt3614 = 0;

	@OriginalMember(owner = "com.jagex.client!lg", name = "b", descriptor = "Lclient!ad;")
	private final HashTable aClass4_79;

	@OriginalMember(owner = "com.jagex.client!lg", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class137(@OriginalArg(0) HashTable arg0) {
		this.aClass4_79 = arg0;
	}

	@OriginalMember(owner = "com.jagex.client!lg", name = "a", descriptor = "(Z)Lclient!ag;")
	public Node method3560() {
		@Pc(23) Node local23;
		if (this.anInt3614 > 0 && this.aClass2_132 != this.aClass4_79.nodes[this.anInt3614 - 1]) {
			local23 = this.aClass2_132;
			this.aClass2_132 = local23.prev;
			return local23;
		}
		while (this.anInt3614 < this.aClass4_79.size) {
			local23 = this.aClass4_79.nodes[this.anInt3614++].prev;
			if (this.aClass4_79.nodes[this.anInt3614 - 1] != local23) {
				this.aClass2_132 = local23.prev;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "com.jagex.client!lg", name = "a", descriptor = "(I)Lclient!ag;")
	public Node method3561() {
		this.anInt3614 = 0;
		return this.method3560();
	}
}
