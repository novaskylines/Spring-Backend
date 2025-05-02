package ifpractice;

import java.util.Scanner;

public class ifpractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("커피 주문하세요 >> ");
		String str1 = sc.next();
		int int1 = sc.nextInt();
		int price = 0;
		if (str1.equals("에스프레소")) {
			price = 2000;
		} else if (str1.equals("아메리카노")) {
			price = 2500;
		} else if (str1.equals("카푸치노")) {
			price = 3000;
		} else if (str1.equals("카페라떼")) {
			price = 3500;
		}
		System.out.println((price*int1)+"원입니다.");
		switch(str1) {
		case "에스프레소":
			price=2000;
			break;
		case "아메리카노":
			price=2500;
			break;
		case "카푸치노":
			price=3000;
			break;
		case "카페라떼":
			price=3500;
			break;
		}
		System.out.println((price*int1)+"원입니다.");
		
	}

}
