package com.jagex.game.config.structtype;

import com.jagex.HashTable;
import com.jagex.SecondaryNode;
import com.jagex.Static162;
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
	private HashTable params;

	@OriginalMember(owner = "com.jagex.client!ck", name = "a", descriptor = "(Lclient!bt;B)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(16) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ck", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet buf, @OriginalArg(2) int code) {
		if (code == 249) {
			@Pc(23) int length = buf.g1();
			if (this.params == null) {
				int local30 = Static162.bitCeil(length);
				this.params = new HashTable(local30);
			}
			for (int index = 0; index < length; index++) {
				@Pc(49) boolean isString = buf.g1() == 1;
				@Pc(53) int local53 = buf.g3();
				@Pc(62) Node node;
				if (isString) {
					node = new StringWrapper(buf.gjstr());
				} else {
					node = new IntWrapper(buf.g4());
				}
				this.params.pushNode(node, (long) local53);
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ck", name = "b", descriptor = "(III)I")
	public int getParam(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			@Pc(16) IntWrapper local16 = (IntWrapper) this.params.getNode((long) arg0);
			return local16 == null ? arg1 : local16.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ck", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String getParam(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			@Pc(16) StringWrapper local16 = (StringWrapper) this.params.getNode((long) arg0);
			return local16 == null ? arg1 : local16.value;
		}
	}
}
