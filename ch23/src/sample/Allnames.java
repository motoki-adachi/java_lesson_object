package sample;

import java.util.Arrays;

public class Allnames {

	public static void main(String[] args) {
		Color[] values = Color.values();  // 列挙の値の配列
		Arrays.stream(values)
			  .forEach(System.out::println);
		
	}
}
