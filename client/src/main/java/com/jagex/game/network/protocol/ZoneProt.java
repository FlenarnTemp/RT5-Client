package com.jagex.game.network.protocol;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!s")
public final class ZoneProt {

	@OriginalMember(owner = "com.jagex.client!ib", name = "C", descriptor = "Lclient!s;")
	public static final ZoneProt LOC_ADD_CHANGE = new ZoneProt(0, 4);
	@OriginalMember(owner = "com.jagex.client!pk", name = "lb", descriptor = "Lclient!s;")
	public static final ZoneProt MAP_PROJANIM = new ZoneProt(1, 15);
	@OriginalMember(owner = "com.jagex.client!gb", name = "o", descriptor = "Lclient!s;")
	public static final ZoneProt OBJ_ADD = new ZoneProt(2, 5);
	@OriginalMember(owner = "com.jagex.client!gd", name = "e", descriptor = "Lclient!s;")
	public static final ZoneProt TEXT_COORD = new ZoneProt(3, -1);
	@OriginalMember(owner = "com.jagex.client!ec", name = "p", descriptor = "Lclient!s;")
	public static final ZoneProt LOC_PREFETCH = new ZoneProt(4, 3);
	@OriginalMember(owner = "com.jagex.client!nr", name = "d", descriptor = "Lclient!s;")
	public static final ZoneProt LOC_DEL = new ZoneProt(5, 2);
	@OriginalMember(owner = "com.jagex.client!bc", name = "f", descriptor = "Lclient!s;")
	public static final ZoneProt MAP_PROJANIM_HALFSQ = new ZoneProt(6, 15);
	@OriginalMember(owner = "com.jagex.client!lo", name = "l", descriptor = "Lclient!s;")
	public static final ZoneProt LOC_ANIM = new ZoneProt(7, 4);
	@OriginalMember(owner = "com.jagex.client!jl", name = "cb", descriptor = "Lclient!s;")
	public static final ZoneProt MAP_ANIM = new ZoneProt(8, 6);
	@OriginalMember(owner = "com.jagex.client!vr", name = "d", descriptor = "Lclient!s;")
	public static final ZoneProt MAP_PROJANIM_SPECIFIC = new ZoneProt(9, 17);
	@OriginalMember(owner = "com.jagex.client!tg", name = "I", descriptor = "Lclient!s;")
	public static final ZoneProt SOUND_AREA = new ZoneProt(10, 6);
	@OriginalMember(owner = "com.jagex.client!bk", name = "g", descriptor = "Lclient!s;")
	public static final ZoneProt OBJ_DEL = new ZoneProt(11, 3);
	@OriginalMember(owner = "com.jagex.client!qj", name = "m", descriptor = "Lclient!s;")
	public static final ZoneProt OBJ_COUNT = new ZoneProt(12, 7);
	@OriginalMember(owner = "com.jagex.client!hu", name = "i", descriptor = "Lclient!s;")
	public static final ZoneProt OBJ_REVEAL = new ZoneProt(13, 7);
	@OriginalMember(owner = "com.jagex.client!us", name = "R", descriptor = "Lclient!s;")
	public static final ZoneProt LOC_MERGE = new ZoneProt(14, 14);

	@OriginalMember(owner = "com.jagex.client!s", name = "<init>", descriptor = "(II)V")
	public ZoneProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
	}

	@OriginalMember(owner = "com.jagex.client!sq", name = "d", descriptor = "(I)[Lclient!s;")
	public static ZoneProt[] getAll() {
		return new ZoneProt[] {LOC_ADD_CHANGE, MAP_PROJANIM, OBJ_ADD, TEXT_COORD, LOC_PREFETCH, LOC_DEL, MAP_PROJANIM_HALFSQ, LOC_ANIM, MAP_ANIM, MAP_PROJANIM_SPECIFIC, SOUND_AREA, OBJ_DEL, OBJ_COUNT, OBJ_REVEAL, LOC_MERGE};
	}

	@OriginalMember(owner = "com.jagex.client!s", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
