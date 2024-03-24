package com.jagex;

import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "com.jagex.client!sl", name = "a", descriptor = "(Lclient!r;II)Lclient!sl;")
	public static Song method5448(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.getfile(arg2, arg1);
		return local5 == null ? null : new Song(new Packet(local5));
	}
}
