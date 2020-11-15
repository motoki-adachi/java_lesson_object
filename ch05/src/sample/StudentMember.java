package sample;
import java.time.LocalDate;

public class StudentMember extends Member {
	private LocalDate birthday;	// 誕生日

	public StudentMember(int id, String name, LocalDate birthday) { // コンストラクタ
		super(id, name);
		this.birthday = birthday;
	}

	public LocalDate getBirthday() {				// 誕生日のゲッター
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {	// 誕生日のセッター
		this.birthday = birthday;
	}

	public LocalDate expirationDate() {		// 有効期限日を返す
		return birthday.plusYears(18);		// 誕生日に18年を足した日付を返す
	}
}
