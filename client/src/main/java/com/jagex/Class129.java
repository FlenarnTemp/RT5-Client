package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!kn")
public final class Class129 implements Runnable {

	@OriginalMember(owner = "com.jagex.client!kn", name = "e", descriptor = "Lclient!ml;")
	public Signlink aClass152_3;

	@OriginalMember(owner = "com.jagex.client!kn", name = "b", descriptor = "[Lclient!tg;")
	public final AudioChannel[] aClass221Array1 = new AudioChannel[2];

	@OriginalMember(owner = "com.jagex.client!kn", name = "i", descriptor = "Z")
	public volatile boolean aBoolean227 = false;

	@OriginalMember(owner = "com.jagex.client!kn", name = "a", descriptor = "Z")
	public volatile boolean aBoolean226 = false;

	@OriginalMember(owner = "com.jagex.client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean226 = true;
		try {
			while (!this.aBoolean227) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) AudioChannel local19 = this.aClass221Array1[local12];
					if (local19 != null) {
						local19.mainLogic();
					}
				}
				ThreadUtils.sleep(10L);
				Static283.method4876(this.aClass152_3, null);
			}
		} catch (@Pc(43) Exception local43) {
			TracingException.report(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean226 = false;
		}
	}
}
