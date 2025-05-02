package practice;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}

class NamedCircle extends Circle {
	private String name;

	// 부모 클래스에 생성자가 있다면 자식 클래스의 생성자에서 부모 클래스의 생성자를 사용해야함
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}

	void show() {
		System.out.println(super.getRadius() + ", " + name);
	}

}

public class CircleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}

}
