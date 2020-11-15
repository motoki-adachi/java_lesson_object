package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateExample1 {
	public static void main(String[] args) {
		Path path = Paths.get("temp");		// 作成するディレクトリのパス
		try {
			Files.createDirectory(path); // ディレクトリを作成する
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
