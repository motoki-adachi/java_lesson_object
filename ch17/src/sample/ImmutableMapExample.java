package sample;

import java.util.Map;

public class ImmutableMapExample {
	public static void main(String[] args) {

		// キーと値を交互に並べて作成（最大10組まで）
		Map<Integer, String> map1 = Map.of( 1, "A", 2, "B", 3, "C");

		// Map.Entry型の要素を並べて作成（制限なし、配列でも可）
		Map<Integer, String> map2 = Map.ofEntries(
											Map.entry(1, "aa"),
											Map.entry(2, "bb"),
											Map.entry(3, "cc"));
	}
}
