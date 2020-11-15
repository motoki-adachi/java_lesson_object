package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MultiCatch1 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("test.txt")); // 15章
			String str = (String) ois.readObject();
		} catch (FileNotFoundException e) { 	// アクセスしたがファイルがなかった
			e.printStackTrace();     			// p.262を参照
		} catch (IOException e) {   			// 一般的な入出力処理のエラー
			e.printStackTrace();
		} catch (ClassNotFoundException e) {  	// クラスファイルがない
			e.printStackTrace();
		}
	}

}
