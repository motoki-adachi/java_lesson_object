package sample;
abstract class AbSuper{
	public abstract void print();
}

abstract class AbSub extends AbSuper {
	public void doit() {
		System.out.println("do something");
	}
}
