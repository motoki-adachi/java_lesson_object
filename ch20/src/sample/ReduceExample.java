package sample;

import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<PC> list = PC.getList();
		Optional<String> names = list.stream()
						.map(PC::getName)
						.reduce((a,b) -> a + ", " + b);	// 文字列連結
		System.out.println(names.get());

	}
}
