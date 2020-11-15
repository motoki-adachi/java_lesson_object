package sample;
import java.util.function.*;

public class MethodRef {
	public static void main(String[] args) {
		test1((x)->Math.sqrt(x));
		test1(Math::sqrt);
	}
	public static void test1(DoubleUnaryOperator duo) {
		double ans = duo.applyAsDouble(5.0);
		System.out.println(ans);
	}
}
