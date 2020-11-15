package sample;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		Set<String> ids = new LinkedHashSet<>();
		ids.add("アンパンマン");
		ids.add("スーパーマン");
		ids.add("バットマン");
		ids.add("スパイダーマン");
		ids.add("バットマン");
		for(String id : ids) {
			System.out.println(id);
		}
	}
}
