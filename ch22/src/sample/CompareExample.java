package sample;

import java.util.Arrays;
import java.util.List;
//import static java.util.Comparator.comparing;
public class CompareExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bb", "ac", "ba");	// リストを作成
		list.sort((s1,s2)->s1.compareToIgnoreCase(s2));		// 並べ替える
		System.out.println(list);								// 表示する
		
	}

}
