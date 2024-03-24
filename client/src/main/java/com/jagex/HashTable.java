package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ad")
public final class HashTable {

	@OriginalMember(owner = "com.jagex.client!ad", name = "f", descriptor = "Lclient!ag;")
	private Node aClass2_9;

	@OriginalMember(owner = "com.jagex.client!ad", name = "j", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "com.jagex.client!ad", name = "s", descriptor = "Lclient!ag;")
	private Node aClass2_10;

	@OriginalMember(owner = "com.jagex.client!ad", name = "v", descriptor = "I")
	private int anInt104 = 0;

	@OriginalMember(owner = "com.jagex.client!ad", name = "n", descriptor = "[Lclient!ag;")
	public final Node[] nodes;

	@OriginalMember(owner = "com.jagex.client!ad", name = "h", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "com.jagex.client!ad", name = "<init>", descriptor = "(I)V")
	public HashTable(@OriginalArg(0) int arg0) {
		this.nodes = new Node[arg0];
		this.size = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Node local23 = this.nodes[local13] = new Node();
			local23.prev = local23;
			local23.next = local23;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "b", descriptor = "(I)Lclient!ag;")
	public Node next() {
		@Pc(24) Node local24;
		if (this.anInt104 > 0 && this.nodes[this.anInt104 - 1] != this.aClass2_10) {
			local24 = this.aClass2_10;
			this.aClass2_10 = local24.prev;
			return local24;
		}
		while (this.size > this.anInt104) {
			local24 = this.nodes[this.anInt104++].prev;
			if (this.nodes[this.anInt104 - 1] != local24) {
				this.aClass2_10 = local24.prev;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "a", descriptor = "(B)Lclient!ag;")
	public Node head() {
		this.anInt104 = 0;
		return this.next();
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "c", descriptor = "(I)V")
	public void clear() {
		for (@Pc(3) int local3 = 0; local3 < this.size; local3++) {
			@Pc(10) Node local10 = this.nodes[local3];
			while (true) {
				@Pc(13) Node local13 = local10.prev;
				if (local13 == local10) {
					break;
				}
				local13.remove();
			}
		}
		this.aClass2_10 = null;
		this.aClass2_9 = null;
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "b", descriptor = "(B)Lclient!ag;")
	public Node method82() {
		if (this.aClass2_9 == null) {
			return null;
		}
		@Pc(34) Node local34 = this.nodes[(int) ((long) (this.size - 1) & this.aLong10)];
		while (local34 != this.aClass2_9) {
			if (this.aClass2_9.nodeId == this.aLong10) {
				@Pc(46) Node local46 = this.aClass2_9;
				this.aClass2_9 = this.aClass2_9.prev;
				return local46;
			}
			this.aClass2_9 = this.aClass2_9.prev;
		}
		this.aClass2_9 = null;
		return null;
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "c", descriptor = "(B)I")
	public int size() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.size; local14++) {
			@Pc(21) Node local21 = this.nodes[local14];
			for (@Pc(24) Node local24 = local21.prev; local24 != local21; local24 = local24.prev) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "a", descriptor = "([Lclient!ag;I)I")
	public int method84(@OriginalArg(0) Node[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.size; local9++) {
			@Pc(16) Node local16 = this.nodes[local9];
			for (@Pc(19) Node local19 = local16.prev; local19 != local16; local19 = local19.prev) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "a", descriptor = "(BLclient!ag;J)V")
	public void pushNode(@OriginalArg(1) Node node, @OriginalArg(2) long id) {
		if (node.next != null) {
			node.remove();
		}
		@Pc(28) Node local28 = this.nodes[(int) ((long) (this.size - 1) & id)];
		node.prev = local28;
		node.next = local28.next;
		node.next.prev = node;
		node.nodeId = id;
		node.prev.next = node;
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "d", descriptor = "(B)I")
	public int method89() {
		return this.size;
	}

	@OriginalMember(owner = "com.jagex.client!ad", name = "a", descriptor = "(JI)Lclient!ag;")
	public Node getNode(@OriginalArg(0) long arg0) {
		this.aLong10 = arg0;
		@Pc(23) Node local23 = this.nodes[(int) (arg0 & (long) (this.size - 1))];
		for (this.aClass2_9 = local23.prev; this.aClass2_9 != local23; this.aClass2_9 = this.aClass2_9.prev) {
			if (arg0 == this.aClass2_9.nodeId) {
				@Pc(41) Node local41 = this.aClass2_9;
				this.aClass2_9 = this.aClass2_9.prev;
				return local41;
			}
		}
		this.aClass2_9 = null;
		return null;
	}
}
