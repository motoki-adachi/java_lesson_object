package sample;
import jp.kwebs.Input;

public class ExceptionSample {
	public static void main(String[] args) {
		double a = Input.getDouble();
		double b = Input.getDouble();
		System.out.println(a + "÷" + b + "=" + a / b);
	}
}
