package sample;
import java.time.LocalDate;

public class GetValue {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 07, 30);
		System.out.println(date);
		System.out.println(date.getYear());		// 年を取り出す
		System.out.println(date.getMonthValue());	// 月を取り出す
		System.out.println(date.getDayOfMonth());	// 日を取り出す

	}
}
