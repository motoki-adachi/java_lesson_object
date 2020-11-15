package sample;

import java.util.Arrays;
import java.util.List;
/*
 * 部署を表すクラスです
 * 例題（FlatmapExample.java、JoiningExample.java）で使います
 */
public class Department {
	private String name;
	private String manager;
	private List<String> employees;
	

	public Department(String name, String manager, List<String> employees) {
		this.name = name;
		this.manager = manager;
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public String getManager() {
		return manager;
	}

	public List<String> getEmployees() {
		return employees;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}

	public String toString() {
		return "Department ["+
				" name=" + name +
				" manager=" + manager +
				", employees=" + employees +
				" ]";
	}
	
	public static List<Department> getList() {
		
		List<Department> list = Arrays.asList(
				new Department("総務","田中宏", Arrays.asList("佐藤渉","平山花子","斎藤雄一")),
				new Department("経理","鈴木恵子", Arrays.asList("向井修","山崎洋子","平木真理")),
				new Department("営業","木村薫", Arrays.asList("真田真澄","増山次郎","戸田絵里"))
				);
		return list;
	}
}
