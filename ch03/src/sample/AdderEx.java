package sample;

public class AdderEx {
	private int number;

	public AdderEx(int number) {
		this.number = number;
	}

	public AdderEx() {
	}

	public void add() {
		number++;
	}

	public void add(int val) {
		number += val;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		AdderEx num = new AdderEx(100);
		num.add();
		num.add();
		System.out.println("number=" + num.getNumber());
	}
}
