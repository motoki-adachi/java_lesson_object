package sample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample1 {

	public static void main(String[] args) {
		Path p = Paths.get("c:/docs/note.txt");			// 絶対パスを作る
		System.out.println(p);							// 絶対パスを表示
		System.out.println(p.getRoot());				// 絶対パスの起点を得る
		System.out.println(p.getParent());				// 親ディレクトリを得る
		System.out.println(p.getFileName());			// ファイル名だけを得る
	}
}
