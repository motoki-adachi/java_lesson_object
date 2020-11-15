package sample;
import java.util.HashMap;
import java.util.Map;

public class Map_EntryExample {
	public static void main(String[] args) {
		// マップを作成		
		Map<Integer, String> map = new HashMap<>();
		map.put(115, "田中");
		map.put(120, "木村");
		map.put(108, "佐藤");
		map.put(112, "鈴木");
		map.put(105, "山下");

		// すべてのエントリを取得して表示する
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
