package sample;

interface Bar<T, R> {// 総称型インタフェース
	R get(T obj);
}

// 実装してみる
class MyBar implements Bar<String, Integer> { // 具体的な型を指定する
	@Override
	public Integer get(String obj) { // 具体的な型を指定する
		return obj.length();
	}
}