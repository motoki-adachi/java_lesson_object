package sample;
public class ThrowException {
	public static void main(String[] args) {
		try {
			sub();
		} catch (Exception e) {
			System.out.println("★例外が発生しました");// 例外処理
		}
	}
	public static void sub() throws Exception {
		throw new Exception(); // チェック例外を投げる
	}
}