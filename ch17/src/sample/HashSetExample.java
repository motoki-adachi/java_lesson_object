package sample;
import java.util.Set;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> ids = new HashSet<>();
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
