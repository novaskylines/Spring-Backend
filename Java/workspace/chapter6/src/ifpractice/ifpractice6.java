package ifpractice;

import java.util.Scanner;

public class ifpractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요 >> ");
		String str = sc.next();
		switch(str) {
		case "A": case "B":
			System.out.println("Excellent");
			break;
		case "C": case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
			break;
		}

	}

}
