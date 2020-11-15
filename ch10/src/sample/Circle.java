package sample;

class Circle extends GeometricShape {	// 円形のクラス
	private double radius;				// 半径

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {					// 面積を計算して返す（オーバーライド）
		return radius * radius * Math.PI;
	}

	@Override
	public String getName() {				// 図形の名前を返す（オーバーライド）
		return "円　形";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
