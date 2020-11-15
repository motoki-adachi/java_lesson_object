package sample;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Examples {
	public static void main(String[] args) {
		 
		// 15時20分35秒
		LocalTime time = LocalTime.of(15, 20, 35);	
		System.out.println(time);
		
		// 2020年2月12日15時20分35秒
		LocalDateTime datetime = LocalDateTime.of(2020,2,12,15,20,35);
		System.out.println(datetime);
		
		// 時刻の編集表示
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ahh時mm分ss秒");
		System.out.println(time.format(fmt));

	}
}
