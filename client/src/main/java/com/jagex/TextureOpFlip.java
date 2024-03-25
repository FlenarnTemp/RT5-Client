package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ai")
public final class TextureOpFlip extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!ai", name = "U", descriptor = "Z")
	private boolean flipHorizontally = true;

	@OriginalMember(owner = "com.jagex.client!ai", name = "T", descriptor = "Z")
	private boolean flipVertically = true;

	@OriginalMember(owner = "com.jagex.client!ai", name = "<init>", descriptor = "()V")
	public TextureOpFlip() {
		super(1, false);
	}

	@OriginalMember(owner = "com.jagex.client!ai", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int row) {
		@Pc(16) int[] monochromePixels = super.monochromeImageCache.get(row);
		if (super.monochromeImageCache.invalid) {
			@Pc(33) int[] childMonochromePixels = this.getChildMonochromeOutput(0, this.flipHorizontally ? Texture.heightMask - row : row);
			if (this.flipVertically) {
				for (@Pc(46) int pixelIndex = 0; pixelIndex < Texture.width; pixelIndex++) {
					monochromePixels[pixelIndex] = childMonochromePixels[Texture.anInt1721 - pixelIndex];
				}
			} else {
				ArrayUtil.method4605(childMonochromePixels, 0, monochromePixels, 0, Texture.width);
			}
		}
		return monochromePixels;
	}

	@OriginalMember(owner = "com.jagex.client!ai", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 0) {
			this.flipVertically = buf.g1() == 1;
		} else if (code == 1) {
			this.flipHorizontally = buf.g1() == 1;
		} else if (code == 2) {
			super.monochrome = buf.g1() == 1;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ai", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] colorPixels = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(34) int[][] childColorPixels = this.getChildColorOutput(0, this.flipHorizontally ? Texture.heightMask - arg0 : arg0);
			@Pc(38) int[] redChannel = childColorPixels[0];
			@Pc(42) int[] greenChannel = childColorPixels[1];
			@Pc(46) int[] blueChannel = childColorPixels[2];
			@Pc(50) int[] outputRed = colorPixels[0];
			@Pc(54) int[] outputGreen = colorPixels[1];
			@Pc(58) int[] outputBlue = colorPixels[2];

			if (this.flipVertically) {
				for (int pixelIndex = 0; pixelIndex < Texture.width; pixelIndex++) {
					outputRed[pixelIndex] = redChannel[Texture.anInt1721 - pixelIndex];
					outputGreen[pixelIndex] = greenChannel[Texture.anInt1721 - pixelIndex];
					outputBlue[pixelIndex] = blueChannel[Texture.anInt1721 - pixelIndex];
				}
			} else {
				for (int pixelIndex = 0; pixelIndex < Texture.width; pixelIndex++) {
					outputRed[pixelIndex] = redChannel[pixelIndex];
					outputGreen[pixelIndex] = greenChannel[pixelIndex];
					outputBlue[pixelIndex] = blueChannel[pixelIndex];
				}
			}
		}
		return colorPixels;
	}
}
