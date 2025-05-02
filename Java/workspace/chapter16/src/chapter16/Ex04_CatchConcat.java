package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_CatchConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int num1 = sc.nextInt();
			int num2 = 10 / num1;
			System.out.println(num2);
			// OR 기호를 이용하여 여러가지 예외를 동시에 처리
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("예외 발생");
			// e는 예외에 대한 정보를 담고 있음.
			// 예외의 이름, 발생시의 메세지, 어디서 발생했는지 위치를 알려줌
			// 예외 처리이기 때문에 메세지가 출력되더라도 프로그램이 멈추지 않음
			e.printStackTrace();
			// 발생 시의 메세지만을 반환
			System.out.println(e.getMessage());
			// 모든 Exception계열 클래스는 Exception을 상속받음 -> 즉, Exception e는 모든 Exception을 대상으로 함
		} catch (Exception e) {
			System.out.println("위에서 작성하지 않은 모든 예외를 처리");
		}
		System.out.println("Good Bye~~!");
	}

}
