package sample;
import java.util.concurrent.CompletableFuture;

public class Example1 {
	public static void main(String[] args) throws Exception {
		CompletableFuture<String> future
			= CompletableFuture.supplyAsync(() -> "value");

		// 結果の取得
		String msg = future.get();
		System.out.println(msg);
	}
}