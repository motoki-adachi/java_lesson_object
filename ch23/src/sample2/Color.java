package sample2;
public enum Color {
	
	WHITE("WS202-1"), 
	BLACK("BS202-1"), 
	GOLD("GS202-1");
	
	//////////////////////////////////////////////////////////////////////
	
	private String ModelNumber;    		// フィールド変換

	private Color(String ModelNumber) {  // コンストラクタ
		this.ModelNumber = ModelNumber;
	}

	public String getModelNumber() {  		// ゲッター
		return ModelNumber;
	}
}