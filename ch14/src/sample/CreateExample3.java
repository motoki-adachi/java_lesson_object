package sample;

import java.nio.file.*;

public class CreateExample3 {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get("foo/bar/note.txt");     // ファイルのパス
		Files.createFile(path);          				// ファイルを作る
	}
}
