package sample;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Path path = Paths.get("data.txt");			// ファイルのパス
		
		try(Scanner in = new Scanner(path);) {		// Scannerを生成する
			
			//区切り文字を変更する
			in.useDelimiter("[ \t]+|"+System.lineSeparator());
			
			while(in.hasNext()) {					// 残りがある間繰り返す
				int number = in.nextInt();			// intの値にして取り出す
				String name = in.next();			// Stringのまま取り出す
				double weight = in.nextDouble();	// doubleの値にして取り出す
				
				// 編集してコンソールに表示する
				System.out.println(number + "\t" + name + "\t" + weight);
				
			}
		} 
		catch (IOException e) {
			e.printStackTrace(); // 例外の内容と例外発生までの呼び出し経路を表示する
		}
	}
}
