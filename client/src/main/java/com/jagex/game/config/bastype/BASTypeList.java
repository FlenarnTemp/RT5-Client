package com.jagex.game.config.bastype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ak")
public final class BASTypeList {

	@OriginalMember(owner = "com.jagex.client!ak", name = "i", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_1 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!ak", name = "e", descriptor = "Lclient!r;")
	private final Js5 aClass197_1;

	@OriginalMember(owner = "com.jagex.client!ak", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public BASTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_1 = arg2;
		this.aClass197_1.getGroupCapacity(32);
	}

	@OriginalMember(owner = "com.jagex.client!ak", name = "a", descriptor = "(I)V")
	public void method241() {
		@Pc(11) LruHashTable local11 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ak", name = "b", descriptor = "(I)V")
	public void method242() {
		@Pc(2) LruHashTable local2 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ak", name = "a", descriptor = "(IZ)V")
	public void method243() {
		@Pc(2) LruHashTable local2 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ak", name = "a", descriptor = "(II)Lclient!ti;")
	public BASType get(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_1;
		@Pc(16) BASType local16;
		synchronized (this.aClass98_1) {
			local16 = (BASType) this.aClass98_1.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_1.getfile(arg0, 32);
		local16 = new BASType();
		if (local33 != null) {
			local16.decode(new Packet(local33));
		}
		@Pc(49) LruHashTable local49 = this.aClass98_1;
		synchronized (this.aClass98_1) {
			this.aClass98_1.put((long) arg0, local16);
			return local16;
		}
	}
}
