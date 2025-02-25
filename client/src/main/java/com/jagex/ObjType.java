package com.jagex;

import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.StringWrapper;
import com.jagex.core.io.Packet;
import com.jagex.game.config.seqtype.SeqType;
import com.jagex.graphics.BitmapFont;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!qf")
public final class ObjType {

	@OriginalMember(owner = "com.jagex.client!qf", name = "h", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "com.jagex.client!qf", name = "j", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "com.jagex.client!qf", name = "o", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "com.jagex.client!qf", name = "r", descriptor = "[Ljava/lang/String;")
	public String[] ops;

	@OriginalMember(owner = "com.jagex.client!qf", name = "t", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "com.jagex.client!qf", name = "B", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "com.jagex.client!qf", name = "J", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "com.jagex.client!qf", name = "L", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "com.jagex.client!qf", name = "O", descriptor = "Lclient!io;")
	public ObjTypeList aClass107_1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "T", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "com.jagex.client!qf", name = "ab", descriptor = "I")
	private int anInt5237;

	@OriginalMember(owner = "com.jagex.client!qf", name = "gb", descriptor = "[Ljava/lang/String;")
	public String[] iops;

	@OriginalMember(owner = "com.jagex.client!qf", name = "ub", descriptor = "I")
	public int anInt5255;

	@OriginalMember(owner = "com.jagex.client!qf", name = "wb", descriptor = "Lclient!ad;")
	public HashTable aClass4_103;

	@OriginalMember(owner = "com.jagex.client!qf", name = "b", descriptor = "I")
	private int anInt5200 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "g", descriptor = "I")
	public int anInt5204 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "d", descriptor = "I")
	public int certlink = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "l", descriptor = "I")
	private int anInt5207 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "v", descriptor = "I")
	private int anInt5213 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "K", descriptor = "I")
	private int anInt5226 = 128;

	@OriginalMember(owner = "com.jagex.client!qf", name = "y", descriptor = "I")
	public int anInt5216 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "k", descriptor = "I")
	private int anInt5206 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "D", descriptor = "I")
	public int cost = 1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "q", descriptor = "I")
	private int anInt5211 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "A", descriptor = "I")
	public int anInt5218 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "F", descriptor = "I")
	private int anInt5222 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "i", descriptor = "I")
	public int anInt5205 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "I", descriptor = "I")
	public int anInt5225 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "I")
	private int anInt5199 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "w", descriptor = "I")
	public int anInt5214 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "x", descriptor = "I")
	public int yAngle2d = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "s", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "com.jagex.client!qf", name = "bb", descriptor = "I")
	public int anInt5238 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "E", descriptor = "I")
	public int anInt5221 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "M", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "com.jagex.client!qf", name = "U", descriptor = "I")
	private int anInt5231 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "hb", descriptor = "I")
	private int anInt5243 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "c", descriptor = "I")
	private int anInt5201 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "db", descriptor = "I")
	public int anInt5240 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "jb", descriptor = "I")
	public int xAngle2d = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "Y", descriptor = "I")
	public int anInt5235 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "m", descriptor = "I")
	private int anInt5208 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "pb", descriptor = "I")
	private int anInt5251 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "nb", descriptor = "I")
	public int yOffset2d = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "W", descriptor = "I")
	private int anInt5233 = 128;

	@OriginalMember(owner = "com.jagex.client!qf", name = "eb", descriptor = "I")
	public int zoom2d = 2000;

	@OriginalMember(owner = "com.jagex.client!qf", name = "tb", descriptor = "I")
	private int anInt5254 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "ib", descriptor = "I")
	public int anInt5244 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "mb", descriptor = "I")
	private int anInt5248 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "R", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "com.jagex.client!qf", name = "rb", descriptor = "I")
	public int xOffset2d = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "yb", descriptor = "I")
	public int certtemplate = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "Ab", descriptor = "I")
	private int anInt5260 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "xb", descriptor = "I")
	public int team = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "lb", descriptor = "I")
	public int stackable = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "kb", descriptor = "I")
	public int anInt5246 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "V", descriptor = "I")
	public int zOffset2d = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "vb", descriptor = "I")
	private int anInt5256 = 0;

	@OriginalMember(owner = "com.jagex.client!qf", name = "Bb", descriptor = "I")
	private int anInt5261 = 128;

	@OriginalMember(owner = "com.jagex.client!qf", name = "ob", descriptor = "I")
	public int anInt5250 = -1;

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 1) {
			this.anInt5237 = arg1.g2();
		} else if (arg0 == 2) {
			this.name = arg1.gjstr();
		} else if (arg0 == 4) {
			this.zoom2d = arg1.g2();
		} else if (arg0 == 5) {
			this.xAngle2d = arg1.g2();
		} else if (arg0 == 6) {
			this.yAngle2d = arg1.g2();
		} else if (arg0 == 7) {
			this.xOffset2d = arg1.g2();
			if (this.xOffset2d > 32767) {
				this.xOffset2d -= 65536;
			}
		} else if (arg0 == 8) {
			this.zOffset2d = arg1.g2();
			if (this.zOffset2d > 32767) {
				this.zOffset2d -= 65536;
			}
		} else if (arg0 == 11) {
			this.stackable = 1;
		} else if (arg0 == 12) {
			this.cost = arg1.g4();
		} else if (arg0 == 16) {
			this.members = true;
		} else if (arg0 == 23) {
			this.anInt5205 = arg1.g2();
		} else if (arg0 == 24) {
			this.anInt5248 = arg1.g2();
		} else if (arg0 == 25) {
			this.anInt5250 = arg1.g2();
		} else if (arg0 == 26) {
			this.anInt5211 = arg1.g2();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.ops[arg0 - 30] = arg1.gjstr();
		} else if (arg0 >= 35 && arg0 < 40) {
			this.iops[arg0 - 35] = arg1.gjstr();
		} else {
			@Pc(162) int local162;
			@Pc(172) int local172;
			if (arg0 == 40) {
				local162 = arg1.g1();
				this.aShortArray112 = new short[local162];
				this.aShortArray113 = new short[local162];
				for (local172 = 0; local172 < local162; local172++) {
					this.aShortArray113[local172] = (short) arg1.g2();
					this.aShortArray112[local172] = (short) arg1.g2();
				}
			} else if (arg0 == 41) {
				local162 = arg1.g1();
				this.aShortArray110 = new short[local162];
				this.aShortArray111 = new short[local162];
				for (local172 = 0; local172 < local162; local172++) {
					this.aShortArray111[local172] = (short) arg1.g2();
					this.aShortArray110[local172] = (short) arg1.g2();
				}
			} else if (arg0 == 42) {
				local162 = arg1.g1();
				this.aByteArray72 = new byte[local162];
				for (local172 = 0; local172 < local162; local172++) {
					this.aByteArray72[local172] = arg1.g1b();
				}
			} else if (arg0 == 65) {
				this.aBoolean381 = true;
			} else if (arg0 == 78) {
				this.anInt5201 = arg1.g2();
			} else if (arg0 == 79) {
				this.anInt5207 = arg1.g2();
			} else if (arg0 == 90) {
				this.anInt5208 = arg1.g2();
			} else if (arg0 == 91) {
				this.anInt5200 = arg1.g2();
			} else if (arg0 == 92) {
				this.anInt5251 = arg1.g2();
			} else if (arg0 == 93) {
				this.anInt5243 = arg1.g2();
			} else if (arg0 == 95) {
				this.yOffset2d = arg1.g2();
			} else if (arg0 == 96) {
				this.anInt5214 = arg1.g1();
			} else if (arg0 == 97) {
				this.certlink = arg1.g2();
			} else if (arg0 == 98) {
				this.certtemplate = arg1.g2();
			} else if (arg0 >= 100 && arg0 < 110) {
				if (this.anIntArray365 == null) {
					this.anIntArray366 = new int[10];
					this.anIntArray365 = new int[10];
				}
				this.anIntArray365[arg0 - 100] = arg1.g2();
				this.anIntArray366[arg0 - 100] = arg1.g2();
			} else if (arg0 == 110) {
				this.anInt5233 = arg1.g2();
			} else if (arg0 == 111) {
				this.anInt5226 = arg1.g2();
			} else if (arg0 == 112) {
				this.anInt5261 = arg1.g2();
			} else if (arg0 == 113) {
				this.anInt5256 = arg1.g1b();
			} else if (arg0 == 114) {
				this.anInt5199 = arg1.g1b() * 5;
			} else if (arg0 == 115) {
				this.team = arg1.g1();
			} else if (arg0 == 121) {
				this.anInt5246 = arg1.g2();
			} else if (arg0 == 122) {
				this.anInt5235 = arg1.g2();
			} else if (arg0 == 125) {
				this.anInt5213 = arg1.g1b();
				this.anInt5206 = arg1.g1b();
				this.anInt5260 = arg1.g1b();
			} else if (arg0 == 126) {
				this.anInt5222 = arg1.g1b();
				this.anInt5231 = arg1.g1b();
				this.anInt5254 = arg1.g1b();
			} else if (arg0 == 127) {
				this.anInt5216 = arg1.g1();
				this.anInt5238 = arg1.g2();
			} else if (arg0 == 128) {
				this.anInt5218 = arg1.g1();
				this.anInt5225 = arg1.g2();
			} else if (arg0 == 129) {
				this.anInt5244 = arg1.g1();
				this.anInt5204 = arg1.g2();
			} else if (arg0 == 130) {
				this.anInt5221 = arg1.g1();
				this.anInt5240 = arg1.g2();
			} else if (arg0 == 132) {
				local162 = arg1.g1();
				this.anIntArray364 = new int[local162];
				for (local172 = 0; local172 < local162; local172++) {
					this.anIntArray364[local172] = arg1.g2();
				}
			} else if (arg0 == 249) {
				local162 = arg1.g1();
				if (this.aClass4_103 == null) {
					local172 = Static162.bitCeil(local162);
					this.aClass4_103 = new HashTable(local172);
				}
				for (local172 = 0; local172 < local162; local172++) {
					@Pc(503) boolean local503 = arg1.g1() == 1;
					@Pc(507) int local507 = arg1.g3();
					@Pc(516) Node local516;
					if (local503) {
						local516 = new StringWrapper(arg1.gjstr());
					} else {
						local516 = new IntWrapper(arg1.g4());
					}
					this.aClass4_103.pushNode(local516, (long) local507);
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(BZ)Z")
	public boolean method4770(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt5205;
		@Pc(14) int local14 = this.anInt5248;
		@Pc(17) int local17 = this.anInt5201;
		if (arg0) {
			local17 = this.anInt5207;
			local6 = this.anInt5250;
			local14 = this.anInt5211;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!this.aClass107_1.aClass197_41.requestDownload(local6, 0)) {
			local36 = false;
		}
		if (local14 != -1 && !this.aClass107_1.aClass197_41.requestDownload(local14, 0)) {
			local36 = false;
		}
		if (local17 != -1 && !this.aClass107_1.aClass197_41.requestDownload(local17, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(ZLclient!bt;)V")
	public void decode(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.g1();
			if (local11 == 0) {
				return;
			}
			this.method4768(local11, arg0);
		}
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(III)I")
	public int getParam(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_103 == null) {
			return arg0;
		} else {
			@Pc(22) IntWrapper local22 = (IntWrapper) this.aClass4_103.getNode((long) arg1);
			return local22 == null ? arg0 : local22.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String getParam(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass4_103 == null) {
			return arg0;
		} else {
			@Pc(24) StringWrapper local24 = (StringWrapper) this.aClass4_103.getNode((long) arg1);
			return local24 == null ? arg0 : local24.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(IZ[I)V")
	private void method4774(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		for (@Pc(13) int local13 = 31; local13 > 0; local13--) {
			@Pc(19) int local19 = local13 * 36;
			for (@Pc(21) int local21 = 35; local21 > 0; local21--) {
				if (arg1[local19 + local21] == 0 && arg1[local21 + local19 - 1 - 36] != 0) {
					arg1[local19 + local21] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(II[I)[I")
	private int[] method4775(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) int[] local14 = new int[1152];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			for (@Pc(22) int local22 = 0; local22 < 36; local22++) {
				@Pc(28) int local28 = arg1[local16];
				if (local28 == 0) {
					if (local22 > 0 && arg1[local16 - 1] != 0) {
						local28 = arg0;
					} else if (local18 > 0 && arg1[local16 - 36] != 0) {
						local28 = arg0;
					} else if (local22 < 35 && arg1[local16 + 1] != 0) {
						local28 = arg0;
					} else if (local18 < 31 && arg1[local16 + 36] != 0) {
						local28 = arg0;
					}
				}
				local14[local16++] = local28;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(IIIILclient!nb;Lclient!wm;ILclient!jo;I)Lclient!gn;")
	public Model method4776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) SeqType arg3, @OriginalArg(5) Renderer arg4, @OriginalArg(6) int arg5, @OriginalArg(7) PlayerAppearance arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15;
		if (this.anIntArray365 != null && arg5 > 1) {
			local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg5 >= this.anIntArray366[local17] && this.anIntArray366[local17] != 0) {
					local15 = this.anIntArray365[local17];
				}
			}
			if (local15 != -1) {
				return this.aClass107_1.get(local15).method4776(arg0, arg1, arg2, arg3, arg4, 1, arg6, arg7);
			}
		}
		local15 = arg1;
		if (arg3 != null) {
			local15 = arg1 | arg3.method3990(arg7, true, arg2);
		}
		@Pc(85) LruHashTable local85 = this.aClass107_1.aClass98_22;
		@Pc(102) Model local102;
		synchronized (this.aClass107_1.aClass98_22) {
			local102 = (Model) this.aClass107_1.aClass98_22.get((long) (arg4.anInt2836 << 29 | this.anInt5255));
		}
		if (local102 == null || arg4.method2863(local102.method3827(), local15) != 0) {
			if (local102 != null) {
				local15 = arg4.method2806(local15, local102.method3827());
			}
			@Pc(129) int local129 = local15;
			if (this.aShortArray111 != null) {
				local129 = local15 | 0x4000;
			}
			if (this.aShortArray113 != null || arg6 != null) {
				local129 |= 0x2000;
			}
			if (this.anInt5233 != 128) {
				local129 |= 0x1;
			}
			if (this.anInt5233 != 128) {
				local129 |= 0x2;
			}
			if (this.anInt5233 != 128) {
				local129 |= 0x4;
			}
			@Pc(178) Class185 local178 = Static298.method2426(this.aClass107_1.aClass197_41, this.anInt5237);
			if (local178 == null) {
				return null;
			}
			local102 = arg4.method2864(local178, local129, this.aClass107_1.anInt2790, this.anInt5256 + 64, this.anInt5199 + 850);
			if (this.anInt5233 != 128 || this.anInt5226 != 128 || this.anInt5261 != 128) {
				local102.method3842(this.anInt5233, this.anInt5226, this.anInt5261);
			}
			@Pc(229) int local229;
			if (this.aShortArray113 != null) {
				for (local229 = 0; local229 < this.aShortArray113.length; local229++) {
					if (this.aByteArray72 == null || this.aByteArray72.length <= local229) {
						local102.method3838(this.aShortArray113[local229], this.aShortArray112[local229]);
					} else {
						local102.method3838(this.aShortArray113[local229], Static147.aShortArray54[this.aByteArray72[local229] & 0xFF]);
					}
				}
			}
			if (this.aShortArray111 != null) {
				for (local229 = 0; local229 < this.aShortArray111.length; local229++) {
					local102.method3816(this.aShortArray111[local229], this.aShortArray110[local229]);
				}
			}
			if (arg6 != null) {
				for (local229 = 0; local229 < 5; local229++) {
					if (PlayerAppearance.destinationBodyColors[local229].length > arg6.anIntArray194[local229]) {
						local102.method3838(Static10.aShortArray1[local229], PlayerAppearance.destinationBodyColors[local229][arg6.anIntArray194[local229]]);
					}
					if (arg6.anIntArray194[local229] < Static186.aShortArrayArray6[local229].length) {
						local102.method3838(Static43.aShortArray20[local229], Static186.aShortArrayArray6[local229][arg6.anIntArray194[local229]]);
					}
				}
			}
			local102.method3814(local15);
			@Pc(371) LruHashTable local371 = this.aClass107_1.aClass98_22;
			synchronized (this.aClass107_1.aClass98_22) {
				this.aClass107_1.aClass98_22.put((long) (this.anInt5255 | arg4.anInt2836 << 29), local102);
			}
		}
		if (arg3 != null) {
			local102 = arg3.method3986(local102, arg7, local15, arg0, arg2);
		}
		local102.method3814(arg1);
		return local102;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "b", descriptor = "(B)V")
	public void method4777() {
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(IZ)Lclient!pr;")
	public Class185 method4778(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt5208;
		@Pc(11) int local11 = this.anInt5251;
		if (arg0) {
			local11 = this.anInt5243;
			local8 = this.anInt5200;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(32) Class185 local32 = Static298.method2426(this.aClass107_1.aClass197_41, local8);
		if (local11 != -1) {
			@Pc(44) Class185 local44 = Static298.method2426(this.aClass107_1.aClass197_41, local11);
			@Pc(55) Class185[] local55 = new Class185[] { local32, local44 };
			local32 = new Class185(local55, 2);
		}
		@Pc(66) int local66;
		if (this.aShortArray113 != null) {
			for (local66 = 0; local66 < this.aShortArray113.length; local66++) {
				local32.method4663(this.aShortArray113[local66], this.aShortArray112[local66]);
			}
		}
		if (this.aShortArray111 != null) {
			for (local66 = 0; local66 < this.aShortArray111.length; local66++) {
				local32.method4658(this.aShortArray110[local66], this.aShortArray111[local66]);
			}
		}
		return local32;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "b", descriptor = "(BZ)Lclient!pr;")
	public Class185 method4779(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt5205;
		@Pc(11) int local11 = this.anInt5248;
		@Pc(14) int local14 = this.anInt5201;
		if (arg0) {
			local8 = this.anInt5250;
			local11 = this.anInt5211;
			local14 = this.anInt5207;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(46) Class185 local46 = Static298.method2426(this.aClass107_1.aClass197_41, local8);
		if (local11 != -1) {
			@Pc(58) Class185 local58 = Static298.method2426(this.aClass107_1.aClass197_41, local11);
			if (local14 == -1) {
				@Pc(104) Class185[] local104 = new Class185[] { local46, local58 };
				local46 = new Class185(local104, 2);
			} else {
				@Pc(70) Class185 local70 = Static298.method2426(this.aClass107_1.aClass197_41, local14);
				@Pc(85) Class185[] local85 = new Class185[] { local46, local58, local70 };
				local46 = new Class185(local85, 3);
			}
		}
		if (local46 == null) {
			return null;
		}
		if (!arg0 && (this.anInt5213 != 0 || this.anInt5206 != 0 || this.anInt5260 != 0)) {
			local46.method4656(this.anInt5213, this.anInt5260, this.anInt5206);
		}
		if (arg0 && (this.anInt5222 != 0 || this.anInt5231 != 0 || this.anInt5254 != 0)) {
			local46.method4656(this.anInt5222, this.anInt5254, this.anInt5231);
		}
		@Pc(171) int local171;
		if (this.aShortArray113 != null) {
			for (local171 = 0; local171 < this.aShortArray113.length; local171++) {
				local46.method4663(this.aShortArray113[local171], this.aShortArray112[local171]);
			}
		}
		if (this.aShortArray111 != null) {
			for (local171 = 0; local171 < this.aShortArray111.length; local171++) {
				local46.method4658(this.aShortArray110[local171], this.aShortArray111[local171]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(ILclient!qf;Lclient!qf;)V")
	public void method4780(@OriginalArg(1) ObjType arg0, @OriginalArg(2) ObjType arg1) {
		this.aShortArray110 = arg1.aShortArray110;
		this.aByteArray72 = arg1.aByteArray72;
		this.xAngle2d = arg1.xAngle2d;
		this.anInt5237 = arg1.anInt5237;
		this.yOffset2d = arg1.yOffset2d;
		this.aShortArray112 = arg1.aShortArray112;
		this.aShortArray113 = arg1.aShortArray113;
		this.zOffset2d = arg1.zOffset2d;
		this.aShortArray111 = arg1.aShortArray111;
		this.cost = arg0.cost;
		this.yAngle2d = arg1.yAngle2d;
		this.xOffset2d = arg1.xOffset2d;
		this.name = arg0.name;
		this.stackable = 1;
		this.zoom2d = arg1.zoom2d;
		this.members = arg0.members;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(Lclient!ur;Lclient!jo;BLclient!wm;ILclient!wm;IIIZ)[I")
	public int[] method4781(@OriginalArg(0) BitmapFont arg0, @OriginalArg(1) PlayerAppearance arg1, @OriginalArg(3) Renderer arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Renderer arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(14) Class185 local14 = Static298.method2426(this.aClass107_1.aClass197_41, this.anInt5237);
		if (local14 == null) {
			return null;
		}
		@Pc(23) int local23;
		if (this.aShortArray113 != null) {
			for (local23 = 0; local23 < this.aShortArray113.length; local23++) {
				if (this.aByteArray72 == null || this.aByteArray72.length <= local23) {
					local14.method4663(this.aShortArray113[local23], this.aShortArray112[local23]);
				} else {
					local14.method4663(this.aShortArray113[local23], Static147.aShortArray54[this.aByteArray72[local23] & 0xFF]);
				}
			}
		}
		if (this.aShortArray111 != null) {
			for (local23 = 0; local23 < this.aShortArray111.length; local23++) {
				local14.method4658(this.aShortArray110[local23], this.aShortArray111[local23]);
			}
		}
		if (arg1 != null) {
			for (local23 = 0; local23 < 5; local23++) {
				if (arg1.anIntArray194[local23] < PlayerAppearance.destinationBodyColors[local23].length) {
					local14.method4663(Static10.aShortArray1[local23], PlayerAppearance.destinationBodyColors[local23][arg1.anIntArray194[local23]]);
				}
				if (arg1.anIntArray194[local23] < Static186.aShortArrayArray6[local23].length) {
					local14.method4663(Static43.aShortArray20[local23], Static186.aShortArrayArray6[local23][arg1.anIntArray194[local23]]);
				}
			}
		}
		@Pc(174) short local174 = 1024;
		@Pc(176) boolean local176 = false;
		if (this.anInt5233 != 128 || this.anInt5226 != 128 || this.anInt5261 != 128) {
			local176 = true;
			local174 = 1031;
		}
		@Pc(210) Model local210 = arg4.method2864(local14, local174, 0, this.anInt5256 + 64, this.anInt5199 + 768);
		if (!local210.method3801()) {
			return null;
		}
		if (local176) {
			local210.method3842(this.anInt5233, this.anInt5226, this.anInt5261);
		}
		@Pc(227) Sprite local227 = null;
		if (this.certtemplate != -1) {
			local227 = this.aClass107_1.method2769(this.certlink, arg0, 10, arg2, true, 0, true, arg1, 0, arg4, 1);
			if (local227 == null) {
				return null;
			}
		} else if (this.anInt5235 != -1) {
			local227 = this.aClass107_1.method2769(this.anInt5246, arg0, arg7, arg2, true, arg3, false, arg1, 0, arg4, arg6);
			if (local227 == null) {
				return null;
			}
		}
		@Pc(287) int local287;
		if (arg8) {
			local287 = (int) ((double) this.zoom2d * 1.5D);
		} else if (arg6 == 2) {
			local287 = (int) ((double) this.zoom2d * 1.04D);
		} else {
			local287 = this.zoom2d;
		}
		arg4.method2821(16, 16, 512, 512);
		@Pc(314) Class14 local314 = arg4.method2897();
		local314.method3932();
		arg4.method2896(local314);
		arg4.method2838(1.0F);
		arg4.method2832(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(333) Class14 local333 = arg4.method2808();
		local333.method3931(-this.yOffset2d << 3);
		local333.method3926(this.yAngle2d << 3);
		local333.method3936(this.xOffset2d, (Renderer.anIntArray178[this.xAngle2d << 3] * local287 >> 15) + (this.zOffset2d - (local210.method3802() / 2)), this.zOffset2d + (local287 * Renderer.anIntArray177[this.xAngle2d << 3] >> 15));
		local333.method3929(this.xAngle2d << 3);
		@Pc(392) int local392 = arg4.method2814();
		@Pc(395) int local395 = arg4.method2875();
		arg4.method2872(50, Integer.MAX_VALUE);
		arg4.method2819();
		arg4.method2898();
		arg4.method2901(0, 0, 36, 32, 0, 0);
		local210.method3835(local333, null, 1);
		arg4.method2872(local392, local395);
		@Pc(427) int[] local427 = arg4.method2850();
		if (arg6 >= 1) {
			local427 = this.method4775(-16777214, local427);
			if (arg6 >= 2) {
				local427 = this.method4775(-1, local427);
			}
		}
		if (arg3 != 0) {
			this.method4774(arg3, local427);
		}
		arg4.method2884(local427, 36, 36, 32).method6385(0, 0);
		if (this.certtemplate != -1) {
			local227.method6385(0, 0);
		} else if (this.anInt5235 != -1) {
			local227.method6385(0, 0);
		}
		if (arg5 == 1 || arg5 == 2 && (this.stackable == 1 || arg7 != 1) && arg7 != -1) {
			arg0.method5897(0, -16777215, 9, -256, this.method4786(arg7));
		}
		local427 = arg4.method2850();
		for (@Pc(525) int local525 = 0; local525 < local427.length; local525++) {
			if ((local427[local525] & 0xFFFFFF) == 0) {
				local427[local525] = 0;
			} else {
				local427[local525] |= 0xFF000000;
			}
		}
		return local427;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(II)Lclient!qf;")
	public ObjType method4782(@OriginalArg(0) int arg0) {
		if (this.anIntArray365 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray366[local15] && this.anIntArray366[local15] != 0) {
					local13 = this.anIntArray365[local15];
				}
			}
			if (local13 != -1) {
				return this.aClass107_1.get(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "c", descriptor = "(BZ)Z")
	public boolean method4783(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt5208;
		@Pc(9) int local9 = this.anInt5251;
		if (arg0) {
			local6 = this.anInt5200;
			local9 = this.anInt5243;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(29) boolean local29 = true;
		if (!this.aClass107_1.aClass197_41.requestDownload(local6, 0)) {
			local29 = false;
		}
		if (local9 != -1 && !this.aClass107_1.aClass197_41.requestDownload(local9, 0)) {
			local29 = false;
		}
		return local29;
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(Lclient!qf;Lclient!qf;I)V")
	public void method4784(@OriginalArg(0) ObjType arg0, @OriginalArg(1) ObjType arg1) {
		this.anInt5213 = arg1.anInt5213;
		this.anInt5200 = arg1.anInt5200;
		this.yAngle2d = arg0.yAngle2d;
		this.aShortArray110 = arg1.aShortArray110;
		this.anInt5208 = arg1.anInt5208;
		this.aShortArray113 = arg1.aShortArray113;
		this.name = arg1.name;
		this.anInt5231 = arg1.anInt5231;
		this.anInt5243 = arg1.anInt5243;
		this.iops = new String[5];
		this.anInt5248 = arg1.anInt5248;
		this.ops = arg1.ops;
		this.anInt5251 = arg1.anInt5251;
		this.anInt5211 = arg1.anInt5211;
		this.zoom2d = arg0.zoom2d;
		this.anInt5207 = arg1.anInt5207;
		this.aClass4_103 = arg1.aClass4_103;
		this.xOffset2d = arg0.xOffset2d;
		this.zOffset2d = arg0.zOffset2d;
		this.anInt5254 = arg1.anInt5254;
		this.anInt5237 = arg0.anInt5237;
		this.members = arg1.members;
		this.yOffset2d = arg0.yOffset2d;
		this.anInt5201 = arg1.anInt5201;
		this.anInt5206 = arg1.anInt5206;
		this.aShortArray111 = arg1.aShortArray111;
		this.anInt5222 = arg1.anInt5222;
		this.cost = 0;
		this.anInt5250 = arg1.anInt5250;
		this.aByteArray72 = arg1.aByteArray72;
		this.aShortArray112 = arg1.aShortArray112;
		this.team = arg1.team;
		this.xAngle2d = arg0.xAngle2d;
		this.anInt5205 = arg1.anInt5205;
		this.anInt5260 = arg1.anInt5260;
		if (arg1.iops != null) {
			for (@Pc(149) int local149 = 0; local149 < 4; local149++) {
				this.iops[local149] = arg1.iops[local149];
			}
		}
		this.iops[4] = Static139.aClass79_61.getLocalized(this.aClass107_1.anInt2781);
	}

	@OriginalMember(owner = "com.jagex.client!qf", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private String method4786(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static350.aClass79_135.getLocalized(this.aClass107_1.anInt2781) + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static259.aClass79_106.getLocalized(this.aClass107_1.anInt2781) + "</col>";
		}
	}
}
