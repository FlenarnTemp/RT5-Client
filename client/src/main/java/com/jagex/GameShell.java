package com.jagex;

import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("com.jagex.client!un")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "com.jagex.client!ms", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame frame;
	@OriginalMember(owner = "com.jagex.client!tb", name = "W", descriptor = "Lclient!ml;")
	public static Signlink signlink;
	@OriginalMember(owner = "com.jagex.client!og", name = "a", descriptor = "I")
	public static int canvasWidth;
	@OriginalMember(owner = "com.jagex.client!ju", name = "T", descriptor = "I")
	public static int canvasHeight;
	@OriginalMember(owner = "com.jagex.client!be", name = "m", descriptor = "Ljava/awt/Canvas;")
	public static Canvas canvas;
	@OriginalMember(owner = "com.jagex.client!vf", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame fullScreenFrame;
	@OriginalMember(owner = "com.jagex.client!rs", name = "h", descriptor = "I")
	public static int maxMemory = 64;
	@OriginalMember(owner = "com.jagex.client!nr", name = "g", descriptor = "Z")
	public static boolean focus;
	@OriginalMember(owner = "com.jagex.client!ts", name = "s", descriptor = "Z")
	public static boolean prevFocus = true;
	@OriginalMember(owner = "com.jagex.client!ia", name = "n", descriptor = "I")
	public static int frameWidth;
	@OriginalMember(owner = "com.jagex.client!kf", name = "c", descriptor = "I")
	public static int frameHeight;
	@OriginalMember(owner = "com.jagex.client!eo", name = "f", descriptor = "I")
	public static int leftMargin = 0;
	@OriginalMember(owner = "com.jagex.client!oj", name = "f", descriptor = "Lclient!un;")
	public static GameShell applet = null;
	@OriginalMember(owner = "com.jagex.client!q", name = "p", descriptor = "I")
	public static int clientRevision;
	@OriginalMember(owner = "com.jagex.client!dt", name = "j", descriptor = "I")
	public static int topMargin = 0;
	@OriginalMember(owner = "com.jagex.client!wr", name = "d", descriptor = "Lclient!ml;")
	public static Signlink signlink2;
	private static double canvasScale;

	@OriginalMember(owner = "com.jagex.client!un", name = "w", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "com.jagex.client!un", name = "j", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "com.jagex.client!un", name = "providesignlink", descriptor = "(Lclient!ml;)V")
	public static void providesignlink(@OriginalArg(0) Signlink arg0) {
		signlink = arg0;
		signlink2 = arg0;
	}

	@OriginalMember(owner = "com.jagex.client!ia", name = "a", descriptor = "(B)V")
	public static void resetTimer() {
		Static316.aClass5_1.method4408();
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			Static357.aLongArray12[local12] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static292.aLongArray9[local24] = 0L;
		}
		Static10.anInt247 = 0;
	}

    @OriginalMember(owner = "com.jagex.client!ju", name = "a", descriptor = "(Ljava/awt/Color;IZILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
    public static void method3290(@OriginalArg(0) Color arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) Color arg5) {
        try {
            @Pc(6) Graphics local6 = canvas.getGraphics();
            if (LoadingBarAwt.aFont3 == null) {
                LoadingBarAwt.aFont3 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                local6.setColor(Color.black);
                local6.fillRect(0, 0, canvasWidth, canvasHeight);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (LoadingBarAwt.anImage1 == null) {
                    LoadingBarAwt.anImage1 = canvas.createImage(304, 34);
                }
                @Pc(68) Graphics local68 = LoadingBarAwt.anImage1.getGraphics();
                local68.setColor(arg0);
                local68.drawRect(0, 0, 303, 33);
                local68.setColor(arg5);
                local68.fillRect(2, 2, arg2 * 3, 30);
                local68.setColor(Color.black);
                local68.drawRect(1, 1, 301, 31);
                local68.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                local68.setFont(LoadingBarAwt.aFont3);
                local68.setColor(arg4);
                local68.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
                local6.drawImage(LoadingBarAwt.anImage1, canvasWidth / 2 - 152, canvasHeight / 2 + -18, null);
            } catch (@Pc(146) Exception local146) {
                @Pc(152) int local152 = canvasWidth / 2 - 152;
                @Pc(158) int local158 = canvasHeight / 2 - 18;
                local6.setColor(arg0);
                local6.drawRect(0, 0, 303, 33);
                local6.setColor(arg5);
                local6.fillRect(local152 + 2, local158 - -2, arg2 * 3, 30);
                local6.setColor(Color.black);
                local6.drawRect(local152 + 1, local158 + 1, 301, 31);
                local6.fillRect(arg2 * 3 + local152 + 2, local158 + 2, 300 - arg2 * 3, 30);
                local6.setFont(LoadingBarAwt.aFont3);
                local6.setColor(arg4);
                local6.drawString(arg3, local152 + (304 - arg3.length() * 6) / 2, local158 + 22);
            }
            if (Static290.aString56 != null) {
                local6.setFont(LoadingBarAwt.aFont3);
                local6.setColor(arg4);
                local6.drawString(Static290.aString56, canvasWidth / 2 - Static290.aString56.length() * 6 / 2, canvasHeight / 2 + -26);
            }
        } catch (@Pc(267) Exception local267) {
            canvas.repaint();
        }
    }

    @OriginalMember(owner = "com.jagex.client!un", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "a", descriptor = "(I)V")
	public final synchronized void method1379() {
		if (canvas != null) {
			canvas.removeFocusListener(this);
			canvas.getParent().remove(canvas);
		}
		@Pc(18) Container local18;
		if (fullScreenFrame != null) {
			local18 = fullScreenFrame;
		} else if (frame == null) {
			local18 = signlink.applet;
		} else {
			local18 = frame;
		}
		local18.setLayout(null);
		canvas = new GameCanvas(this);
		local18.add(canvas);
		canvas.setSize(canvasWidth, canvasHeight);
		canvas.setVisible(true);
		if (local18 == frame) {
			@Pc(54) Insets local54 = frame.getInsets();
			canvas.setLocation(local54.left + leftMargin, local54.top + topMargin);
		} else {
			canvas.setLocation(leftMargin, topMargin);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		Static371.aBoolean475 = true;
		focus = true;
		Static328.aBoolean412 = true;
		Static122.aBoolean176 = false;
		Static48.aLong37 = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "b", descriptor = "(I)V")
	public final void method1382() {
		if (this.aBoolean94) {
			return;
		}
		try {
			@Pc(21) PrivilegedRequest local21 = signlink.loadMiscNatives(applet.getClass());
			while (local21.status == 0) {
				ThreadUtils.sleep(100L);
			}
			if (local21.result != null) {
				throw (Throwable) local21.result;
			}
			jagmisc.init();
			this.aBoolean94 = true;
			Static316.aClass5_1 = Timer.create();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	protected final void startApplication(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			leftMargin = 0;
			applet = this;
			clientRevision = 578;
			canvasWidth = 765;
			frameWidth = 765;
			canvasHeight = 503;
			frameHeight = 503;
			topMargin = 0;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(true);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			@Pc(48) Insets local48 = frame.getInsets();
			frame.setSize(local48.right + local48.left + frameWidth, local48.bottom + local48.top + frameHeight);
			signlink2 = signlink = new Signlink(null, arg1, arg0, 29);
			@Pc(82) PrivilegedRequest local82 = signlink.startThread(1, this);
			while (local82.status == 0) {
				ThreadUtils.sleep(10L);
			}
		} catch (@Pc(95) Exception local95) {
			TracingException.report(local95, null);
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "a", descriptor = "(Z)V")
	protected abstract void mainLogic();

	@OriginalMember(owner = "com.jagex.client!un", name = "c", descriptor = "(I)V")
	protected abstract void mainLoop();

	@OriginalMember(owner = "com.jagex.client!un", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getCodeBase() : signlink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "com.jagex.client!un", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "d", descriptor = "(I)V")
	protected abstract void method1386();

	@OriginalMember(owner = "com.jagex.client!un", name = "b", descriptor = "(B)V")
	protected abstract void method1387();

	@OriginalMember(owner = "com.jagex.client!un", name = "e", descriptor = "(I)Z")
	protected final boolean isHostnameValid() {
		return true;
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getParameter(arg0) : signlink.applet.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "c", descriptor = "(B)V")
	protected abstract void method1389();

	@OriginalMember(owner = "com.jagex.client!un", name = "f", descriptor = "(I)V")
	private void method1390() {
		@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
		@Pc(15) long local15 = Static292.aLongArray9[Static255.anInt4703];
		Static292.aLongArray9[Static255.anInt4703] = local11;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static255.anInt4703 = Static255.anInt4703 + 1 & 0x1F;
		synchronized (this) {
			focus = Static371.aBoolean475;
		}
		this.mainLogic();
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "g", descriptor = "(I)V")
	private void method1391() {
		@Pc(6) long local6 = MonotonicClock.currentTimeMillis();
		@Pc(10) long local10 = Static357.aLongArray12[Static76.anInt1739];
		Static357.aLongArray12[Static76.anInt1739] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(29) int local29 = (int) (local6 - local10);
			Static3.anInt62 = ((local29 >> 1) + 32000) / local29;
		}
		Static76.anInt1739 = Static76.anInt1739 + 1 & 0x1F;
		if (Static210.anInt3761++ > 50) {
			Static328.aBoolean412 = true;
			Static210.anInt3761 -= 50;
			canvas.setSize(canvasWidth, canvasHeight);
			canvas.setVisible(true);
			if (frame != null && fullScreenFrame == null) {
				@Pc(76) Insets local76 = frame.getInsets();
				canvas.setLocation(local76.left + leftMargin, topMargin + local76.top);
			} else {
				canvas.setLocation(leftMargin, topMargin);
			}
		}
		this.mainLoop();
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (applet == this && !Static111.aBoolean167) {
			Static393.aLong231 = MonotonicClock.currentTimeMillis();
			ThreadUtils.sleep(5000L);
			signlink2 = null;
			this.method1395(false);
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1392(@OriginalArg(1) String arg0) {
		if (this.aBoolean95) {
			return;
		}
		this.aBoolean95 = true;
		System.out.println("error_game_" + arg0);
		try {
			BrowserControl.call(signlink.applet, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getDocumentBase() : signlink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "a", descriptor = "(IIIII)V")
	protected final void startApplet(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (applet == null) {
				canvasHeight = arg2;
				frameHeight = arg2;
				clientRevision = 578;
				leftMargin = 0;
				applet = this;
				topMargin = 0;
				canvasWidth = arg0;
				frameWidth = arg0;
				if (signlink == null) {
					signlink2 = signlink = new Signlink(this, arg1, null, 0);
				}
				@Pc(66) PrivilegedRequest local66 = signlink.startThread(1, this);
				while (local66.status == 0) {
					ThreadUtils.sleep(10L);
				}
			} else {
				Static373.anInt7032++;
				if (Static373.anInt7032 >= 3) {
					this.method1392("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Exception local76) {
			TracingException.report(local76, null);
			this.method1392("crash");
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "a", descriptor = "(BZ)V")
	private void method1395(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static111.aBoolean167) {
				return;
			}
			Static111.aBoolean167 = true;
		}
		if (signlink.applet != null) {
			signlink.applet.destroy();
		}
		try {
			this.method1386();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean94) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean94 = false;
		}
		@Pc(48) PrivilegedRequest local48 = signlink.unloadNatives(applet.getClass());
		while (local48.status == 0) {
			ThreadUtils.sleep(100L);
		}
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				canvas.getParent().remove(canvas);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (signlink != null) {
			try {
				signlink.stop();
			} catch (@Pc(75) Exception local75) {
			}
		}
		this.method1389();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable local89) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getAppletContext() : signlink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static371.aBoolean475 = false;
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Signlink.javaVendor != null) {
					@Pc(10) String local10 = Signlink.javaVendor.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Signlink.javaVersion;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1392("wrongjava");
							break label113;
						}
					} else if (local10.indexOf("ibm") != -1 && (Signlink.javaVersion == null || Signlink.javaVersion.equals("1.4.2"))) {
						this.method1392("wrongjava");
						break label113;
					}
				}
				@Pc(70) int local70;
				if (Signlink.javaVersion != null && Signlink.javaVersion.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Signlink.javaVersion.length()) {
						@Pc(78) char local78 = Signlink.javaVersion.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local78 + local72 * 10 - 48;
						local70++;
					}
					if (local72 >= 5) {
						Static370.aBoolean473 = true;
					}
				}
				if (signlink.applet != null) {
					@Pc(111) Method local111 = Signlink.setFocusCycleRoot;
					if (local111 != null) {
						try {
							local111.invoke(signlink.applet, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static57.method1620();
				Static60.method886();
				this.method1379();
				this.method1387();
				Static316.aClass5_1 = Timer.create();
				this.method1382();
				while (Static393.aLong231 == 0L || MonotonicClock.currentTimeMillis() < Static393.aLong231) {
					Static10.anInt247 = Static316.aClass5_1.sleep(Static44.anInt1106);
					for (local70 = 0; local70 < Static10.anInt247; local70++) {
						this.method1390();
					}
					this.method1391();
					Static283.method4876(signlink, canvas);
				}
			}
		} catch (@Pc(179) Exception local179) {
			TracingException.report(local179, null);
			this.method1392("crash");
		}
		this.method1395(true);
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static371.aBoolean475 = true;
		Static328.aBoolean412 = true;
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (applet == this && !Static111.aBoolean167) {
			Static393.aLong231 = 0L;
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (applet != this || Static111.aBoolean167) {
			return;
		}
		Static328.aBoolean412 = true;
		if (Static370.aBoolean473 && MonotonicClock.currentTimeMillis() - Static48.aLong37 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || frameWidth <= local26.width && frameHeight <= local26.height) {
				Static122.aBoolean176 = true;
			}
		}
	}

	@OriginalMember(owner = "com.jagex.client!un", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (applet == this && !Static111.aBoolean167) {
			Static393.aLong231 = MonotonicClock.currentTimeMillis() + 4000L;
		}
	}
}
