package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!bi")
public final class Class22 {

	@OriginalMember(owner = "com.jagex.client!bi", name = "c", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "com.jagex.client!bi", name = "e", descriptor = "Lclient!bi;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "com.jagex.client!bi", name = "l", descriptor = "Lclient!hb;")
	public Entity aClass11_Sub5_1;

	@OriginalMember(owner = "com.jagex.client!bi", name = "a", descriptor = "(I)V")
	public void method857() {
		if (Static222.anInt3944 >= 500) {
			return;
		}
		this.anInt645 = 0;
		this.aClass22_1 = Static290.aClass22_3;
		this.aClass11_Sub5_1 = null;
		Static290.aClass22_3 = this;
		Static222.anInt3944++;
	}
}
