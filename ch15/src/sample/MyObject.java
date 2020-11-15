package sample;
import java.io.Serializable;
import java.time.LocalDate;

class MyObject implements Serializable {
	private static final long serialVersionUID = 10L;	// バージョン番号	

	private static int counter = 100;	// 保存されない（インスタンスに含まれてない）
	private double value;					// プリミティブ型は保存される 
	private LocalDate date;				// Selializableを実装しているので保存される
	private YourObject obj;				// Selializableを実装していれば保存される
	private transient Foo flag;			// 保存されない（保存の対象からはずされる）
	//

	public MyObject(double value, LocalDate date, YourObject obj, Foo flag) {
		this.value = value;
		this.date = date;
		this.obj = obj;
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "MyObject [value=" + value + ", date=" + date + ", obj=" + obj + ", flag=" + flag + "]" +
				"counter=" + counter;
	}

}

// ダミークラス
class YourObject implements Serializable {
	private int number;

	public YourObject(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "YourObject [number=" + number + "]";
	}

}
// ダミークラス
class Foo {
	private int flag;

	public Foo(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Foo [flag=" + flag + "]";
	}

}
