package sample;
import java.io.IOException;

public class ReplaceAllExample {
	public static void main(String[] args) throws IOException {

		String str = "<title>サンプル</title>";

		// < と > とその間の任意の文字列を空文字（""）に置き換える
		System.out.println( str.replaceAll("<.+?>", ""));
		
	}
}
