package sample;
class First {
	protected First create() {
		return new First();			// Firstクラスのインスタンスを返す
	}
}

class Second extends First {
	@Override
	public Second create() {		// protected First ⇒ public Second と変更

		return new Second();		// Secondクラスのインスタンスを返す
	}

	protected First create(int n) {	// シグニチャが違うのでオバーロードになる
		return new First();
	}
}
