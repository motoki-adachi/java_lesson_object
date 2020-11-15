package sample;
import java.util.HashMap;
import java.util.Map;
public class MapOperation {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(115, "田中");
		map.put(120, "木村");
		map.put(108, "佐藤");
		map.put(115, "佐々木");
		
		System.out.println(map.get(115));		// 重複キーのエントリ
		System.out.println(map.get(200));		// 無効なエントリ
		System.out.println(map.getOrDefault(200,"未登録"));		// nullを回避	
	}
}
