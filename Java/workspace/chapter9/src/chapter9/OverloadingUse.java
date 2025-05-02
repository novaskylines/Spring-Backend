package chapter9;

// 메서드 오버로딩: 매개변수의 개수나 자료형을 다르지만 메서드명은 같은 여러 메서드를 정의
// 같은 이름으로 매개변수 작성 시 자료형이 달라도 작동되게 하기 위해서

// 중요: PUBLIC 클래스는 파일 이름이랑 같아야 한다. 다른 클래스에는 절대로 퍼블릭을 붙이지 않는다.
class Calc{
	// 메서드의 이름이 같아도 매개변수의 개수가 다르거나 자료형이 다르다면 다른 메서드로 생성할 수 있다
	int add(int a, int b) {
		return a+b;
	}
	int add(int a) {
		return a+1;
	}
	//반환 타입은 다르지만 매개변수가 같아 에러 발생
//	double add(int a) {
//		return 1+1;
//	}
	double add(double a, double b) {
		return a+b;
	}
	int add(double a) {
		return (int)a+1;
	}
}

public class OverloadingUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		double d = 3.14;
		String s = "홍길동";
		// println은 메서드 오버로딩을 이용해 작성되었기 때문에 매개변수에 상관없이 사용가능
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		System.out.println();

	}

}
