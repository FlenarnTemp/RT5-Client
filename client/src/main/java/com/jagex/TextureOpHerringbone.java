package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!sb")
public final class TextureOpHerringbone extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!sb", name = "R", descriptor = "I")
	private int segmentLength = 1;

	@OriginalMember(owner = "com.jagex.client!sb", name = "O", descriptor = "I")
	private int threshold = 204;

	@OriginalMember(owner = "com.jagex.client!sb", name = "W", descriptor = "I")
	private int segmentThickness = 1;

	@OriginalMember(owner = "com.jagex.client!sb", name = "<init>", descriptor = "()V")
	public TextureOpHerringbone() {
		super(0, true);
	}

	@OriginalMember(owner = "com.jagex.client!sb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] monochromePixels = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			for (@Pc(17) int pixelX = 0; pixelX < Texture.width; pixelX++) {
				@Pc(23) int xPosition = Texture.widthFractions[pixelX];
				@Pc(27) int yPosition = Texture.heightFractions[arg0];
				@Pc(34) int segmentOffset = xPosition * this.segmentLength >> 12;
				@Pc(41) int yOffset = yPosition * this.segmentThickness >> 12;
				@Pc(51) int segmentPositionWithinUnit = this.segmentLength * (xPosition % (4096 / this.segmentLength));
				@Pc(61) int segmentOffsetWithinUnit = this.segmentThickness * (yPosition % (4096 / this.segmentThickness));
				if (segmentOffsetWithinUnit < this.threshold) {
					segmentOffset -= yOffset;
					while (segmentOffset < 0) {
						segmentOffset += 4;
					}
					while (segmentOffset > 3) {
						segmentOffset -= 4;
					}
					if (segmentOffset != 1) {
						monochromePixels[pixelX] = 0;
						continue;
					}
					if (this.threshold > segmentPositionWithinUnit) {
						monochromePixels[pixelX] = 0;
						continue;
					}
				}
				if (segmentPositionWithinUnit < this.threshold) {
					segmentOffset -= yOffset;
					while (segmentOffset < 0) {
						segmentOffset += 4;
					}
					while (segmentOffset > 3) {
						segmentOffset -= 4;
					}
					if (segmentOffset > 0) {
						monochromePixels[pixelX] = 0;
						continue;
					}
				}
				monochromePixels[pixelX] = 4096;
			}
		}
		return monochromePixels;
	}

	@OriginalMember(owner = "com.jagex.client!sb", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 0) {
			this.segmentLength = buf.g1();
		} else if (code == 1) {
			this.segmentThickness = buf.g1();
		} else if (code == 2) {
			this.threshold = buf.g2();
		}
	}
}
