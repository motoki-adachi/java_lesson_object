package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListExample {

	public static void main(String[] args) {
		// 要素を並べて作成
		List<Member> list = Arrays.asList(	new Member(103, "木村太郎"),
											new Member(102, "鈴木一郎"),
											new Member(101, "田中宏"));
		// リストはソートできる
		Collections.sort(list); // 自然な順序による並び替え
		for(Member m : list) {
			System.out.println(m);
		}

	}

}
