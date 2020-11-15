package sample2;

import java.time.LocalDate;

public class Product {
	
	private String number;		// 型番
	private String name;		// 品名
	private int price;			// 価格
	private LocalDate date;		// 発売日
	private boolean stock;		// 在庫（の有無）

	public Product(String number, String name, int price, LocalDate date, boolean stock) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
	}

	// thisで簡略化したコンストラクタ
	public Product(String number, String name, int price) {
		this(number, name, price, LocalDate.now(), true);
	}

	// ファイルから初期値を読み込むコンストラクタ
	public Product(String fileName) {
		// fileNameのデータファイルから初期値を読み込んで、
		// フィールド変数にセットする処理（省略）
	}

	// 引数のないコンストラクタ
	public Product() {
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public LocalDate getDate() {
		return date;
	}

	public boolean isStock() {
		return stock;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", "
				+ "price=" + price + ", date=" + date + ", stock=" + stock + "]";
	}

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p);
	}
}
