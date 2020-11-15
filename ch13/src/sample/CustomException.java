package sample;
public class CustomException {
	public static void main(String[] args) {
		try {
			method();
		} catch (MyException e) {
			System.out.println(e.getMessage());		// 例外メッセージを表示
		}
	}

	public static void method() throws MyException {
		throw new MyException("★例外が発生しました");	// メッセージ付き例外を投げる
	}
}
