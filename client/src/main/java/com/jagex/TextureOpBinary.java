package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!fu")
public final class TextureOpBinary extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!fu", name = "O", descriptor = "I")
	private int minvalue = 0;

	@OriginalMember(owner = "com.jagex.client!fu", name = "Q", descriptor = "I")
	private int maxvalue = 4096;

	@OriginalMember(owner = "com.jagex.client!fu", name = "<init>", descriptor = "()V")
	public TextureOpBinary() {
		super(1, true);
	}

	@OriginalMember(owner = "com.jagex.client!fu", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 0) {
			this.minvalue = buf.g2();
		} else if (code == 1) {
			this.maxvalue = buf.g2();
		}
	}

	@OriginalMember(owner = "com.jagex.client!fu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] output = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(27) int[] local27 = this.getChildMonochromeOutput(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Texture.width; local29++) {
				@Pc(35) int local35 = local27[local29];
				output[local29] = local35 >= this.minvalue && local35 <= this.maxvalue ? 4096 : 0;
			}
		}
		return output;
	}
}
