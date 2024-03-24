package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!gr")
public final class QuickChatPhrase {

	@OriginalMember(owner = "com.jagex.client!gr", name = "a", descriptor = "[I")
	public int[] values;

	@OriginalMember(owner = "com.jagex.client!gr", name = "b", descriptor = "I")
	public int id;

	@OriginalMember(owner = "com.jagex.client!gr", name = "c", descriptor = "Lclient!tb;")
	public QuickChatPhraseType type;
}
