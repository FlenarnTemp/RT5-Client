package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!f")
public final class Class67 {

	@OriginalMember(owner = "com.jagex.client!f", name = "c", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "com.jagex.client!f", name = "e", descriptor = "Lclient!cj;")
	public Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "com.jagex.client!f", name = "g", descriptor = "Lclient!el;")
	public Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "com.jagex.client!f", name = "i", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "com.jagex.client!f", name = "j", descriptor = "Lclient!bi;")
	public Class22 aClass22_2;

	@OriginalMember(owner = "com.jagex.client!f", name = "l", descriptor = "Lclient!gq;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "com.jagex.client!f", name = "n", descriptor = "Lclient!cj;")
	public Class11_Sub3 aClass11_Sub3_3;

	@OriginalMember(owner = "com.jagex.client!f", name = "o", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "com.jagex.client!f", name = "q", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "com.jagex.client!f", name = "r", descriptor = "Lclient!tp;")
	public Class224 aClass224_1;

	@OriginalMember(owner = "com.jagex.client!f", name = "t", descriptor = "Lclient!da;")
	public Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "com.jagex.client!f", name = "v", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "com.jagex.client!f", name = "w", descriptor = "Z")
	public boolean aBoolean137;

	@OriginalMember(owner = "com.jagex.client!f", name = "z", descriptor = "B")
	public byte aByte13;

	@OriginalMember(owner = "com.jagex.client!f", name = "B", descriptor = "Lclient!f;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "com.jagex.client!f", name = "C", descriptor = "Z")
	public boolean aBoolean138;

	@OriginalMember(owner = "com.jagex.client!f", name = "D", descriptor = "Lclient!gq;")
	public Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "com.jagex.client!f", name = "h", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "com.jagex.client!f", name = "m", descriptor = "B")
	public byte aByte10;

	@OriginalMember(owner = "com.jagex.client!f", name = "a", descriptor = "B")
	public byte aByte7;

	@OriginalMember(owner = "com.jagex.client!f", name = "s", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "com.jagex.client!f", name = "y", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "com.jagex.client!f", name = "<init>", descriptor = "(III)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte7 = this.aByte10 = (byte) arg0;
		this.aShort22 = (short) arg2;
		this.aShort23 = (short) arg1;
	}

	@OriginalMember(owner = "com.jagex.client!f", name = "b", descriptor = "(I)V")
	public void method1964() {
		while (this.aClass22_2 != null) {
			@Pc(17) Class22 local17 = this.aClass22_2.aClass22_1;
			this.aClass22_2.method857();
			this.aClass22_2 = local17;
		}
		this.aByte8 = 0;
	}
}
