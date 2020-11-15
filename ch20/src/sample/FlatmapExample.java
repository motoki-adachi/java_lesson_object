package sample;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class FlatmapExample {

	public static void main(String[] args) {
		List<Department> list = Department.getList();
		
		List<String> employees = list.stream()
				.map(Department::getEmployees) // Listのストリーム 
				.flatMap((List<String> ls) -> ls.stream())		  // 平坦化
				.collect(toList()); 
		
		employees.forEach(e -> System.out.print(e + " "));

	}
}
