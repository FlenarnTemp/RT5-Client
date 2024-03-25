package com.jagex.game.config.meltype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ki")
public final class MapElementTypeList {

	@OriginalMember(owner = "com.jagex.client!ki", name = "g", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_26 = new LruHashTable(128);

	@OriginalMember(owner = "com.jagex.client!ki", name = "n", descriptor = "Lclient!hu;")
	public LruHashTable elementCache = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!ki", name = "b", descriptor = "Lclient!r;")
	private final Js5 aClass197_49;

	@OriginalMember(owner = "com.jagex.client!ki", name = "j", descriptor = "Lclient!r;")
	public final Js5 configClient;

	@OriginalMember(owner = "com.jagex.client!ki", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public MapElementTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass197_49 = arg2;
		this.configClient = arg3;
		this.aClass197_49.getGroupCapacity(36);
	}

	@OriginalMember(owner = "com.jagex.client!ki", name = "a", descriptor = "(I)V")
	public void method3373() {
		@Pc(11) LruHashTable local11 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.method2621();
		}
		local11 = this.elementCache;
		synchronized (this.elementCache) {
			this.elementCache.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ki", name = "a", descriptor = "(II)V")
	public void method3376() {
		@Pc(2) LruHashTable local2 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.clean(5);
		}
		local2 = this.elementCache;
		synchronized (this.elementCache) {
			this.elementCache.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ki", name = "a", descriptor = "(III)V")
	public void method3377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass98_26 = new LruHashTable(arg1);
		this.elementCache = new LruHashTable(arg0);
	}

	@OriginalMember(owner = "com.jagex.client!ki", name = "b", descriptor = "(II)Lclient!np;")
	public MapElementType get(@OriginalArg(1) int id) {
		@Pc(6) LruHashTable local6 = this.aClass98_26;
		@Pc(16) MapElementType type;
		synchronized (this.aClass98_26) {
			type = (MapElementType) this.aClass98_26.get((long) id);
		}
		if (type != null) {
			return type;
		}
		@Pc(33) byte[] local33 = this.aClass197_49.getfile(id, 36);
		type = new MapElementType();
		type.id = id;
		type.aClass125_2 = this;
		if (local33 != null) {
			type.decode(new Packet(local33));
		}
		type.postDecode();
		@Pc(65) LruHashTable local65 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.put((long) id, type);
			return type;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ki", name = "c", descriptor = "(I)V")
	public void method3380() {
		@Pc(2) LruHashTable local2 = this.aClass98_26;
		synchronized (this.aClass98_26) {
			this.aClass98_26.method2614();
		}
		local2 = this.elementCache;
		synchronized (this.elementCache) {
			this.elementCache.method2614();
		}
	}
}
