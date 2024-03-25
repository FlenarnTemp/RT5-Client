package com.jagex.game.config.invtype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!dp")
public final class InvTypeList {

	@OriginalMember(owner = "com.jagex.client!dp", name = "e", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_6 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!dp", name = "c", descriptor = "Lclient!r;")
	private final Js5 aClass197_15;

	@OriginalMember(owner = "com.jagex.client!dp", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public InvTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_15 = arg2;
		this.aClass197_15.getGroupCapacity(5);
	}

	@OriginalMember(owner = "com.jagex.client!dp", name = "a", descriptor = "(II)Lclient!hl;")
	public InvType get(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_6;
		@Pc(16) InvType type;
		synchronized (this.aClass98_6) {
			type = (InvType) this.aClass98_6.get((long) arg0);
		}
		if (type != null) {
			return type;
		}
		@Pc(38) byte[] local38 = this.aClass197_15.getfile(arg0, 5);
		type = new InvType();
		if (local38 != null) {
			type.decode(new Packet(local38));
		}
		@Pc(54) LruHashTable local54 = this.aClass98_6;
		synchronized (this.aClass98_6) {
			this.aClass98_6.put((long) arg0, type);
			return type;
		}
	}
}
