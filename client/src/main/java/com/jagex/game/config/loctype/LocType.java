package com.jagex.game.config.loctype;

import com.jagex.*;
import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.StringWrapper;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ct")
public final class LocType {

	@OriginalMember(owner = "com.jagex.client!ct", name = "f", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "com.jagex.client!ct", name = "g", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "com.jagex.client!ct", name = "k", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "com.jagex.client!ct", name = "B", descriptor = "Lclient!ad;")
	private HashTable params;

	@OriginalMember(owner = "com.jagex.client!ct", name = "K", descriptor = "[B")
	private byte[] recol_d_palette;

	@OriginalMember(owner = "com.jagex.client!ct", name = "P", descriptor = "[I")
	private int[] models;

	@OriginalMember(owner = "com.jagex.client!ct", name = "V", descriptor = "[I")
	public int[] bgsounds;

	@OriginalMember(owner = "com.jagex.client!ct", name = "X", descriptor = "[I")
	public int[] multiloc;

	@OriginalMember(owner = "com.jagex.client!ct", name = "db", descriptor = "[I")
	public int[] quests;

	@OriginalMember(owner = "com.jagex.client!ct", name = "nb", descriptor = "[I")
	private int[] shapes;

	@OriginalMember(owner = "com.jagex.client!ct", name = "qb", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "com.jagex.client!ct", name = "vb", descriptor = "Lclient!rh;")
	public LocTypeList myList;

	@OriginalMember(owner = "com.jagex.client!ct", name = "Ab", descriptor = "I")
	public int anInt1351;

	@OriginalMember(owner = "com.jagex.client!ct", name = "i", descriptor = "I")
	private int anInt1311 = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "c", descriptor = "I")
	private int xoff = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "h", descriptor = "Z")
	public boolean breakroutefinding = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "d", descriptor = "I")
	public int anInt1309 = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "E", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "m", descriptor = "I")
	public int anInt1313 = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "u", descriptor = "Z")
	public boolean shadow = true;

	@OriginalMember(owner = "com.jagex.client!ct", name = "p", descriptor = "I")
	public int mapsceneicon = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "w", descriptor = "I")
	public int occlude = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "J", descriptor = "[I")
	private int[] anIntArray91 = null;

	@OriginalMember(owner = "com.jagex.client!ct", name = "A", descriptor = "I")
	public int bgsound = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "M", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "z", descriptor = "I")
	public int blockwalk = 2;

	@OriginalMember(owner = "com.jagex.client!ct", name = "D", descriptor = "I")
	public int length = 1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "I")
	public int mapelement = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "jb", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "kb", descriptor = "I")
	public int anInt1344 = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "R", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "t", descriptor = "I")
	public int bgsound_volume = 255;

	@OriginalMember(owner = "com.jagex.client!ct", name = "gb", descriptor = "I")
	public int anInt1341 = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "mb", descriptor = "Z")
	public boolean mapsceneiconrotate = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "O", descriptor = "I")
	private int zoff = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "fb", descriptor = "Z")
	public boolean mirror = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "ub", descriptor = "I")
	private int resizex = 128;

	@OriginalMember(owner = "com.jagex.client!ct", name = "s", descriptor = "I")
	private int resizey = 128;

	@OriginalMember(owner = "com.jagex.client!ct", name = "bb", descriptor = "Z")
	public boolean istexture = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "v", descriptor = "S")
	private short hillskew_value = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "cb", descriptor = "I")
	private int multivarbit = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "zb", descriptor = "Z")
	public boolean mapsceneiconmirror = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "W", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "Y", descriptor = "[I")
	public int[] anIntArray95 = null;

	@OriginalMember(owner = "com.jagex.client!ct", name = "T", descriptor = "I")
	public int active = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "I", descriptor = "Ljava/lang/String;")
	public String name = "null";

	@OriginalMember(owner = "com.jagex.client!ct", name = "S", descriptor = "Z")
	public boolean hardshadow = true;

	@OriginalMember(owner = "com.jagex.client!ct", name = "Q", descriptor = "I")
	public int bgsoundmin = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "Db", descriptor = "Z")
	public boolean randseq = true;

	@OriginalMember(owner = "com.jagex.client!ct", name = "sb", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "H", descriptor = "I")
	private int yoff = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "Fb", descriptor = "I")
	private int resizez = 128;

	@OriginalMember(owner = "com.jagex.client!ct", name = "ab", descriptor = "I")
	private int multivarp = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "l", descriptor = "I")
	public int anInt1312 = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "eb", descriptor = "I")
	public int walloff = 16;

	@OriginalMember(owner = "com.jagex.client!ct", name = "yb", descriptor = "Z")
	public boolean forcedecor = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "C", descriptor = "I")
	public int anim = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "b", descriptor = "I")
	public int bgsoundrange = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "ib", descriptor = "Z")
	public boolean var1 = true;

	@OriginalMember(owner = "com.jagex.client!ct", name = "hb", descriptor = "I")
	public int forceapproach = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "o", descriptor = "I")
	public int bgsoundmax = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "Gb", descriptor = "[Ljava/lang/String;")
	public String[] ops = new String[5];

	@OriginalMember(owner = "com.jagex.client!ct", name = "Eb", descriptor = "I")
	public int raiseobject = -1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "pb", descriptor = "Z")
	public boolean sharelight = false;

	@OriginalMember(owner = "com.jagex.client!ct", name = "Hb", descriptor = "I")
	public int width = 1;

	@OriginalMember(owner = "com.jagex.client!ct", name = "wb", descriptor = "B")
	private byte hillskew_mode = 0;

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(B)V")
	public void method1516() {
		if (this.active == -1) {
			this.active = 0;
			if (this.models != null && (this.shapes == null || this.shapes[0] == 10)) {
				this.active = 1;
			}
			for (@Pc(32) int local32 = 0; local32 < 5; local32++) {
				if (this.ops[local32] != null) {
					this.active = 1;
					break;
				}
			}
		}
		if (this.raiseobject == -1) {
			this.raiseobject = this.blockwalk == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(IILclient!tf;IILclient!nb;ILclient!wm;ILclient!tf;IIII)Lclient!gn;")
	public Model method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class157 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Renderer arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg3 == 5 || arg3 == 6 || arg3 == 7 || arg3 == 8) {
			arg3 = 4;
		}
		@Pc(36) long local36;
		if (this.shapes == null) {
			local36 = (this.anInt1351 << 10) + arg5;
		} else {
			local36 = (this.anInt1351 << 10) + (arg3 << 3) + arg5;
		}
		@Pc(49) int local49 = arg12;
		local36 |= arg6.anInt2836 << 29;
		if (arg4 != null) {
			arg12 |= arg4.method3990(arg7, false, arg0);
		}
		if (this.hillskew_mode == 3) {
			arg12 |= 0x7;
		} else if (this.hillskew_mode != 0) {
			arg12 |= 0x2;
		}
		if (arg3 == 10 && arg5 > 3) {
			arg12 |= 0x5;
		}
		@Pc(107) LruHashTable local107 = this.myList.aClass98_48;
		@Pc(117) Model local117;
		synchronized (this.myList.aClass98_48) {
			local117 = (Model) this.myList.aClass98_48.get(local36);
		}
		if (local117 == null || arg6.method2863(local117.method3827(), arg12) != 0) {
			if (local117 != null) {
				arg12 = arg6.method2806(arg12, local117.method3827());
			}
			local117 = this.method1524(arg5, arg3, arg12, arg6);
			if (local117 == null) {
				return null;
			}
			local107 = this.myList.aClass98_48;
			synchronized (this.myList.aClass98_48) {
				this.myList.aClass98_48.put(local36, local117);
			}
		}
		@Pc(172) boolean local172 = false;
		if (arg4 != null) {
			local172 = true;
			local117 = arg4.method3987(arg0, (byte) 1, arg7, arg5 & 0x3, arg1, arg12, local117);
		}
		if (arg3 == 10 && arg5 > 3) {
			if (!local172) {
				local117 = local117.method3800((byte) 3, arg12, true);
				local172 = true;
			}
			local117.method3833(2048);
		}
		if (this.hillskew_mode != 0) {
			if (!local172) {
				local172 = true;
				local117 = local117.method3800((byte) 3, arg12, true);
			}
			local117.method3819(this.hillskew_mode, this.hillskew_value, arg2, arg8, arg10, arg9, arg11);
		}
		if (local172) {
			local117.method3814(local49);
		}
		return local117;
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(ILclient!tf;IIIZIZLclient!wm;Lclient!tf;I)Lclient!ij;")
	public Class105 method1519(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Renderer arg7, @OriginalArg(9) Class6 arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 5 || arg9 == 6 || arg9 == 7 || arg9 == 8) {
			arg9 = 4;
		}
		@Pc(45) long local45 = (long) (this.shapes == null ? (this.anInt1351 << 10) + arg2 : arg2 + (this.anInt1351 << 10) + (arg9 << 3));
		@Pc(53) long local53 = local45 | (long) (arg7.anInt2836 << 29);
		@Pc(55) int local55 = arg5;
		if (this.hillskew_mode == 3) {
			local55 = arg5 | 0x7;
		} else if (this.hillskew_mode != 0) {
			local55 = arg5 | 0x2;
		}
		if (arg6) {
			local55 |= 0x20000;
		}
		@Pc(85) LruHashTable local85 = this.myList.aClass98_47;
		@Pc(95) Class105 local95;
		synchronized (this.myList.aClass98_47) {
			local95 = (Class105) this.myList.aClass98_47.get(local53);
		}
		@Pc(108) Model local108 = local95 == null ? null : local95.aClass31_3;
		@Pc(110) Class2_Sub2_Sub4 local110 = null;
		if (local108 != null && arg7.method2863(local108.method3827(), local55) == 0) {
			local110 = local95.aClass2_Sub2_Sub4_3;
			local108 = local95.aClass31_3;
			if (arg6 && local110 == null) {
				local110 = local95.aClass2_Sub2_Sub4_3 = local108.method3839(null);
			}
		} else {
			if (local108 != null) {
				local55 = arg7.method2806(local55, local108.method3827());
			}
			@Pc(128) int local128 = local55;
			if (arg9 == 10 && arg2 > 3) {
				local128 = local55 | 0x5;
			}
			local108 = this.method1524(arg2, arg9, local128, arg7);
			if (local108 == null) {
				return null;
			}
			if (arg9 == 10 && arg2 > 3) {
				local108.method3833(2048);
			}
			if (arg6) {
				local110 = local108.method3839(null);
			}
			local108.method3814(local55);
			local95 = new Class105();
			local95.aClass31_3 = local108;
			local95.aClass2_Sub2_Sub4_3 = local110;
			@Pc(186) LruHashTable local186 = this.myList.aClass98_47;
			synchronized (this.myList.aClass98_47) {
				this.myList.aClass98_47.put(local53, local95);
			}
		}
		if (this.hillskew_mode == 0 || arg1 == null && arg8 == null) {
			local108 = local108.method3800((byte) 0, arg5, true);
		} else {
			local108 = local108.method3800((byte) 0, local55, true);
			local108.method3819(this.hillskew_mode, this.hillskew_value, arg1, arg8, arg4, arg0, arg3);
			local108.method3814(arg5);
		}
		Static158.aClass105_1.aClass2_Sub2_Sub4_3 = local110;
		Static158.aClass105_1.aClass31_3 = local108;
		return Static158.aClass105_1;
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String getParam(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(21) StringWrapper local21 = (StringWrapper) this.params.get((long) arg1);
			return local21 == null ? arg0 : local21.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(II)Z")
	public boolean isReady(@OriginalArg(1) int arg0) {
		@Pc(31) Js5 local31;
		@Pc(35) int local35;
		if (this.shapes != null) {
			local31 = this.myList.aClass197_78;
			synchronized (this.myList.aClass197_78) {
				for (local35 = 0; local35 < this.shapes.length; local35++) {
					if (this.shapes[local35] == arg0) {
						return this.myList.aClass197_78.requestDownload(this.models[local35] & 0xFFFF, 0);
					}
				}
				return true;
			}
		} else if (this.models == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(27) boolean local27 = true;
			local31 = this.myList.aClass197_78;
			synchronized (this.myList.aClass197_78) {
				for (local35 = 0; local35 < this.models.length; local35++) {
					local27 &= this.myList.aClass197_78.requestDownload(this.models[local35] & 0xFFFF, 0);
				}
				return local27;
			}
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "b", descriptor = "(B)Z")
	public boolean method1522() {
		if (this.multiloc == null) {
			return this.bgsound != -1 || this.bgsounds != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.multiloc.length; local22++) {
			if (this.multiloc[local22] != -1) {
				@Pc(46) LocType local46 = this.myList.get(this.multiloc[local22]);
				if (local46.bgsound != -1 || local46.bgsounds != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet buf, @OriginalArg(2) int code) {
		@Pc(12) int local12;
		@Pc(31) int local31;
		if (code == 1) {
			int length = buf.g1();
			if (length > 0) {
				if (this.models == null || this.myList.aBoolean400) {
					this.models = new int[length];
					this.shapes = new int[length];
					for (int index = 0; index < length; index++) {
						this.models[index] = buf.g2();
						this.shapes[index] = buf.g1();
					}
				} else {
					buf.pos += length * 3;
				}
			}
		} else if (code == 2) {
			this.name = buf.gjstr();
		} else if (code == 5) {
			int length = buf.g1();
			if (length > 0) {
				if (this.models == null || this.myList.aBoolean400) {
					this.models = new int[length];
					this.shapes = null;
					for (int index = 0; index < length; index++) {
						this.models[index] = buf.g2();
					}
				} else {
					buf.pos += length * 2;
				}
			}
		} else if (code == 14) {
			this.width = buf.g1();
		} else if (code == 15) {
			this.length = buf.g1();
		} else if (code == 17) {
			this.var1 = false;
			this.blockwalk = 0;
		} else if (code == 18) {
			this.var1 = false;
		} else if (code == 19) {
			this.active = buf.g1();
		} else if (code == 21) {
			this.hillskew_mode = 1;
		} else if (code == 22) {
			this.sharelight = true;
		} else if (code == 23) {
			this.occlude = 1;
		} else if (code == 24) {
			this.anim = buf.g2();
			if (this.anim == 65535) {
				this.anim = -1;
			}
		} else if (code == 27) {
			this.blockwalk = 1;
		} else if (code == 28) {
			this.walloff = buf.g1();
		} else if (code == 29) {
			this.ambient = buf.g1b();
		} else if (code == 39) {
			this.contrast = buf.g1b() * 5;
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
		} else if (code == 62) {
			this.mirror = true;
		} else if (code == 64) {
			this.shadow = false;
		} else if (code == 65) {
			this.resizex = buf.g2();
		} else if (code == 66) {
			this.resizey = buf.g2();
		} else if (code == 67) {
			this.resizez = buf.g2();
		} else if (code == 69) {
			this.forceapproach = buf.g1();
		} else if (code == 70) {
			this.xoff = buf.g2s();
		} else if (code == 71) {
			this.yoff = buf.g2s();
		} else if (code == 72) {
			this.zoff = buf.g2s();
		} else if (code == 73) {
			this.forcedecor = true;
		} else if (code == 74) {
			this.breakroutefinding = true;
		} else if (code == 75) {
			this.raiseobject = buf.g1();
		} else {
			@Pc(462) int local462;
			if (code == 77 || code == 92) {
				this.multivarbit = buf.g2();
				if (this.multivarbit == 65535) {
					this.multivarbit = -1;
				}
				this.multivarp = buf.g2();
				if (this.multivarp == 65535) {
					this.multivarp = -1;
				}
				int defaultId = -1;
				if (code == 92) {
					defaultId = buf.g2();
					if (defaultId == 65535) {
						defaultId = -1;
					}
				}
				int length = buf.g1();
				this.multiloc = new int[length + 2];
				for (int index = 0; index <= length; index++) {
					this.multiloc[index] = buf.g2();
					if (this.multiloc[index] == 65535) {
						this.multiloc[index] = -1;
					}
				}
				this.multiloc[length + 1] = defaultId;
			} else if (code == 78) {
				this.bgsound = buf.g2();
				this.bgsoundrange = buf.g1();
			} else if (code == 79) {
				this.bgsoundmin = buf.g2();
				this.bgsoundmax = buf.g2();
				this.bgsoundrange = buf.g1();
				int length = buf.g1();
				this.bgsounds = new int[length];
				for (int index = 0; index < length; index++) {
					this.bgsounds[index] = buf.g2();
				}
			} else if (code == 81) {
				this.hillskew_mode = 2;
				this.hillskew_value = (short) (buf.g1() * 256);
			} else if (code == 82) {
				this.istexture = true;
			} else if (code == 88) {
				this.hardshadow = false;
			} else if (code == 89) {
				this.randseq = false;
			} else if (code == 90) {
				this.aBoolean109 = true;
			} else if (code == 91) {
				this.members = true;
			} else if (code == 93) {
				this.hillskew_mode = 3;
				this.hillskew_value = (short) buf.g2();
			} else if (code == 94) {
				this.hillskew_mode = 4;
			} else if (code == 95) {
				this.hillskew_mode = 5;
			} else if (code == 96) {
				this.aBoolean108 = true;
			} else if (code == 97) {
				this.mapsceneiconrotate = true;
			} else if (code == 98) {
				this.aBoolean107 = true;
			} else if (code == 99) {
				this.anInt1344 = buf.g1();
				this.anInt1312 = buf.g2();
			} else if (code == 100) {
				this.anInt1341 = buf.g1();
				this.anInt1313 = buf.g2();
			} else if (code == 101) {
				this.anInt1309 = buf.g1();
			} else if (code == 102) {
				this.mapsceneicon = buf.g2();
			} else if (code == 103) {
				this.occlude = 0;
			} else if (code == 104) {
				this.bgsound_volume = buf.g1();
			} else if (code == 105) {
				this.mapsceneiconmirror = true;
			} else if (code == 106) {
				int length = buf.g1();
				this.anIntArray95 = new int[length];
				this.anIntArray91 = new int[length];
				for (int index = 0; index < length; index++) {
					this.anIntArray95[index] = buf.g2();
					local462 = buf.g1();
					this.anIntArray91[index] = local462;
					this.anInt1311 += local462;
				}
			} else if (code == 107) {
				this.mapelement = buf.g2();
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
				int length = buf.g1();
				if (this.params == null) {
					local31 = Static162.bitCeil(length);
					this.params = new HashTable(local31);
				}
				for (int index = 0; index < length; index++) {
					@Pc(760) boolean local760 = buf.g1() == 1;
					@Pc(764) int local764 = buf.g3();
					@Pc(775) Node node;
					if (local760) {
						node = new StringWrapper(buf.gjstr());
					} else {
						node = new IntWrapper(buf.g4());
					}
					this.params.pushNode(node, (long) local764);
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(IIIILclient!wm;)Lclient!gn;")
	private Model method1524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Renderer arg3) {
		@Pc(10) int local10 = this.ambient + 64;
		@Pc(15) int local15 = this.contrast + 850;
		@Pc(17) int local17 = arg2;
		@Pc(30) boolean local30 = this.mirror || arg1 == 2 && arg0 > 3;
		if (local30) {
			arg2 |= 0x10;
		}
		if (arg0 == 0) {
			if (this.resizex != 128 || this.xoff != 0) {
				arg2 |= 0x1;
			}
			if (this.resizez != 128 || this.zoff != 0) {
				arg2 |= 0x4;
			}
		} else {
			arg2 |= 0xD;
		}
		if (this.resizey != 128 || this.yoff != 0) {
			arg2 |= 0x2;
		}
		if (this.recol_s != null) {
			arg2 |= 0x2000;
		}
		if (this.retex_s != null) {
			arg2 |= 0x4000;
		}
		@Pc(165) Model local165;
		@Pc(120) int local120;
		@Pc(130) int local130;
		@Pc(322) int local322;
		if (this.shapes == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.models == null) {
				return null;
			}
			local120 = this.models.length;
			if (local120 == 0) {
				return null;
			}
			@Pc(128) long local128 = (long) arg3.anInt2836;
			for (local130 = 0; local130 < local120; local130++) {
				local128 = local128 * 67783L + (long) this.models[local130];
			}
			@Pc(155) LruHashTable local155 = this.myList.aClass98_46;
			synchronized (this.myList.aClass98_46) {
				local165 = (Model) this.myList.aClass98_46.get(local128);
			}
			if (local165 != null) {
				if (local165.method3805() != local10) {
					arg2 |= 0x800;
				}
				if (local165.method3826() != local15) {
					arg2 |= 0x1000;
				}
			}
			if (local165 == null || arg3.method2863(local165.method3827(), arg2) != 0) {
				@Pc(209) int local209 = arg2 | 0xF81F;
				if (local165 != null) {
					local209 = arg3.method2806(local209, local165.method3827());
				}
				@Pc(219) Class185 local219 = null;
				@Pc(221) Class185[] local221 = Static310.aClass185Array1;
				synchronized (Static310.aClass185Array1) {
					@Pc(225) int local225 = 0;
					while (true) {
						if (local120 <= local225) {
							if (local120 > 1) {
								local219 = new Class185(Static310.aClass185Array1, local120);
							}
							break;
						}
						@Pc(230) Js5 local230 = this.myList.aClass197_78;
						synchronized (this.myList.aClass197_78) {
							local219 = Static298.method2426(this.myList.aClass197_78, this.models[local225] & 0xFFFF);
						}
						if (local219 == null) {
							return null;
						}
						if (local120 > 1) {
							Static310.aClass185Array1[local225] = local219;
						}
						local225++;
					}
				}
				local165 = arg3.method2864(local219, local209, this.myList.anInt5669, local10, local15);
				@Pc(303) LruHashTable local303 = this.myList.aClass98_46;
				synchronized (this.myList.aClass98_46) {
					this.myList.aClass98_46.put(local128, local165);
				}
			}
		} else {
			local120 = -1;
			for (local322 = 0; local322 < this.shapes.length; local322++) {
				if (this.shapes[local322] == arg1) {
					local120 = local322;
					break;
				}
			}
			if (local120 == -1) {
				return null;
			}
			@Pc(364) int local364 = this.models[local120] | arg3.anInt2836 << 29;
			@Pc(368) LruHashTable local368 = this.myList.aClass98_46;
			synchronized (this.myList.aClass98_46) {
				local165 = (Model) this.myList.aClass98_46.get((long) local364);
			}
			if (local165 != null) {
				if (local10 != local165.method3805()) {
					arg2 |= 0x800;
				}
				if (local165.method3826() != local15) {
					arg2 |= 0x1000;
				}
			}
			if (local165 == null || arg3.method2863(local165.method3827(), arg2) != 0) {
				local130 = arg2 | 0xF81F;
				if (local165 != null) {
					local130 = arg3.method2806(local130, local165.method3827());
				}
				@Pc(435) Js5 local435 = this.myList.aClass197_78;
				@Pc(447) Class185 local447;
				synchronized (this.myList.aClass197_78) {
					local447 = Static298.method2426(this.myList.aClass197_78, local364 & 0xFFFF);
				}
				if (local447 == null) {
					return null;
				}
				local165 = arg3.method2864(local447, local130, this.myList.anInt5669, local10, local15);
				@Pc(471) LruHashTable local471 = this.myList.aClass98_46;
				synchronized (this.myList.aClass98_46) {
					this.myList.aClass98_46.put((long) local364, local165);
				}
			}
		}
		@Pc(493) Model local493 = local165.method3800((byte) 0, arg2, true);
		if (local10 != local165.method3805()) {
			local493.method3807(local10);
		}
		if (local15 != local165.method3826()) {
			local493.method3830(local15);
		}
		if (local30) {
			local493.method3837();
		}
		if (arg1 == 4 && arg0 > 3) {
			local493.method3845(2048);
			local493.method3813(45, 0, -45);
		}
		@Pc(535) int local535 = arg0 & 0x3;
		if (local535 == 1) {
			local493.method3845(4096);
		} else if (local535 == 2) {
			local493.method3845(8192);
		} else if (local535 == 3) {
			local493.method3845(12288);
		}
		if (this.recol_s != null) {
			for (local322 = 0; local322 < this.recol_s.length; local322++) {
				local493.method3838(this.recol_s[local322], this.recol_d[local322]);
			}
		}
		if (this.retex_s != null) {
			for (local322 = 0; local322 < this.retex_s.length; local322++) {
				local493.method3816(this.retex_s[local322], this.retex_d[local322]);
			}
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			local493.method3842(this.resizex, this.resizey, this.resizez);
		}
		if (this.xoff != 0 || this.yoff != 0 || this.zoff != 0) {
			local493.method3813(this.xoff, this.yoff, this.zoff);
		}
		local493.method3814(local17);
		return local493;
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.decode(arg0, local9);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "c", descriptor = "(B)I")
	public int method1527() {
		if (this.anIntArray95 == null) {
			return -1;
		}
		@Pc(21) int local21 = (int) (Math.random() * (double) this.anInt1311);
		@Pc(23) int local23;
		for (local23 = 0; this.anIntArray91[local23] <= local21; local23++) {
			local21 -= this.anIntArray91[local23];
		}
		return this.anIntArray95[local23];
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "d", descriptor = "(B)Z")
	public boolean method1529() {
		if (this.models == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Js5 local16 = this.myList.aClass197_78;
		synchronized (this.myList.aClass197_78) {
			for (@Pc(28) int local28 = 0; local28 < this.models.length; local28++) {
				local12 &= this.myList.aClass197_78.requestDownload(this.models[local28] & 0xFFFF, 0);
			}
			return local12;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "b", descriptor = "(II)Z")
	public boolean method1531(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anim) {
			return true;
		} else {
			if (this.anIntArray95 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray95.length; local27++) {
					if (this.anIntArray95[local27] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(III)I")
	public int getParam(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(21) IntWrapper local21 = (IntWrapper) this.params.get((long) arg1);
			return local21 == null ? arg0 : local21.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ct", name = "a", descriptor = "(ILclient!wl;)Lclient!ct;")
	public LocType method1533(@OriginalArg(1) Interface11 arg0) {
		@Pc(13) int local13 = -1;
		if (this.multivarbit != -1) {
			local13 = arg0.method5778(this.multivarbit);
		} else if (this.multivarp != -1) {
			local13 = arg0.method5777(this.multivarp);
		}
		if (local13 < 0 || this.multiloc.length - 1 <= local13 || this.multiloc[local13] == -1) {
			@Pc(61) int local61 = this.multiloc[this.multiloc.length - 1];
			return local61 == -1 ? null : this.myList.get(local61);
		} else {
			return this.myList.get(this.multiloc[local13]);
		}
	}
}
