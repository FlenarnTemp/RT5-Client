package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!lc")
public final class Class57_Sub2_Sub1 extends Class57_Sub2 {

	@OriginalMember(owner = "com.jagex.client!lc", name = "B", descriptor = "[B")
	private byte[] data;

	@OriginalMember(owner = "com.jagex.client!lc", name = "<init>", descriptor = "()V")
	public Class57_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "com.jagex.client!lc", name = "a", descriptor = "(IB)V")
	@Override
	protected void modify(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.data[local10] = (byte) (local7 * 3 >> 5);
		this.data[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "com.jagex.client!lc", name = "b", descriptor = "(III)[B")
	public byte[] generate() {
		this.data = new byte[524288];
		this.noise();
		return this.data;
	}
}
