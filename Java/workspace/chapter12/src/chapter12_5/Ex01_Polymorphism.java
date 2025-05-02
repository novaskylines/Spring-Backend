package chapter12_5;

abstract class Calc {
	int a = 5;
	int b = 6;

	abstract void plus();
}

class Mycalc extends Calc {
	void plus() {
		System.out.println((a+b)+"MyCalc의 plus결과");
	}

	void minus() {
		System.out.println((a-b)+"MyCalc의 minus결과");
	}
}

class Yourcalc extends Calc {
	void plus() {
		System.out.println((a+b)+"YourCalc의 plus결과");
	}

	void minus() {
		System.out.println((a-b)+"YourCalc의 minus결과");
	}
}
public class Ex01_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalc myCalc = new Mycalc();
		myCalc.plus();
		myCalc.minus();

		// 부모 클래스의 타입에 자식클래스의 생성자를 사용해 인스턴스 생성
		Calc myCalc2 = new Mycalc();
		// 부모클래스의 메서드는 실행 가능 -> 실행 코드는 자식클래스의 코드가 일정함
		myCalc2.plus();
		
		Calc yourCalc = new Yourcalc();
		yourCalc.plus();
		// 부모 클래스의 인스턴스를 자식 클래스로 변경하는 방법
		Yourcalc changeCalc = (Yourcalc)yourCalc;
		changeCalc.minus();

	}

}
