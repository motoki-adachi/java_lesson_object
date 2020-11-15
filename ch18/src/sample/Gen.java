package sample;
class Gen {								// クラスは総称型ではない
	public <T> void display(T obj) {	// displayメソッドだけ総称型にする
		System.out.println(obj);
	}
	// インスタンスを作って試す
	public static void main(String[] args) {
		Gen gen = new Gen(); 	// インスタンスは普通に作成する
		gen.display("aaa"); 	// 総称型の引数は型指定しないので、
		gen.display(123); 		// どんな型でもOKになる
	}
}
