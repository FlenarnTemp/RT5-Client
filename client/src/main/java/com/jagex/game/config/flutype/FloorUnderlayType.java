package com.jagex.game.config.flutype;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!tq")
public final class FloorUnderlayType {

	@OriginalMember(owner = "com.jagex.client!tq", name = "a", descriptor = "I")
	public int chroma;

	@OriginalMember(owner = "com.jagex.client!tq", name = "h", descriptor = "I")
	public int hue;

	@OriginalMember(owner = "com.jagex.client!tq", name = "i", descriptor = "I")
	public int anInt6379;

	@OriginalMember(owner = "com.jagex.client!tq", name = "l", descriptor = "I")
	public int anInt6381;

	@OriginalMember(owner = "com.jagex.client!tq", name = "d", descriptor = "I")
	private int colour = 0;

	@OriginalMember(owner = "com.jagex.client!tq", name = "k", descriptor = "Z")
	public boolean hardshadow = true;

	@OriginalMember(owner = "com.jagex.client!tq", name = "g", descriptor = "I")
	public int materialscale = 128;

	@OriginalMember(owner = "com.jagex.client!tq", name = "o", descriptor = "I")
	public int material = -1;

	@OriginalMember(owner = "com.jagex.client!tq", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(5) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!tq", name = "a", descriptor = "(Lclient!bt;IZ)V")
	private void decode(@OriginalArg(0) Packet buf, @OriginalArg(1) int code) {
		if (code == 1) {
			this.colour = buf.g3();
			this.computeColour(this.colour);
		} else if (code == 2) {
			this.material = buf.g2();
			if (this.material == 65535) {
				this.material = -1;
			}
		} else if (code == 3) { // TODO - Confirm
			this.materialscale = buf.g2();
		} else if (code == 4) {
			this.hardshadow = false;
		}
	}

	@OriginalMember(owner = "com.jagex.client!tq", name = "a", descriptor = "(IB)V")
	private void computeColour(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local72 < 0.5D) {
				local66 = (local46 - local32) / (local46 + local32);
			}
			if (local72 >= 0.5D) {
				local66 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local14 == local46) {
				local64 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local64 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local64 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local64 /= 6.0D;
		this.anInt6381 = (int) (local72 * 256.0D);
		this.anInt6379 = (int) (local66 * 256.0D);

		if (this.anInt6381 < 0) {
			this.anInt6381 = 0;
		} else if (this.anInt6381 > 255) {
			this.anInt6381 = 255;
		}

		if (this.anInt6379 < 0) {
			this.anInt6379 = 0;
		} else if (this.anInt6379 > 255) {
			this.anInt6379 = 255;
		}

		if (local72 > 0.5D) {
			this.chroma = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.chroma = (int) (local72 * local66 * 512.0D);
		}

		if (this.chroma < 1) {
			this.chroma = 1;
		}
		this.hue = (int) ((double) this.chroma * local64);
	}
}
