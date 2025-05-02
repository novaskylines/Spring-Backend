
public class Ex03_CircleUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.company.area.Circle c1 = new com.company.area.Circle(3.5);
		System.out.println("반지름 3.5의 원의 넓이 "+c1.getArea());

		com.company.circumference.Circle c2 = new com.company.circumference.Circle(3.5);
		System.out.println("반지름 3.5의 원의 둘레 "+c2.getCircumference());

	}

}
