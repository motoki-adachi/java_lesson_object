package sample;

import java.util.List;
import static java.util.stream.Collectors.*;

public class MapExample {

	public static void main(String[] args) {
		List<PC> list = PC.getList();
		
		List<String> psMakers = list.stream()
								.map(PC::getMaker)
								.collect(toList());
		
		psMakers.forEach(name->System.out.print(name + " "));

	}

}
