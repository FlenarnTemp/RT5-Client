package com.jagex.game.config.npctype;

import com.jagex.*;
import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.StringWrapper;
import com.jagex.core.io.Packet;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!fk")
public final class NPCType {

	@OriginalMember(owner = "com.jagex.client!fk", name = "n", descriptor = "[[I")
	private int[][] modeloffset;

	@OriginalMember(owner = "com.jagex.client!fk", name = "A", descriptor = "[I")
	private int[] models;

	@OriginalMember(owner = "com.jagex.client!fk", name = "F", descriptor = "[I")
	public int[] multinpc;

	@OriginalMember(owner = "com.jagex.client!fk", name = "H", descriptor = "[B")
	private byte[] recol_d_palette;

	@OriginalMember(owner = "com.jagex.client!fk", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "com.jagex.client!fk", name = "O", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "com.jagex.client!fk", name = "U", descriptor = "[I")
	private int[] heads;

	@OriginalMember(owner = "com.jagex.client!fk", name = "Y", descriptor = "[I")
	public int[] quests;

	@OriginalMember(owner = "com.jagex.client!fk", name = "ib", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "com.jagex.client!fk", name = "jb", descriptor = "Lclient!ta;")
	public NPCTypeList myList;

	@OriginalMember(owner = "com.jagex.client!fk", name = "kb", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "com.jagex.client!fk", name = "nb", descriptor = "Lclient!ad;")
	private HashTable params;

	@OriginalMember(owner = "com.jagex.client!fk", name = "ub", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "com.jagex.client!fk", name = "wb", descriptor = "I")
	public int id;

	@OriginalMember(owner = "com.jagex.client!fk", name = "e", descriptor = "B")
	public byte spotshadowtrans_1 = -96;

	@OriginalMember(owner = "com.jagex.client!fk", name = "j", descriptor = "Z")
	public boolean spotshadow = true;

	@OriginalMember(owner = "com.jagex.client!fk", name = "h", descriptor = "I")
	public int bgsound_crawl = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "q", descriptor = "Z")
	public boolean walksmoothing = true;

	@OriginalMember(owner = "com.jagex.client!fk", name = "l", descriptor = "I")
	private int multivarbit = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "p", descriptor = "I")
	private int resizev = 128;

	@OriginalMember(owner = "com.jagex.client!fk", name = "t", descriptor = "I")
	public int anInt2017 = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "z", descriptor = "[Ljava/lang/String;")
	public final String[] ops = new String[5];

	@OriginalMember(owner = "com.jagex.client!fk", name = "V", descriptor = "I")
	public int bas = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "Q", descriptor = "I")
	public int anInt2028 = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "y", descriptor = "I")
	public int anInt2020 = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "b", descriptor = "S")
	public short spotshadowcolour_1 = 0;

	@OriginalMember(owner = "com.jagex.client!fk", name = "K", descriptor = "I")
	public int bgsound_run = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "i", descriptor = "I")
	public int overlayheight = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "eb", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "com.jagex.client!fk", name = "w", descriptor = "B")
	public byte walkflags = 0;

	@OriginalMember(owner = "com.jagex.client!fk", name = "hb", descriptor = "Z")
	public boolean follower = false;

	@OriginalMember(owner = "com.jagex.client!fk", name = "G", descriptor = "I")
	public int cursorattack = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "E", descriptor = "I")
	public int bgsound_range = 0;

	@OriginalMember(owner = "com.jagex.client!fk", name = "X", descriptor = "S")
	public short spotshadowcolour_2 = 0;

	@OriginalMember(owner = "com.jagex.client!fk", name = "cb", descriptor = "I")
	public int mapelement = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "N", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "com.jagex.client!fk", name = "k", descriptor = "I")
	public int anInt2011 = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "D", descriptor = "Z")
	public boolean active = true;

	@OriginalMember(owner = "com.jagex.client!fk", name = "r", descriptor = "I")
	public int bgsound_walk = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "fb", descriptor = "I")
	public int vislevel = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "gb", descriptor = "Z")
	public boolean minimap = true;

	@OriginalMember(owner = "com.jagex.client!fk", name = "sb", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "com.jagex.client!fk", name = "qb", descriptor = "I")
	public int turnspeed = 32;

	@OriginalMember(owner = "com.jagex.client!fk", name = "ob", descriptor = "I")
	public int anInt2042 = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "B", descriptor = "I")
	private int multivarp = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "db", descriptor = "I")
	public int bgsound = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "tb", descriptor = "I")
	private int resizeh = 128;

	@OriginalMember(owner = "com.jagex.client!fk", name = "C", descriptor = "B")
	public byte respawndir = 4;

	@OriginalMember(owner = "com.jagex.client!fk", name = "T", descriptor = "I")
	public int covermarker = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "ab", descriptor = "I")
	public int anInt2035 = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "mb", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "vb", descriptor = "Z")
	public boolean drawabove = false;

	@OriginalMember(owner = "com.jagex.client!fk", name = "m", descriptor = "B")
	public byte spotshadowtrans_2 = -16;

	@OriginalMember(owner = "com.jagex.client!fk", name = "I", descriptor = "Z")
	public boolean drawbelow = false;

	@OriginalMember(owner = "com.jagex.client!fk", name = "zb", descriptor = "I")
	public int bgsound_volume = 255;

	@OriginalMember(owner = "com.jagex.client!fk", name = "yb", descriptor = "I")
	public int anInt2050 = -1;

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(BLclient!bt;)V")
	public void decode(@OriginalArg(1) Packet buf) {
		while (true) {
			@Pc(15) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(2) int code) {
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (code == 1) {
			int length = buf.g1();
			this.models = new int[length];
			for (int index = 0; index < length; index++) {
				this.models[index] = buf.g2();
				if (this.models[index] == 65535) {
					this.models[index] = -1;
				}
			}
		} else if (code == 2) {
			this.name = buf.gjstr();
		} else if (code == 12) {
			this.size = buf.g1();
		} else if (code >= 30 && code < 35) {
			this.ops[code - 30] = buf.gjstr();
		} else if (code == 40) {
			int length = buf.g1();
			this.recol_s = new short[length];
			this.recol_d = new short[length];
			for (int index = 0; index < length; index++) {
				this.recol_s[index] = (short) buf.g2();
				this.recol_d[index] = (short) buf.g2();
			}
		} else if (code == 41) {
			int length = buf.g1();
			this.retex_s = new short[length];
			this.retex_d = new short[length];
			for (int index = 0; index < length; index++) {
				this.retex_s[index] = (short) buf.g2();
				this.retex_d[index] = (short) buf.g2();
			}
		} else if (code == 42) {
			int length = buf.g1();
			this.recol_d_palette = new byte[length];
			for (int index = 0; index < length; index++) {
				this.recol_d_palette[index] = buf.g1b();
			}
		} else if (code == 60) {
			int length = buf.g1();
			this.heads = new int[length];
			for (int index = 0; index < length; index++) {
				this.heads[index] = buf.g2();
			}
		} else if (code == 93) {
			this.minimap = false;
		} else if (code == 95) {
			this.vislevel = buf.g2();
		} else if (code == 97) {
			this.resizeh = buf.g2();
		} else if (code == 98) {
			this.resizev = buf.g2();
		} else if (code == 99) {
			this.drawabove = true;
		} else if (code == 100) {
			this.ambient = buf.g1b();
		} else if (code == 101) {
			this.contrast = buf.g1b() * 5;
		} else if (code == 102) {
			this.anInt2050 = buf.g2();
		} else if (code == 103) {
			this.turnspeed = buf.g2();
		} else {
			@Pc(233) int local233;
			if (code == 106 || code == 118) {
				this.multivarbit = buf.g2();
				if (this.multivarbit == 65535) {
					this.multivarbit = -1;
				}
				this.multivarp = buf.g2();
				if (this.multivarp == 65535) {
					this.multivarp = -1;
				}
				int defaultId = -1;
				if (code == 118) {
					defaultId = buf.g2();
					if (defaultId == 65535) {
						defaultId = -1;
					}
				}
				int length = buf.g1();
				this.multinpc = new int[length + 2];
				for (int index = 0; index <= length; index++) {
					this.multinpc[index] = buf.g2();
					if (this.multinpc[index] == 65535) {
						this.multinpc[index] = -1;
					}
				}
				this.multinpc[length + 1] = defaultId;
			} else if (code == 107) {
				this.active = false;
			} else if (code == 109) {
				this.walksmoothing = false;
			} else if (code == 111) {
				this.spotshadow = false;
			} else if (code == 113) {
				this.spotshadowcolour_1 = (short) buf.g2();
				this.spotshadowcolour_2 = (short) buf.g2();
			} else if (code == 114) {
				this.spotshadowtrans_1 = buf.g1b();
				this.spotshadowtrans_2 = buf.g1b();
			} else if (code == 115) {
				buf.g1();
				buf.g1();
			} else if (code == 119) {
				this.walkflags = buf.g1b();
			} else if (code == 121) {
				this.modeloffset = new int[this.models.length][];
				int length = buf.g1();
				for (int index = 0; index < length; index++) {
					int offset = buf.g1();
					@Pc(717) int[] offsets = this.modeloffset[offset] = new int[3];
					offsets[0] = buf.g1b();
					offsets[1] = buf.g1b();
					offsets[2] = buf.g1b();
				}
			} else if (code == 122) {
				this.anInt2028 = buf.g2();
			} else if (code == 123) {
				this.overlayheight = buf.g2();
			} else if (code == 125) {
				this.respawndir = buf.g1b();
			} else if (code == 127) {
				this.bas = buf.g2();
			} else if (code == 128) {
				buf.g1();
			} else if (code == 134) {
				this.bgsound = buf.g2();
				if (this.bgsound == 65535) {
					this.bgsound = -1;
				}
				this.bgsound_crawl = buf.g2();
				if (this.bgsound_crawl == 65535) {
					this.bgsound_crawl = -1;
				}
				this.bgsound_walk = buf.g2();
				if (this.bgsound_walk == 65535) {
					this.bgsound_walk = -1;
				}
				this.bgsound_run = buf.g2();
				if (this.bgsound_run == 65535) {
					this.bgsound_run = -1;
				}
				this.bgsound_range = buf.g1();
			} else if (code == 135) {
				this.anInt2017 = buf.g1();
				this.anInt2011 = buf.g2();
			} else if (code == 136) {
				this.anInt2035 = buf.g1();
				this.anInt2020 = buf.g2();
			} else if (code == 137) {
				this.cursorattack = buf.g2();
			} else if (code == 138) {
				this.covermarker = buf.g2();
			} else if (code == 139) {
				this.anInt2042 = buf.g2();
			} else if (code == 140) {
				this.bgsound_volume = buf.g1();
			} else if (code == 141) {
				this.follower = true;
			} else if (code == 142) {
				this.mapelement = buf.g2();
			} else if (code == 143) {
				this.drawbelow = true;
			} else if (code >= 150 && code < 155) {
				this.ops[code - 150] = buf.gjstr();
				if (!this.myList.allowMembers) {
					this.ops[code - 150] = null;
				}
			} else if (code == 160) {
				int length = buf.g1();
				this.quests = new int[length];
				for (int index = 0; index < length; index++) {
					this.quests[index] = buf.g2();
				}
			} else if (code == 249) {
				local50 = buf.g1();
				if (this.params == null) {
					local60 = Static162.bitCeil(local50);
					this.params = new HashTable(local60);
				}
				for (local60 = 0; local60 < local50; local60++) {
					@Pc(539) boolean local539 = buf.g1() == 1;
					@Pc(543) int local543 = buf.g3();
					@Pc(552) Node local552;
					if (local539) {
						local552 = new StringWrapper(buf.gjstr());
					} else {
						local552 = new IntWrapper(buf.g4());
					}
					this.params.pushNode(local552, (long) local543);
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(Lclient!ak;ILclient!nb;Lclient!wm;Lclient!gp;IIILclient!nb;I[Lclient!bg;IBLclient!wl;I)Lclient!gn;")
	public Model getBodyModel(@OriginalArg(0) BASTypeList arg0, @OriginalArg(1) int arg1, @OriginalArg(2) SeqType arg2, @OriginalArg(3) Renderer arg3, @OriginalArg(4) SeqTypeList arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) SeqType arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20[] arg10, @OriginalArg(11) int arg11, @OriginalArg(13) Interface11 arg12, @OriginalArg(14) int arg13) {
		if (this.multinpc != null) {
			@Pc(13) NPCType local13 = this.getMultiNpc(arg12);
			return local13 == null ? null : local13.getBodyModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
		}
		@Pc(37) int local37 = arg9;
		if (this.resizev != 128) {
			local37 = arg9 | 0x2;
		}
		if (this.resizeh != 128) {
			local37 |= 0x5;
		}
		@Pc(65) boolean local65 = arg2 != null || arg8 != null;
		@Pc(67) boolean local67 = false;
		@Pc(69) boolean local69 = false;
		@Pc(71) boolean local71 = false;
		@Pc(78) int local78 = arg10 == null ? 0 : arg10.length;
		@Pc(112) int local112;
		@Pc(117) int local117;
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			Static21.aClass2_Sub2_Sub13Array1[local80] = null;
			if (arg10[local80] != null) {
				@Pc(98) SeqType local98 = arg4.method2371(arg10[local80].anInt624);
				if (local98.anIntArray262 != null) {
					local65 = true;
					Static168.A_SEQ_TYPE_ARRAY_42[local80] = local98;
					local112 = arg10[local80].anInt628;
					local117 = arg10[local80].anInt627;
					@Pc(122) int local122 = local98.anIntArray262[local112];
					Static21.aClass2_Sub2_Sub13Array1[local80] = arg4.method2368(local122 >>> 16);
					@Pc(135) int local135 = local122 & 0xFFFF;
					Static225.anIntArray259[local80] = local135;
					if (Static21.aClass2_Sub2_Sub13Array1[local80] != null) {
						local69 |= Static21.aClass2_Sub2_Sub13Array1[local80].method4237(local135);
						local67 |= Static21.aClass2_Sub2_Sub13Array1[local80].method4235(local135);
						local71 |= local98.aBoolean263;
					}
					if ((local98.aBoolean264 || Static318.forceTweening) && local117 != -1 && local98.anIntArray262.length > local117) {
						Static132.anIntArray161[local80] = local98.frames[local112];
						Static356.anIntArray461[local80] = arg10[local80].anInt625;
						@Pc(221) int local221 = local98.anIntArray262[local117];
						Static116.aClass2_Sub2_Sub13Array3[local80] = arg4.method2368(local221 >>> 16);
						@Pc(234) int local234 = local221 & 0xFFFF;
						Static191.anIntArray101[local80] = local234;
						if (Static116.aClass2_Sub2_Sub13Array3[local80] != null) {
							local69 |= Static116.aClass2_Sub2_Sub13Array3[local80].method4237(local234);
							local67 |= Static116.aClass2_Sub2_Sub13Array3[local80].method4235(local234);
						}
					} else {
						Static132.anIntArray161[local80] = 0;
						Static356.anIntArray461[local80] = 0;
						Static116.aClass2_Sub2_Sub13Array3[local80] = null;
						Static191.anIntArray101[local80] = -1;
					}
				}
			}
		}
		@Pc(266) int local266 = -1;
		local112 = -1;
		local117 = 0;
		@Pc(277) AnimFrameset local277 = null;
		@Pc(279) AnimFrameset local279 = null;
		@Pc(281) int local281 = -1;
		@Pc(283) int local283 = -1;
		@Pc(285) int local285 = 0;
		@Pc(287) AnimFrameset local287 = null;
		@Pc(289) AnimFrameset local289 = null;
		@Pc(359) int local359;
		if (local65) {
			@Pc(302) int local302;
			if (arg2 != null) {
				local266 = arg2.anIntArray262[arg1];
				local302 = local266 >>> 16;
				local277 = arg4.method2368(local302);
				local266 &= 0xFFFF;
				if (local277 != null) {
					local69 |= local277.method4237(local266);
					local67 |= local277.method4235(local266);
					local71 |= arg2.aBoolean263;
				}
				if ((arg2.aBoolean264 || Static318.forceTweening) && arg13 != -1 && arg2.anIntArray262.length > arg13) {
					local117 = arg2.frames[arg1];
					local112 = arg2.anIntArray262[arg13];
					local359 = local112 >>> 16;
					local112 &= 0xFFFF;
					if (local302 == local359) {
						local279 = local277;
					} else {
						local279 = arg4.method2368(local359);
					}
					if (local279 != null) {
						local69 |= local279.method4237(local112);
						local67 |= local279.method4235(local112);
					}
				}
			}
			local37 |= 0x20;
			if (arg8 != null) {
				local281 = arg8.anIntArray262[arg6];
				local302 = local281 >>> 16;
				local281 &= 0xFFFF;
				local287 = arg4.method2368(local302);
				if (local287 != null) {
					local69 |= local287.method4237(local281);
					local67 |= local287.method4235(local281);
					local71 |= arg8.aBoolean263;
				}
				if ((arg8.aBoolean264 || Static318.forceTweening) && arg7 != -1 && arg8.anIntArray262.length > arg7) {
					local283 = arg8.anIntArray262[arg7];
					local285 = arg8.frames[arg6];
					local359 = local283 >>> 16;
					if (local302 == local359) {
						local289 = local287;
					} else {
						local289 = arg4.method2368(local359);
					}
					local283 &= 0xFFFF;
					if (local289 != null) {
						local69 |= local289.method4237(local283);
						local67 |= local289.method4235(local283);
					}
				}
			}
			if (local69) {
				local37 |= 0x80;
			}
			if (local67) {
				local37 |= 0x100;
			}
			if (local71) {
				local37 |= 0x200;
			}
		}
		@Pc(520) LruHashTable local520 = this.myList.aClass98_54;
		@Pc(537) Model local537;
		synchronized (this.myList.aClass98_54) {
			local537 = (Model) this.myList.aClass98_54.get((long) (this.id | arg3.anInt2836 << 16));
		}
		if (local537 == null || (local537.method3827() & local37) != local37) {
			if (local537 != null) {
				local37 |= local537.method3827();
			}
			local359 = local37;
			@Pc(566) boolean local566 = false;
			@Pc(570) Js5 local570 = this.myList.aClass197_88;
			@Pc(574) int local574;
			synchronized (this.myList.aClass197_88) {
				local574 = 0;
				while (true) {
					if (local574 >= this.models.length) {
						break;
					}
					if (this.models[local574] != -1 && !this.myList.aClass197_88.requestDownload(this.models[local574], 0)) {
						local566 = true;
					}
					local574++;
				}
			}
			if (local566) {
				return null;
			}
			@Pc(621) Class185[] local621 = new Class185[this.models.length];
			for (local574 = 0; local574 < this.models.length; local574++) {
				if (this.models[local574] != -1) {
					@Pc(636) Js5 local636 = this.myList.aClass197_88;
					synchronized (this.myList.aClass197_88) {
						local621[local574] = Static298.method2426(this.myList.aClass197_88, this.models[local574]);
					}
					if (this.modeloffset != null && this.modeloffset[local574] != null && local621[local574] != null) {
						local621[local574].method4656(this.modeloffset[local574][0], this.modeloffset[local574][2], this.modeloffset[local574][1]);
					}
				}
			}
			@Pc(700) BASType local700 = null;
			if (this.bas != -1) {
				local700 = arg0.get(this.bas);
			}
			@Pc(718) int local718;
			if (local700 != null && local700.equipmentTransforms != null) {
				for (local718 = 0; local718 < local700.equipmentTransforms.length; local718++) {
					if (local700.equipmentTransforms[local718] != null && local718 < local621.length && local621[local718] != null) {
						@Pc(742) int local742 = local700.equipmentTransforms[local718][0];
						@Pc(749) int local749 = local700.equipmentTransforms[local718][1];
						@Pc(756) int local756 = local700.equipmentTransforms[local718][2];
						@Pc(765) int local765 = local700.equipmentTransforms[local718][3] << 3;
						@Pc(774) int local774 = local700.equipmentTransforms[local718][4] << 3;
						@Pc(783) int local783 = local700.equipmentTransforms[local718][5] << 3;
						if (this.anIntArrayArray19 == null) {
							this.anIntArrayArray19 = new int[local700.equipmentTransforms.length][];
						}
						if (this.anIntArrayArray19[local718] == null) {
							@Pc(805) int[] local805 = this.anIntArrayArray19[local718] = new int[15];
							if (local765 == 0 && local774 == 0 && local783 == 0) {
								local805[12] = -local742;
								local805[0] = local805[4] = local805[8] = 32768;
								local805[14] = -local756;
								local805[13] = -local749;
							} else {
								@Pc(821) int local821 = Renderer.anIntArray177[local765];
								@Pc(825) int local825 = Renderer.anIntArray178[local765];
								@Pc(829) int local829 = Renderer.anIntArray177[local774];
								@Pc(833) int local833 = Renderer.anIntArray178[local774];
								@Pc(837) int local837 = Renderer.anIntArray177[local783];
								@Pc(841) int local841 = Renderer.anIntArray178[local783];
								@Pc(849) int local849 = local825 * local837 + 16384 >> 15;
								@Pc(857) int local857 = local841 * local825 + 16384 >> 15;
								local805[5] = -local825;
								local805[4] = local821 * local837 + 16384 >> 15;
								local805[6] = local829 * local857 + local837 * -local833 + 16384 >> 15;
								local805[0] = local857 * local833 + local837 * local829 + 16384 >> 15;
								local805[7] = -local833 * -local841 + local849 * local829 + 16384 >> 15;
								local805[1] = local833 * local849 + local829 * -local841 + 16384 >> 15;
								local805[3] = local821 * local841 + 16384 >> 15;
								local805[2] = local833 * local821 + 16384 >> 15;
								local805[8] = local829 * local821 + 16384 >> 15;
								local805[14] = -local742 * local805[2] + -local749 * local805[5] + -local756 * local805[8] + 16384 >> 15;
								local805[12] = -local742 * local805[0] + -local749 * local805[3] + local805[6] * -local756 + 16384 >> 15;
								local805[13] = local805[4] * -local749 + local805[1] * -local742 + local805[7] * -local756 + 16384 >> 15;
							}
							local805[9] = local742;
							local805[10] = local749;
							local805[11] = local756;
						}
						if (local765 != 0 || local774 != 0 || local783 != 0) {
							local621[local718].method4664(local774, local783, local765);
						}
						if (local742 != 0 || local749 != 0 || local756 != 0) {
							local621[local718].method4656(local742, local756, local749);
						}
					}
				}
			}
			@Pc(1152) Class185 local1152;
			if (local621.length == 1) {
				local1152 = local621[0];
			} else {
				local1152 = new Class185(local621, local621.length);
			}
			if (this.recol_s != null) {
				local359 = local37 | 0x2000;
			}
			if (this.retex_s != null) {
				local359 |= 0x4000;
			}
			local537 = arg3.method2864(local1152, local359, this.myList.anInt6108, this.ambient + 64, this.contrast + 850);
			if (this.recol_s != null) {
				for (local718 = 0; local718 < this.recol_s.length; local718++) {
					if (this.recol_d_palette == null || this.recol_d_palette.length <= local718) {
						local537.method3838(this.recol_s[local718], this.recol_d[local718]);
					} else {
						local537.method3838(this.recol_s[local718], Static258.aShortArray95[this.recol_d_palette[local718] & 0xFF]);
					}
				}
			}
			if (this.retex_s != null) {
				for (local718 = 0; local718 < this.retex_s.length; local718++) {
					local537.method3816(this.retex_s[local718], this.retex_d[local718]);
				}
			}
			local537.method3814(local37);
			@Pc(1272) LruHashTable local1272 = this.myList.aClass98_54;
			synchronized (this.myList.aClass98_54) {
				this.myList.aClass98_54.put((long) (arg3.anInt2836 << 16 | this.id), local537);
			}
		}
		@Pc(1300) Model local1300 = local537.method3800((byte) 4, local37, true);
		if (!local65) {
			return local1300;
		}
		@Pc(1306) int local1306 = 0;
		@Pc(1308) int local1308 = 1;
		while (local1306 < local78) {
			if (Static21.aClass2_Sub2_Sub13Array1[local1306] != null) {
				local1300.method3823(Static132.anIntArray161[local1306], Static356.anIntArray461[local1306] - 1, Static116.aClass2_Sub2_Sub13Array3[local1306], local1308, Static225.anIntArray259[local1306], Static191.anIntArray101[local1306], Static21.aClass2_Sub2_Sub13Array1[local1306], Static168.A_SEQ_TYPE_ARRAY_42[local1306].aBoolean263, this.anIntArrayArray19[local1306]);
			}
			local1306++;
			local1308 <<= 0x1;
		}
		if (local277 != null && local287 != null) {
			local1300.method3811(local117, arg11 - 1, arg2.aBooleanArray37, arg5 - 1, arg8.aBoolean263 | arg2.aBoolean263, local281, local283, local112, local287, local279, local285, local289, local277, local266);
		} else if (local277 != null) {
			local1300.method3828(local117, local279, local112, arg2.aBoolean263, arg11 - 1, local266, local277, 0);
		} else if (local287 != null) {
			local1300.method3828(local285, local289, local283, arg8.aBoolean263, arg5 - 1, local281, local287, 0);
		}
		for (@Pc(1427) int local1427 = 0; local1427 < local78; local1427++) {
			Static21.aClass2_Sub2_Sub13Array1[local1427] = null;
			Static116.aClass2_Sub2_Sub13Array3[local1427] = null;
			Static168.A_SEQ_TYPE_ARRAY_42[local1427] = null;
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			local1300.method3842(this.resizeh, this.resizev, this.resizeh);
		}
		local1300.method3814(arg9);
		return local1300;
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(IIIILclient!wm;Lclient!nb;ZLclient!wl;Lclient!gp;)Lclient!gn;")
	public Model method2088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Renderer arg3, @OriginalArg(5) SeqType arg4, @OriginalArg(7) Interface11 arg5, @OriginalArg(8) SeqTypeList arg6) {
		if (this.multinpc != null) {
			@Pc(13) NPCType local13 = this.getMultiNpc(arg5);
			return local13 == null ? null : local13.method2088(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (this.heads == null) {
			return null;
		} else {
			@Pc(36) int local36 = 1024;
			if (arg4 != null && arg2 != -1) {
				local36 = arg4.method3990(arg2, true, arg1) | 0x400;
			}
			@Pc(63) LruHashTable local63 = this.myList.aClass98_55;
			@Pc(80) Model local80;
			synchronized (this.myList.aClass98_55) {
				local80 = (Model) this.myList.aClass98_55.get((long) (arg3.anInt2836 << 16 | this.id));
			}
			if (local80 == null || local36 != (local36 & local80.method3827())) {
				if (local80 != null) {
					local36 |= local80.method3827();
				}
				@Pc(107) int local107 = local36;
				@Pc(109) boolean local109 = false;
				@Pc(113) Js5 local113 = this.myList.aClass197_88;
				@Pc(117) int local117;
				synchronized (this.myList.aClass197_88) {
					local117 = 0;
					while (true) {
						if (this.heads.length <= local117) {
							break;
						}
						if (!this.myList.aClass197_88.requestDownload(this.heads[local117], 0)) {
							local109 = true;
						}
						local117++;
					}
				}
				if (local109) {
					return null;
				}
				@Pc(157) Class185[] local157 = new Class185[this.heads.length];
				@Pc(161) Js5 local161 = this.myList.aClass197_88;
				synchronized (this.myList.aClass197_88) {
					for (@Pc(165) int local165 = 0; local165 < this.heads.length; local165++) {
						local157[local165] = Static298.method2426(this.myList.aClass197_88, this.heads[local165]);
					}
				}
				@Pc(209) Class185 local209;
				if (local157.length == 1) {
					local209 = local157[0];
				} else {
					local209 = new Class185(local157, local157.length);
				}
				if (this.recol_s != null) {
					local107 = local36 | 0x2000;
				}
				if (this.retex_s != null) {
					local107 |= 0x4000;
				}
				local80 = arg3.method2864(local209, local107, this.myList.anInt6108, 64, 768);
				if (this.recol_s != null) {
					for (local117 = 0; local117 < this.recol_s.length; local117++) {
						if (this.recol_d_palette == null || this.recol_d_palette.length <= local117) {
							local80.method3838(this.recol_s[local117], this.recol_d[local117]);
						} else {
							local80.method3838(this.recol_s[local117], Static258.aShortArray95[this.recol_d_palette[local117] & 0xFF]);
						}
					}
				}
				if (this.retex_s != null) {
					for (local117 = 0; local117 < this.retex_s.length; local117++) {
						local80.method3816(this.retex_s[local117], this.retex_d[local117]);
					}
				}
				local80.method3814(local36);
				@Pc(319) LruHashTable local319 = this.myList.aClass98_55;
				synchronized (this.myList.aClass98_55) {
					this.myList.aClass98_55.put((long) (arg3.anInt2836 << 16 | this.id), local80);
				}
			}
			if (arg4 != null && arg2 != -1) {
				local80 = arg4.method3986(local80, arg2, local36, arg0, arg1);
			}
			local80.method3814(1024);
			return local80;
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(Z)V")
	public void postDecode() {
		if (this.models == null) {
			this.models = new int[0];
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String getParam(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(22) StringWrapper local22 = (StringWrapper) this.params.getNode((long) arg1);
			return local22 == null ? arg0 : local22.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(Lclient!wl;I)Z")
	public boolean method2091(@OriginalArg(0) Interface11 arg0) {
		if (this.multinpc == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.multivarbit != -1) {
			local10 = arg0.method5778(this.multivarbit);
		} else if (this.multivarp != -1) {
			local10 = arg0.method5777(this.multivarp);
		}
		if (local10 < 0 || this.multinpc.length - 1 <= local10 || this.multinpc[local10] == -1) {
			@Pc(66) int local66 = this.multinpc[this.multinpc.length - 1];
			return local66 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "b", descriptor = "(Lclient!wl;I)Lclient!fk;")
	public NPCType getMultiNpc(@OriginalArg(0) Interface11 arg0) {
		@Pc(13) int local13 = -1;
		if (this.multivarbit != -1) {
			local13 = arg0.method5778(this.multivarbit);
		} else if (this.multivarp != -1) {
			local13 = arg0.method5777(this.multivarp);
		}
		if (local13 < 0 || local13 >= this.multinpc.length - 1 || this.multinpc[local13] == -1) {
			@Pc(68) int local68 = this.multinpc[this.multinpc.length - 1];
			return local68 == -1 ? null : this.myList.get(local68);
		} else {
			return this.myList.get(this.multinpc[local13]);
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(III)I")
	public int getParam(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(22) IntWrapper local22 = (IntWrapper) this.params.getNode((long) arg1);
			return local22 == null ? arg0 : local22.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!fk", name = "a", descriptor = "(I)Z")
	public boolean hasAreaSound() {
		if (this.multinpc == null) {
			return this.bgsound != -1 || this.bgsound_walk != -1 || this.bgsound_run != -1;
		}
		for (@Pc(28) int local28 = 0; local28 < this.multinpc.length; local28++) {
			if (this.multinpc[local28] != -1) {
				@Pc(45) NPCType local45 = this.myList.get(this.multinpc[local28]);
				if (local45.bgsound != -1 || local45.bgsound_walk != -1 || local45.bgsound_run != -1) {
					return true;
				}
			}
		}
		return false;
	}
}
