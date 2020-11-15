package sample;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MyList_outerVar {
	public static void main(String[] args) {
		// データ作成
		List<Book> list = Arrays.asList(
			new Book("120", "german", "Janssen", LocalDate.of(2017, 9, 18), 1500),
			new Book("310", "japanese", "田中宏", LocalDate.of(2018, 3, 5), 5500),
			new Book("400", "english", "Alcott", LocalDate.of(2018, 2, 11), 4500),
			new Book("100", "japanese", "森下花", LocalDate.of(2018, 1, 10), 2200),
			new Book("410", "english", "Hunter", LocalDate.of(2017, 12, 1), 5500));

		// 比較用のインスタンス
		Book ref = new Book("010", "japanese", "森下花", LocalDate.of(2016, 2, 11), 2800);
		
		// 選択して出力する
		// listup(list, book -> ref.isSameAuthor(book));
		listup(list, ref::isSameAuthor); // 同じ処理をメソッド参照で
	}
	// リストアップメソッド
	public static void listup(List<Book> list, Predicate p) {
		for(Book book : list) {
			if(p.test(book)) {	// インタフェースのメソッドで判定する
				System.out.println(book);
			}
		}
	}	
}
