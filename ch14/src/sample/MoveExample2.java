package sample;
import java.nio.file.*;

public class MoveExample2 {
	public static void main(String[] args) throws Exception {
		Path source = Paths.get("temp/memo.txt");		// 元のパス
		Path target = Paths.get("foo/bar/memo.txt");	// 移動先のパス
		Files.move(source, target);					// 移動
	}
}
