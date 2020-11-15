package sample;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class CalculatingExample {
	public static void main(String[] args) {
		List<PC> list = PC.getList();
		// 件数
		long count = list.stream().collect(counting());
		// 合計
		int sum = list.stream()
				.collect(summingInt(PC::getPrice));
		// 平均
		double ave = list.stream()
				.collect(averagingInt(PC::getPrice));
		// 最大値
		Optional<PC> max = list.stream()
				.collect(maxBy(comparing(PC::getPrice)));
		// 最小値
		Optional<PC> min = list.stream()
				.collect(minBy(comparing(PC::getPrice)));

		System.out.println("件　数＝" + count);
		System.out.println("合　計＝" + sum);
		System.out.println("平　均＝" + ave);
		System.out.println("最高値＝" + max.get());
		System.out.println("最安値＝" + min.get());
	}
}
