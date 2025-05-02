package exam1;

import java.util.Scanner;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Circle[] circArr = new Circle[4];

		for (int i = 0; i < 4; i++) {
			System.out.print((i + 1) + " 반지름 >> ");
			circArr[i] = new Circle(sc.nextInt());
		}

		sc.close();

		System.out.println("저장하였습니다...");
		System.out.println("원의 면적 전체 합은 "
				+ (circArr[0].getArea() + circArr[1].getArea() + circArr[2].getArea() + circArr[3].getArea()));

	}

}
