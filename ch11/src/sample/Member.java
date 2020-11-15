package sample;

public class Member implements Version {		// Versionを実装したMemberクラス
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Member() {
	}

	@Override
	public String getVersion() {				// 抽象メソッドgetVersionをオーバーライド
		return "Memberクラス version 1.0";		// バージョン文字列を返す
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
