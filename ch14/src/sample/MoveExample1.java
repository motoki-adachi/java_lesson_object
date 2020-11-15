package sample;
import java.nio.file.*;
public class MoveExample1 {
	public static void main(String[] args) throws Exception  {
		Path source = Paths.get("temp/note.txt");	// 元のパス
		Path target = Paths.get("temp/memo.txt");	// 変更後のパス
		Files.move(source, target);				// 名前の変更
	}
}
