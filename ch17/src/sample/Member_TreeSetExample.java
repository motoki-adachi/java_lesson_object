package sample;
import java.util.Set;
import java.util.TreeSet;

public class Member_TreeSetExample {
	public static void main(String[] args) {
		
		Set<Member> members = new TreeSet<>();
		
		members.add(new Member(115, "田中"));
		members.add(new Member(120, "木村"));
		members.add(new Member(108, "佐藤"));
		members.add(new Member(112, "鈴木"));
		members.add(new Member(105, "山下"));
		members.add(new Member(112, "山田"));
		
		for(Member member : members) {
			System.out.println(member);
		}
	}
}
