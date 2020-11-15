package sample;
import jp.kwebs.Input;
public class ExceptionSample4 {
	public static void main(String[] args) {
		int a = Input.getInt();
		int b = Input.getInt();
		try {
			int ans = div(a, b);
			System.out.println(a + "÷" + b + "=" + ans);
		}
		catch(ArithmeticException e ) {
			System.out.println("0で割る計算はできません");
		}
		// try文の次に実行される部分
		System.out.println("･･･end･･･");
		
	}
	public static int div(int a, int b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		return	a/b;
	}
}
