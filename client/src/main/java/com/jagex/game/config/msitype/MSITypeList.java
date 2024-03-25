package com.jagex.game.config.msitype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ii")
public final class MSITypeList {

	@OriginalMember(owner = "com.jagex.client!ii", name = "n", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_19 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!ii", name = "p", descriptor = "Lclient!hu;")
	public LruHashTable aClass98_20 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!ii", name = "d", descriptor = "Lclient!r;")
	public final Js5 aClass197_39;

	@OriginalMember(owner = "com.jagex.client!ii", name = "m", descriptor = "Lclient!r;")
	private final Js5 aClass197_40;

	@OriginalMember(owner = "com.jagex.client!ii", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V")
	public MSITypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass197_39 = arg3;
		this.aClass197_40 = arg2;
		this.aClass197_40.getGroupCapacity(34);
	}

	@OriginalMember(owner = "com.jagex.client!ii", name = "a", descriptor = "(IZI)V")
	public void method2702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass98_19 = new LruHashTable(arg0);
		this.aClass98_20 = new LruHashTable(arg1);
	}

	@OriginalMember(owner = "com.jagex.client!ii", name = "a", descriptor = "(II)V")
	public void method2704() {
		@Pc(6) LruHashTable local6 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.clean(5);
		}
		local6 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ii", name = "b", descriptor = "(B)V")
	public void method2705() {
		@Pc(2) LruHashTable local2 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2621();
		}
		local2 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ii", name = "c", descriptor = "(B)V")
	public void method2707() {
		@Pc(8) LruHashTable local8 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.method2614();
		}
		local8 = this.aClass98_20;
		synchronized (this.aClass98_20) {
			this.aClass98_20.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ii", name = "b", descriptor = "(II)Lclient!md;")
	public MSIType method2708(@OriginalArg(1) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_19;
		@Pc(16) MSIType local16;
		synchronized (this.aClass98_19) {
			local16 = (MSIType) this.aClass98_19.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_40.getfile(arg0, 34);
		local16 = new MSIType();
		local16.aClass104_1 = this;
		if (local33 != null) {
			local16.decode(new Packet(local33));
		}
		@Pc(52) LruHashTable local52 = this.aClass98_19;
		synchronized (this.aClass98_19) {
			this.aClass98_19.put((long) arg0, local16);
			return local16;
		}
	}
}
