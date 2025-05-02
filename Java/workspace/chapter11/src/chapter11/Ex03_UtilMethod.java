package chapter11;

public class Ex03_UtilMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calc1 = new MyCalculator();
		int num1 = calc1.adder(1, 2);
		System.out.println(num1);
		
		// 자주 사용하는 기능의 경우 static으로 작성하여 빠르게 처리할 수 있음
		int num2 = MyCalculator.adder(2, 3);
		// System의 대표적인 static 사용방식이 println
		System.out.println(num2);
		// Math도 static 변수.
		// ctrl을 누르고 클래스 이름 위에 호버하면 그 클래스가 있는 파일로 이동 가능
		System.out.println(Math.random());
	}

}
