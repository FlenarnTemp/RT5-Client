package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!qk")
public final class TextureOp37 extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!qk", name = "Q", descriptor = "[I")
	public static final int[] anIntArray368 = new int[32];

	@OriginalMember(owner = "com.jagex.client!qk", name = "N", descriptor = "I")
	private int anInt5401 = 0;

	@OriginalMember(owner = "com.jagex.client!qk", name = "W", descriptor = "I")
	private int anInt5408 = 0;

	@OriginalMember(owner = "com.jagex.client!qk", name = "R", descriptor = "I")
	private int anInt5404 = 12288;

	@OriginalMember(owner = "com.jagex.client!qk", name = "O", descriptor = "I")
	private int anInt5402 = 4096;

	@OriginalMember(owner = "com.jagex.client!qk", name = "eb", descriptor = "I")
	private int anInt5416 = 2048;

	@OriginalMember(owner = "com.jagex.client!qk", name = "ab", descriptor = "I")
	private int anInt5412 = 2048;

	@OriginalMember(owner = "com.jagex.client!qk", name = "P", descriptor = "I")
	private int anInt5403 = 8192;

	static {
		@Pc(7) int local7 = 2;
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			anIntArray368[local9] = local7 - 1;
			local7 += local7;
		}
	}

	@OriginalMember(owner = "com.jagex.client!qk", name = "<init>", descriptor = "()V")
	public TextureOp37() {
		super(0, true);
	}

	@OriginalMember(owner = "com.jagex.client!qk", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		Static29.method937();
	}

	@OriginalMember(owner = "com.jagex.client!qk", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 0) {
			this.anInt5416 = buf.g2();
		} else if (code == 1) {
			this.anInt5401 = buf.g2();
		} else if (code == 2) {
			this.anInt5408 = buf.g2();
		} else if (code == 3) {
			this.anInt5412 = buf.g2();
		} else if (code == 4) {
			this.anInt5404 = buf.g2();
		} else if (code == 5) {
			this.anInt5402 = buf.g2();
		} else if (code == 6) {
			this.anInt5403 = buf.g2();
		}
	}

	@OriginalMember(owner = "com.jagex.client!qk", name = "b", descriptor = "(IIB)Z")
	private boolean method4924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt5404 * (arg1 + arg0) >> 12;
		@Pc(23) int local23 = Static181.anIntArray203[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5404;
		@Pc(37) int local37 = (local30 << 12) / this.anInt5403;
		@Pc(44) int local44 = this.anInt5402 * local37 >> 12;
		return local44 > arg1 - arg0 && arg1 - arg0 > -local44;
	}

	@OriginalMember(owner = "com.jagex.client!qk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(26) int local26 = Texture.heightFractions[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Texture.width; local28++) {
				@Pc(36) int local36 = Texture.widthFractions[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt5416;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(59) int local59 = local50 <= 2048 ? local50 : local50 - 4096;
				@Pc(64) int local64 = local26 + this.anInt5401;
				@Pc(75) int local75 = local64 >= -2048 ? local64 : local64 + 4096;
				@Pc(84) int local84 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(89) int local89 = this.anInt5408 + local36;
				@Pc(98) int local98 = local89 >= -2048 ? local89 : local89 + 4096;
				@Pc(107) int local107 = local98 <= 2048 ? local98 : local98 - 4096;
				@Pc(113) int local113 = local26 + this.anInt5412;
				@Pc(124) int local124 = local113 >= -2048 ? local113 : local113 + 4096;
				@Pc(135) int local135 = local124 <= 2048 ? local124 : local124 - 4096;
				local11[local28] = this.method4926(local59, local84) || this.method4924(local107, local135) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "com.jagex.client!qk", name = "a", descriptor = "(BII)Z")
	private boolean method4926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt5404 >> 12;
		@Pc(34) int local34 = Static181.anIntArray203[local13 * 255 >> 12 & 0xFF];
		@Pc(41) int local41 = (local34 << 12) / this.anInt5404;
		@Pc(48) int local48 = (local41 << 12) / this.anInt5403;
		@Pc(55) int local55 = local48 * this.anInt5402 >> 12;
		return local55 > arg1 + arg0 && -local55 < arg0 + arg1;
	}
}
