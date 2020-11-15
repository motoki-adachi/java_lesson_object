package sample;
import java.nio.file.*;

public class DeleteExample2 {
	public static void main(String[] args) throws Exception {
		Path target = Paths.get("foo/bar/note.txt");// 削除対象のパス
		Files.deleteIfExists(target);		// ファイルがあれば削除する
	}
}
