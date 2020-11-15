package sample;
import java.util.List;
import	static java.util.stream.Collectors.*;
public class JoiningExample {
	public static void main(String[] args) {
		List<Department> list = Department.getList();
		String employees = list.stream()
							.map(Department::getEmployees)
							.flatMap(List::stream)
							.collect(joining(", "));
		System.out.println(employees);
	}
}
