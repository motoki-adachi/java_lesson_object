package sample;
import java.io.*;
import java.nio.file.*;

public class NewBufferedReaderWithTry {
	public static void main(String[] args) {
		Path path = Paths.get("nagasaki.txt");

		// リソース付きtry文
		try(BufferedReader in = Files.newBufferedReader(path);) {
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} 
		catch (IOException e) {
			e.printStackTrace(); // 例外の内容と例外発生までの呼び出し経路を表示する
		}
	}
}
