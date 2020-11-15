package sample;
public class Escape {
	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception e) {
			System.out.println("main:★例外が発生しました");
		}
	}

	public static void foo() throws Exception {  // 例外をかわす
		bar();
	}

	public static void bar() throws Exception {
		throw new Exception();
	}
}