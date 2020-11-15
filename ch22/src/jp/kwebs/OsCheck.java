package jp.kwebs;
import java.util.Locale;

public final class OsCheck {

	private static String OS;
	static {
		OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
	}

	public static OSType os() {

		if((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
			return OSType.MAC;
		} else if(OS.indexOf("win") >= 0) {
			return OSType.WINDOWS;
		} else if(OS.indexOf("nux") >= 0) {
			return OSType.LINUX;
		} else {
			return OSType.OTHER;
		}
	}

	public static boolean isWindows() {
		return OS.indexOf("win") >= 0;
	}

	public static boolean isLinux() {
		return OS.indexOf("nux") >= 0;
	}

	public static boolean isMac() {
		return OS.indexOf("mac") >= 0 || OS.indexOf("darwin") >= 0;
	}
}