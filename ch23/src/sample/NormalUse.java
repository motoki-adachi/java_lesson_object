package sample;
import java.util.Arrays;
import java.util.List;

public class NormalUse {
	public static void main(String[] args) {
		List<SmartPhone> list = Arrays.asList(
				new SmartPhone("100", Color.WHITE),
				new SmartPhone("101", Color.BLACK),
				new SmartPhone("102", Color.BLACK),
				new SmartPhone("103", Color.GOLD));
		
		list.stream()
			.filter(s->s.getColor()==Color.BLACK)	// 色がColor.BLACKであるものを抽出
			.forEach(System.out::println); 			// 出力する
	}
}
