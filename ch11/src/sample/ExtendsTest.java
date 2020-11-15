package sample;

class Y extends X {
	@Override
	public void hello() {
		System.out.println("こんにちは");
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		Y y = new Y();
		y.talk();
		y.hello();
		y.bye();
	}
}
