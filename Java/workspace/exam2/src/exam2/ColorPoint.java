package exam2;

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

public class ColorPoint extends Point {

	private String color;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();

	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	private void setPoint(int x, int y) {
		// TODO Auto-generated method stub
		super.move(x, y);
	}

	private void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	private void show() {
		// TODO Auto-generated method stub
		System.out.println(this.color + "색으로 (" + super.getX() + ", " + super.getY() + ")");
	}

}
