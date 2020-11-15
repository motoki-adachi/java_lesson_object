package exercise;

import java.time.LocalDate;
// 
// 16-2-2 の問題に必要なクラス
public class Order {
	private Long code;
	private int quantity;
	private LocalDate date;
	
	public Order(Long code, int quantity, LocalDate date) {
		this.code = code;
		this.quantity = quantity;
		this.date = date;
	}
	public Long getCode() {
		return code;
	}
	public int getQuantity() {
		return quantity;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [code=" + code + ", quantity=" + quantity + ", date=" + date + "]";
	}

	

}
