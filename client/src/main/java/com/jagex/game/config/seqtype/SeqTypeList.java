package com.jagex.game.config.seqtype;

import com.jagex.*;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!gp")
public final class SeqTypeList {

	@OriginalMember(owner = "com.jagex.client!gp", name = "f", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_14 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!gp", name = "q", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_15 = new LruHashTable(100);

	@OriginalMember(owner = "com.jagex.client!gp", name = "n", descriptor = "Lclient!r;")
	private final Js5 aClass197_27;

	@OriginalMember(owner = "com.jagex.client!gp", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;Lclient!r;)V")
	public SeqTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aClass197_27 = arg2;
		if (this.aClass197_27 != null) {
			@Pc(26) int local26 = this.aClass197_27.capacity() - 1;
			this.aClass197_27.getGroupCapacity(local26);
		}
		Static81.method3665(arg3, arg4);
	}

	@OriginalMember(owner = "com.jagex.client!gp", name = "a", descriptor = "(II)Lclient!nt;")
	public AnimFrameset method2368(@OriginalArg(1) int arg0) {
		@Pc(12) LruHashTable local12 = this.aClass98_15;
		@Pc(22) AnimFrameset local22;
		synchronized (this.aClass98_15) {
			local22 = (AnimFrameset) this.aClass98_15.get((long) arg0);
			if (local22 == null) {
				local22 = new AnimFrameset(arg0);
				this.aClass98_15.put((long) arg0, local22);
			}
		}
		synchronized (local22) {
			return local22.method4240() ? local22 : null;
		}
	}

	@OriginalMember(owner = "com.jagex.client!gp", name = "c", descriptor = "(II)Lclient!nb;")
	public SeqType method2371(@OriginalArg(1) int id) {
		@Pc(6) LruHashTable local6 = this.aClass98_14;
		@Pc(16) SeqType type;
		synchronized (this.aClass98_14) {
			type = (SeqType) this.aClass98_14.get((long) id);
		}
		if (type != null) {
			return type;
		}
		@Pc(37) byte[] local37 = this.aClass197_27.getfile(Static341.method5768(id), Static98.method2104(id));
		type = new SeqType();
		type.id = id;
		type.aClass85_2 = this;
		if (local37 != null) {
			type.decode(new Packet(local37));
		}
		type.postDecode();
		@Pc(64) LruHashTable local64 = this.aClass98_14;
		synchronized (this.aClass98_14) {
			this.aClass98_14.put((long) id, type);
			return type;
		}
	}

	@OriginalMember(owner = "com.jagex.client!gp", name = "a", descriptor = "(I)V")
	public void method2373() {
		@Pc(8) LruHashTable local8 = this.aClass98_14;
		synchronized (this.aClass98_14) {
			this.aClass98_14.method2614();
		}
		local8 = this.aClass98_15;
		synchronized (this.aClass98_15) {
			this.aClass98_15.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!gp", name = "b", descriptor = "(I)V")
	public void method2374() {
		@Pc(2) LruHashTable local2 = this.aClass98_14;
		synchronized (this.aClass98_14) {
			this.aClass98_14.method2621();
		}
		local2 = this.aClass98_15;
		synchronized (this.aClass98_15) {
			this.aClass98_15.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!gp", name = "a", descriptor = "(ZI)V")
	public void method2375() {
		@Pc(6) LruHashTable local6 = this.aClass98_14;
		synchronized (this.aClass98_14) {
			this.aClass98_14.clean(5);
		}
		local6 = this.aClass98_15;
		synchronized (this.aClass98_15) {
			this.aClass98_15.clean(5);
		}
	}
}
