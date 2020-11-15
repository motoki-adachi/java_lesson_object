package sample;

class Foo {
	public void show() {							// 元のshowメソッド
		System.out.println("Fooクラスです");
	}
}

class Bar extends Foo {
	@Override
	public void show() {							// オーバーライドしたshowメソッド
		System.out.println("Barクラスです");
	}
}

public class Exec {
	public static void main(String[] args) {
		Foo foo = new Bar();					// スーパークラス型の変数に代入する
		foo.show();							// showメソッドを実行
	}
}
