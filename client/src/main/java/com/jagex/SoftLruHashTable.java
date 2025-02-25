package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!hs")
public final class SoftLruHashTable {

	@OriginalMember(owner = "com.jagex.client!hs", name = "h", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "com.jagex.client!hs", name = "m", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "com.jagex.client!hs", name = "c", descriptor = "I")
	private int available;

	@OriginalMember(owner = "com.jagex.client!hs", name = "b", descriptor = "Lclient!ad;")
	private final HashTable table;

	@OriginalMember(owner = "com.jagex.client!hs", name = "<init>", descriptor = "(I)V")
	public SoftLruHashTable(@OriginalArg(0) int arg0) {
		this.capacity = arg0;
		this.available = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.table = new HashTable(local16);
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "a", descriptor = "(ILclient!iq;Ljava/lang/Object;)V")
	public void method2583(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Object arg1) {
		this.method2588(arg0, arg1);
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "a", descriptor = "(I)V")
	public void clear() {
		this.queue.clear();
		this.table.clear();
		this.available = this.capacity;
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "a", descriptor = "(Lclient!bq;B)V")
	private void method2586(@OriginalArg(0) ReferenceNodeWithInterface arg0) {
		if (arg0 != null) {
			arg0.remove();
			arg0.unlinkSecondary();
			this.available += arg0.anInt5040;
		}
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "b", descriptor = "(I)I")
	public int method2587() {
		return this.available;
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "a", descriptor = "(Lclient!iq;Ljava/lang/Object;II)V")
	private void method2588(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		if (this.capacity < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2593(arg0);
		this.available--;
		while (this.available < 0) {
			@Pc(36) ReferenceNodeWithInterface local36 = (ReferenceNodeWithInterface) this.queue.method6339();
			this.method2586(local36);
		}
		@Pc(61) HardReferenceNode local61 = new HardReferenceNode(arg0, arg1, 1);
		this.table.pushNode(local61, arg0.method1779());
		this.queue.addTail(local61);
		local61.secondaryKey = 0L;
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "b", descriptor = "(II)V")
	public void method2589() {
		if (ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY == null) {
			return;
		}
		for (@Pc(19) ReferenceNodeWithInterface local19 = (ReferenceNodeWithInterface) this.queue.head(); local19 != null; local19 = (ReferenceNodeWithInterface) this.queue.next()) {
			if (local19.isSoft()) {
				if (local19.get() == null) {
					local19.remove();
					local19.unlinkSecondary();
					this.available += local19.anInt5040;
				}
			} else if ((long) 5 < ++local19.secondaryKey) {
				@Pc(66) ReferenceNodeWithInterface local66 = ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY.create(local19);
				this.table.pushNode(local66, local19.nodeId);
				Static145.method2696(local19, local66);
				local19.remove();
				local19.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "a", descriptor = "(B)V")
	public void method2590() {
		for (@Pc(7) ReferenceNodeWithInterface local7 = (ReferenceNodeWithInterface) this.queue.head(); local7 != null; local7 = (ReferenceNodeWithInterface) this.queue.next()) {
			if (local7.isSoft()) {
				local7.remove();
				local7.unlinkSecondary();
				this.available += local7.anInt5040;
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "d", descriptor = "(I)I")
	public int method2592() {
		return this.capacity;
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "a", descriptor = "(ILclient!iq;)V")
	private void method2593(@OriginalArg(1) Interface7 arg0) {
		@Pc(11) long local11 = arg0.method1779();
		for (@Pc(25) ReferenceNodeWithInterface local25 = (ReferenceNodeWithInterface) this.table.getNode(local11); local25 != null; local25 = (ReferenceNodeWithInterface) this.table.method82()) {
			if (local25.anInterface7_3.method1778(arg0)) {
				this.method2586(local25);
				return;
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!hs", name = "a", descriptor = "(Lclient!iq;I)Ljava/lang/Object;")
	public Object method2596(@OriginalArg(0) Interface7 arg0) {
		@Pc(11) long local11 = arg0.method1779();
		for (@Pc(18) ReferenceNodeWithInterface local18 = (ReferenceNodeWithInterface) this.table.getNode(local11); local18 != null; local18 = (ReferenceNodeWithInterface) this.table.method82()) {
			if (local18.anInterface7_3.method1778(arg0)) {
				@Pc(30) Object local30 = local18.get();
				if (local30 != null) {
					if (local18.isSoft()) {
						@Pc(59) HardReferenceNode local59 = new HardReferenceNode(arg0, local30, local18.anInt5040);
						this.table.pushNode(local59, local18.nodeId);
						this.queue.addTail(local59);
						local59.secondaryKey = 0L;
						local18.remove();
						local18.unlinkSecondary();
					} else {
						this.queue.addTail(local18);
						local18.secondaryKey = 0L;
					}
					return local30;
				}
				local18.remove();
				local18.unlinkSecondary();
				this.available += local18.anInt5040;
			}
		}
		return null;
	}
}
