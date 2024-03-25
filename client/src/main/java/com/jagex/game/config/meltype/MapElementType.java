package com.jagex.game.config.meltype;

import com.jagex.*;
import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.StringWrapper;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!np")
public final class MapElementType {

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "I")
	private int anInt4404;

	@OriginalMember(owner = "com.jagex.client!np", name = "d", descriptor = "I")
	private int anInt4407;

	@OriginalMember(owner = "com.jagex.client!np", name = "h", descriptor = "Lclient!ki;")
	public MapElementTypeList aClass125_2;

	@OriginalMember(owner = "com.jagex.client!np", name = "j", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "com.jagex.client!np", name = "n", descriptor = "I")
	public int anInt4414;

	@OriginalMember(owner = "com.jagex.client!np", name = "r", descriptor = "I")
	public int anInt4417;

	@OriginalMember(owner = "com.jagex.client!np", name = "t", descriptor = "Lclient!ad;")
	private HashTable params;

	@OriginalMember(owner = "com.jagex.client!np", name = "x", descriptor = "Ljava/lang/String;")
	public String text;

	@OriginalMember(owner = "com.jagex.client!np", name = "y", descriptor = "I")
	public int anInt4422;

	@OriginalMember(owner = "com.jagex.client!np", name = "E", descriptor = "I")
	private int anInt4427;

	@OriginalMember(owner = "com.jagex.client!np", name = "H", descriptor = "I")
	public int id;

	@OriginalMember(owner = "com.jagex.client!np", name = "I", descriptor = "I")
	public int anInt4431;

	@OriginalMember(owner = "com.jagex.client!np", name = "N", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "com.jagex.client!np", name = "Q", descriptor = "I")
	public int anInt4437;

	@OriginalMember(owner = "com.jagex.client!np", name = "S", descriptor = "I")
	private int anInt4439;

	@OriginalMember(owner = "com.jagex.client!np", name = "c", descriptor = "I")
	public int anInt4406 = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "s", descriptor = "I")
	public int textSize = 0;

	@OriginalMember(owner = "com.jagex.client!np", name = "i", descriptor = "I")
	private int anInt4410 = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "e", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "com.jagex.client!np", name = "u", descriptor = "I")
	public int anInt4419 = Integer.MIN_VALUE;

	@OriginalMember(owner = "com.jagex.client!np", name = "q", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "com.jagex.client!np", name = "m", descriptor = "I")
	private int anInt4413 = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "v", descriptor = "I")
	public int sprite = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "A", descriptor = "I")
	public int category = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "C", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "com.jagex.client!np", name = "J", descriptor = "I")
	public int anInt4432 = Integer.MAX_VALUE;

	@OriginalMember(owner = "com.jagex.client!np", name = "L", descriptor = "I")
	private int anInt4433 = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "k", descriptor = "I")
	private int anInt4411 = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "K", descriptor = "Z")
	public boolean aBoolean305 = true;

	@OriginalMember(owner = "com.jagex.client!np", name = "O", descriptor = "I")
	private int anInt4435 = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "M", descriptor = "I")
	public int anInt4434 = Integer.MAX_VALUE;

	@OriginalMember(owner = "com.jagex.client!np", name = "F", descriptor = "I")
	public int anInt4428 = Integer.MIN_VALUE;

	@OriginalMember(owner = "com.jagex.client!np", name = "R", descriptor = "I")
	public int anInt4438 = -1;

	@OriginalMember(owner = "com.jagex.client!np", name = "T", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41 = new String[5];

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(Lclient!wl;B)Z")
	public boolean method4180(@OriginalArg(0) Interface11 arg0) {
		@Pc(16) int local16;
		if (this.anInt4410 == -1) {
			if (this.anInt4433 == -1) {
				return true;
			}
			local16 = arg0.method5778(this.anInt4433);
		} else {
			local16 = arg0.method5777(this.anInt4410);
		}
		if (local16 < this.anInt4407 || local16 > this.anInt4404) {
			return false;
		}
		@Pc(57) int local57;
		if (this.anInt4411 == -1) {
			if (this.anInt4435 == -1) {
				return true;
			}
			local57 = arg0.method5778(this.anInt4435);
		} else {
			local57 = arg0.method5777(this.anInt4411);
		}
		return this.anInt4427 <= local57 && this.anInt4439 >= local57;
	}

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(BLclient!bt;)V")
	public void decode(@OriginalArg(1) Packet buf) {
		while (true) {
			@Pc(5) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(code, buf);
		}
	}

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(BLclient!wm;)Lclient!jd;")
	public Sprite method4183(@OriginalArg(1) Renderer arg0) {
		@Pc(28) Sprite local28 = (Sprite) this.aClass125_2.elementCache.get((long) (this.anInt4413 | 0x20000 | arg0.anInt2836 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass125_2.configClient.requestDownload(this.anInt4413);
		@Pc(48) SpriteData local48 = Static396.method1682(this.aClass125_2.configClient, this.anInt4413, 0);
		if (local48 != null) {
			local28 = arg0.createSprite(local48);
			this.aClass125_2.elementCache.put((long) (this.anInt4413 | 0x20000 | arg0.anInt2836 << 29), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method4185(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			@Pc(22) StringWrapper local22 = (StringWrapper) this.params.getNode((long) arg0);
			return local22 == null ? arg1 : local22.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(IILclient!bt;)V")
	private void decode(@OriginalArg(0) int code, @OriginalArg(2) Packet buf) {
		if (code == 1) {
			this.sprite = buf.g2();
		} else if (code == 2) {
			this.anInt4438 = buf.g2();
		} else if (code == 3) {
			this.text = buf.gjstr();
		} else if (code == 4) {
			this.anInt4431 = buf.g3();
		} else if (code == 5) {
			this.anInt4406 = buf.g3();
		} else if (code == 6) {
			this.textSize = buf.g1();
		} else {
			@Pc(57) int local57;
			if (code == 7) {
				local57 = buf.g1();
				if ((local57 & 0x1) == 0) {
					this.aBoolean305 = false;
				}
				if ((local57 & 0x2) == 2) {
					this.aBoolean304 = true;
				}
			} else if (code == 8) {
				this.aBoolean303 = buf.g1() == 1;
			} else if (code == 9) {
				this.anInt4433 = buf.g2();
				if (this.anInt4433 == 65535) {
					this.anInt4433 = -1;
				}
				this.anInt4410 = buf.g2();
				if (this.anInt4410 == 65535) {
					this.anInt4410 = -1;
				}
				this.anInt4407 = buf.g4();
				this.anInt4404 = buf.g4();
			} else if (code >= 10 && code <= 14) {
				this.aStringArray41[code - 10] = buf.gjstr();
			} else {
				@Pc(196) int local196;
				if (code == 15) {
					int length = buf.g1();
					this.anIntArray290 = new int[length * 2];
					for (int index = 0; index < length * 2; index++) {
						this.anIntArray290[index] = buf.g2s();
					}
					this.anInt4422 = buf.g4();
					this.anInt4414 = buf.g4();
				} else if (code == 16) {
					this.aBoolean302 = false;
				} else if (code == 17) {
					this.aString49 = buf.gjstr();
				} else if (code == 18) {
					this.anInt4413 = buf.g2();
				} else if (code == 19) {
					this.category = buf.g2();
				} else if (code == 20) {
					this.anInt4435 = buf.g2();
					if (this.anInt4435 == 65535) {
						this.anInt4435 = -1;
					}
					this.anInt4411 = buf.g2();
					if (this.anInt4411 == 65535) {
						this.anInt4411 = -1;
					}
					this.anInt4427 = buf.g4();
					this.anInt4439 = buf.g4();
				} else if (code == 21) {
					this.anInt4417 = buf.g4();
				} else if (code == 22) {
					this.anInt4437 = buf.g4();
				} else if (code == 249) {
					int length = buf.g1();
					if (this.params == null) {
						local196 = Static162.bitCeil(length);
						this.params = new HashTable(local196);
					}
					for (int index = 0; index < length; index++) {
						@Pc(215) boolean local215 = buf.g1() == 1;
						@Pc(219) int local219 = buf.g3();
						@Pc(228) Node node;
						if (local215) {
							node = new StringWrapper(buf.gjstr());
						} else {
							node = new IntWrapper(buf.g4());
						}
						this.params.pushNode(node, (long) local219);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(I)V")
	public void postDecode() {
		if (this.anIntArray290 == null) {
			return;
		}
		for (@Pc(19) int index = 0; index < this.anIntArray290.length; index += 2) {
			if (this.anIntArray290[index] < this.anInt4434) {
				this.anInt4434 = this.anIntArray290[index];
			} else if (this.anIntArray290[index] > this.anInt4419) {
				this.anInt4419 = this.anIntArray290[index];
			}
			if (this.anIntArray290[index + 1] < this.anInt4432) {
				this.anInt4432 = this.anIntArray290[index + 1];
			} else if (this.anIntArray290[index + 1] > this.anInt4428) {
				this.anInt4428 = this.anIntArray290[index + 1];
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(IIZ)I")
	public int method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			@Pc(25) IntWrapper local25 = (IntWrapper) this.params.getNode((long) arg1);
			return local25 == null ? arg0 : local25.value;
		}
	}

	@OriginalMember(owner = "com.jagex.client!np", name = "a", descriptor = "(Lclient!wm;ZZ)Lclient!jd;")
	public Sprite method4189(@OriginalArg(0) Renderer arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg1 ? this.anInt4438 : this.sprite;
		@Pc(24) int local24 = local17 | arg0.anInt2836 << 29;
		@Pc(33) Sprite local33 = (Sprite) this.aClass125_2.elementCache.get((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass125_2.configClient.requestDownload(local17)) {
			@Pc(53) SpriteData local53 = Static396.method1682(this.aClass125_2.configClient, local17, 0);
			if (local53 != null) {
				local33 = arg0.createSprite(local53);
				this.aClass125_2.elementCache.put((long) local24, local33);
			}
			return local33;
		} else {
			return null;
		}
	}
}
