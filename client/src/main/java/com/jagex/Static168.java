package com.jagex;

import com.jagex.game.config.seqtype.SeqType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "com.jagex.client!jq", name = "D", descriptor = "I")
	public static int anInt7248 = -1;

	@OriginalMember(owner = "com.jagex.client!jq", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray67 = new boolean[8];

	@OriginalMember(owner = "com.jagex.client!jq", name = "I", descriptor = "[Lclient!nb;")
	public static final SeqType[] A_SEQ_TYPE_ARRAY_42 = new SeqType[14];

	@OriginalMember(owner = "com.jagex.client!jq", name = "a", descriptor = "(II)I")
	public static int method6476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Scene.aByteArrayArray4 == null ? 0 : (Scene.aByteArrayArray4[arg0][arg1] & 0xFF) << 3;
	}
}
