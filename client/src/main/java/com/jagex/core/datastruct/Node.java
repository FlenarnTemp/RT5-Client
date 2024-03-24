package com.jagex.core.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ag")
public class Node {

	@OriginalMember(owner = "com.jagex.client!ag", name = "d", descriptor = "J")
	public long nodeId;

	@OriginalMember(owner = "com.jagex.client!ag", name = "c", descriptor = "Lclient!ag;")
	public Node prev;

	@OriginalMember(owner = "com.jagex.client!ag", name = "e", descriptor = "Lclient!ag;")
	public Node next;

	@OriginalMember(owner = "com.jagex.client!ag", name = "a", descriptor = "(I)Z")
	public final boolean hasNext() {
		return this.next != null;
	}

	@OriginalMember(owner = "com.jagex.client!ag", name = "a", descriptor = "(B)V")
	public final void remove() {
		if (this.next != null) {
			this.next.prev = this.prev;
			this.prev.next = this.next;
			this.next = null;
			this.prev = null;
		}
	}
}
