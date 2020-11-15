package sample;
import java.util.Collections;
import java.util.List;
public class OfMethod{
	public static void main(String[] args) {
		// リストを作成
		List<String> list = List.of("田中", "鈴木", "木村");

		try {
			//Collections.sort(list);
			list.add("山田");
		}
		catch(RuntimeException e) {
			System.out.println("list は変更できません");
		}
		for(String s : list){
			System.out.println(s);
		}

	}
}
