package com.jagex;

import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!mk")
public final class BrokenInputStream extends InputStream {

	@OriginalMember(owner = "com.jagex.client!mk", name = "read", descriptor = "()I")
	@Override
	public int read() {
		ThreadUtils.sleep(30000L);
		return -1;
	}
}
