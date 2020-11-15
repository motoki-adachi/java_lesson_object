package sample;

import static java.util.stream.Collectors.toList;
import static java.util.Comparator.*;
import java.util.List;

public class Skip_limitExample {
	public static void main(String[] args) {
		List<PC> list = PC.getList();
		
		List<PC> limitedPCs = list.stream()
								.sorted(comparing(PC::getPrice))
								.skip(3)
								.limit(3)
								.collect(toList());
		
		limitedPCs.forEach(System.out::println);

	}
}
