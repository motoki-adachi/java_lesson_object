package sample;

public class Product {

  private String number;
  private String name;
  private int peice;
  private LocalDate sate;
  private boolean stock;


  public Product(String number, String name, int peice, LocalDate sate, boolean stock) {
    this.number = number;
    this.name = name;
    this.peice = peice;
    this.sate = sate;
    this.stock = stock;
  }


  public String getNumber() {
    return this.number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPeice() {
    return this.peice;
  }

  public void setPeice(int peice) {
    this.peice = peice;
  }

  public LocalDate getSate() {
    return this.sate;
  }

  public void setSate(LocalDate sate) {
    this.sate = sate;
  }

  public boolean isStock() {
    return this.stock;
  }

  public boolean getStock() {
    return this.stock;
  }

  public void setStock(boolean stock) {
    this.stock = stock;
  }

}
