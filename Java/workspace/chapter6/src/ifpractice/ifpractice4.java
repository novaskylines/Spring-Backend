package ifpractice;

import java.util.Scanner;

public class ifpractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요 >> ");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		switch(str2) {
		case "AND":
			if (str1.equals("True") && str2.equals("True")) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			break;
		case "OR":
			if (str1.equals("True") || str2.equals("True")) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			break;		
		}

	}

}
