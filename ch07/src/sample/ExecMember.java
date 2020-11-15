package sample;
import java.time.LocalDate;

public class ExecMember {
	public static void main(String[] args) {
		Member mem = new StudentMember(100, "田中宏", LocalDate.of(2004, 7, 30));
		System.out.println(mem.getId());
		System.out.println(mem.getName());
		//System.out.println(mem.getBirthday());		コンパイルエラー
		//System.out.println(mem.expirationDate());		コンパイルエラー
	}
}
