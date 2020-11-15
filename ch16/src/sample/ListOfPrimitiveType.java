package sample;

import java.util.ArrayList;
import java.util.List;

public class ListOfPrimitiveType {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(130);
		list.add(140);
		for(int n : list) {
			System.out.print(n + "\t");
		}
	}
}
