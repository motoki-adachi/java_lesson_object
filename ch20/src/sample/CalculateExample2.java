package sample;
import java.util.List;
import java.util.Optional;
import static java.util.Comparator.*;

public class CalculateExample2 {
	public static void main(String[] args) {
		List<PC> list = PC.getList();

		Optional<PC> min = list.stream().min(comparing(PC::getPrice));
		Optional<PC> max = list.stream().max(comparing(PC::getPrice));

		System.out.println("最小＝"+ min.get());
		System.out.println("最大＝"+ max.get());

	}
}
