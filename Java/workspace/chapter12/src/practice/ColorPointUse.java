package practice;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String str) {
		super(x, y);
		this.color = str;
		// TODO Auto-generated constructor stub
	}

	public void setPoint(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String str) {
		color = str;
	}

	public void show() {
		System.out.println(this.color + "색으로(" + getX() + "," + getY() + ")");
	}

}

public class ColorPointUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
		ColorPoint cp1 = new ColorPoint(5, 5, "YELLOW");
		cp.show();
		cp1.show();

	}

}
