package com.jagex.game.config.cursortype;

import com.jagex.Class50;
import com.jagex.js5.Js5;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!mi")
public final class CursorTypeList {

	@OriginalMember(owner = "com.jagex.client!mi", name = "g", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_32 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!mi", name = "o", descriptor = "Lclient!hu;")
	public final LruHashTable cursorCache = new LruHashTable(2);

	@OriginalMember(owner = "com.jagex.client!mi", name = "j", descriptor = "Lclient!r;")
	public final Js5 js5;

	@OriginalMember(owner = "com.jagex.client!mi", name = "f", descriptor = "Lclient!r;")
	private final Js5 aClass197_55;

	@OriginalMember(owner = "com.jagex.client!mi", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public CursorTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.js5 = arg3;
		this.aClass197_55 = arg2;
		this.aClass197_55.getGroupCapacity(33);
	}

	@OriginalMember(owner = "com.jagex.client!mi", name = "a", descriptor = "(I)V")
	public void method3728() {
		@Pc(2) LruHashTable local2 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.method2621();
		}
		local2 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!mi", name = "a", descriptor = "(II)Lclient!te;")
	public CursorType method3731(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_32;
		@Pc(16) CursorType local16;
		synchronized (this.aClass98_32) {
			local16 = (CursorType) this.aClass98_32.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_55.getfile(arg0, 33);
		local16 = new CursorType();
		local16.myList = this;
		if (local33 != null) {
			local16.decode(new Packet(local33));
		}
		@Pc(60) LruHashTable local60 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.put((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "com.jagex.client!mi", name = "b", descriptor = "(BI)V")
	public void method3732() {
		@Pc(2) LruHashTable local2 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.clean(5);
		}
		local2 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!mi", name = "a", descriptor = "(B)V")
	public void method3733() {
		@Pc(6) LruHashTable local6 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.method2614();
		}
		local6 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.method2614();
		}
	}
}
