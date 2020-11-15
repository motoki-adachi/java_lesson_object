package sample;

public class ReplaceExample {

	public static void main(String[] args) {
		String str = "01/15 成人の日\n"		+
					 "02/11 建国記念の日\n" +
					 "04/29 みどりの日";
		
		System.out.println(str.replace("/", "-"));
	}
}
