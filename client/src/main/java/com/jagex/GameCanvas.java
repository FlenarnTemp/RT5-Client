package com.jagex;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.client!qc")
public final class GameCanvas extends Canvas {

	@OriginalMember(owner = "com.jagex.client!qc", name = "c", descriptor = "Ljava/awt/com.jagex.Component;")
	private final Component component;

	@OriginalMember(owner = "com.jagex.client!qc", name = "<init>", descriptor = "(Ljava/awt/com.jagex.Component;)V")
	public GameCanvas(@OriginalArg(0) Component component) {
		this.component = component;
	}

	@OriginalMember(owner = "com.jagex.client!qc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics g) {
		this.component.paint(g);
	}

	@OriginalMember(owner = "com.jagex.client!qc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics g) {
		this.component.update(g);
	}
}
