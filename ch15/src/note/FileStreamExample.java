package note;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExample {

	public static void main(String[] args) throws IOException{
		Path path = Paths.get("nagasaki_ms932.txt");
		
		Stream<String> st  
			= Files.lines(path, Charset.forName("MS932"));
	    st.forEach(System.out::println);
	}
}
