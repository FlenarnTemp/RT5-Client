package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ar")
public final class TextureOpBoxBlur extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!ar", name = "Q", descriptor = "I")
	private int anInt369 = 1;

	@OriginalMember(owner = "com.jagex.client!ar", name = "S", descriptor = "I")
	private int anInt371 = 1;

	@OriginalMember(owner = "com.jagex.client!ar", name = "<init>", descriptor = "()V")
	public TextureOpBoxBlur() {
		super(1, false);
	}

	@OriginalMember(owner = "com.jagex.client!ar", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(31) int local31 = this.anInt371 + this.anInt371 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt369 + this.anInt369 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local31][];
			@Pc(72) int local72;
			for (@Pc(57) int local57 = arg0 - this.anInt371; local57 <= arg0 + this.anInt371; local57++) {
				@Pc(67) int[] local67 = this.getChildMonochromeOutput(0, Texture.heightMask & local57);
				@Pc(70) int[] local70 = new int[Texture.width];
				local72 = 0;
				for (@Pc(76) int local76 = -this.anInt369; local76 <= this.anInt369; local76++) {
					local72 += local67[Texture.anInt1721 & local76];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Texture.width) {
					local70[local93] = local72 * local48 >> 16;
					local72 -= local67[local93 - this.anInt369 & Texture.anInt1721];
					local93++;
					local72 += local67[Texture.anInt1721 & local93 + this.anInt369];
				}
				local51[local57 + this.anInt371 - arg0] = local70;
			}
			for (@Pc(154) int local154 = 0; local154 < Texture.width; local154++) {
				@Pc(158) int local158 = 0;
				for (local72 = 0; local72 < local31; local72++) {
					local158 += local51[local72][local154];
				}
				local11[local154] = local158 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "com.jagex.client!ar", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 0) {
			this.anInt369 = buf.g1();
		} else if (code == 1) {
			this.anInt371 = buf.g1();
		} else if (code == 2) {
			super.monochrome = buf.g1() == 1;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ar", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(31) int local31 = this.anInt371 + this.anInt371 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt369 + this.anInt369 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.anInt371; local55 <= this.anInt371 + arg0; local55++) {
				@Pc(65) int[][] local65 = this.getChildColorOutput(0, local55 & Texture.heightMask);
				@Pc(69) int[][] local69 = new int[3][Texture.width];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt369; local91 <= this.anInt369; local91++) {
					@Pc(97) int local97 = local91 & Texture.anInt1721;
					local71 += local79[local97];
					local75 += local87[local97];
					local73 += local83[local97];
				}
				@Pc(124) int[] local124 = local69[0];
				@Pc(128) int[] local128 = local69[1];
				@Pc(132) int[] local132 = local69[2];
				@Pc(134) int local134 = 0;
				while (Texture.width > local134) {
					local124[local134] = local71 * local47 >> 16;
					local128[local134] = local73 * local47 >> 16;
					local132[local134] = local75 * local47 >> 16;
					@Pc(167) int local167 = local134 - this.anInt369 & Texture.anInt1721;
					local75 -= local87[local167];
					local134++;
					local73 -= local83[local167];
					local71 -= local79[local167];
					@Pc(193) int local193 = Texture.anInt1721 & this.anInt369 + local134;
					local71 += local79[local193];
					local75 += local87[local193];
					local73 += local83[local193];
				}
				local50[this.anInt371 + local55 - arg0] = local69;
			}
			@Pc(239) int[] local239 = local19[0];
			@Pc(243) int[] local243 = local19[1];
			@Pc(247) int[] local247 = local19[2];
			for (local73 = 0; local73 < Texture.width; local73++) {
				local75 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local31; local259++) {
					@Pc(265) int[][] local265 = local50[local259];
					local257 += local265[2][local73];
					local255 += local265[1][local73];
					local75 += local265[0][local73];
				}
				local239[local73] = local35 * local75 >> 16;
				local243[local73] = local35 * local255 >> 16;
				local247[local73] = local35 * local257 >> 16;
			}
		}
		return local19;
	}
}
