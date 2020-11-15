package sample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MultiCatch2 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("test.txt"));
			String str = (String) ois.readObject();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
