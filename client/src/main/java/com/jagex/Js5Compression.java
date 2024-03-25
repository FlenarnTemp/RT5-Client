package com.jagex;

import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Js5Compression {

	@OriginalMember(owner = "com.jagex.client!com.jagex.client", name = "fb", descriptor = "I")
	public static final int MAX_LENGTH = 0;
	@OriginalMember(owner = "com.jagex.client!fa", name = "e", descriptor = "Lclient!hg;")
	public static final GzipDecompressor GZIP_DECOMPRESSOR = new GzipDecompressor();

	@OriginalMember(owner = "com.jagex.client!jg", name = "a", descriptor = "([BI)[B")
	public static byte[] uncompress(@OriginalArg(0) byte[] src) {
		@Pc(8) Packet buf = new Packet(src);
		@Pc(12) int type = buf.g1();
		@Pc(23) int len = buf.g4();
		if (len < 0 || MAX_LENGTH != 0 && MAX_LENGTH < len) {
			throw new RuntimeException("ctype=" + type + " clen=" + len + " maxsize=" + MAX_LENGTH);
		} else if (type == 0) {
			@Pc(45) byte[] bytes = new byte[len];
			buf.gdata(bytes, len);
			return bytes;
		} else {
			@Pc(57) int unpackedLength = buf.g4();
			if (unpackedLength < 0 || MAX_LENGTH != 0 && MAX_LENGTH < unpackedLength) {
				throw new RuntimeException("ctype=" + type + " clen=" + len + " ulen=" + unpackedLength + " maxsize=" + MAX_LENGTH);
			}
			@Pc(71) byte[] bytes = new byte[unpackedLength];
			if (type == 1) {
				BZip2InputStream.bunzip2(bytes, unpackedLength, src, len);
			} else {
				GZIP_DECOMPRESSOR.gunzip(bytes, buf);
			}
			return bytes;
		}
	}

}
