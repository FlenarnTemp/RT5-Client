package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!na")
public final class TextureOpColorize extends TextureOp {

	@OriginalMember(owner = "com.jagex.client!na", name = "P", descriptor = "I")
	private int anInt4013 = 4096;

	@OriginalMember(owner = "com.jagex.client!na", name = "N", descriptor = "I")
	private int anInt4011 = 4096;

	@OriginalMember(owner = "com.jagex.client!na", name = "W", descriptor = "I")
	private int anInt4019 = 4096;

	@OriginalMember(owner = "com.jagex.client!na", name = "<init>", descriptor = "()V")
	public TextureOpColorize() {
		super(1, false);
	}

	@OriginalMember(owner = "com.jagex.client!na", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet buf) {
		if (code == 0) {
			this.anInt4019 = buf.g2();
		} else if (code == 1) {
			this.anInt4011 = buf.g2();
		} else if (code == 2) {
			this.anInt4013 = buf.g2();
		}
	}

	@OriginalMember(owner = "com.jagex.client!na", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.colorImageCache.get(arg0);
		if (super.colorImageCache.invalid) {
			@Pc(27) int[][] local27 = this.getChildColorOutput(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Texture.width; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local67 == local63) {
					local43[local53] = local59 * this.anInt4019 >> 12;
					local47[local53] = this.anInt4011 * local63 >> 12;
					local51[local53] = this.anInt4013 * local67 >> 12;
				} else {
					local43[local53] = this.anInt4019;
					local47[local53] = this.anInt4011;
					local51[local53] = this.anInt4013;
				}
			}
		}
		return local17;
	}
}
