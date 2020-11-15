package sample;

public class Foo<T> { // クラス宣言に<T>を付ける
	private T obj; 	// フィールド変数の型

	public Foo(T obj) { // コンストラクタの引数の型
		this.obj = obj;
	}

	public T getObj() { // メソッドの戻り値の型
		return obj;
	}

	public void setObj(T obj) { // メソッドの引数の型
		this.obj = obj;
	}
}
