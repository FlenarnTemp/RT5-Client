package com.jagex.game.config.seqtype;

import com.jagex.AnimFrameset;
import com.jagex.Model;
import com.jagex.Static318;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!nb")
public final class SeqType {

	@OriginalMember(owner = "com.jagex.client!nb", name = "a", descriptor = "[[I")
	public int[][] sound;

	@OriginalMember(owner = "com.jagex.client!nb", name = "b", descriptor = "[Z")
	public boolean[] aBooleanArray37;

	@OriginalMember(owner = "com.jagex.client!nb", name = "c", descriptor = "[I")
	public int[] frames;

	@OriginalMember(owner = "com.jagex.client!nb", name = "e", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "com.jagex.client!nb", name = "n", descriptor = "I")
	public int id;

	@OriginalMember(owner = "com.jagex.client!nb", name = "t", descriptor = "Lclient!gp;")
	public SeqTypeList aClass85_2;

	@OriginalMember(owner = "com.jagex.client!nb", name = "w", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "com.jagex.client!nb", name = "j", descriptor = "I")
	public int replaycount = 99;

	@OriginalMember(owner = "com.jagex.client!nb", name = "r", descriptor = "I")
	public int replayoff = -1;

	@OriginalMember(owner = "com.jagex.client!nb", name = "s", descriptor = "Z")
	public boolean stretches = false;

	@OriginalMember(owner = "com.jagex.client!nb", name = "m", descriptor = "I")
	public int anInt4027 = -1;

	@OriginalMember(owner = "com.jagex.client!nb", name = "h", descriptor = "I")
	public int priority = 5;

	@OriginalMember(owner = "com.jagex.client!nb", name = "o", descriptor = "I")
	public int anInt4029 = -1;

	@OriginalMember(owner = "com.jagex.client!nb", name = "p", descriptor = "I")
	public int mainhand = -1;

	@OriginalMember(owner = "com.jagex.client!nb", name = "g", descriptor = "I")
	public int anInt4022 = 2;

	@OriginalMember(owner = "com.jagex.client!nb", name = "x", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "com.jagex.client!nb", name = "y", descriptor = "I")
	public int offhand = -1;

	@OriginalMember(owner = "com.jagex.client!nb", name = "A", descriptor = "Z")
	public boolean aBoolean264 = false;

	@OriginalMember(owner = "com.jagex.client!nb", name = "v", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "com.jagex.client!nb", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(5) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!nb", name = "a", descriptor = "(Lclient!bt;II)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(1) int code) {
		@Pc(45) int local45;
		@Pc(60) int local60;
		if (code == 1) {
			int frameCount = buf.g2();
			this.frames = new int[frameCount];
			for (int index = 0; index < frameCount; index++) {
				this.frames[index] = buf.g2();
			}
			this.anIntArray262 = new int[frameCount];
			for (int index = 0; index < frameCount; index++) {
				this.anIntArray262[index] = buf.g2();
			}
			for (int index = 0; index < frameCount; index++) {
				this.anIntArray262[index] += buf.g2() << 16;
			}
		} else if (code == 2) {
			this.replayoff = buf.g2();
		} else if (code == 3) {
			this.aBooleanArray37 = new boolean[256];
			int length = buf.g1();
			for (int index = 0; index < length; index++) {
				this.aBooleanArray37[buf.g1()] = true;
			}
		} else if (code == 4) {
			this.stretches = true;
		} else if (code == 5) {
			this.priority = buf.g1();
		} else if (code == 6) {
			this.mainhand = buf.g2();
		} else if (code == 7) {
			this.offhand = buf.g2();
		} else if (code == 8) {
			this.replaycount = buf.g1();
		} else if (code == 9) {
			this.anInt4027 = buf.g1();
		} else if (code == 10) {
			this.anInt4029 = buf.g1();
		} else if (code == 11) {
			this.anInt4022 = buf.g1();
		} else if (code == 12) {
			int length = buf.g1();
			this.anIntArray263 = new int[length];
			for (int index = 0; index < length; index++) {
				this.anIntArray263[index] = buf.g2();
			}
			for (int index = 0; index < length; index++) {
				this.anIntArray263[index] += buf.g2() << 16;
			}
		} else if (code == 13) {
			int length = buf.g2();
			this.sound = new int[length][];
			for (int index = 0; index < length; index++) {
				local45 = buf.g1();
				if (local45 > 0) {
					this.sound[index] = new int[local45];
					this.sound[index][0] = buf.g3();
					for (local60 = 1; local60 < local45; local60++) {
						this.sound[index][local60] = buf.g2();
					}
				}
			}
		} else if (code == 14) {
			this.aBoolean263 = true;
		} else if (code == 15) {
			this.aBoolean264 = true;
		} else if (code == 16) {
			this.aBoolean262 = true;
		}
	}

	@OriginalMember(owner = "com.jagex.client!nb", name = "a", descriptor = "(I)V")
	public void postDecode() {
		if (this.anInt4029 == -1) {
			if (this.aBooleanArray37 == null) {
				this.anInt4029 = 0;
			} else {
				this.anInt4029 = 2;
			}
		}
		if (this.anInt4027 != -1) {
			return;
		}
		if (this.aBooleanArray37 == null) {
			this.anInt4027 = 0;
		} else {
			this.anInt4027 = 2;
		}
	}

	@OriginalMember(owner = "com.jagex.client!nb", name = "a", descriptor = "(Lclient!gn;IZIII)Lclient!gn;")
	public Model method3986(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.frames[arg1];
		@Pc(13) int local13 = this.anIntArray262[arg1];
		@Pc(21) AnimFrameset local21 = this.aClass85_2.method2368(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method3800((byte) 1, arg2, true);
		}
		@Pc(35) AnimFrameset local35 = null;
		if ((this.aBoolean264 || Static318.forceTweening) && arg4 != -1 && this.anIntArray262.length > arg4) {
			@Pc(54) int local54 = this.anIntArray262[arg4];
			local35 = this.aClass85_2.method2368(local54 >> 16);
			arg4 = local54 & 0xFFFF;
		}
		@Pc(68) AnimFrameset local68 = null;
		@Pc(70) AnimFrameset local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray263 != null) {
			if (this.anIntArray263.length > arg1) {
				local72 = this.anIntArray263[arg1];
				if (local72 != 65535) {
					local68 = this.aClass85_2.method2368(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean264 || Static318.forceTweening) && arg4 != -1 && this.anIntArray263.length > arg4) {
				local74 = this.anIntArray263[arg4];
				if (local74 != 65535) {
					local70 = this.aClass85_2.method2368(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean263) {
			arg2 |= 0x200;
		}
		if (local21.method4237(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method4235(local25)) {
			arg2 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method4237(local72)) {
				arg2 |= 0x80;
			}
			if (local68.method4235(local72)) {
				arg2 |= 0x100;
			}
		}
		if (local35 != null) {
			if (local35.method4237(arg4)) {
				arg2 |= 0x80;
			}
			if (local35.method4235(arg4)) {
				arg2 |= 0x100;
			}
		}
		if (local70 != null) {
			if (local70.method4237(local74)) {
				arg2 |= 0x80;
			}
			if (local70.method4235(local74)) {
				arg2 |= 0x100;
			}
		}
		arg2 |= 0x20;
		@Pc(234) Model local234 = arg0.method3800((byte) 1, arg2, true);
		local234.method3828(local8, local35, arg4, this.aBoolean263, arg3 - 1, local25, local21, 0);
		if (local68 != null) {
			local234.method3828(local8, local70, local74, this.aBoolean263, arg3 - 1, local72, local68, 0);
		}
		return local234;
	}

	@OriginalMember(owner = "com.jagex.client!nb", name = "a", descriptor = "(IBIIIIBLclient!gn;)Lclient!gn;")
	public Model method3987(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Model arg6) {
		@Pc(8) int local8 = this.frames[arg2];
		@Pc(13) int local13 = this.anIntArray262[arg2];
		@Pc(21) AnimFrameset local21 = this.aClass85_2.method2368(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method3800(arg1, arg5, true);
		}
		@Pc(35) AnimFrameset local35 = null;
		if ((this.aBoolean264 || Static318.forceTweening) && arg0 != -1 && arg0 < this.anIntArray262.length) {
			@Pc(53) int local53 = this.anIntArray262[arg0];
			local35 = this.aClass85_2.method2368(local53 >> 16);
			arg0 = local53 & 0xFFFF;
		}
		if (this.aBoolean263) {
			arg5 |= 0x200;
		}
		if (local21.method4237(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method4235(local25)) {
			arg5 |= 0x100;
		}
		if (local35 != null) {
			if (local35.method4237(arg0)) {
				arg5 |= 0x80;
			}
			if (local35.method4235(arg0)) {
				arg5 |= 0x100;
			}
		}
		arg5 |= 0x20;
		@Pc(125) Model local125 = arg6.method3800(arg1, arg5, true);
		local125.method3828(local8, local35, arg0, this.aBoolean263, arg4 - 1, local25, local21, arg3);
		return local125;
	}

	@OriginalMember(owner = "com.jagex.client!nb", name = "a", descriptor = "(IZII)I")
	public int method3990(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray262[arg0];
		@Pc(14) AnimFrameset local14 = null;
		@Pc(22) AnimFrameset local22 = this.aClass85_2.method2368(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean264 || Static318.forceTweening) && arg2 != -1 && this.anIntArray262.length > arg2) {
			local7 = this.anIntArray262[arg2];
			local14 = this.aClass85_2.method2368(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean263) {
			local5 = 512;
		}
		if (local22.method4237(local26)) {
			local5 |= 0x80;
		}
		if (local22.method4235(local26)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method4237(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4235(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray263 != null && arg1) {
			@Pc(125) int local125;
			@Pc(138) AnimFrameset local138;
			if (arg0 < this.anIntArray263.length) {
				local125 = this.anIntArray263[arg0];
				if (local125 != 65535) {
					local138 = this.aClass85_2.method2368(local125 >> 16);
					local125 &= 0xFFFF;
					if (local138 != null) {
						if (local138.method4237(local125)) {
							local5 |= 0x80;
						}
						if (local138.method4235(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean264 || Static318.forceTweening) && arg2 != -1 && this.anIntArray263.length > arg2) {
				local125 = this.anIntArray263[arg2];
				if (local125 != 65535) {
					local138 = this.aClass85_2.method2368(local125 >> 16);
					local125 &= 0xFFFF;
					if (local138 != null) {
						if (local138.method4237(local125)) {
							local5 |= 0x80;
						}
						if (local138.method4235(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}