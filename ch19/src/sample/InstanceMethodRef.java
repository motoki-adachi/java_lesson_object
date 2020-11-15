package sample;

import java.util.function.ToIntFunction;

public class InstanceMethodRef {
	public static void main(String[] args) {
		test((String s) -> s.length());
		test(String::length);
	} 
	public static void test(ToIntFunction<String> f) {
		int length = f.applyAsInt("Hello");
		System.out.println(length);
	}
}

