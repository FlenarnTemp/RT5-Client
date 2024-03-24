package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!bs")
public class Class12_Sub1 extends ParticleNode {

	@OriginalMember(owner = "com.jagex.client!bs", name = "m", descriptor = "Lclient!bs;")
	public Class12_Sub1 aClass12_Sub1_5;

	@OriginalMember(owner = "com.jagex.client!bs", name = "r", descriptor = "Lclient!bs;")
	public Class12_Sub1 aClass12_Sub1_6;

	@OriginalMember(owner = "com.jagex.client!bs", name = "b", descriptor = "(B)V")
	public final void method4206() {
		if (this.aClass12_Sub1_6 != null) {
			this.aClass12_Sub1_6.aClass12_Sub1_5 = this.aClass12_Sub1_5;
			this.aClass12_Sub1_5.aClass12_Sub1_6 = this.aClass12_Sub1_6;
			this.aClass12_Sub1_5 = null;
			this.aClass12_Sub1_6 = null;
		}
	}
}
