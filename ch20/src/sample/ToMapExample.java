package sample;
import static java.util.stream.Collectors.*;
import java.util.*;
public class ToMapExample {

	public static void main(String[] args) {
		List<PC> list = PC.getList();
		Map<String, Integer> pcMap = list.stream()
								.collect(toMap(PC::getName, PC::getPrice));

		pcMap.forEach((k,v)->System.out.println(k + " = " +v));

	}
}
