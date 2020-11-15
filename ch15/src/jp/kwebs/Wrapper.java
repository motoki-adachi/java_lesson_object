package jp.kwebs;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 * I/Oストリーム Wrapping ユーティリティ
 * 
 * @author T.Kawaba
 *
 */
public class Wrapper {
	/**
	 * PrintWriterを返す
	 * @param path	ファイルのパス
	 * @return		PrintWriter
	 * @throws IOException	- 入出力エラーが発生した場合
	 */
	public static PrintWriter newPrintWriter(String path)throws IOException {
		return newPrintWriter(path,"UTF-8", false);
	}
	/**
	 * PrintWriterを返す
	 * @param path			ファイルのパス
	 * @param charset		文字セット
	 * @return				PrintWriter
	 * @throws IOException	- 入出力エラーが発生した場合
	 */
	public static PrintWriter newPrintWriter(String path, String charset)throws IOException {
		return newPrintWriter(path, charset, false);
	}
	/**
	 * PrintWriterを返す
	 * @param path			ファイルのパス
	 * @param mode			追記モードの指定
	 * @return				PrintWriter
	 * @throws IOException	- 入出力エラーが発生した場合
	 */
	public static PrintWriter newPrintWriter(String path, boolean mode)throws IOException {
		return newPrintWriter(path, "UTF-8", mode);
	}
	/**
	 * PrintWriterを返す
	 * @param path			ファイルのパス
	 * @param mode			追記モードの指定
	 * @param charset		文字セット
	 * @return				PrintWriter
	 * @throws IOException	- 入出力エラーが発生した場合
	 */
	public static PrintWriter newPrintWriter(String path, boolean mode, String charset) throws IOException {
		return newPrintWriter(path, charset, mode);
	}
	/**
	 * PrintWriterを返す
	 * @param path			ファイルのパス
	 * @param charset		文字セット
	 * @param mode			追記モードの指定
	 * @return				PrintWriter
	 * @throws IOException	- 入出力エラーが発生した場合
	 */
	public static PrintWriter newPrintWriter(String path, String charset, boolean mode) throws IOException {
		return new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream(path, mode), Charset.forName(charset)));
		
	}
	/**
	 * ObjectOutputStreamを作成して返す
	 * @param path			ファイルのパス
	 * @return				ObjectOutputStream 
	 * @throws IOException	- 入出力エラーが発生した場合
	 */
	public static ObjectOutputStream newObjectOutputStream(String path) throws IOException {
		return new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(path)));
	}
	/**
	 * ObjectInputStreamを作成して返す
	 * @param path			ファイルのパス
	 * @return				ObjectInputStream 
	 * @throws IOException	- 入出力エラーが発生した場合
	 */
	public static ObjectInputStream newObjectInputStream(String path) throws IOException {
		return new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(path)));
	}
}
