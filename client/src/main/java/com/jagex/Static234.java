package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "com.jagex.client!ni", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "com.jagex.client!ni", name = "a", descriptor = "(Lclient!ml;ILjava/lang/String;I)Lclient!cc;")
	public static PrivilegedRequest method4095(@OriginalArg(0) Signlink arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.openUrl(arg2);
		}
		@Pc(79) PrivilegedRequest local79;
		if (arg1 == 2) {
			try {
				arg0.applet.getAppletContext().showDocument(new URL(arg0.applet.getCodeBase(), arg2), "_blank");
				local79 = new PrivilegedRequest();
				local79.status = 1;
				return local79;
			} catch (@Pc(85) Exception local85) {
				local79 = new PrivilegedRequest();
				local79.status = 2;
				return local79;
			}
		} else if (arg1 == 3) {
			try {
				BrowserControl.call(arg0.applet, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg0.applet.getAppletContext().showDocument(new URL(arg0.applet.getCodeBase(), arg2), "_top");
				local79 = new PrivilegedRequest();
				local79.status = 1;
				return local79;
			} catch (@Pc(127) Exception local127) {
				local79 = new PrivilegedRequest();
				local79.status = 2;
				return local79;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

}
