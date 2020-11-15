package sample;
import java.util.Arrays;
import java.util.List;

public class MatchesExample {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Jack110", "suzu-10", "Ken3", "tom10");

		for(String s : list) {
			// 大文字を含み単語構成文字以外を含まない5文字以上の文字列
			if(s.matches("^(?=.*[A-Z])(?!.*\\W).{5,}$")) {
				System.out.println(s);
			}
		}
	}
}
