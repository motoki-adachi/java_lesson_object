package sample;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferedReaderWithCharset {
	public static void main(String[] args) throws IOException {
		// PathとFilesを使ってBufferedReaderを作る
		Path path = Paths.get("nagasaki_ms932.txt");
		BufferedReader in = Files.newBufferedReader(path, Charset.forName("MS932"));

		// While文を使ってすべてのデータを読み出し、コンソールに表示する
		String line;						// 行データを入れる変数
		while((line = in.readLine()) != null) {	// nullでない間、繰り返す
			System.out.println(line);		// １行分を表示する
		}
	}
}
