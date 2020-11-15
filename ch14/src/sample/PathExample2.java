package sample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample2 {

	public static void main(String[] args) {
		Path p = Paths.get("note.txt");				// Pathを作る
		System.out.println(p);
		System.out.println(p.toAbsolutePath());		// 絶対パスに変換
		p = Paths.get("");							// 相対カレントディレクトリ
		System.out.println(p.toAbsolutePath());		// 絶対カレントディレクトリ
	}

}
