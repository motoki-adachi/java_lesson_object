package exercise;

import java.util.Arrays;
import java.util.List;
import sample.PC;

public class Sales {
	private String name;
	private String office;
	private PC pc;
	private int quantity;

	public Sales() {
	}

	public Sales(String name, String office, PC pc, int quantity) {
		this.name = name;
		this.office = office;
		this.pc = pc;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public String getOffice() {
		return office;
	}

	public PC getPc() {
		return pc;
	}

	public int getQuantity() {
		return quantity;
	}

	public String toString() {
		return "_Sales2 [" +
				" name=" + name +
				" office=" + office +
				" ,pc=" + pc +
				" ,quantity=" + quantity +
				" ]";
	}

	public static List<Sales> getList() {
		
		List<Sales> list = Arrays.asList(
				new Sales("田中","東京", new PC("DELO-200", "DESKTOP", 50000, "DELO"), 2), 
				new Sales("田中","東京", new PC("DELO-100", "DESKTOP", 48000, "DELO"), 3),
				new Sales("田中","東京",new PC("LatteAir", "LAPTOP",  85000, "Latte"), 1),
				new Sales("田中","東京", new PC("Panalet",  "LAPTOP",  75000, "Panan"), 2),
				new Sales("田中","東京", new PC("Ariban",   "TABLET",  12000, "Ariban"), 5),
				new Sales("佐藤","東京", new PC("HQ-110A",  "DESKTOP", 68000, "HQ"), 3),
				new Sales("佐藤","東京", new PC("SeakBook", "LAPTOP",  98000, "HQ"), 1),
				new Sales("佐藤","東京", new PC("PanaMini", "TABLET",  62000, "Panan"), 2),
				new Sales("鈴木","大阪", new PC("DELO-200", "DESKTOP", 50000, "DELO"), 1),
				new Sales("鈴木","大阪", new PC("HQ-Star",  "DESKTOP", 60000, "HQ"), 2),
				new Sales("鈴木","大阪", new PC("Nectop",   "LAPTOP",  79000, "Nect"), 4),
				new Sales("鈴木","大阪", new PC("DELOPad",  "TABLET",  48000, "DELO"), 1),
				new Sales("木村","大阪", new PC("DELO-200", "DESKTOP", 50000, "DELO"), 5),
				new Sales("木村", "大阪",new PC("Nectop",   "LAPTOP",  79000, "Nect"), 2)
				);
		
		return list;
		
	}
	
	public static void main(String[] args) {
		
		List<Sales> list = Sales.getList();
		list.forEach(System.out::println);
		
		
		
	}
		
}
