package sample;

public class CheckType {
	public static void main(String[] args) {
		Member mem = new Member();		// Memberクラスのインスタンスを作る
		if(mem instanceof Member) {				// Member型か調べる 
			System.out.println("Member型です");
		}
		if(mem instanceof Version) {				// Version型か調べる
			System.out.println("Version型です");
		}

	}
}
