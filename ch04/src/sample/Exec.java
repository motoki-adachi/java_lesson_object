package sample;

import java.time.LocalDate;

public class Exec {
	public static void main(String[] args) {
		Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
		Product p2 = p1;					// 変数p2に参照を代入
		p2.setPrice(40200);					// p2で価格を40200に変更
		System.out.println("p1= " + p1);	// p1を表示
		System.out.println("p2= " + p2);	// p2を表示
	}
}
