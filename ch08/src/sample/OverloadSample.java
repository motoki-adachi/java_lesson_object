package sample;
class Adder {					// スーパークラス
	private int number;		// 合計値。

	public void add() {		// （オーバーロードされる）
		number++;
	}

	public int getNumber() {				// ゲッター
		return number;
	}

	public void setNumber(int number) {	// セッター
		this.number = number;
	}
}

class SubAdder extends Adder {				// サブクラス
	public void add(int val) {				// オーバーロードメソッド
		setNumber(getNumber() + val);
	}
}