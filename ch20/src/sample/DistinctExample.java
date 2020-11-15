package sample;

import java.util.List;
import static java.util.stream.Collectors.*;

public class DistinctExample {

	public static void main(String[] args) {
		List<PC> list = PC.getList();
		
		List<String> makers = list.stream()
								.map(PC::getMaker)
								.distinct()
								.collect(toList());
		
		makers.forEach(name->System.out.print(name + " "));

	}

}
