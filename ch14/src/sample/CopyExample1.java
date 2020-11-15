package sample;
import java.nio.file.*;		// java.nio.fileのすべてをインポートする
public class CopyExample1 {
	public static void main(String[] args) throws Exception {
		Path source = Paths.get("foo/bar/note.txt");	// コピー元
		Path target = Paths.get("temp/note.txt");		// コピー先
		Files.copy(source, target);					// コピーする
	}
}
