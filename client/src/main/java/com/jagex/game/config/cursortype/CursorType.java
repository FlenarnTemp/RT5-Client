package com.jagex.game.config.cursortype;

import com.jagex.SpriteData;
import com.jagex.Static396;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!te")
public final class CursorType {

	@OriginalMember(owner = "com.jagex.client!te", name = "b", descriptor = "I")
	public int hotspoty;

	@OriginalMember(owner = "com.jagex.client!te", name = "c", descriptor = "I")
	private int graphic;

	@OriginalMember(owner = "com.jagex.client!te", name = "d", descriptor = "Lclient!mi;")
	public CursorTypeList myList;

	@OriginalMember(owner = "com.jagex.client!te", name = "f", descriptor = "I")
	public int hotspotx;

	@OriginalMember(owner = "com.jagex.client!te", name = "a", descriptor = "(B)Lclient!dk;")
	public synchronized SpriteData getCursor() {
		@Pc(13) SpriteData cached = (SpriteData) this.myList.cursorCache.get((long) this.graphic);
		if (cached != null) {
			return cached;
		}
		SpriteData sprite = Static396.method1682(this.myList.js5, this.graphic, 0);
		if (sprite != null) {
			this.myList.cursorCache.put((long) this.graphic, sprite);
		}
		return sprite;
	}

	@OriginalMember(owner = "com.jagex.client!te", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet buf) {
		while (true) {
			@Pc(5) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!te", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet buf, @OriginalArg(2) int code) {
		if (code == 1) {
			this.graphic = buf.g2();
		} else if (code == 2) {
			this.hotspotx = buf.g1();
			this.hotspoty = buf.g1();
		}
	}
}
