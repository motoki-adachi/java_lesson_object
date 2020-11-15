package sample;

import java.util.Comparator;

public class NameComparator implements Comparator<Member> {
	public int compare(Member o1, Member o2) {
		String s1 = o1.getName(), s2 = o2.getName();
		return s1.compareTo(s2); 	// 名前を比較して、負、0、正のどれかの値を返す
	}
}
