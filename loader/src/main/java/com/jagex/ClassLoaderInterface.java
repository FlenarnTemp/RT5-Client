package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("com.jagex.loader!h")
public interface ClassLoaderInterface {

	@OriginalMember(owner = "com.jagex.loader!h", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException;

	@OriginalMember(owner = "com.jagex.loader!h", name = "loadClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0) throws ClassNotFoundException;

	@OriginalMember(owner = "com.jagex.loader!h", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)V")
	void method6513(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1);
}
