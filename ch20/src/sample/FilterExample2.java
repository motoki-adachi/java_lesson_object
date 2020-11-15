package sample;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class FilterExample2 {

	public static void main(String[] args) {
		List<PC> list = PC.getList();
		
		List<PC> maker_panan = list.stream()
									.filter((PC pc) -> "Panan".equals(pc.getMaker()))
									.collect(toList());
	}
}
