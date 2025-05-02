package ifpractice;

import java.util.Scanner;

public class ifpractice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 400 -> 1 100 -> 0 4 -> 1 else -> 0
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해주세요 >> ");
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0)
				|| (year%400==0)) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}
		
		int y400 = year%400>0 ? 0 : 1;
		int y100 = year%100>0 ? 0 : 1;
		int y4 = year%4>0 ? 0 : 1;
		String result = ""+y400+y100+y4;
		System.out.println(result);
		switch(result) {
		case "100": case "110": case "111": case "001": case "101":
			System.out.println("윤년");
			break;
		default:
			System.out.println("윤년 아님");
			break;
		}

	}

}
