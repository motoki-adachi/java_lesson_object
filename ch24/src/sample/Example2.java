package sample;
import java.util.concurrent.CompletableFuture;

public class Example2 {
	public static void main(String[] args) throws Exception {
		CompletableFuture<Void> future 
			= CompletableFuture
				.supplyAsync(() -> "Value")
				.thenAccept(result -> { // resultはsupplyAsyncからの戻り値
					// 戻り値を使って後続の処理を実行する
					System.out.println("★" + result); // ダミーの後続の処理
				});
	}
}