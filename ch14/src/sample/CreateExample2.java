package sample;

import java.nio.file.*;// java.nio.file内のすべてをインポートする

public class CreateExample2 {
	public static void main(String[] args) throws Exception { // 例外をかわす
		Path path = Paths.get("foo/bar");  // 作成するディレクトリのパス
		Files.createDirectories(path);  // 複数のディレクトリを作る
	}
}
