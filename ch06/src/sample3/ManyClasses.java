package sample3;

class A {
	public A() {
		System.out.println("Ａクラス");
	}
}

class B extends A {
	public B() {
		System.out.println("Ｂクラス");
	}
}

class C extends B {
	public C() {
		System.out.println("Ｃクラス");
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		C obj = new C();
	}
}
