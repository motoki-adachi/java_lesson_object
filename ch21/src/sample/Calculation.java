package sample;

import java.time.LocalDate;

public class Calculation {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();		// 今日の日付を得る
		LocalDate newDay = today.plusDays(150);	// 150日後の日付を得る
		System.out.println(today);
		System.out.println(newDay);
		
	}

}
