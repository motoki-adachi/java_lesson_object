package sample2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import sample.Book;
import static java.util.Comparator.comparing;

public class ComparatorExample {
	public static void main(String[] args) {

		List<Book> list = Arrays.asList(
				new Book("120", "german", "Janssen", LocalDate.of(2017, 9, 18), 2200),
				new Book("310", "japanese", "田中宏", LocalDate.of(2018, 3, 5), 5500),
				new Book("400", "english", "Alcott", LocalDate.of(2018, 2, 11), 4500),
				new Book("100", "japanese", "森下花", LocalDate.of(2018, 1, 10), 2200),
				new Book("410", "english", "Hunter", LocalDate.of(2017, 12, 1), 5500));

		list.sort(comparing(Book::getPrice)	// 価格の昇順に並べ替え
			  .thenComparing(Book::getCode)		// 価格が同じなら登録番号順にする
		  	  .reversed() ); 					// 並び順を逆転させる
		
		list.forEach(System.out::println); 	// 各要素を出力する

	}
}
