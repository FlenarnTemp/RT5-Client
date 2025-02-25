package com.jagex.game.config.questtype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ui")
public final class QuestTypeList {

	@OriginalMember(owner = "com.jagex.client!ui", name = "c", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_60 = new LruHashTable(64);

	@OriginalMember(owner = "com.jagex.client!ui", name = "i", descriptor = "Lclient!r;")
	private final Js5 aClass197_91;

	@OriginalMember(owner = "com.jagex.client!ui", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public QuestTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_91 = arg2;
		if (this.aClass197_91 != null) {
			this.aClass197_91.getGroupCapacity(35);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ui", name = "a", descriptor = "(I)V")
	public void method5881() {
		@Pc(2) LruHashTable local2 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2614();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ui", name = "a", descriptor = "(B)V")
	public void method5882() {
		@Pc(10) LruHashTable local10 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ui", name = "a", descriptor = "(ZI)V")
	public void method5884() {
		@Pc(2) LruHashTable local2 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ui", name = "a", descriptor = "(II)Lclient!ud;")
	public QuestType get(@OriginalArg(1) int id) {
		@Pc(6) LruHashTable local6 = this.aClass98_60;
		@Pc(16) QuestType type;
		synchronized (this.aClass98_60) {
			type = (QuestType) this.aClass98_60.get((long) id);
		}
		if (type != null) {
			return type;
		}
		@Pc(33) byte[] local33 = this.aClass197_91.getfile(id, 35);
		type = new QuestType();
		if (local33 != null) {
			type.decode(new Packet(local33));
		}
		type.postDecode();
		@Pc(52) LruHashTable local52 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.put((long) id, type);
			return type;
		}
	}
}
