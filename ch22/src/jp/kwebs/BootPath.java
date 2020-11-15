package jp.kwebs;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Locale;

public class BootPath {
	public static final String get(Class<?> classs) {
		String path = classs.getProtectionDomain().getCodeSource().getLocation().getFile();
		try {
			path = URLDecoder.decode(path, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return isWindows() ? path.substring(1) : path;
	}

	public static final String get(Class<?> classs, String charset) {
		String path = classs.getProtectionDomain().getCodeSource().getLocation().getFile();
		try {
			path = URLDecoder.decode(path, charset);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return isWindows() ? path.substring(1) : path;
	}

	public static boolean isWindows() {
		String os = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
		return os.indexOf("win") >= 0;
	}

	// Test
	public static void main(String[] args) {
		System.out.println(BootPath.get(BootPath.class));

	}
}
