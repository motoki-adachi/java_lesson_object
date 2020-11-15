package sample;

public class SimpleObject {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		SimpleObject obj = new SimpleObject();
		System.out.println("number=" + obj.getNumber());

	}
}
