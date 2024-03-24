package com.jagex.game.config.iftype.componentproperties;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!eh")
public final class ServerActiveProperties extends Node {

	@OriginalMember(owner = "com.jagex.client!eh", name = "A", descriptor = "I")
	public final int targetParam;

	@OriginalMember(owner = "com.jagex.client!eh", name = "z", descriptor = "I")
	public final int events;

	@OriginalMember(owner = "com.jagex.client!eh", name = "<init>", descriptor = "(II)V")
	public ServerActiveProperties(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.targetParam = arg1;
		this.events = arg0;
	}

	@OriginalMember(owner = "com.jagex.client!ao", name = "a", descriptor = "(IB)I")
	public static int getTargetMask(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "com.jagex.client!eh", name = "b", descriptor = "(B)I")
	public int method1850() {
		return this.events >> 18 & 0x7;
	}

	@OriginalMember(owner = "com.jagex.client!eh", name = "c", descriptor = "(B)Z")
	public boolean method1851() {
		return (this.events >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "com.jagex.client!eh", name = "d", descriptor = "(B)I")
	public int getTargetMask() {
		return getTargetMask(this.events);
	}

	@OriginalMember(owner = "com.jagex.client!eh", name = "b", descriptor = "(I)Z")
	public boolean method1853() {
		return (this.events >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "com.jagex.client!eh", name = "a", descriptor = "(II)Z")
	public boolean isButtonEnabled(@OriginalArg(0) int arg0) {
		return (this.events >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "com.jagex.client!eh", name = "c", descriptor = "(I)Z")
	public boolean isResumePauseButtonEnabled() {
		return (this.events & 0x1) != 0;
	}
}
