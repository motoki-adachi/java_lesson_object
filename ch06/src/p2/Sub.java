package p2;						// SubはObjとは別のパッケージにある
import p1.Obj;

public class Sub extends Obj {	// SubはObjのサブクラス
	public void print() {
		System.out.println(number);	// numberを表示する
	}
}
