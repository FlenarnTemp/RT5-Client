package com.jagex.game.config.flotype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!fl")
public final class FloorOverlayTypeList {

	@OriginalMember(owner = "com.jagex.client!fl", name = "k", descriptor = "Lclient!hu;")
	private final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!fl", name = "p", descriptor = "I")
	public int anInt2060 = 0;

	@OriginalMember(owner = "com.jagex.client!fl", name = "d", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "com.jagex.client!fl", name = "m", descriptor = "I")
	public final int capacity;

	@OriginalMember(owner = "com.jagex.client!fl", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public FloorOverlayTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.archive = arg2;
		this.capacity = this.archive.getGroupCapacity(4);
	}

	@OriginalMember(owner = "com.jagex.client!fl", name = "a", descriptor = "(IB)V")
	public void clean() {
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!fl", name = "a", descriptor = "(B)V")
	public void method2103() {
		synchronized (this.types) {
			this.types.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!fl", name = "b", descriptor = "(II)Lclient!mg;")
	public FloorOverlayType get(@OriginalArg(1) int id) {
		@Pc(16) FloorOverlayType flo;
		synchronized (this.types) {
			flo = (FloorOverlayType) this.types.get(id);
		}
		if (flo != null) {
			return flo;
		}
		@Pc(41) byte[] data = this.archive.getfile(id, 4);
		flo = new FloorOverlayType();
		flo.aClass72_4 = this;
		flo.id = id;
		if (data != null) {
			flo.decode(new Packet(data));
		}
		flo.method3716();
		synchronized (this.types) {
			this.types.put(id, flo);
			return flo;
		}
	}

	@OriginalMember(owner = "com.jagex.client!fl", name = "a", descriptor = "(I)V")
	public void method2108() {
		synchronized (this.types) {
			this.types.method2621();
		}
	}
}
