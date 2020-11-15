package sample;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		
        LocalDate birthday = LocalDate.of(1998, 7, 13);	// 誕生日
        LocalDate today = LocalDate.now();					// 今日

        System.out.println(birthday +"～" +today);		// 期間を表示
        
        // 期間を日数で得る
        long days = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("誕生日から" + days + "日");

        // 期間を年、月、日で得る
        Period period = Period.between(birthday, today);
        System.out.print(period.getYears() + "才 ");			// 年の値
        System.out.print(period.getMonths() + "ヵ月 ");		// 月の値
        System.out.print(period.getDays() + "日");				// 日の値
        

	}
}
