package com.jagex;

import com.jagex.graphics.BitmapFont;
import org.openrs2.deob.annotation.OriginalMember;

import java.awt.*;

public class LoadingBarAwt {

	@OriginalMember(owner = "com.jagex.client!et", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;
	@OriginalMember(owner = "com.jagex.client!eu", name = "B", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "com.jagex.client!fr", name = "a", descriptor = "(I)V")
	public static void clear() {
		anImage1 = null;
		aFont3 = null;
	}

}
