package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MultiCatch3 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("test.txt"));
			String str = (String) ois.readObject();
		} 
		catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}
}
