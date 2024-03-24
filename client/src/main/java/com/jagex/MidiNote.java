package com.jagex;

import com.jagex.core.datastruct.Node;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!ej")
public final class MidiNote extends Node {

	@OriginalMember(owner = "com.jagex.client!ej", name = "s", descriptor = "I")
	public int anInt1775;

	@OriginalMember(owner = "com.jagex.client!ej", name = "t", descriptor = "I")
	public int anInt1776;

	@OriginalMember(owner = "com.jagex.client!ej", name = "u", descriptor = "I")
	public int anInt1777;

	@OriginalMember(owner = "com.jagex.client!ej", name = "v", descriptor = "I")
	public int anInt1778;

	@OriginalMember(owner = "com.jagex.client!ej", name = "w", descriptor = "I")
	public int anInt1779;

	@OriginalMember(owner = "com.jagex.client!ej", name = "x", descriptor = "I")
	public int anInt1780;

	@OriginalMember(owner = "com.jagex.client!ej", name = "y", descriptor = "I")
	public int anInt1781;

	@OriginalMember(owner = "com.jagex.client!ej", name = "z", descriptor = "I")
	public int anInt1782;

	@OriginalMember(owner = "com.jagex.client!ej", name = "A", descriptor = "I")
	public int anInt1783;

	@OriginalMember(owner = "com.jagex.client!ej", name = "F", descriptor = "I")
	public int anInt1786;

	@OriginalMember(owner = "com.jagex.client!ej", name = "I", descriptor = "Lclient!bd;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "com.jagex.client!ej", name = "J", descriptor = "Lclient!qn;")
	public Class2_Sub12_Sub4 stream;

	@OriginalMember(owner = "com.jagex.client!ej", name = "K", descriptor = "I")
	public int anInt1788;

	@OriginalMember(owner = "com.jagex.client!ej", name = "M", descriptor = "Lclient!jn;")
	public PcmSound sound;

	@OriginalMember(owner = "com.jagex.client!ej", name = "O", descriptor = "I")
	public int anInt1790;

	@OriginalMember(owner = "com.jagex.client!ej", name = "P", descriptor = "I")
	public int anInt1791;

	@OriginalMember(owner = "com.jagex.client!ej", name = "Q", descriptor = "I")
	public int anInt1792;

	@OriginalMember(owner = "com.jagex.client!ej", name = "R", descriptor = "I")
	public int channel;

	@OriginalMember(owner = "com.jagex.client!ej", name = "S", descriptor = "Lclient!ne;")
	public MidiInstrument aClass2_Sub25_1;

	@OriginalMember(owner = "com.jagex.client!ej", name = "T", descriptor = "I")
	public int anInt1794;

	@OriginalMember(owner = "com.jagex.client!ej", name = "U", descriptor = "I")
	public int anInt1795;

	@OriginalMember(owner = "com.jagex.client!ej", name = "b", descriptor = "(I)V")
	public void release() {
		this.aClass17_1 = null;
		this.aClass2_Sub25_1 = null;
		this.sound = null;
		this.stream = null;
	}
}
