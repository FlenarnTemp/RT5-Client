package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!gd")
public final class LocalizedString {

	@OriginalMember(owner = "com.jagex.client!gd", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] localizations;

	@OriginalMember(owner = "com.jagex.client!gd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public LocalizedString(@OriginalArg(0) String en, @OriginalArg(1) String de, @OriginalArg(2) String fr, @OriginalArg(3) String pt) {
		this.localizations = new String[] { en, de, fr, pt };
	}

	@OriginalMember(owner = "com.jagex.client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "com.jagex.client!gd", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String getLocalized(@OriginalArg(0) int lang) {
		return this.localizations[lang];
	}
}
