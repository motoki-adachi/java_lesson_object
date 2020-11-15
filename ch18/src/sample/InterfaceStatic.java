package sample;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InterfaceStatic {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member(101, "田中宏"));
		list.add(new Member(102, "鈴木一郎"));
		list.add(new Member(103, "木村太郎"));

		list.sort(Comparator.reverseOrder());  // 自然な順序の逆順に並び替える

		for(Member m : list) {
			System.out.println(m);
		}
	}
}
