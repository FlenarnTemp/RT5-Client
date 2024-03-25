package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!li")
public final class TextureOpNoise extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!li", name = "<init>", descriptor = "()V")
	public TextureOpNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "com.jagex.client!li", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(16) int[] monochromePixels = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(24) int heightFraction = Texture.heightFractions[y];
			for (@Pc(26) int i = 0; i < Texture.width; i++) {
				monochromePixels[i] = this.calculateNoise(heightFraction, Texture.widthFractions[i]) % 4096;
			}
		}
		return monochromePixels;
	}

	@OriginalMember(owner = "com.jagex.client!li", name = "b", descriptor = "(III)I")
	private int calculateNoise(@OriginalArg(0) int x, @OriginalArg(2) int y) {
		@Pc(9) int sum = x * 57 + y;
		@Pc(15) int result = sum << 1 ^ sum;
		return 4096 - (result * (result * result * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
