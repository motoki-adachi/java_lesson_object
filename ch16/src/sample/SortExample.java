package sample;

import java.util.Arrays;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList( new Member(115, "たなか"),
				   							new Member(120, "きむら"),
				   							new Member(108, "さとう"),
				   							new Member(105, "やました"),
				   							new Member(112, "すずき") );
		NameComparator comp = new NameComparator();
		list.sort(comp);
		
		for(Member m : list) {
			System.out.println(m);
		}
	}
}
