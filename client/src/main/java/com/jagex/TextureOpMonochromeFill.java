package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ae")
public final class TextureOpMonochromeFill extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!ae", name = "Z", descriptor = "I")
	private int fillIntensity;

	@OriginalMember(owner = "com.jagex.client!ae", name = "<init>", descriptor = "()V")
	public TextureOpMonochromeFill() {
		this(4096);
	}

	@OriginalMember(owner = "com.jagex.client!ae", name = "<init>", descriptor = "(I)V")
	private TextureOpMonochromeFill(@OriginalArg(0) int intensity) {
		super(0, true);
		this.fillIntensity = intensity;
	}

	@OriginalMember(owner = "com.jagex.client!ae", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 0) {
			this.fillIntensity = (buf.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ae", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(14) int[] output = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			ArrayUtil.method4610(output, 0, Texture.width, this.fillIntensity);
		}
		return output;
	}
}
