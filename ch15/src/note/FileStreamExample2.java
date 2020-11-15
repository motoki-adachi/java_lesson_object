package note;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExample2 {
	public static void main(String[] args) {
		Path path = Paths.get("nagasaki_ms932.txt");
		try(Stream<String> st 
			  = Files.lines(path, Charset.forName("MS932"));){ 
			st.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
