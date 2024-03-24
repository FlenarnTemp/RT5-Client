package com.jagex.game.config.enumtype;

import com.jagex.*;
import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.StringWrapper;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ds")
public final class EnumType {

	@OriginalMember(owner = "com.jagex.client!ds", name = "e", descriptor = "Lclient!ad;")
	private HashTable aClass4_30;

	@OriginalMember(owner = "com.jagex.client!ds", name = "i", descriptor = "Lclient!ad;")
	public HashTable table;

	@OriginalMember(owner = "com.jagex.client!ds", name = "l", descriptor = "C")
	public char valueType;

	@OriginalMember(owner = "com.jagex.client!ds", name = "m", descriptor = "I")
	private int defaultInt;

	@OriginalMember(owner = "com.jagex.client!ds", name = "n", descriptor = "C")
	public char keyType;

	@OriginalMember(owner = "com.jagex.client!ds", name = "h", descriptor = "Ljava/lang/String;")
	private String defaultString = "null";

	@OriginalMember(owner = "com.jagex.client!ds", name = "a", descriptor = "(II)I")
	public int getInt(@OriginalArg(1) int arg0) {
		if (this.table == null) {
			return this.defaultInt;
		} else {
			@Pc(23) IntWrapper local23 = (IntWrapper) this.table.getNode((long) arg0);
			return local23 == null ? this.defaultInt : local23.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ds", name = "a", descriptor = "(Lclient!bt;BI)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(2) int code) {
		if (code == 1) {
			this.keyType = Static78.forCharKey(buf.g1b());
		} else if (code == 2) {
			this.valueType = Static78.forCharKey(buf.g1b());
		} else if (code == 3) {
			this.defaultString = buf.gjstr();
		} else if (code == 4) {
			this.defaultInt = buf.g4();
		} else if (code == 5 || code == 6) {
			@Pc(45) int local45 = buf.g2();
			this.table = new HashTable(Static162.bitCeil(local45));
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				@Pc(61) int local61 = buf.g4();
				@Pc(73) Node local73;
				if (code == 5) {
					local73 = new StringWrapper(buf.gjstr());
				} else {
					local73 = new IntWrapper(buf.g4());
				}
				this.table.pushNode(local73, (long) local61);
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ds", name = "a", descriptor = "(B)V")
	private void method1768() {
		this.aClass4_30 = new HashTable(this.table.method89());
		for (@Pc(20) IntWrapper local20 = (IntWrapper) this.table.head(); local20 != null; local20 = (IntWrapper) this.table.next()) {
			@Pc(29) IntWrapper local29 = new IntWrapper((int) local20.nodeId);
			this.aClass4_30.pushNode(local29, (long) local20.value);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ds", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean containsValue(@OriginalArg(1) String arg0) {
		if (this.table == null) {
			return false;
		}
		if (this.aClass4_30 == null) {
			this.method1773();
		}
		for (@Pc(37) Class2_Sub28 local37 = (Class2_Sub28) this.aClass4_30.getNode(Static80.method5982(arg0)); local37 != null; local37 = (Class2_Sub28) this.aClass4_30.method82()) {
			if (local37.aString54.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "com.jagex.client!ds", name = "b", descriptor = "(II)Z")
	public boolean containsValue(@OriginalArg(1) int arg0) {
		if (this.table == null) {
			return false;
		}
		if (this.aClass4_30 == null) {
			this.method1768();
		}
		@Pc(29) IntWrapper local29 = (IntWrapper) this.aClass4_30.getNode((long) arg0);
		return local29 != null;
	}

	@OriginalMember(owner = "com.jagex.client!ds", name = "d", descriptor = "(B)V")
	private void method1773() {
		this.aClass4_30 = new HashTable(this.table.method89());
		for (@Pc(28) StringWrapper local28 = (StringWrapper) this.table.head(); local28 != null; local28 = (StringWrapper) this.table.next()) {
			@Pc(39) Class2_Sub28 local39 = new Class2_Sub28(local28.value, (int) local28.nodeId);
			this.aClass4_30.pushNode(local39, Static80.method5982(local28.value));
		}
	}

	@OriginalMember(owner = "com.jagex.client!ds", name = "a", descriptor = "(ILclient!bt;)V")
	public void decode(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.g1();
			if (local11 == 0) {
				return;
			}
			this.decode(arg0, local11);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ds", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String getString(@OriginalArg(0) int arg0) {
		if (this.table == null) {
			return this.defaultString;
		} else {
			@Pc(19) StringWrapper local19 = (StringWrapper) this.table.getNode((long) arg0);
			return local19 == null ? this.defaultString : local19.value;
		}
	}
}
