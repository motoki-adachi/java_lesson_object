package sample;
import java.util.Set;
public class ImmutableSetExample {
	public static void main(String[] args) {
		// 要素をコンマで区切って並べる
		Set<String> set = Set.of("田中", "鈴木", "木村");

		// 配列から作成する
		String[] names = {"田中", "鈴木", "木村"};
		Set<String> set2 = Set.of(names);
	}
}
