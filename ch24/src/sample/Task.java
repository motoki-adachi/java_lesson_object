package sample;
import java.util.concurrent.TimeUnit;

class Task {		////// 仕事をするクラス //////
	private String msg;

	public Task(String msg) {
		this.msg = msg;
	}

	public void doit() {
		System.out.println(msg);		// フィールドの文字列を表示する
		// 遅延をシミュレートするため1秒間停止する
		try {
			TimeUnit.SECONDS.sleep(1);	// 1秒間停止する
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}
	// 以下省略
}
