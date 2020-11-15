package sample;

class MyGen implements GenIntf {

	@Override
	public <T> void display(T obj) {
		System.out.println(obj);		
	}
}

public class MyGenExec {
	public static void main(String[] args) {
		MyGen gen = new MyGen();
		gen.display("aaa");
		gen.display(123);
	}
}