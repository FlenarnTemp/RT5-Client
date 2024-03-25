package com.jagex.game.config.structtype;

import com.jagex.Class50;
import com.jagex.LruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ks")
public final class StructTypeList {

	@OriginalMember(owner = "com.jagex.client!ks", name = "c", descriptor = "Lclient!hu;")
	private final LruHashTable types = new LruHashTable(256);

	@OriginalMember(owner = "com.jagex.client!ks", name = "a", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "com.jagex.client!ks", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public StructTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.archive = arg2;
		this.archive.getGroupCapacity(26);
	}

	@OriginalMember(owner = "com.jagex.client!ks", name = "a", descriptor = "(BI)Lclient!ck;")
	public StructType get(@OriginalArg(1) int id) {
		@Pc(16) StructType type;
		synchronized (this.types) {
			type = (StructType) this.types.get(id);
		}
		if (type != null) {
			return type;
		}
		@Pc(38) byte[] bytes = this.archive.getfile(id, 26);
		type = new StructType();
		if (bytes != null) {
			type.decode(new Packet(bytes));
		}
		synchronized (this.types) {
			this.types.put(id, type);
			return type;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ks", name = "b", descriptor = "(BI)V")
	public void method3472() {
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ks", name = "a", descriptor = "(B)V")
	public void method3473() {
		synchronized (this.types) {
			this.types.method2621();
		}
	}

	@OriginalMember(owner = "com.jagex.client!ks", name = "a", descriptor = "(I)V")
	public void method3475() {
		synchronized (this.types) {
			this.types.method2614();
		}
	}
}
