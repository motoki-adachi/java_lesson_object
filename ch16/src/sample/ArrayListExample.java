package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("おはよう");
		list.add("こんにちは");
		list.add("こんばんは");
		
		for(String ls : list) {		// リストの内容を表示
			System.out.println(ls);
		}
		//
		//for(int i=0; i<list.size();i++) {
		//		System.out.println(list.get(i));
		//}
	}
}