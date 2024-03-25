package com.jagex.game.client;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!q")
public final class StockMarketOffer {

	@OriginalMember(owner = "com.jagex.client!q", name = "a", descriptor = "I")
	public int obj;

	@OriginalMember(owner = "com.jagex.client!q", name = "b", descriptor = "I")
	public int completedCount;

	@OriginalMember(owner = "com.jagex.client!q", name = "d", descriptor = "I")
	public int price;

	@OriginalMember(owner = "com.jagex.client!q", name = "g", descriptor = "I")
	public int count;

	@OriginalMember(owner = "com.jagex.client!q", name = "k", descriptor = "B")
	private byte statusAndType;

	@OriginalMember(owner = "com.jagex.client!q", name = "m", descriptor = "I")
	public int completedGold;

	@OriginalMember(owner = "com.jagex.client!q", name = "<init>", descriptor = "()V")
	public StockMarketOffer() {
	}

	@OriginalMember(owner = "com.jagex.client!q", name = "<init>", descriptor = "(Lclient!bt;)V")
	public StockMarketOffer(@OriginalArg(0) Packet buf) {
		this.statusAndType = buf.g1b();
		this.obj = buf.g2();
		this.price = buf.g4();
		this.count = buf.g4();
		this.completedCount = buf.g4();
		this.completedGold = buf.g4();
	}

	@OriginalMember(owner = "com.jagex.client!q", name = "a", descriptor = "(I)I")
	public int getStatus() {
		return this.statusAndType & 0x7;
	}

	@OriginalMember(owner = "com.jagex.client!q", name = "b", descriptor = "(B)I")
	public int getType() {
		return (this.statusAndType & 0x8) == 8 ? 1 : 0;
	}
}
