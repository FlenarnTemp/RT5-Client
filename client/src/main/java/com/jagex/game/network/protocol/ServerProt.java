package com.jagex.game.network.protocol;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!h")
public final class ServerProt {

	@OriginalMember(owner = "com.jagex.client!rf", name = "cb", descriptor = "Lclient!h;")
	public static final ServerProt REFLECTION_CHEAT_CHECK = new ServerProt(18, -2);
	@OriginalMember(owner = "com.jagex.client!vs", name = "x", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_75 = new ServerProt(75, 0);
	@OriginalMember(owner = "com.jagex.client!sm", name = "B", descriptor = "Lclient!h;")
	public static final ServerProt IF_OPENTOP = new ServerProt(93, 5); // TODO: confirm
	@OriginalMember(owner = "com.jagex.client!e", name = "j", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_48 = new ServerProt(48, 5);
	@OriginalMember(owner = "com.jagex.client!nb", name = "D", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_91 = new ServerProt(91, 2);
	@OriginalMember(owner = "com.jagex.client!rb", name = "n", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_66 = new ServerProt(66, 10);
	@OriginalMember(owner = "com.jagex.client!dg", name = "g", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_82 = new ServerProt(82, 0);
	@OriginalMember(owner = "com.jagex.client!bg", name = "g", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_30 = new ServerProt(30, 2);
	@OriginalMember(owner = "com.jagex.client!bp", name = "r", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_76 = new ServerProt(76, -1);
	@OriginalMember(owner = "com.jagex.client!pk", name = "jb", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_0 = new ServerProt(0, 10);
	@OriginalMember(owner = "com.jagex.client!ro", name = "d", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_36 = new ServerProt(36, 8);
	@OriginalMember(owner = "com.jagex.client!gs", name = "g", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_12 = new ServerProt(12, 3);
	@OriginalMember(owner = "com.jagex.client!ip", name = "g", descriptor = "Lclient!h;")
	public static final ServerProt PLAYER_INFO = new ServerProt(72, -2);
	@OriginalMember(owner = "com.jagex.client!wh", name = "v", descriptor = "Lclient!h;")
	public static final ServerProt WIDGETSTRUCT_SETTING = new ServerProt(77, 12);
	@OriginalMember(owner = "com.jagex.client!vo", name = "p", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_89 = new ServerProt(89, 6);
	@OriginalMember(owner = "com.jagex.client!fl", name = "o", descriptor = "Lclient!h;")
	public static final ServerProt IF_OPENSUB = new ServerProt(52, 9); // TODO: confirm
	@OriginalMember(owner = "com.jagex.client!wm", name = "q", descriptor = "Lclient!h;")
	public static final ServerProt UPDATE_STAT = new ServerProt(20, 6);
	@OriginalMember(owner = "com.jagex.client!ip", name = "e", descriptor = "Lclient!h;")
	public static final ServerProt CAM_LOOKAT = new ServerProt(25, 8);
	@OriginalMember(owner = "com.jagex.client!en", name = "b", descriptor = "Lclient!h;")
	public static final ServerProt UPDATE_FRIENDLIST = new ServerProt(70, -2);
	@OriginalMember(owner = "com.jagex.client!mg", name = "z", descriptor = "Lclient!h;")
	public static final ServerProt UPDATE_RUNWEIGHT = new ServerProt(7, 2);
	@OriginalMember(owner = "com.jagex.client!mq", name = "o", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_55 = new ServerProt(55, -1);
	@OriginalMember(owner = "com.jagex.client!ej", name = "C", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_43 = new ServerProt(43, -1);
	@OriginalMember(owner = "com.jagex.client!aj", name = "R", descriptor = "Lclient!h;")
	public static final ServerProt LOGOUT = new ServerProt(58, 0);
	@OriginalMember(owner = "com.jagex.client!js", name = "J", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_73 = new ServerProt(73, 6);
	@OriginalMember(owner = "com.jagex.client!vp", name = "m", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_5 = new ServerProt(5, 8);
	@OriginalMember(owner = "com.jagex.client!fu", name = "X", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_17 = new ServerProt(17, 2);
	@OriginalMember(owner = "com.jagex.client!kl", name = "a", descriptor = "Lclient!h;")
	public static final ServerProt SOUND_AREA = new ServerProt(1, 6);
	@OriginalMember(owner = "com.jagex.client!ae", name = "P", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_97 = new ServerProt(97, 7);
	@OriginalMember(owner = "com.jagex.client!gq", name = "j", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_103 = new ServerProt(103, 0);
	@OriginalMember(owner = "com.jagex.client!ia", name = "p", descriptor = "Lclient!h;")
	public static final ServerProt UPDATE_REBOOT_TIMER = new ServerProt(8, 2);
	@OriginalMember(owner = "com.jagex.client!pg", name = "T", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_92 = new ServerProt(92, 6);
	@OriginalMember(owner = "com.jagex.client!ei", name = "l", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_31 = new ServerProt(31, 8);
	@OriginalMember(owner = "com.jagex.client!ct", name = "j", descriptor = "Lclient!h;")
	public static final ServerProt MAP_PROJANIM_SPECIFIC = new ServerProt(39, 17);
	@OriginalMember(owner = "com.jagex.client!tp", name = "k", descriptor = "Lclient!h;")
	public static final ServerProt LOC_MERGE = new ServerProt(101, 14);
	@OriginalMember(owner = "com.jagex.client!ei", name = "e", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_15 = new ServerProt(15, 10);
	@OriginalMember(owner = "com.jagex.client!cq", name = "f", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_24 = new ServerProt(24, 12);
	@OriginalMember(owner = "com.jagex.client!em", name = "f", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_35 = new ServerProt(35, -2);
	@OriginalMember(owner = "com.jagex.client!wt", name = "X", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_26 = new ServerProt(26, 28);
	@OriginalMember(owner = "com.jagex.client!wi", name = "x", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_71 = new ServerProt(71, 20);
	@OriginalMember(owner = "com.jagex.client!jg", name = "t", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_10 = new ServerProt(10, -1);
	@OriginalMember(owner = "com.jagex.client!ui", name = "l", descriptor = "Lclient!h;")
	public static final ServerProt LOC_ADD_CHANGE = new ServerProt(104, 4);
	@OriginalMember(owner = "com.jagex.client!lo", name = "i", descriptor = "Lclient!h;")
	public static final ServerProt OBJ_COUNT = new ServerProt(83, 7);
	@OriginalMember(owner = "com.jagex.client!et", name = "i", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_40 = new ServerProt(40, 1);
	@OriginalMember(owner = "com.jagex.client!jo", name = "p", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_23 = new ServerProt(23, 8);
	@OriginalMember(owner = "com.jagex.client!em", name = "a", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_56 = new ServerProt(56, -1);
	@OriginalMember(owner = "com.jagex.client!wc", name = "i", descriptor = "Lclient!h;")
	public static final ServerProt LOC_PREFETCH = new ServerProt(94, 3);
	@OriginalMember(owner = "com.jagex.client!nj", name = "h", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_42 = new ServerProt(42, 3);
	@OriginalMember(owner = "com.jagex.client!cf", name = "v", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_105 = new ServerProt(105, -1);
	@OriginalMember(owner = "com.jagex.client!gg", name = "O", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_41 = new ServerProt(41, 3);
	@OriginalMember(owner = "com.jagex.client!nq", name = "f", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_19 = new ServerProt(19, 0);
	@OriginalMember(owner = "com.jagex.client!ie", name = "n", descriptor = "Lclient!h;")
	public static final ServerProt SET_INTERFACE_SETTINGS = new ServerProt(38, 14);
	@OriginalMember(owner = "com.jagex.client!wt", name = "bb", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_6 = new ServerProt(6, -2);
	@OriginalMember(owner = "com.jagex.client!mg", name = "w", descriptor = "Lclient!h;")
	public static final ServerProt SET_INTERACTION = new ServerProt(46, -1);
	@OriginalMember(owner = "com.jagex.client!hq", name = "x", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_14 = new ServerProt(14, 6);
	@OriginalMember(owner = "com.jagex.client!es", name = "c", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_54 = new ServerProt(54, 12);
	@OriginalMember(owner = "com.jagex.client!eq", name = "u", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_37 = new ServerProt(37, -2);
	@OriginalMember(owner = "com.jagex.client!wj", name = "e", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_67 = new ServerProt(67, -1);
	@OriginalMember(owner = "com.jagex.client!ip", name = "a", descriptor = "Lclient!h;")
	public static final ServerProt MESSAGE_GAME = new ServerProt(99, -1);
	@OriginalMember(owner = "com.jagex.client!ck", name = "B", descriptor = "Lclient!h;")
	public static final ServerProt MAP_PROJANIM = new ServerProt(34, 15);
	@OriginalMember(owner = "com.jagex.client!ke", name = "y", descriptor = "Lclient!h;")
	public static final ServerProt LAST_LOGIN_INFO = new ServerProt(68, 4);
	@OriginalMember(owner = "com.jagex.client!pk", name = "Q", descriptor = "Lclient!h;")
	public static final ServerProt CHAT_FILTER_SETTINGS = new ServerProt(2, 2);
	@OriginalMember(owner = "com.jagex.client!mr", name = "Ub", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_64 = new ServerProt(64, 3);
	@OriginalMember(owner = "com.jagex.client!fj", name = "a", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_27 = new ServerProt(27, 8);
	@OriginalMember(owner = "com.jagex.client!el", name = "o", descriptor = "Lclient!h;")
	public static final ServerProt LOC_DEL = new ServerProt(80, 2);
	@OriginalMember(owner = "com.jagex.client!nm", name = "k", descriptor = "Lclient!h;")
	public static final ServerProt UPDATE_RUNENERGY = new ServerProt(4, 1);
	@OriginalMember(owner = "com.jagex.client!jm", name = "c", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_44 = new ServerProt(44, 8);
	@OriginalMember(owner = "com.jagex.client!ot", name = "I", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_47 = new ServerProt(47, 6);
	@OriginalMember(owner = "com.jagex.client!pj", name = "u", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_50 = new ServerProt(50, -1);
	@OriginalMember(owner = "com.jagex.client!ih", name = "g", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_85 = new ServerProt(85, -2);
	@OriginalMember(owner = "com.jagex.client!hl", name = "I", descriptor = "Lclient!h;")
	public static final ServerProt MIDI_SONG = new ServerProt(61, 4);
	@OriginalMember(owner = "com.jagex.client!cj", name = "n", descriptor = "Lclient!h;")
	public static final ServerProt MIDI_JINGLE = new ServerProt(62, 6);
	@OriginalMember(owner = "com.jagex.client!hc", name = "g", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_84 = new ServerProt(84, -1);
	@OriginalMember(owner = "com.jagex.client!sn", name = "E", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_100 = new ServerProt(100, -2);
	@OriginalMember(owner = "com.jagex.client!mc", name = "j", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_81 = new ServerProt(81, 8);
	@OriginalMember(owner = "com.jagex.client!bs", name = "s", descriptor = "Lclient!h;")
	public static final ServerProt LOC_ANIM = new ServerProt(74, 4);
	@OriginalMember(owner = "com.jagex.client!so", name = "d", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_60 = new ServerProt(60, -2);
	@OriginalMember(owner = "com.jagex.client!la", name = "i", descriptor = "Lclient!h;")
	public static final ServerProt TEXT_COORD = new ServerProt(63, -1);
	@OriginalMember(owner = "com.jagex.client!jl", name = "db", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_86 = new ServerProt(86, 10);
	@OriginalMember(owner = "com.jagex.client!sk", name = "v", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_32 = new ServerProt(32, -2);
	@OriginalMember(owner = "com.jagex.client!ra", name = "j", descriptor = "Lclient!h;")
	public static final ServerProt REBUILD_NORMAL = new ServerProt(98, -2);
	@OriginalMember(owner = "com.jagex.client!tj", name = "q", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_45 = new ServerProt(45, 1);
	@OriginalMember(owner = "com.jagex.client!eo", name = "e", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_21 = new ServerProt(21, 3);
	@OriginalMember(owner = "com.jagex.client!ak", name = "d", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_95 = new ServerProt(95, 8);
	@OriginalMember(owner = "com.jagex.client!fe", name = "e", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_29 = new ServerProt(29, 3);
	@OriginalMember(owner = "com.jagex.client!fl", name = "n", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_49 = new ServerProt(49, -1);
	@OriginalMember(owner = "com.jagex.client!ag", name = "f", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_90 = new ServerProt(90, 12);
	@OriginalMember(owner = "com.jagex.client!gl", name = "s", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_51 = new ServerProt(51, -1);
	@OriginalMember(owner = "com.jagex.client!c", name = "d", descriptor = "Lclient!h;")
	public static final ServerProt OBJ_DEL = new ServerProt(3, 3);
	@OriginalMember(owner = "com.jagex.client!pk", name = "hb", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_78 = new ServerProt(78, 6);
	@OriginalMember(owner = "com.jagex.client!wq", name = "o", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_69 = new ServerProt(69, -2);
	@OriginalMember(owner = "com.jagex.client!ek", name = "X", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_65 = new ServerProt(65, 5);
	@OriginalMember(owner = "com.jagex.client!en", name = "a", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_22 = new ServerProt(22, 8);
	@OriginalMember(owner = "com.jagex.client!kg", name = "t", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_11 = new ServerProt(11, -1);
	@OriginalMember(owner = "com.jagex.client!bo", name = "a", descriptor = "Lclient!h;")
	public static final ServerProt REBUILD_REGION = new ServerProt(88, -2);
	@OriginalMember(owner = "com.jagex.client!vo", name = "z", descriptor = "Lclient!h;")
	public static final ServerProt MAP_PROJANIM_HALFSQ = new ServerProt(33, 15);
	@OriginalMember(owner = "com.jagex.client!ff", name = "G", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_53 = new ServerProt(53, -1);
	@OriginalMember(owner = "com.jagex.client!un", name = "p", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_57 = new ServerProt(57, 12);
	@OriginalMember(owner = "com.jagex.client!lp", name = "b", descriptor = "Lclient!h;")
	public static final ServerProt OBJ_ADD = new ServerProt(13, 5);
	@OriginalMember(owner = "com.jagex.client!bo", name = "g", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_16 = new ServerProt(16, 7);
	@OriginalMember(owner = "com.jagex.client!hs", name = "r", descriptor = "Lclient!h;")
	public static final ServerProt UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerProt(59, -2);
	@OriginalMember(owner = "com.jagex.client!ne", name = "H", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_102 = new ServerProt(102, 12);
	@OriginalMember(owner = "com.jagex.client!jl", name = "V", descriptor = "Lclient!h;")
	public static final ServerProt OBJ_REVEAL = new ServerProt(79, 7);
	@OriginalMember(owner = "com.jagex.client!io", name = "p", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_87 = new ServerProt(87, -2);
	@OriginalMember(owner = "com.jagex.client!lq", name = "t", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_28 = new ServerProt(28, 6);
	@OriginalMember(owner = "com.jagex.client!od", name = "Bb", descriptor = "Lclient!h;")
	public static final ServerProt MAP_ANIM = new ServerProt(96, 6);
	@OriginalMember(owner = "com.jagex.client!fk", name = "P", descriptor = "Lclient!h;")
	public static final ServerProt PACKET_9 = new ServerProt(9, 8);

	@OriginalMember(owner = "com.jagex.client!h", name = "f", descriptor = "I")
	public final int size;

	@OriginalMember(owner = "com.jagex.client!h", name = "e", descriptor = "I")
	private final int opcode;

	@OriginalMember(owner = "com.jagex.client!h", name = "<init>", descriptor = "(II)V")
	public ServerProt(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.size = arg1;
		this.opcode = arg0;
	}

	@OriginalMember(owner = "com.jagex.client!jo", name = "a", descriptor = "(Z)[Lclient!h;")
	public static ServerProt[] getAll() {
		return new ServerProt[] { PACKET_0, SOUND_AREA, CHAT_FILTER_SETTINGS, OBJ_DEL, UPDATE_RUNENERGY, PACKET_5, PACKET_6, UPDATE_RUNWEIGHT, UPDATE_REBOOT_TIMER, PACKET_9, PACKET_10, PACKET_11, PACKET_12, OBJ_ADD, PACKET_14, PACKET_15, PACKET_16, PACKET_17, REFLECTION_CHEAT_CHECK, PACKET_19, UPDATE_STAT, PACKET_21, PACKET_22, PACKET_23, PACKET_24, CAM_LOOKAT, PACKET_26, PACKET_27, PACKET_28, PACKET_29, PACKET_30, PACKET_31, PACKET_32, MAP_PROJANIM_HALFSQ, MAP_PROJANIM, PACKET_35, PACKET_36, PACKET_37, SET_INTERFACE_SETTINGS, MAP_PROJANIM_SPECIFIC, PACKET_40, PACKET_41, PACKET_42, PACKET_43, PACKET_44, PACKET_45, SET_INTERACTION, PACKET_47, PACKET_48, PACKET_49, PACKET_50, PACKET_51, IF_OPENSUB, PACKET_53, PACKET_54, PACKET_55, PACKET_56, PACKET_57, LOGOUT, UPDATE_ZONE_PARTIAL_ENCLOSED, PACKET_60, MIDI_SONG, MIDI_JINGLE, TEXT_COORD, PACKET_64, PACKET_65, PACKET_66, PACKET_67, LAST_LOGIN_INFO, PACKET_69, UPDATE_FRIENDLIST, PACKET_71, PLAYER_INFO, PACKET_73, LOC_ANIM, PACKET_75, PACKET_76, WIDGETSTRUCT_SETTING, PACKET_78, OBJ_REVEAL, LOC_DEL, PACKET_81, PACKET_82, OBJ_COUNT, PACKET_84, PACKET_85, PACKET_86, PACKET_87, REBUILD_REGION, PACKET_89, PACKET_90, PACKET_91, PACKET_92, IF_OPENTOP, LOC_PREFETCH, PACKET_95, MAP_ANIM, PACKET_97, REBUILD_NORMAL, MESSAGE_GAME, PACKET_100, LOC_MERGE, PACKET_102, PACKET_103, LOC_ADD_CHANGE, PACKET_105 };
	}

	@OriginalMember(owner = "com.jagex.client!h", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "com.jagex.client!h", name = "b", descriptor = "(B)I")
	public int getOpcode() {
		return this.opcode;
	}
}
