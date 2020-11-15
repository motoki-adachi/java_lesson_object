package sample;
public class ExceptionMessage {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println(e.getMessage());// 例外メッセージを表示
		}
	}
	public static void method() throws Exception {
		throw new Exception("★例外が発生しました"); // メッセージ付き例外を投げる
	}
}