package sample;
import static java.util.stream.Collectors.*;
import java.util.List;
import java.util.Map;

public class GroupingExample2 {
	public static void main(String[] args) {
		List<PC> list = PC.getList();
		Map<String, List<String>> typeGroup = 
					list.stream()
				 	 	.collect(groupingBy(PC::getType,
				 	 				mapping(PC::getName, toList())));
		
		typeGroup.entrySet().stream()
			.forEach(System.out::println);
	}
}
