package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!tl")
public class SecondaryNode extends Node {

	@OriginalMember(owner = "com.jagex.client!tl", name = "u", descriptor = "Lclient!tl;")
	public SecondaryNode secondaryNext;

	@OriginalMember(owner = "com.jagex.client!tl", name = "x", descriptor = "J")
	public long secondaryKey;

	@OriginalMember(owner = "com.jagex.client!tl", name = "z", descriptor = "Lclient!tl;")
	public SecondaryNode secondaryPrev;

	@OriginalMember(owner = "com.jagex.client!tl", name = "b", descriptor = "(Z)Z")
	public final boolean islinkedSecondary() {
		return this.secondaryPrev != null;
	}

	@OriginalMember(owner = "com.jagex.client!tl", name = "c", descriptor = "(B)V")
	public final void unlinkSecondary() {
		if (this.secondaryPrev != null) {
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryNext = null;
			this.secondaryPrev = null;
		}
	}
}
