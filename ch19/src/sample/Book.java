package sample;

import java.time.LocalDate;
/*
 * 19章の例題に必要なクラスです
 */

public class Book {
	private String code;
	private String language;
	private String author;
	private LocalDate date;
	private int price;
	public Book() {}
	public Book(String code) {this.code = code; }
	public Book(String code, String language, String author, LocalDate date, int price) {
		this.code = code;
		this.language = language;
		this.author = author;
		this.date = date;
		this.price = price;
	}

	public boolean isSameAuthor(Book other) {
		return author.equals(other.getAuthor());
	}
	public void summary() {
		System.out.println(code+" "+author+"\t["+language+"]");
	}
	public String getCode() {
		return code;
	}
	public String getLanguage() {
		return language;
	}
	public String getAuthor() {
		return author;
	}
	public LocalDate getDate() {
		return date;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		Book other = (Book) obj;
		if(code == null) {
			if(other.code != null)
				return false;
		} else if(!code.equals(other.code))
			return false;
		return true;
	}
	@Override
	public String toString() {
		
		return
				
		"Book ["		+
		
		" code="		+	code		+
		",language="	+	language	+
		",author="		+	author	+
		",date="		+	date		+
		",price="		+	price		+
		
		" ]";
	}

}

