package com.jagex;

import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.StringWrapper;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ck")
public final class StructType extends SecondaryNode {

	@OriginalMember(owner = "com.jagex.client!ck", name = "E", descriptor = "Lclient!ad;")
	private HashTable aClass4_20;

	@OriginalMember(owner = "com.jagex.client!ck", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(23) int local23 = arg0.g1();
		@Pc(30) int local30;
		if (this.aClass4_20 == null) {
			local30 = Static162.bitCeil(local23);
			this.aClass4_20 = new HashTable(local30);
		}
		for (local30 = 0; local30 < local23; local30++) {
			@Pc(49) boolean local49 = arg0.g1() == 1;
			@Pc(53) int local53 = arg0.g3();
			@Pc(62) Node local62;
			if (local49) {
				local62 = new StringWrapper(arg0.gjstr());
			} else {
				local62 = new IntWrapper(arg0.g4());
			}
			this.aClass4_20.pushNode(local62, (long) local53);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ck", name = "b", descriptor = "(III)I")
	public int getParam(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass4_20 == null) {
			return arg1;
		} else {
			@Pc(16) IntWrapper local16 = (IntWrapper) this.aClass4_20.get((long) arg0);
			return local16 == null ? arg1 : local16.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ck", name = "a", descriptor = "(Lclient!bt;B)V")
	public void decode(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.g1();
			if (local16 == 0) {
				return;
			}
			this.decode(arg0, local16);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ck", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String getParam(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass4_20 == null) {
			return arg1;
		} else {
			@Pc(16) StringWrapper local16 = (StringWrapper) this.aClass4_20.get((long) arg0);
			return local16 == null ? arg1 : local16.value;
		}
	}
}
