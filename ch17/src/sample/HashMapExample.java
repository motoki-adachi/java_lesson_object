package sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(115, "田中");
		map.put(120, "木村");
		map.put(108, "佐藤");
		map.put(112, "鈴木");
		map.put(105, "山下");
		
		System.out.println(map.get(108));
		System.out.println(map.get(105));

	}

}
