package sample;
import static java.util.stream.Collectors.*;
import java.util.List;
import java.util.Map;

public class GroupingExample {
	public static void main(String[] args) {
		
		List<PC> list = PC.getList();	// パソコンの機種のリスト
		
		// タイプ別のリストからなるマップを作る
		Map<String, List<PC>> typeGroup = 	list.stream()
				 	 							.collect(groupingBy(PC::getType));
		
		// MapのforEachメソッドで出力する
		typeGroup.forEach((k,v)->System.out.println(k + " = " +v));
	}
}
