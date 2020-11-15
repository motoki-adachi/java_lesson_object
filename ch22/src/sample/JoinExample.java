package sample;

public class JoinExample {

	public static void main(String[] args) {
		String[] array = { "2020", "07", "15" };
		System.out.println(String.join("-", array));
		System.out.println(String.join("\n", array));

	}
}
