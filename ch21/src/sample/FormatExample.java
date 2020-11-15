package sample;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatExample {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021, 7, 13);
		// 書式を作る
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("y年MM月dd日 eeee");
		// 書式を使って編集し、出力する
		System.out.println(date.format(fmt));
	}
}