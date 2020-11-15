package sample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AdjustExample2 {

	public static void main(String[] args) {
		
		TemporalAdjuster lastDay =  TemporalAdjusters.lastDayOfMonth(); // 月末の日
		TemporalAdjuster nextSaturday = TemporalAdjusters.next(DayOfWeek.MONDAY) ;

		LocalDate date = LocalDate.now().with(lastDay).with(nextSaturday);
		System.out.println(date);
	}
}
