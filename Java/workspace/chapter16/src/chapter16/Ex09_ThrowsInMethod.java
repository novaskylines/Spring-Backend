package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod {
	
	public static void myMethod1() {
		// myMethod2에 throws가 있으면 try catch로 예외처리를 하거나 myMethod에 throws를 해야한다
		myMethod2();
	}
	public static void myMethod2() 
		// 그래서 여기서 myMethod1으로 throws
		throws ArithmeticException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 10/num1;
		System.out.println(num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			myMethod1();
		} catch (ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("------");

	}

}
