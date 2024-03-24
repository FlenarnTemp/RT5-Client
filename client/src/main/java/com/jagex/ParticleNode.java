package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ss")
public class ParticleNode {

	@OriginalMember(owner = "com.jagex.client!ss", name = "d", descriptor = "Lclient!ss;")
	public ParticleNode prev;

	@OriginalMember(owner = "com.jagex.client!ss", name = "f", descriptor = "Lclient!ss;")
	public ParticleNode next;

	@OriginalMember(owner = "com.jagex.client!ss", name = "a", descriptor = "(I)V")
	public final void method5684() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.prev = null;
			this.next = null;
		}
	}
}
