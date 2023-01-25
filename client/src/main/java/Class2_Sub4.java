import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!bt", name = "kb", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
	public int anInt5300;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray73 = Static48.method1465(arg0);
		this.anInt5300 = 0;
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Class2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.anInt5300 = 0;
		this.aByteArray73 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)J")
	public final long method4797() {
		@Pc(10) long local10 = (long) this.method4835() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.method4835() & 0xFFFFFFFFL;
		return local19 + (local10 << 32);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIIZ)V")
	public final void method4798(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray73[this.anInt5300++];
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	public final int method4799() {
		this.anInt5300 += 2;
		@Pc(38) int local38 = (this.aByteArray73[this.anInt5300 - 1] - 128 & 0xFF) + ((this.aByteArray73[this.anInt5300 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)B")
	public final byte method4800() {
		return (byte) -this.aByteArray73[this.anInt5300++];
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	public final int method4801(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static80.method5980(this.anInt5300, arg0, this.aByteArray73);
		this.method4812(local18);
		return local18;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)I")
	public final int method4802() {
		this.anInt5300 += 2;
		return (this.aByteArray73[this.anInt5300 - 2] & 0xFF) + ((this.aByteArray73[this.anInt5300 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	public final int method4803() {
		return -this.aByteArray73[this.anInt5300++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public final void method4804(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	public final int method4805() {
		this.anInt5300 += 2;
		return (this.aByteArray73[this.anInt5300 - 1] - 128 & 0xFF) + ((this.aByteArray73[this.anInt5300 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJ)V")
	public final void method4806(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local2 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray73[this.anInt5300++] = (byte) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)Z")
	public final boolean method4807() {
		this.anInt5300 -= 4;
		@Pc(23) int local23 = Static80.method5980(this.anInt5300, 0, this.aByteArray73);
		@Pc(27) int local27 = this.method4835();
		return local27 == local23;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method4808() {
		@Pc(14) int local14 = this.anInt5300;
		while (this.aByteArray73[this.anInt5300++] != 0) {
		}
		@Pc(37) int local37 = this.anInt5300 - local14 - 1;
		return local37 == 0 ? "" : Static47.method1462(local14, this.aByteArray73, local37);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)I")
	public final int method4810() {
		return 128 - this.aByteArray73[this.anInt5300++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)I")
	public final int method4811() {
		@Pc(21) byte local21 = this.aByteArray73[this.anInt5300++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray73[this.anInt5300++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)V")
	public final void method4812(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V")
	public final void method4813(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)I")
	public final int method4814() {
		return this.aByteArray73[this.anInt5300++] & 0xFF;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)I")
	public final int method4815() {
		this.anInt5300 += 2;
		@Pc(33) int local33 = (this.aByteArray73[this.anInt5300 - 2] - 128 & 0xFF) + ((this.aByteArray73[this.anInt5300 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)I")
	public final int method4816() {
		@Pc(16) int local16 = this.aByteArray73[this.anInt5300] & 0xFF;
		return local16 >= 128 ? this.method4828() - 32768 : this.method4814();
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)I")
	public final int method4817() {
		@Pc(19) int local19 = this.aByteArray73[this.anInt5300] & 0xFF;
		return local19 >= 128 ? this.method4828() - 49152 : this.method4814() + -64;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	public final void method4818(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)V")
	public final void method4820(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int local16 = this.anInt5300;
		this.anInt5300 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method4835();
			@Pc(37) int local37 = this.method4835();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg0[local39 >>> 11 & 0x3] + local39 ^ (local33 >>> 5 ^ local33 << 4) + local33;
				local39 -= -1640531527;
				local33 -= (local37 >>> 5 ^ local37 << 4) + local37 ^ arg0[local39 & 0x3] + local39;
			}
			this.anInt5300 -= 8;
			this.method4812(local33);
			this.method4812(local37);
		}
		this.anInt5300 = local16;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4821(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt5300 += Static350.method5838(arg0.length(), arg0, this.aByteArray73, this.anInt5300);
		this.aByteArray73[this.anInt5300++] = 0;
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)I")
	public final int method4822() {
		this.anInt5300 += 2;
		@Pc(37) int local37 = ((this.aByteArray73[this.anInt5300 - 2] & 0xFF) << 8) + (this.aByteArray73[this.anInt5300 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BI)V")
	public final void method4823(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4841(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4842(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)B")
	public final byte method4824() {
		return this.aByteArray73[this.anInt5300++];
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V")
	public final void method4825(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5300 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5300 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(BI)V")
	public final void method4826(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)I")
	public final int method4828() {
		this.anInt5300 += 2;
		return ((this.aByteArray73[this.anInt5300 - 2] & 0xFF) << 8) + (this.aByteArray73[this.anInt5300 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)V")
	public final void method4829(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI)V")
	public final void method4830(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = this.aByteArray73[this.anInt5300++];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
	public final void method4831(@OriginalArg(1) long arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 56);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 48);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 40);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 32);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)I")
	public final int method4832() {
		this.anInt5300 += 3;
		return (this.aByteArray73[this.anInt5300 - 1] & 0xFF) + (((this.aByteArray73[this.anInt5300 - 3] & 0xFF) << 16) + ((this.aByteArray73[this.anInt5300 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4833(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5300;
		this.anInt5300 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4798(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local23.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt5300 = 0;
		this.method4841(local39.length);
		this.method4856(local39, local39.length);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)I")
	public final int method4834() {
		this.anInt5300 += 4;
		return ((this.aByteArray73[this.anInt5300 - 4] & 0xFF) << 16) + (((this.aByteArray73[this.anInt5300 - 3] & 0xFF) << 24) + ((this.aByteArray73[this.anInt5300 - 1] & 0xFF) << 8) + (this.aByteArray73[this.anInt5300 + -2] & 0xFF));
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)I")
	public final int method4835() {
		this.anInt5300 += 4;
		return ((this.aByteArray73[this.anInt5300 - 3] & 0xFF) << 16) + ((this.aByteArray73[this.anInt5300 - 4] & 0xFF) << 24) + ((this.aByteArray73[this.anInt5300 + -2] & 0xFF) << 8) + (this.aByteArray73[this.anInt5300 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(BI)V")
	public final void method4836(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V")
	public final void method4837(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 + 128);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)I")
	public final int method4838() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method4816();
		while (local16 == 32767) {
			local16 = this.method4816();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(BI)V")
	public final void method4839(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 24);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)B")
	public final byte method4840() {
		return (byte) (128 - this.aByteArray73[this.anInt5300++]);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public final void method4841(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	public final void method4842(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)I")
	public final int method4843() {
		this.anInt5300 += 4;
		return ((this.aByteArray73[this.anInt5300 - 1] & 0xFF) << 24) + ((this.aByteArray73[this.anInt5300 - 2] & 0xFF) << 16) + ((this.aByteArray73[this.anInt5300 + -3] & 0xFF) << 8) + (this.aByteArray73[this.anInt5300 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V")
	public final void method4844(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)V")
	public final void method4845(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(BI)V")
	public final void method4847(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) arg0;
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 16);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(BI)V")
	public final void method4848(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4841(arg0 >>> 28 | 0x80);
					}
					this.method4841(arg0 >>> 21 | 0x80);
				}
				this.method4841(arg0 >>> 14 | 0x80);
			}
			this.method4841(arg0 >>> 7 | 0x80);
		}
		this.method4841(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)I")
	public final int method4849() {
		this.anInt5300 += 2;
		@Pc(31) int local31 = (this.aByteArray73[this.anInt5300 - 2] & 0xFF) + ((this.aByteArray73[this.anInt5300 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V")
	public final void method4850(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)I")
	public final int method4851() {
		this.anInt5300 += 4;
		return ((this.aByteArray73[this.anInt5300 - 2] & 0xFF) << 24) + (((this.aByteArray73[this.anInt5300 - 1] & 0xFF) << 16) + (this.aByteArray73[this.anInt5300 - 4] << 8 & 0xFF00)) + (this.aByteArray73[this.anInt5300 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)I")
	public final int method4852() {
		this.anInt5300 += 2;
		return ((this.aByteArray73[this.anInt5300 - 1] & 0xFF) << 8) + (this.aByteArray73[this.anInt5300 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(B)B")
	public final byte method4853() {
		return (byte) (this.aByteArray73[this.anInt5300++] - 128);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IB)V")
	public final void method4854(@OriginalArg(0) int arg0) {
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 >> 8);
		this.aByteArray73[this.anInt5300++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method4855() {
		@Pc(14) byte local14 = this.aByteArray73[this.anInt5300++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt5300;
		while (this.aByteArray73[this.anInt5300++] != 0) {
		}
		@Pc(55) int local55 = this.anInt5300 - local27 - 1;
		return local55 == 0 ? "" : Static47.method1462(local27, this.aByteArray73, local55);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI[BI)V")
	public final void method4856(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			this.aByteArray73[this.anInt5300++] = arg0[local8];
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIII)V")
	public final void method4857(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray73[this.anInt5300++] - 128);
		}
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(B)Ljava/lang/String;")
	public final String method4858() {
		if (this.aByteArray73[this.anInt5300] == 0) {
			this.anInt5300++;
			return null;
		} else {
			return this.method4808();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)J")
	public final long method4859(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local2 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray73[this.anInt5300++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(ZI)V")
	public final void method4860(@OriginalArg(1) int arg0) {
		this.aByteArray73[this.anInt5300 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([II)V")
	public final void method4861(@OriginalArg(0) int[] arg0) {
		@Pc(17) int local17 = this.anInt5300 / 8;
		this.anInt5300 = 0;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(28) int local28 = this.method4835();
			@Pc(32) int local32 = this.method4835();
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local28 += local34 + arg0[local34 & 0x3] ^ local32 + (local32 >>> 5 ^ local32 << 4);
				local34 += -1640531527;
				local32 += local28 + (local28 >>> 5 ^ local28 << 4) ^ arg0[local34 >>> 11 & 0x3] + local34;
			}
			this.anInt5300 -= 8;
			this.method4812(local28);
			this.method4812(local32);
		}
	}

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(B)I")
	public final int method4862() {
		return this.aByteArray73[this.anInt5300++] - 128 & 0xFF;
	}
}
