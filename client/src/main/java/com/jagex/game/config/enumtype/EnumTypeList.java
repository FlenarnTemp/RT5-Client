package com.jagex.game.config.enumtype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.Static121;
import com.jagex.Static266;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!is")
public final class EnumTypeList {

	@OriginalMember(owner = "com.jagex.client!is", name = "h", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_23 = new LruHashTable(128);

	@OriginalMember(owner = "com.jagex.client!is", name = "f", descriptor = "Lclient!r;")
	private final Js5 aClass197_43;

	@OriginalMember(owner = "com.jagex.client!is", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public EnumTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_43 = arg2;
		if (this.aClass197_43 != null) {
			@Pc(20) int local20 = this.aClass197_43.capacity() - 1;
			this.aClass197_43.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "com.jagex.client!is", name = "a", descriptor = "(IB)Lclient!ds;")
	public EnumType get(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_23;
		@Pc(16) EnumType local16;
		synchronized (this.aClass98_23) {
			local16 = (EnumType) this.aClass98_23.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass197_43.getfile(Static121.method2393(arg0), Static266.method4498(arg0));
		local16 = new EnumType();
		if (local37 != null) {
			local16.decode(new Packet(local37));
		}
		@Pc(61) LruHashTable local61 = this.aClass98_23;
		synchronized (this.aClass98_23) {
			this.aClass98_23.put((long) arg0, local16);
			return local16;
		}
	}
}
