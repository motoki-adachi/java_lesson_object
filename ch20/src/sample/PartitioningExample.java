package sample;
import static java.util.stream.Collectors.*;
import java.util.List;
import java.util.Map;

public class PartitioningExample {
	public static void main(String[] args) {
		List<PC> list = PC.getList();
		Map<Boolean, List<String>> typeGroup = 
					list.stream()
				 	 	.collect(partitioningBy(pc->pc.getPrice()>60000,
				 	 				mapping(PC::getName,toList())));
		
		typeGroup.forEach((k,v)->System.out.println(k + " = " +v));
	}
}
