package sample;
import java.io.*;
import java.nio.file.*;

public class NewBufferedWriterExample {
	public static void main(String[] args) {
			Path path = Paths.get("data.txt");
		try(BufferedWriter out = Files.newBufferedWriter(path, 
							StandardOpenOption.CREATE,	 // 存在しなければ作成する 
							StandardOpenOption.APPEND);){ // 追記モード
 			// 追記処理
				out.write(110+"\t");		// "\t"を連結してintをStringにする
				out.write("佐藤一郎"+"\t");
				out.write(73.2+"\n");		// "\n"を連結してdoubleをStringにする
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
}
