package com.jagex.game.config.idktype;

import com.jagex.Class185;
import com.jagex.Static298;
import com.jagex.core.io.Packet;
import com.jagex.js5.Js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ge")
public final class IDKType {

	@OriginalMember(owner = "com.jagex.client!ge", name = "b", descriptor = "[S")
	private short[] retex_d;

	@OriginalMember(owner = "com.jagex.client!ge", name = "d", descriptor = "[S")
	private short[] recol_s;

	@OriginalMember(owner = "com.jagex.client!ge", name = "f", descriptor = "[S")
	private short[] recol_d;

	@OriginalMember(owner = "com.jagex.client!ge", name = "i", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "com.jagex.client!ge", name = "q", descriptor = "[I")
	private int[] models;

	@OriginalMember(owner = "com.jagex.client!ge", name = "t", descriptor = "Lclient!e;")
	public IDKTypeList aClass55_2;

	@OriginalMember(owner = "com.jagex.client!ge", name = "g", descriptor = "[I")
	private final int[] heads = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "com.jagex.client!ge", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(5) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(code, buf);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ge", name = "a", descriptor = "(IILclient!bt;)V")
	private void decode(@OriginalArg(0) int code, @OriginalArg(2) Packet buf) {
		if (code == 1) {
			buf.g1();
		} else if (code == 2) {
			int length = buf.g1();
			this.models = new int[length];
			for (int index = 0; index < length; index++) {
				this.models[index] = buf.g2();
			}
		} else if (code != 3) {
			if (code == 40) {
				int length = buf.g1();
				this.recol_d = new short[length];
				this.recol_s = new short[length];
				for (int index = 0; index < length; index++) {
					this.recol_s[index] = (short) buf.g2();
					this.recol_d[index] = (short) buf.g2();
				}
			} else if (code == 41) {
				int length = buf.g1();
				this.retex_d = new short[length];
				this.retex_s = new short[length];
				for (int index = 0; index < length; index++) {
					this.retex_s[index] = (short) buf.g2();
					this.retex_d[index] = (short) buf.g2();
				}
			} else if (code >= 60 && code < 70) {
				this.heads[code - 60] = buf.g2();
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ge", name = "a", descriptor = "(Z)Z")
	public boolean hasReadyModels() {
		if (this.models == null) {
			return true;
		}
		@Pc(12) boolean ready = true;
		@Pc(16) Js5 js5 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			for (@Pc(20) int index = 0; index < this.models.length; index++) {
				if (!this.aClass55_2.aClass197_16.requestDownload(this.models[index], 0)) {
					ready = false;
				}
			}
			return ready;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ge", name = "b", descriptor = "(Z)Lclient!pr;")
	public Class185 method2273() {
		@Pc(13) Class185[] local13 = new Class185[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Js5 js5 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			for (@Pc(23) int index = 0; index < 5; index++) {
				if (this.heads[index] != -1) {
					local13[local15++] = Static298.method2426(this.aClass55_2.aClass197_16, this.heads[index]);
				}
			}
		}
		@Pc(62) Class185 local62 = new Class185(local13, local15);

		if (this.recol_s != null) {
			for (int index = 0; index < this.recol_s.length; index++) {
				local62.method4663(this.recol_s[index], this.recol_d[index]);
			}
		}
		if (this.retex_s != null) {
			for (int index = 0; index < this.retex_s.length; index++) {
				local62.method4658(this.retex_d[index], this.retex_s[index]);
			}
		}
		return local62;
	}

	@OriginalMember(owner = "com.jagex.client!ge", name = "a", descriptor = "(B)Z")
	public boolean hasReadyHeads() {
		@Pc(7) boolean ready = true;
		@Pc(11) Js5 js5 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			for (@Pc(27) int index = 0; index < 5; index++) {
				if (this.heads[index] != -1 && !this.aClass55_2.aClass197_16.requestDownload(this.heads[index], 0)) {
					ready = false;
				}
			}
			return ready;
		}
	}

	@OriginalMember(owner = "com.jagex.client!ge", name = "b", descriptor = "(I)Lclient!pr;")
	public Class185 method2275() {
		if (this.models == null) {
			return null;
		}
		@Pc(23) Class185[] local23 = new Class185[this.models.length];
		@Pc(27) Js5 local27 = this.aClass55_2.aClass197_16;
		synchronized (this.aClass55_2.aClass197_16) {
			@Pc(31) int local31 = 0;
			while (true) {
				if (this.models.length <= local31) {
					break;
				}
				local23[local31] = Static298.method2426(this.aClass55_2.aClass197_16, this.models[local31]);
				local31++;
			}
		}
		@Pc(73) Class185 local73;
		if (local23.length == 1) {
			local73 = local23[0];
		} else {
			local73 = new Class185(local23, local23.length);
		}
		if (local73 == null) {
			return null;
		}
		@Pc(87) int local87;
		if (this.recol_s != null) {
			for (local87 = 0; local87 < this.recol_s.length; local87++) {
				local73.method4663(this.recol_s[local87], this.recol_d[local87]);
			}
		}
		if (this.retex_s != null) {
			for (local87 = 0; local87 < this.retex_s.length; local87++) {
				local73.method4658(this.retex_d[local87], this.retex_s[local87]);
			}
		}
		return local73;
	}
}
