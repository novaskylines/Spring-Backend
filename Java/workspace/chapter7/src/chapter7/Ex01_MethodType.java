package chapter7;

public class Ex01_MethodType {
//	public, private, protect
//	접근제어자(public)
//		정적메서드(static)(클래스 이름으로 사용 가능하도록 생성)
//			반환타입(void): void=반환하지 않음, 자료형=해당 타입을 반환
// 				메서드 이름(main): 카멜 표기법
//					매개변수(string[] args): 메서드가 실행될 때 필요한 데이터
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드와 함수의 차이
		// 함수: 특정한 매개변수를 넣으면 특정한 값을 돌려주는 기능
		// 메서드: 클래스 안에 있는 함수 / 클래스: 메서드와 변수를 담아서 정리한 공간
		// 앞으로 클래스 안에서 쓰는 모든 함수는 모두 메서드로 취급.
		
		// 자바에서 메서드 선언 방식
		// 메서드 생성시 필수로 적어야 하는 명령어: 반환타입, 메서드이름, 매개변수
		// 메서드 안에서는 메서드를 선언할 수 없다!
		
		// 메서드 실행
		// 클래스 선언하기
		// 클래스를 선언해서 만든 결과물 ex01을 인스턴스라고 한다
		// 인스턴스가 선언되어야만 데이터가 메모리에 담기며, 실행할 수 있게 된다.
		Ex01_MethodType ex01 = new Ex01_MethodType();
		// 클래스 이름 뒤에 .을 붙여 메서드 이름 작성하기
		System.out.println(ex01.add(5, 10));
		
		//static 메서드의 경우 클래스 선언 없이 사용
		// 정적 메서드는 언제든지 메모리에서 불러올 수 있지만, 항상 불러와야 하는 메서드가 아니면 잘 사용하지 않음
		System.out.println(Ex01_MethodType.pow(2,2));
		
		//return이 없는 메서드
		// 데이터를 저장한다거나 하는 작업을 실행할 때 이런 메서드를 사용
		ex01.sayHello();
		
		// / by 0 error -> 메서드 내에서 해결
		ex01.divide(1, 0);

	}
	
	void sayHello() {
		System.out.println("Hello World!");
	}
	
	int add(int x, int y) {
		return x+y;
	}
	int minus(int x, int y) {
		return x-y;
	}
	int mul(int x, int y) {
		return x*y;
	}
	double div(int x, int y) {
		return x/y;
	}
	static int pow(int x, int count) {
		int result = x;
		for(int i=1; i<count; i++) {
			result = result*x;
		}
		// return에 모든 값을 적을 필요는 없음
		return result;
				
	}
	
	public static void divide(int x, int y) {
		if(y==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println(x/y);
		
	}

}
