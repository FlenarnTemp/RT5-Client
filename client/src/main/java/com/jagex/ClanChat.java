package com.jagex;

import com.jagex.core.io.Packet;
import com.jagex.game.network.protocol.ClientProt;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class ClanChat {

	@OriginalMember(owner = "com.jagex.client!gr", name = "d", descriptor = "B")
	public static byte rank;
	@OriginalMember(owner = "com.jagex.client!pd", name = "u", descriptor = "B")
	public static byte minKick;
	@OriginalMember(owner = "com.jagex.client!wo", name = "L", descriptor = "Ljava/lang/String;")
	public static String name = null;
	@OriginalMember(owner = "com.jagex.client!kp", name = "b", descriptor = "I")
	public static int size;
	@OriginalMember(owner = "com.jagex.client!co", name = "p", descriptor = "[Lclient!sk;")
	public static ClanMember[] members;
	@OriginalMember(owner = "com.jagex.client!jr", name = "l", descriptor = "Ljava/lang/String;")
	public static String owner = null;

	@OriginalMember(owner = "com.jagex.client!qp", name = "b", descriptor = "(I)V")
	public static void leave() {
		Protocol.writeOpcode(ClientProt.PACKET_64);
		Protocol.outboundBuffer.p1(0);
	}

	@OriginalMember(owner = "com.jagex.client!gn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void join(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Protocol.writeOpcode(ClientProt.PACKET_64);
			Protocol.outboundBuffer.p1(Packet.pjstrlen(arg0));
			Protocol.outboundBuffer.pjstr(arg0);
		}
	}

	@OriginalMember(owner = "com.jagex.client!jj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void kick(@OriginalArg(1) String arg0) {
		if (members != null) {
			Protocol.writeOpcode(ClientProt.PACKET_15);
			Protocol.outboundBuffer.p1(Packet.pjstrlen(arg0));
			Protocol.outboundBuffer.pjstr(arg0);
		}
	}

}
