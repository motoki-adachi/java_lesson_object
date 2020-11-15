package note;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FinallySample {
	public static void main(String[] args) throws Exception  {	// 例外をかわす

	}

	public static void methodA(){	
		Path path = Paths.get("my.txt");

		BufferedReader in = null;
		try{
			in = Files.newBufferedReader(path);	// 例外を投げる可能性がある
			//
			//
		}
		catch(IOException e){	// 例外処理
			e.printStackTrace();
		}
		finally{				
			if(in != null){
				try {
					in.close();// 常にclose()を実行する
				} catch (IOException e) {
					e.printStackTrace();
				}		
			}
		}

	}
}
