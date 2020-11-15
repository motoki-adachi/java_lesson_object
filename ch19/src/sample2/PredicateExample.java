package sample2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import sample.Book;


public class PredicateExample {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
			new Book("120", "german", "Janssen", LocalDate.of(2017, 9, 18), 1500),
			new Book("310", "japanese", "田中宏", LocalDate.of(2018, 3, 5), 5500),
			new Book("400", "english", "Alcott", LocalDate.of(2018, 2, 11), 4500),
			new Book("100", "japanese", "森下花", LocalDate.of(2018, 1, 10), 2200),
			new Book("410", "english", "Hunter", LocalDate.of(2017, 12, 1), 5500));
		// 選択して出力  
		Predicate<Book> min5000 = (book -> book.getPrice()>=5000);
		Predicate<Book> japanese = (book -> "japanese".equals(book.getLanguage()));
		Predicate<Book>	german = (book -> "german".equals(book.getLanguage()));
		
		listup(books, min5000.and(japanese).or(german));
	}
	// リストアップメソッド
	public static void listup(List<Book> books, Predicate<Book> p) {
		for(Book book : books) {
			if(p.test(book)) {	// インタフェースのメソッドで判定する
				System.out.println(book);
			}
		}
	}
}
