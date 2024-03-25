package com.jagex.game.config.questtype;

import com.jagex.HashTable;
import com.jagex.Static162;
import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.StringWrapper;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!ud")
public final class QuestType {

	@OriginalMember(owner = "com.jagex.client!ud", name = "a", descriptor = "Ljava/lang/String;")
	private String sortname;

	@OriginalMember(owner = "com.jagex.client!ud", name = "d", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "com.jagex.client!ud", name = "f", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "com.jagex.client!ud", name = "i", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "com.jagex.client!ud", name = "j", descriptor = "[I")
	private int[] varbitsrequirement;

	@OriginalMember(owner = "com.jagex.client!ud", name = "m", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "com.jagex.client!ud", name = "n", descriptor = "Ljava/lang/String;")
	private String name;

	@OriginalMember(owner = "com.jagex.client!ud", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] varbitdescriptions;

	@OriginalMember(owner = "com.jagex.client!ud", name = "p", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "com.jagex.client!ud", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] varpsdescription;

	@OriginalMember(owner = "com.jagex.client!ud", name = "s", descriptor = "[I")
	private int[] varpsrequirement;

	@OriginalMember(owner = "com.jagex.client!ud", name = "u", descriptor = "Lclient!ad;")
	private HashTable params;

	@OriginalMember(owner = "com.jagex.client!ud", name = "v", descriptor = "[I")
	private int[] questrequirements;

	@OriginalMember(owner = "com.jagex.client!ud", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "com.jagex.client!ud", name = "y", descriptor = "[[I")
	private int[][] statrequirements;

	@OriginalMember(owner = "com.jagex.client!ud", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "com.jagex.client!ud", name = "l", descriptor = "I")
	public int anInt6454 = -1;

	@OriginalMember(owner = "com.jagex.client!ud", name = "a", descriptor = "(BLclient!bt;)V")
	public void decode(@OriginalArg(1) Packet buf) {
		while (true) {
			@Pc(13) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@OriginalMember(owner = "com.jagex.client!ud", name = "a", descriptor = "(BLclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet buf, @OriginalArg(2) int code) {
		if (code == 1) {
			this.name = buf.gjstr2();
		} else if (code == 2) {
			this.sortname = buf.gjstr2();
		} else if (code == 3) {
			int length = buf.g1();
			this.anIntArrayArray55 = new int[length][3];
			for (int index = 0; index < length; index++) {
				this.anIntArrayArray55[index][0] = buf.g2();
				this.anIntArrayArray55[index][1] = buf.g4();
				this.anIntArrayArray55[index][2] = buf.g4();
			}
		} else if (code == 4) {
			int length = buf.g1();
			this.anIntArrayArray57 = new int[length][3];
			for (int index = 0; index < length; index++) {
				this.anIntArrayArray57[index][0] = buf.g2();
				this.anIntArrayArray57[index][1] = buf.g4();
				this.anIntArrayArray57[index][2] = buf.g4();
			}
		} else if (code == 5) {
			buf.g2();
		} else if (code == 6) {
			buf.g1();
		} else if (code == 7) {
			buf.g1();
		} else if (code == 9) {
			buf.g1();
		} else if (code == 10) {
			int length = buf.g1();
			this.anIntArray436 = new int[length];
			for (int index = 0; index < length; index++) {
				this.anIntArray436[index] = buf.g4();
			}
		} else if (code == 12) {
			buf.g4();
		} else if (code == 13) {
			int length = buf.g1();
			this.questrequirements = new int[length];
			for (int index = 0; index < length; index++) {
				this.questrequirements[index] = buf.g2();
			}
		} else if (code == 14) {
			int length = buf.g1();
			this.statrequirements = new int[length][2];
			for (int index = 0; index < length; index++) {
				this.statrequirements[index][0] = buf.g1();
				this.statrequirements[index][1] = buf.g1();
			}
		} else if (code == 15) {
			buf.g2();
		} else if (code == 17) {
			this.anInt6454 = buf.g2();
		} else if (code == 18) {
			int lengths = buf.g1();
			this.anIntArray437 = new int[lengths];
			this.anIntArray440 = new int[lengths];
			this.varpsrequirement = new int[lengths];
			this.varpsdescription = new String[lengths];
			for (int index = 0; index < lengths; index++) {
				this.varpsrequirement[index] = buf.g4();
				this.anIntArray440[index] = buf.g4();
				this.anIntArray437[index] = buf.g4();
				this.varpsdescription[index] = buf.gjstr();
			}
		} else if (code == 19) {
			int length = buf.g1();
			this.anIntArray441 = new int[length];
			this.varbitdescriptions = new String[length];
			this.varbitsrequirement = new int[length];
			this.anIntArray438 = new int[length];
			for (int index = 0; index < length; index++) {
				this.varbitsrequirement[index] = buf.g4();
				this.anIntArray438[index] = buf.g4();
				this.anIntArray441[index] = buf.g4();
				this.varbitdescriptions[index] = buf.gjstr();
			}
		} else if (code == 249) {
			int length = buf.g1();
			if (this.params == null) {
				int size = Static162.bitCeil(length);
				this.params = new HashTable(size);
			}
			for (int index = 0; index < length; index++) {
				@Pc(329) boolean isString = buf.g1() == 1;
				@Pc(333) int local333 = buf.g3();
				@Pc(342) Node node;
				if (isString) {
					node = new StringWrapper(buf.gjstr());
				} else {
					node = new IntWrapper(buf.g4());
				}
				this.params.pushNode(node, (long) local333);
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!ud", name = "a", descriptor = "(B)V")
	public void postDecode() {
		if (this.sortname == null) {
			this.sortname = this.name;
		}
	}
}