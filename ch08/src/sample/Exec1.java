package sample;
class Foo {	// スーパークラス
	public void show() {							// 元のshowメソッド
		System.out.println("Fooクラスです");
	}
}

class Bar extends Foo {	// サブクラス
	@Override
	public void show() {							// オーバーライドしたshowメソッド
		System.out.println("Barクラスです");
	}
}

public class Exec1 {
	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.show();							// Barクラスのshowメソッドを実行する
	}
}
