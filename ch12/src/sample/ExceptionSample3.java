package sample;
import jp.kwebs.Input;

public class ExceptionSample3 {
	public static void main(String[] args) {
		int a = Input.getInt();
		int b = Input.getInt();
		int ans = div(a, b);
		System.out.println(a + "÷" + b + "=" + ans);
	}

	public static int div(int a, int b) {
		if(b != 0) {
			return a / b;
		} else {
			return 0; 	// 何を返せばよいか決められない
						// ここでは、コンパイルエラーを避けるため0を返している
		}
	}
}
