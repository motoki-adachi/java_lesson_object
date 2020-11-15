package sample;
public class InstanceOfTest {
	public static void main(String[] args) {
		Object o1 = new A();		// Object ← Aのアップキャスト
		Object o2 = new B();		// Object ← Bのアップキャスト
		Object o3 = new C();		// Object ← Cのアップキャスト
		System.out.println(o1 instanceof B);	// o1 は Bか
		System.out.println(o2 instanceof B);	// o2 は Bか
		System.out.println(o3 instanceof B);	// o3 は Bか
	}
}

class A {
}

class B extends A {
}

class C extends B {
}
