package exercise;

public class Order {

  private String code;
  private LocalDate date;
  public int price;
  public int quantity;
  public boolean delivery;


  public Order(String code, LocalDate date, int price, int quantity, boolean delivery) {
    this.code = code;
    this.date = date;
    this.price = price;
    this.quantity = quantity;
    this.delivery = delivery;
  }


  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isDelivery() {
    return this.delivery;
  }

  public boolean getDelivery() {
    return this.delivery;
  }

  public void setDelivery(boolean delivery) {
    this.delivery = delivery;
  }


}