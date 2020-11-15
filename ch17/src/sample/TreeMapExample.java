package sample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
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
