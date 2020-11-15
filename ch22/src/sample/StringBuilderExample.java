package sample;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(500);
		sb.append(2020);
		sb.append("年");
		sb.append(7);
		sb.append("月");
		String str = sb.toString();
		System.out.println(str);
	}
}
