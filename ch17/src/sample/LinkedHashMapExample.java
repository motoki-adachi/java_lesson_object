package sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(115, "田中");
		map.put(120, "木村");
		map.put(108, "佐藤");
		map.put(112, "鈴木");
		map.put(105, "山下");
		
		// 全エントリを表示
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}		
	}
}
