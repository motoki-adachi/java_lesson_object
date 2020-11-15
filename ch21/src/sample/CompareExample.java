package sample;

import java.time.LocalDate;

public class CompareExample {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2020, 1, 10); 	// 2020-01-10
		LocalDate date2 = LocalDate.of(2019, 12, 6); 	// 2019-12-06
		System.out.println(date1.isAfter(date2));		// day1はday2よりも後の日付か？
		System.out.println(date1.isBefore(date2));		// day1はday2よりも前の日付か？
		System.out.println(date1.isEqual(date2));		// day1はday2と同じか？
		System.out.println(date1.isLeapYear());		// うるう年か？
	}

}
