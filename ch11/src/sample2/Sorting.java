package sample2;

import java.util.Arrays;
public class Sorting {
	public static void main(String[] args) {
		Member[] members = {
				new Member(115, "田中"),
				new Member(120, "木村"),
				new Member(108, "佐藤"),
				new Member(112, "鈴木"),
				new Member(105, "山下")
		};
		Arrays.sort(members);
		for(Member m : members) {
			System.out.println(m);
		}
	}
}
