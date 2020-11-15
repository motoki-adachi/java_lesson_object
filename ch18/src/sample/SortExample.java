package sample;
import java.util.*;
public class SortExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList( new Member(115, "たなか"),
				   							new Member(120, "きむら"),
				   							new Member(108, "さとう"),
				   							new Member(105, "やました"),
				   							new Member(112, "すずき") );
		list.sort(new Comparator<Member>() {	
						public int compare(Member o1, Member o2) {
							String s1 = o1.getName(), s2=o2.getName();
							return s1.compareTo(s2);
						}
					});
		
		for(Member m : list) {
			System.out.println(m);
		}
	}
}
