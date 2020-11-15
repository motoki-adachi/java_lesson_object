package sample;
/*
 * 例題で利用するスマートフォンのクラス
 */
public class SmartPhone {
	private String  type;	// 型番	
	private Color color;	// 本体の色（白:1、黒:2、ゴールド:3）

	public SmartPhone(String type, Color color) {
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public Color getColor() {
		return color;
	}
	public String toString() {
		return "SmartPhone [" + 
				" type=" + type +
				", color=" + color + 
				" ]";
	}
}
