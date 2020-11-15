package sample;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
public class CalculateExample {
	public static void main(String[] args) {
		List<PC> list = PC.getList();

		// 件数
		long count = list.stream().count();
		// 合計
		int sum = list.stream()
						.mapToInt(PC::getPrice)
						.sum();
		// 平均
		OptionalDouble ave = list.stream()
								  .mapToInt(PC::getPrice)
								  .average();
		// 最大値
		
		OptionalInt max=list.stream()
								.mapToInt(PC::getPrice)
								.max();
		
		// 最小値
		OptionalInt min = list.stream()
								.mapToInt(PC::getPrice)
								.min();	
		
		System.out.println("件　数＝"+ count);
		System.out.println("合　計＝"+ sum);
		System.out.println("平　均＝"+ ave.getAsDouble());
		System.out.println("最大値＝"+ max.getAsInt());
		System.out.println("最小値＝"+ min.getAsInt());
	}
}
