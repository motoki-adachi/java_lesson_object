package sample;
import java.io.*;

public class PrintWriterExample {
	public static void main(String[] args) {

		try(PrintWriter out = new PrintWriter("data.txt");) {
			out.print(100);			// 番号
			out.print("\t");		// 区切り文字
			out.print("田中宏");	// 氏名
			out.print("\t");		// 区切り文字
			out.println(60.5);		// 体重
		} 
		catch (IOException e) {
			e.printStackTrace(); 	// 例外の内容と例外発生までの呼び出し経路を表示する
		}
	}
}
