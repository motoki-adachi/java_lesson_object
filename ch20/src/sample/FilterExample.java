package sample;

import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<PC> list = PC.getList();
		
		list.stream()
			.filter((PC pc) -> "Panan".equals(pc.getMaker()))
			.forEach(System.out::println);
	}
}
