package com.jagex.game.config.bastype;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ti")
public final class BASType {

	@OriginalMember(owner = "com.jagex.client!ti", name = "d", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "com.jagex.client!ti", name = "p", descriptor = "[[I")
	public int[][] equipmentTransforms;

	@OriginalMember(owner = "com.jagex.client!ti", name = "i", descriptor = "I")
	public int anInt6270 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "n", descriptor = "I")
	public int anInt6275 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "t", descriptor = "I")
	private int anInt6279 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "k", descriptor = "I")
	public int anInt6272 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "w", descriptor = "I")
	public int anInt6282 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "q", descriptor = "I")
	public int anInt6277 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "s", descriptor = "I")
	public int anInt6278 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "l", descriptor = "I")
	public int anInt6273 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "e", descriptor = "I")
	public int anInt6266 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "E", descriptor = "I")
	public int anInt6287 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "F", descriptor = "I")
	public int anInt6288 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "v", descriptor = "I")
	public int anInt6281 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "a", descriptor = "I")
	public int anInt6263 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "I", descriptor = "I")
	public int anInt6291 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "c", descriptor = "I")
	public int anInt6265 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "m", descriptor = "I")
	public int anInt6274 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "J", descriptor = "Z")
	public boolean aBoolean424 = true;

	@OriginalMember(owner = "com.jagex.client!ti", name = "z", descriptor = "[I")
	public int[] anIntArray426 = null;

	@OriginalMember(owner = "com.jagex.client!ti", name = "b", descriptor = "I")
	public int anInt6264 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "D", descriptor = "I")
	public int anInt6286 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "x", descriptor = "I")
	public int anInt6283 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "f", descriptor = "I")
	public int anInt6267 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "g", descriptor = "I")
	public int anInt6268 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "B", descriptor = "[I")
	public int[] anIntArray427 = null;

	@OriginalMember(owner = "com.jagex.client!ti", name = "K", descriptor = "I")
	public int anInt6292 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "y", descriptor = "I")
	public int anInt6284 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "Q", descriptor = "I")
	public int anInt6296 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "R", descriptor = "I")
	public int anInt6297 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "u", descriptor = "I")
	public int anInt6280 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "T", descriptor = "I")
	public int anInt6299 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "H", descriptor = "I")
	public int anInt6290 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "U", descriptor = "I")
	public int anInt6300 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "M", descriptor = "I")
	public int anInt6293 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "j", descriptor = "I")
	public int anInt6271 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "X", descriptor = "I")
	public int anInt6303 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "Y", descriptor = "I")
	public int anInt6304 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "V", descriptor = "I")
	public int anInt6301 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "W", descriptor = "I")
	public int anInt6302 = 0;

	@OriginalMember(owner = "com.jagex.client!ti", name = "P", descriptor = "I")
	public int anInt6295 = -1;

	@OriginalMember(owner = "com.jagex.client!ti", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(13) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(code, buf);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ti", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 1) {
			this.anInt6291 = buf.g2();
			this.anInt6270 = buf.g2();
			if (this.anInt6291 == 65535) {
				this.anInt6291 = -1;
			}
			if (this.anInt6270 == 65535) {
				this.anInt6270 = -1;
			}
		} else if (code == 2) {
			this.anInt6265 = buf.g2();
		} else if (code == 3) {
			this.anInt6299 = buf.g2();
		} else if (code == 4) {
			this.anInt6284 = buf.g2();
		} else if (code == 5) {
			this.anInt6267 = buf.g2();
		} else if (code == 6) {
			this.anInt6263 = buf.g2();
		} else if (code == 7) {
			this.anInt6292 = buf.g2();
		} else if (code == 8) {
			this.anInt6271 = buf.g2();
		} else if (code == 9) {
			this.anInt6301 = buf.g2();
		} else if (code == 26) {
			this.anInt6287 = (short) (buf.g1() * 4);
			this.anInt6290 = (short) (buf.g1() * 4);
		} else {
			@Pc(137) int local137;
			@Pc(335) int local335;
			if (code == 27) {
				if (this.equipmentTransforms == null) {
					this.equipmentTransforms = new int[12][];
				}
				local137 = buf.g1();
				this.equipmentTransforms[local137] = new int[6];
				for (local335 = 0; local335 < 6; local335++) {
					this.equipmentTransforms[local137][local335] = buf.g2s();
				}
			} else if (code == 28) {
				this.anIntArray425 = new int[12];
				for (local137 = 0; local137 < 12; local137++) {
					this.anIntArray425[local137] = buf.g1();
					if (this.anIntArray425[local137] == 255) {
						this.anIntArray425[local137] = -1;
					}
				}
			} else if (code == 29) {
				this.anInt6266 = buf.g1();
			} else if (code == 30) {
				this.anInt6300 = buf.g2();
			} else if (code == 31) {
				this.anInt6302 = buf.g1();
			} else if (code == 32) {
				this.anInt6278 = buf.g2();
			} else if (code == 33) {
				this.anInt6281 = buf.g2s();
			} else if (code == 34) {
				this.anInt6303 = buf.g1();
			} else if (code == 35) {
				this.anInt6280 = buf.g2();
			} else if (code == 36) {
				this.anInt6283 = buf.g2s();
			} else if (code == 37) {
				this.anInt6274 = buf.g1();
			} else if (code == 38) {
				this.anInt6286 = buf.g2();
			} else if (code == 39) {
				this.anInt6273 = buf.g2();
			} else if (code == 40) {
				this.anInt6293 = buf.g2();
			} else if (code == 41) {
				this.anInt6268 = buf.g2();
			} else if (code == 42) {
				this.anInt6296 = buf.g2();
			} else if (code == 43) {
				this.anInt6304 = buf.g2();
			} else if (code == 44) {
				this.anInt6288 = buf.g2();
			} else if (code == 45) {
				this.anInt6272 = buf.g2();
			} else if (code == 46) {
				this.anInt6297 = buf.g2();
			} else if (code == 47) {
				this.anInt6295 = buf.g2();
			} else if (code == 48) {
				this.anInt6264 = buf.g2();
			} else if (code == 49) {
				this.anInt6275 = buf.g2();
			} else if (code == 50) {
				this.anInt6277 = buf.g2();
			} else if (code == 51) {
				this.anInt6282 = buf.g2();
			} else if (code == 52) {
				local137 = buf.g1();
				this.anIntArray426 = new int[local137];
				this.anIntArray427 = new int[local137];
				for (local335 = 0; local335 < local137; local335++) {
					this.anIntArray426[local335] = buf.g2();
					@Pc(348) int local348 = buf.g1();
					this.anIntArray427[local335] = local348;
					this.anInt6279 += local348;
				}
			} else if (code == 53) {
				this.aBoolean424 = false;
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ti", name = "a", descriptor = "(II)Z")
	public boolean method5692(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6291 == arg0) {
			return true;
		} else {
			if (this.anIntArray426 != null) {
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray426.length; local32++) {
					if (arg0 == this.anIntArray426[local32]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ti", name = "b", descriptor = "(B)I")
	public int method5696() {
		if (this.anInt6291 != -1) {
			return this.anInt6291;
		} else if (this.anIntArray426 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt6279 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray427[local30]; local30++) {
				local28 -= this.anIntArray427[local30];
			}
			return this.anIntArray426[local30];
		}
	}
}
