package sample2;

import java.time.LocalDate;

public final class Product {
	private final String number;		// 型番
	private final String name;			// 品名
	private final int price;			// 価格
	private final LocalDate date;		// 発売日
	private final boolean stock;		// 在庫（の有無）

	public Product(String number, String name, int price, LocalDate date, boolean stock) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
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

	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", "
				+ "price=" + price + ", date=" + date + ", stock=" + stock + "]";
	}
}
