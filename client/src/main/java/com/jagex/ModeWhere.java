package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!kk")
public final class ModeWhere {

	@OriginalMember(owner = "com.jagex.client!ks", name = "b", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_LIVE = new ModeWhere("LIVE", 0);
	@OriginalMember(owner = "com.jagex.client!hc", name = "c", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_WTRC = new ModeWhere("WTRC", 1);
	@OriginalMember(owner = "com.jagex.client!bk", name = "m", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_WTQA = new ModeWhere("WTQA", 2);
	@OriginalMember(owner = "com.jagex.client!com.jagex.client", name = "Y", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_WTWIP = new ModeWhere("WTWIP", 3);
	@OriginalMember(owner = "com.jagex.client!cq", name = "e", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_WTI = new ModeWhere("WTI", 5);
	@OriginalMember(owner = "com.jagex.client!nf", name = "q", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_LOCAL = new ModeWhere("LOCAL", 4);
	@OriginalMember(owner = "com.jagex.client!kk", name = "h", descriptor = "I")
	public final int anInt3427;

	@OriginalMember(owner = "com.jagex.client!kk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public ModeWhere(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3427 = arg1;
	}

	@OriginalMember(owner = "com.jagex.client!il", name = "b", descriptor = "(B)[Lclient!kk;")
	public static ModeWhere[] getAll() {
		return new ModeWhere[] { MODE_WHERE_LIVE, MODE_WHERE_WTRC, MODE_WHERE_WTQA, MODE_WHERE_WTWIP, MODE_WHERE_LOCAL, MODE_WHERE_WTI};
	}

	@OriginalMember(owner = "com.jagex.client!nm", name = "a", descriptor = "(II)Lclient!kk;")
	public static ModeWhere get(@OriginalArg(0) int arg0) {
		@Pc(13) ModeWhere[] local13 = getAll();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) ModeWhere local21 = local13[local15];
			if (local21.anInt3427 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "com.jagex.client!pp", name = "a", descriptor = "(ILclient!kk;)Z")
	public static boolean isExternalMode(@OriginalArg(1) ModeWhere arg0) {
		return MODE_WHERE_WTRC == arg0 || MODE_WHERE_WTQA == arg0 || MODE_WHERE_WTWIP == arg0 || MODE_WHERE_WTI == arg0;
	}

	@OriginalMember(owner = "com.jagex.client!kk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
