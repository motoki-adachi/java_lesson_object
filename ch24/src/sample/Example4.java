 package sample;
  import java.util.concurrent.CompletableFuture;
  public class Example4 {
    public static void main(String[] args)  throws Exception{
      CompletableFuture<String> future
        = CompletableFuture.supplyAsync(() -> "Value")
 
        .thenCompose(result->CompletableFuture.supplyAsync(()->"★"+result))

        .whenComplete((ret, err)-> { // retは2つ目の非同期処理の戻り値
        	if(err==null) {
        		System.out.println(ret +"★");
        	}else {
        		System.out.println("エラーです");
        	}
        });
   }
 }
