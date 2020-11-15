package sample;
import static java.util.stream.Collectors.*;
import java.util.*;
public class ToSetExample {

	public static void main(String[] args) {
		List<PC> list = PC.getList();
		Set<String> types = list.stream()
								.map(PC::getType)
								.collect(toSet());

		types.forEach(System.out::println);

	}
}
