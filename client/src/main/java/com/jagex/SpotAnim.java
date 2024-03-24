package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!uh")
public final class SpotAnim extends Entity {

	@OriginalMember(owner = "com.jagex.client!uh", name = "y", descriptor = "Lclient!oh;")
	private ParticleSystem aClass12_Sub5_7;

	@OriginalMember(owner = "com.jagex.client!uh", name = "N", descriptor = "I")
	private int anInt6518 = -32768;

	@OriginalMember(owner = "com.jagex.client!uh", name = "F", descriptor = "I")
	private final int anInt6510 = -1;

	@OriginalMember(owner = "com.jagex.client!uh", name = "Q", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "com.jagex.client!uh", name = "E", descriptor = "I")
	private int anInt6509 = 0;

	@OriginalMember(owner = "com.jagex.client!uh", name = "X", descriptor = "I")
	private int anInt6524 = 0;

	@OriginalMember(owner = "com.jagex.client!uh", name = "A", descriptor = "I")
	private final int anInt6505;

	@OriginalMember(owner = "com.jagex.client!uh", name = "z", descriptor = "I")
	public final int anInt6504;

	@OriginalMember(owner = "com.jagex.client!uh", name = "T", descriptor = "Lclient!nb;")
	private Class157 aClass157_3;

	@OriginalMember(owner = "com.jagex.client!uh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public SpotAnim(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6505 = arg0;
		this.anInt6504 = arg1 + arg2;
		@Pc(41) int local41 = client.SpotAnimTypes.method5407(this.anInt6505).anInt2448;
		if (local41 == -1) {
			this.aBoolean445 = true;
		} else {
			this.aBoolean445 = false;
			this.aClass157_3 = client.SeqTypes.method2371(local41);
		}
		if (arg2 == this.anInt6504) {
			Static1.method4(this.aClass157_3, false, super.plane, super.xFine, super.zFine, this.anInt6509);
		}
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Renderer arg0) {
		@Pc(9) Model local9 = this.method5874(0, arg0);
		if (local9 != null) {
			this.method5873(local9, arg0);
		}
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "a", descriptor = "(Lclient!gn;Lclient!wm;Z)V")
	private void method5873(@OriginalArg(0) Model arg0, @OriginalArg(1) Renderer arg1) {
		@Pc(6) Class114[] local6 = arg0.method3808();
		@Pc(9) Class163[] local9 = arg0.method3840();
		if ((this.aClass12_Sub5_7 == null || this.aClass12_Sub5_7.aBoolean322) && (local6 != null || local9 != null)) {
			this.aClass12_Sub5_7 = new ParticleSystem(client.cycle);
		}
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4357(arg1, (long) client.cycle, local6, local9);
			this.aClass12_Sub5_7.method4361(super.plane, super.aShort103, super.aShort104, super.aShort101, super.aShort102);
		}
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Renderer arg0) {
		@Pc(9) Model local9 = this.method5874(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class14 local16 = arg0.method2808();
		local16.method3922(super.xFine, super.anInt6782, super.zFine);
		if (this.aClass12_Sub5_7 == null) {
			local9.method3835(local16, null, 0);
		} else {
			@Pc(41) Class224 local41 = this.aClass12_Sub5_7.method4358();
			arg0.method2824(local9, local41, local16, null);
		}
		this.anInt6518 = local9.method3802();
		this.method5873(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "h", descriptor = "(I)I")
	@Override
	public int method6080() {
		return this.anInt6518;
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "a", descriptor = "(ILclient!wm;Z)Lclient!gn;")
	private Model method5874(@OriginalArg(0) int arg0, @OriginalArg(1) Renderer arg1) {
		@Pc(9) SpotAnimType local9 = client.SpotAnimTypes.method5407(this.anInt6505);
		return this.aBoolean445 ? local9.method2433(-1, 0, arg1, arg0, client.SeqTypes, -1) : local9.method2433(this.anInt6510, this.anInt6524, arg1, arg0, client.SeqTypes, this.anInt6509);
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Renderer arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "d", descriptor = "(B)V")
	public void method5878() {
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4354();
		}
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "a", descriptor = "(II)V")
	public void method5879(@OriginalArg(0) int arg0) {
		if (this.aBoolean445) {
			return;
		}
		this.anInt6524 += arg0;
		while (this.anInt6524 > this.aClass157_3.anIntArray261[this.anInt6509]) {
			this.anInt6524 -= this.aClass157_3.anIntArray261[this.anInt6509];
			this.anInt6509++;
			if (this.anInt6509 >= this.aClass157_3.anIntArray262.length) {
				this.aBoolean445 = true;
				break;
			}
		}
		if (!this.aBoolean445) {
			Static1.method4(this.aClass157_3, false, super.plane, super.xFine, super.zFine, this.anInt6509);
		}
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4354();
		}
	}

	@OriginalMember(owner = "com.jagex.client!uh", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Renderer arg2) {
		return false;
	}
}
