package sample;

import java.util.Arrays;
import java.util.List;

public class SwitchExample {

	public static void main(String[] args) {
		List<SmartPhone> list = Arrays.asList(
				new SmartPhone("100", Color.WHITE),
				new SmartPhone("101", Color.BLACK),
				new SmartPhone("102", Color.BLACK),
				new SmartPhone("103", Color.GOLD));
		
		list.forEach(s->{				// ListのforEachメソッド
			switch(s.getColor()){
			  case BLACK:				// caseラベルとして使う時は値名だけを書く
				System.out.println(s);
				break;
			  case WHITE:
			  case GOLD:
			}
		});
	}

}
