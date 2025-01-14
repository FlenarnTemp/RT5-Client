package com.jagex.game.network.protocol;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!mc")
public final class ClientProt {

	@OriginalMember(owner = "com.jagex.client!pk", name = "kb", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_0 = new ClientProt(0, 2);

	@OriginalMember(owner = "com.jagex.client!we", name = "H", descriptor = "Lclient!mc;")
	public static final ClientProt MESSAGE_PRIVATE = new ClientProt(1, -1);

	@OriginalMember(owner = "com.jagex.client!c", name = "b", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_2 = new ClientProt(2, 8);

	@OriginalMember(owner = "com.jagex.client!gd", name = "h", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_3 = new ClientProt(3, 7);

	@OriginalMember(owner = "com.jagex.client!ip", name = "d", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_4 = new ClientProt(4, 8);

	@OriginalMember(owner = "com.jagex.client!sb", name = "S", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_5 = new ClientProt(5, 7);

	@OriginalMember(owner = "com.jagex.client!vp", name = "k", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_6 = new ClientProt(6, 15);

	@OriginalMember(owner = "com.jagex.client!rn", name = "d", descriptor = "Lclient!mc;")
	public static final ClientProt EVENT_CAMERA_POSITION = new ClientProt(7, 4);

	@OriginalMember(owner = "com.jagex.client!fo", name = "f", descriptor = "Lclient!mc;")
	public static final ClientProt WINDOW_STATUS = new ClientProt(8, 6);

	@OriginalMember(owner = "com.jagex.client!kc", name = "e", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_9 = new ClientProt(9, 15);

	@OriginalMember(owner = "com.jagex.client!eo", name = "b", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_10 = new ClientProt(10, 8);

	@OriginalMember(owner = "com.jagex.client!ft", name = "U", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_11 = new ClientProt(11, 16);

	@OriginalMember(owner = "com.jagex.client!h", name = "b", descriptor = "Lclient!mc;")
	public static final ClientProt IF_BUTTON = new ClientProt(12, 8);

	@OriginalMember(owner = "com.jagex.client!wm", name = "o", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_13 = new ClientProt(13, 16);

	@OriginalMember(owner = "com.jagex.client!so", name = "h", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_14 = new ClientProt(14, 8);

	@OriginalMember(owner = "com.jagex.client!e", name = "n", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_15 = new ClientProt(15, -1);

	@OriginalMember(owner = "com.jagex.client!l", name = "d", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_16 = new ClientProt(16, -1);

	@OriginalMember(owner = "com.jagex.client!il", name = "P", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_17 = new ClientProt(17, 8);

	@OriginalMember(owner = "com.jagex.client!ij", name = "c", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_18 = new ClientProt(18, -1);

	@OriginalMember(owner = "com.jagex.client!vm", name = "W", descriptor = "Lclient!mc;")
	public static final ClientProt MESSAGE_QUICKCHAT_PUBLIC = new ClientProt(19, -1);

	@OriginalMember(owner = "com.jagex.client!ds", name = "w", descriptor = "Lclient!mc;")
	public static final ClientProt SOUND_SONGEND = new ClientProt(20, 4);

	@OriginalMember(owner = "com.jagex.client!hd", name = "m", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_21 = new ClientProt(21, 6);

	@OriginalMember(owner = "com.jagex.client!s", name = "b", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_22 = new ClientProt(22, 7);

	@OriginalMember(owner = "com.jagex.client!wn", name = "d", descriptor = "Lclient!mc;")
	public static final ClientProt EVENT_KEYBOARD = new ClientProt(23, -1);

	@OriginalMember(owner = "com.jagex.client!ts", name = "h", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_24 = new ClientProt(24, -1);

	@OriginalMember(owner = "com.jagex.client!em", name = "h", descriptor = "Lclient!mc;")
	public static final ClientProt TRANSMITVAR_VERIFYID = new ClientProt(25, 2);

	@OriginalMember(owner = "com.jagex.client!gb", name = "m", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_26 = new ClientProt(26, 7);

	@OriginalMember(owner = "com.jagex.client!be", name = "g", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_27 = new ClientProt(27, 3);

	@OriginalMember(owner = "com.jagex.client!te", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_28 = new ClientProt(28, 3);

	@OriginalMember(owner = "com.jagex.client!cr", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt RESUME_P_NAMEDIALOG = new ClientProt(29, -1);

	@OriginalMember(owner = "com.jagex.client!sr", name = "g", descriptor = "Lclient!mc;")
	public static final ClientProt MESSAGE_QUICKCHAT_PRIVATE = new ClientProt(30, -1);

	@OriginalMember(owner = "com.jagex.client!sg", name = "l", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_31 = new ClientProt(31, 3);

	@OriginalMember(owner = "com.jagex.client!pd", name = "m", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_32 = new ClientProt(32, 3);

	@OriginalMember(owner = "com.jagex.client!bo", name = "f", descriptor = "Lclient!mc;")
	public static final ClientProt EVENT_FRAME_MAP_LOADED = new ClientProt(33, 4);

	@OriginalMember(owner = "com.jagex.client!jj", name = "U", descriptor = "Lclient!mc;")
	public static final ClientProt REFLECTION_CHECK = new ClientProt(34, -1);

	@OriginalMember(owner = "com.jagex.client!cr", name = "g", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_35 = new ClientProt(35, 3);

	@OriginalMember(owner = "com.jagex.client!hk", name = "f", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_36 = new ClientProt(36, 3);

	@OriginalMember(owner = "com.jagex.client!vf", name = "W", descriptor = "Lclient!mc;")
	public static final ClientProt EVENT_MOUSE_CLICK = new ClientProt(37, 6);

	@OriginalMember(owner = "com.jagex.client!jt", name = "V", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_38 = new ClientProt(38, 4);

	@OriginalMember(owner = "com.jagex.client!ag", name = "o", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_39 = new ClientProt(39, 3);

	@OriginalMember(owner = "com.jagex.client!jo", name = "u", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_40 = new ClientProt(40, 7);

	@OriginalMember(owner = "com.jagex.client!ad", name = "i", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_41 = new ClientProt(41, 3);

	@OriginalMember(owner = "com.jagex.client!oj", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_42 = new ClientProt(42, -1);

	@OriginalMember(owner = "com.jagex.client!vq", name = "c", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_43 = new ClientProt(43, 8);

	@OriginalMember(owner = "com.jagex.client!nr", name = "f", descriptor = "Lclient!mc;")
	public static final ClientProt EVENT_APPLET_FOCUS = new ClientProt(44, 1);

	@OriginalMember(owner = "com.jagex.client!ib", name = "D", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_45 = new ClientProt(45, 3);

	@OriginalMember(owner = "com.jagex.client!fl", name = "i", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_46 = new ClientProt(46, 2);

	@OriginalMember(owner = "com.jagex.client!we", name = "G", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_47 = new ClientProt(47, 7);

	@OriginalMember(owner = "com.jagex.client!rf", name = "O", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_48 = new ClientProt(48, 11);

	@OriginalMember(owner = "com.jagex.client!we", name = "D", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_49 = new ClientProt(49, -1);

	@OriginalMember(owner = "com.jagex.client!we", name = "F", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_50 = new ClientProt(50, 3);

	@OriginalMember(owner = "com.jagex.client!kp", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt CLOSE_MODAL = new ClientProt(51, 0);

	@OriginalMember(owner = "com.jagex.client!lh", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_52 = new ClientProt(52, 12);

	@OriginalMember(owner = "com.jagex.client!aa", name = "t", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_53 = new ClientProt(53, -1);

	@OriginalMember(owner = "com.jagex.client!gn", name = "j", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_54 = new ClientProt(54, 8);

	@OriginalMember(owner = "com.jagex.client!cj", name = "h", descriptor = "Lclient!mc;")
	public static final ClientProt MAP_BUILD_COMPLETE = new ClientProt(55, 0);

	@OriginalMember(owner = "com.jagex.client!sp", name = "Q", descriptor = "Lclient!mc;")
	public static final ClientProt URL_REQUEST = new ClientProt(56, -1);

	@OriginalMember(owner = "com.jagex.client!ki", name = "d", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_57 = new ClientProt(57, 8);

	@OriginalMember(owner = "com.jagex.client!kt", name = "O", descriptor = "Lclient!mc;")
	public static final ClientProt RESUME_P_OBJDIALOG = new ClientProt(58, 2);

	@OriginalMember(owner = "com.jagex.client!rt", name = "d", descriptor = "Lclient!mc;")
	public static final ClientProt MOVE_MINIMAPCLICK = new ClientProt(59, 18);

	@OriginalMember(owner = "com.jagex.client!fp", name = "A", descriptor = "Lclient!mc;")
	public static final ClientProt MESSAGE_PUBLIC = new ClientProt(60, -1);

	@OriginalMember(owner = "com.jagex.client!f", name = "b", descriptor = "Lclient!mc;")
	public static final ClientProt EVENT_MOUSE_MOVE = new ClientProt(61, -1);

	@OriginalMember(owner = "com.jagex.client!br", name = "X", descriptor = "Lclient!mc;")
	public static final ClientProt SET_CHATFILTERSETTINGS = new ClientProt(62, 3);

	@OriginalMember(owner = "com.jagex.client!gg", name = "C", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_63 = new ClientProt(63, 8);

	@OriginalMember(owner = "com.jagex.client!ao", name = "B", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_64 = new ClientProt(64, -1);

	@OriginalMember(owner = "com.jagex.client!vp", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_65 = new ClientProt(65, 4);

	@OriginalMember(owner = "com.jagex.client!vr", name = "k", descriptor = "Lclient!mc;")
	public static final ClientProt GET_EXAMINE = new ClientProt(66, 2);

	@OriginalMember(owner = "com.jagex.client!vf", name = "T", descriptor = "Lclient!mc;")
	public static final ClientProt RESUME_P_COUTNDIALOG = new ClientProt(67, 4);

	@OriginalMember(owner = "com.jagex.client!nb", name = "i", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_68 = new ClientProt(68, 3);

	@OriginalMember(owner = "com.jagex.client!kl", name = "l", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_69 = new ClientProt(69, 3);

	@OriginalMember(owner = "com.jagex.client!ac", name = "x", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_70 = new ClientProt(70, 3);

	@OriginalMember(owner = "com.jagex.client!ss", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt NO_TIMEOUT = new ClientProt(71, 0);

	@OriginalMember(owner = "com.jagex.client!pa", name = "a", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_72 = new ClientProt(72, 7);

	@OriginalMember(owner = "com.jagex.client!ii", name = "i", descriptor = "Lclient!mc;")
	public static final ClientProt OPLOC1 = new ClientProt(73, 7); // TODO: confirm

	@OriginalMember(owner = "com.jagex.client!mr", name = "Gb", descriptor = "Lclient!mc;")
	public static final ClientProt RESUME_P_STRINGDIALOG = new ClientProt(74, -1);

	@OriginalMember(owner = "com.jagex.client!co", name = "t", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_75 = new ClientProt(75, 11);

	@OriginalMember(owner = "com.jagex.client!nt", name = "P", descriptor = "Lclient!mc;")
	public static final ClientProt CLIENT_CHEAT = new ClientProt(76, -1);

	@OriginalMember(owner = "com.jagex.client!ta", name = "p", descriptor = "Lclient!mc;")
	public static final ClientProt BUG_REPORT = new ClientProt(77, -1);

	@OriginalMember(owner = "com.jagex.client!nn", name = "V", descriptor = "Lclient!mc;")
	public static final ClientProt MOVE_GAMECLICK = new ClientProt(78, 5);

	@OriginalMember(owner = "com.jagex.client!we", name = "J", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_79 = new ClientProt(79, 7);

	@OriginalMember(owner = "com.jagex.client!et", name = "n", descriptor = "Lclient!mc;")
	public static final ClientProt PACKET_80 = new ClientProt(80, 7);

	@OriginalMember(owner = "com.jagex.client!jq", name = "t", descriptor = "Lclient!mc;")
	public static final ClientProt IDLE_TIMER = new ClientProt(81, 2);

	@OriginalMember(owner = "com.jagex.client!mc", name = "c", descriptor = "I")
	private final int id;

	@OriginalMember(owner = "com.jagex.client!mc", name = "<init>", descriptor = "(II)V")
	public ClientProt(@OriginalArg(0) int id, @OriginalArg(1) int size) {
		this.id = id;
	}

	@OriginalMember(owner = "com.jagex.client!mc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "com.jagex.client!mc", name = "c", descriptor = "(I)I")
	public int getId() {
		return this.id;
	}
}
