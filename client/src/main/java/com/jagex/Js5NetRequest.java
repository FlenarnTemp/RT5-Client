package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!jj")
public final class Js5NetRequest extends Js5Request {

	@OriginalMember(owner = "com.jagex.client!jj", name = "O", descriptor = "I")
	public int blockPosition;

	@OriginalMember(owner = "com.jagex.client!jj", name = "Q", descriptor = "B")
	public byte trailerLen;

	@OriginalMember(owner = "com.jagex.client!jj", name = "T", descriptor = "Lclient!bt;")
	public Packet buffer;

	@OriginalMember(owner = "com.jagex.client!jj", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] getData() {
		if (super.incomplete || this.buffer.pos < this.buffer.data.length - this.trailerLen) {
			throw new RuntimeException();
		}
		return this.buffer.data;
	}

	@OriginalMember(owner = "com.jagex.client!jj", name = "b", descriptor = "(I)I")
	@Override
	public int getPercentageComplete() {
		return this.buffer == null ? 0 : this.buffer.pos * 100 / (this.buffer.data.length - this.trailerLen);
	}
}
