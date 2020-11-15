package exercise;

import java.util.Arrays;
import java.util.List;
/*
 * パソコン、タブレットなどを表すクラスです
 * 20章の例題で利用します
 * 
 */
public class PC implements Comparable<PC>{
	private String name;
	private String type;
	private int price;
	private String maker;
	
	public PC() {}
	public PC(String name, String type, int price, String maker) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.maker = maker;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	public String getMaker() {
		return maker;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		PC other = (PC) obj;
		if(name == null) {
			if(other.name != null)
				return false;
		} else if(!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PC [" +
				" name=" + name +
				", type=" + type +
				", price=" + price +
				", maker=" + maker+ 
				" ]";
	}
	
	public static List<PC> getList() {
		List<PC> list = Arrays.asList(
				new PC("DELO-200", "DESKTOP", 50000, "DELO"),
				new PC("HQ-110A",  "DESKTOP", 68000, "HQ"),
				new PC("PanaMini", "TABLET",  62000, "Panan"),
				new PC("SeakBook", "LAPTOP",  98000, "HQ"),
				new PC("Panalet",  "LAPTOP",  75000, "Panan"),
				new PC("HQ-Star",  "DESKTOP", 60000, "HQ"),
				new PC("LatteAir", "LAPTOP",  85000, "Latte"),
				new PC("Nectop",   "LAPTOP",  79000, "Nect"),
				new PC("DELOPad",  "TABLET",  48000, "DELO"),
				new PC("DELO-100", "DESKTOP", 48000, "DELO"),
				new PC("Ariban",   "TABLET",  12000, "Ariban")

	    );
		return list;
	}
	// 製品名の辞書順を自然な並べ替えの順序とする
	@Override
	public int compareTo(PC other) {
		return name.compareTo(other.name);
	}

	
}
