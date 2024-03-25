package com.jagex;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!km")
public final class VarbitTypeList {

	@OriginalMember(owner = "com.jagex.client!km", name = "e", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_28 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!km", name = "c", descriptor = "Lclient!r;")
	private final Js5 aClass197_51;

	@OriginalMember(owner = "com.jagex.client!km", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public VarbitTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_51 = arg2;
		if (this.aClass197_51 != null) {
			@Pc(20) int local20 = this.aClass197_51.capacity() - 1;
			this.aClass197_51.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "com.jagex.client!km", name = "a", descriptor = "(II)V")
	public void method3390() {
		synchronized (this.aClass98_28) {
			this.aClass98_28.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!km", name = "b", descriptor = "(II)V")
	public void method3392(@OriginalArg(0) int arg0) {
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2614();
			this.aClass98_28 = new LruHashTable(arg0);
		}
	}

	@OriginalMember(owner = "com.jagex.client!km", name = "b", descriptor = "(I)V")
	public void method3393() {
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!km", name = "c", descriptor = "(II)Lclient!la;")
	public VarbitType get(@OriginalArg(0) int id) {
		@Pc(24) VarbitType type;
		synchronized (this.aClass98_28) {
			type = (VarbitType) this.aClass98_28.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(45) byte[] bytes = this.aClass197_51.getfile(Static75.method1837(id), Static319.method5431(id));
		type = new VarbitType();
		if (bytes != null) {
			type.decode(new Packet(bytes));
		}
		synchronized (this.aClass98_28) {
			this.aClass98_28.put(id, type);
			return type;
		}
	}

	@OriginalMember(owner = "com.jagex.client!km", name = "a", descriptor = "(Z)V")
	public void method3395() {
		synchronized (this.aClass98_28) {
			this.aClass98_28.method2614();
		}
	}
}
