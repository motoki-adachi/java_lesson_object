package sample;

import java.time.LocalDate;

public class CreateDate {

	public static void main(String[] args) {
		// 今日の日付
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// 年月日を指定して作成
		LocalDate date = LocalDate.of(2021, 12, 8);
		System.out.println(date);

	}

}
