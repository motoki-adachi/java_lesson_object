package sample;

import java.util.ArrayList;
import java.util.List;

public class ListOfMembers {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member(101, "田中宏"));
		list.add(new Member(102, "鈴木一郎"));
		list.add(new Member(103, "木村太郎"));
		for(Member m : list) {
			System.out.println(m);
		}
		
	}

}
