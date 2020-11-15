package sample;

import static java.util.stream.Collectors.toList;
import static java.util.Comparator.*;
import java.util.List;

public class SortedExample {
	public static void main(String[] args) {
		List<PC> list = PC.getList();
		
		List<PC> sortedPCs = list.stream()
								.sorted(comparing(PC::getPrice))
								.collect(toList());
		
		sortedPCs.forEach(System.out::println);

	}
}
