package sample;
import java.util.concurrent.CompletableFuture;

public class Example5 {
	public static void main(String[] args) throws Exception {
		CompletableFuture<String> future 
			= CompletableFuture.supplyAsync(() -> "★★")
				.thenCombine(
					CompletableFuture.supplyAsync(() -> "☆☆"), (r1, r2) -> r1 + r2)

				.whenComplete((ret, err) -> {
					if(err == null) {
						System.out.println("〇" + ret + "〇");
					} else {
						System.out.println("エラーです");   // エラー対策
					}
				});
	}
}