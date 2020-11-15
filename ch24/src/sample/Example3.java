package sample;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Example3 {
	public static void main(String[] args) throws Exception {
		CompletableFuture<String> future 
			= CompletableFuture
				.supplyAsync(() -> "hello")
				.orTimeout(1, TimeUnit.SECONDS)  	// タイムアウト設定
				.whenComplete((ret, err) -> {   	// エラー対策処理
					if(err == null) {
						// thenAcceptで実行していた処理
						System.out.println("★" + ret);
					} else {
						System.out.println("エラーです");  // エラー処理
					}
				});
	}
}