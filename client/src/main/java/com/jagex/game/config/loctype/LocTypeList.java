package com.jagex.game.config.loctype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.Static324;
import com.jagex.Static381;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!rh")
public final class LocTypeList {

	@OriginalMember(owner = "com.jagex.client!rh", name = "v", descriptor = "I")
	public int anInt5669;

	@OriginalMember(owner = "com.jagex.client!rh", name = "l", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "com.jagex.client!rh", name = "h", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_45 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!rh", name = "q", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_46 = new LruHashTable(500);

	@OriginalMember(owner = "com.jagex.client!rh", name = "t", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_47 = new LruHashTable(30);

	@OriginalMember(owner = "com.jagex.client!rh", name = "u", descriptor = "Lclient!hu;")
	public final LruHashTable aClass98_48 = new LruHashTable(50);

	@OriginalMember(owner = "com.jagex.client!rh", name = "n", descriptor = "Lclient!r;")
	private final Js5 aClass197_79;

	@OriginalMember(owner = "com.jagex.client!rh", name = "o", descriptor = "Z")
	public boolean allowMembers;

	@OriginalMember(owner = "com.jagex.client!rh", name = "d", descriptor = "Lclient!r;")
	public final Js5 aClass197_78;

	@OriginalMember(owner = "com.jagex.client!rh", name = "<init>", descriptor = "(Lclient!dn;IZLclient!r;Lclient!r;)V")
	public LocTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aClass197_79 = arg3;
		this.allowMembers = arg2;
		this.aClass197_78 = arg4;
		if (this.aClass197_79 != null) {
			@Pc(47) int local47 = this.aClass197_79.capacity() - 1;
			this.aClass197_79.getGroupCapacity(local47);
		}
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "a", descriptor = "(II)V")
	public void method5155(@OriginalArg(0) int arg0) {
		this.anInt5669 = arg0;
		@Pc(9) LruHashTable local9 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.method2614();
		}
		local9 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.method2614();
		}
		local9 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "a", descriptor = "(BZ)V")
	public void setAllowMembers(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.allowMembers) {
			this.allowMembers = arg0;
			this.method5159();
		}
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "a", descriptor = "(B)V")
	public void method5158() {
		@Pc(2) LruHashTable local2 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.method2621();
		}
		local2 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.method2621();
		}
		local2 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.method2621();
		}
		local2 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "a", descriptor = "(I)V")
	public void method5159() {
		@Pc(2) LruHashTable local2 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.method2614();
		}
		local2 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.method2614();
		}
		local2 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.method2614();
		}
		local2 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "a", descriptor = "(IZ)V")
	public void method5160(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean400) {
			this.aBoolean400 = arg0;
			this.method5159();
		}
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "a", descriptor = "(IB)V")
	public void method5161(@OriginalArg(0) int arg0) {
		this.aClass98_45 = new LruHashTable(arg0);
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "b", descriptor = "(II)V")
	public void method5162() {
		@Pc(6) LruHashTable local6 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.clean(5);
		}
		local6 = this.aClass98_46;
		synchronized (this.aClass98_46) {
			this.aClass98_46.clean(5);
		}
		local6 = this.aClass98_47;
		synchronized (this.aClass98_47) {
			this.aClass98_47.clean(5);
		}
		local6 = this.aClass98_48;
		synchronized (this.aClass98_48) {
			this.aClass98_48.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!rh", name = "b", descriptor = "(IB)Lclient!ct;")
	public LocType get(@OriginalArg(0) int id) {
		@Pc(6) LruHashTable local6 = this.aClass98_45;
		@Pc(16) LocType type;
		synchronized (this.aClass98_45) {
			type = (LocType) this.aClass98_45.get((long) id);
		}
		if (type != null) {
			return type;
		}
		@Pc(37) byte[] local37 = this.aClass197_79.getfile(Static381.method6348(id), Static324.method5540(id));
		type = new LocType();
		type.id = id;
		type.myList = this;
		if (local37 != null) {
			type.decode(new Packet(local37));
		}
		type.postDecode();
		if (type.breakroutefinding) {
			type.blockwalk = 0;
			type.var1 = false;
		}
		if (!this.allowMembers && type.members) {
			type.quests = null;
			type.ops = null;
		}
		@Pc(91) LruHashTable local91 = this.aClass98_45;
		synchronized (this.aClass98_45) {
			this.aClass98_45.put((long) id, type);
			return type;
		}
	}
}
