package sample;
import java.nio.file.*;

public class DeleteExample1 {
	public static void main(String[] args) throws Exception {
		Path target = Paths.get("foo/bar/memo.txt"); // 削除対象のパス
		if(Files.exists(target)) {       // ファイルがあれば、
			Files.delete(target);        // 削除する
		}
	}
}
