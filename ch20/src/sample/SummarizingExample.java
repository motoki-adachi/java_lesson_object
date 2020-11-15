package sample;
import static java.util.stream.Collectors.*;
import java.util.IntSummaryStatistics;
import java.util.List;
public class SummarizingExample {
	public static void main(String[] args) {
		List<Book> list = Book.getList();
		IntSummaryStatistics stat 
				= list.stream().collect(summarizingInt(Book::getPrice));
		
		System.out.println("件　数＝" + stat.getCount());
		System.out.println("合　計＝" + stat.getSum());
		System.out.println("平　均＝" + stat.getAverage());
		System.out.println("最高値＝" + stat.getMax());
		System.out.println("最安値＝" + stat.getMin());

	}
}
