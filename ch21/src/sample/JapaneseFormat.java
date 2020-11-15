package sample;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class JapaneseFormat {

	public static void main(String[] args) {
		LocalDate date =LocalDate.of(2021, 7,13);

		DateTimeFormatter fmt  = 
				DateTimeFormatter.ofPattern("Gy年MM月dd日 eeee");
		System.out.println(JapaneseDate.from(date).format(fmt));	

	}

}
