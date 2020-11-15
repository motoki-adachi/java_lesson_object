package sample;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

	public static void main(String[] args) {
		
        LocalTime start = LocalTime.of(12, 10, 30);	// 出　発
        LocalTime goal = LocalTime.of(16, 46, 25);		// ゴール

        System.out.println(start +"～" + goal);
        Duration d =Duration.between(start, goal);
        
        System.out.println("出発から" + d.toSeconds() + "秒");
        
        System.out.print("所要時間＝" + d.toHoursPart() + "時間 ");	// Java9から
        System.out.print(d.toMinutesPart()+ "分 ");					// Java9から
        System.out.println(d.toSecondsPart() + "秒 ");				// Java9から
        
	}
}
