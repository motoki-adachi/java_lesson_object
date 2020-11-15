package sample;

public class ExecFoo {

	public static void main(String[] args) {
		Foo<String> sg = new Foo<>("Hello");
		System.out.println(sg.getObj());
	}
}
