package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConstructorExample {
	public static void main(String[] args) throws IOException {
		
		// ファイルをbyte配列として読み込む
		byte[] bytes = Files.readAllBytes(Paths.get("sample.html"));
		
		// byte配列から文字列を作成して表示する
		String str = new String(bytes, "UTF-8");
		System.out.println(str);
		
	}
	
	
}
