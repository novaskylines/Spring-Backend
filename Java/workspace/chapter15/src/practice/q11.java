package practice;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("지불할 금액을 정수로 입력하세요>>");
		String str = sc.next();
		String[] parts = str.split(",");
		String str2 = "";
		for (int i = 0; i < parts.length; i++) {
			str2 += parts[i];
			System.out.println(str2);
		}
		int num = Integer.parseInt(str2);

		// 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
		int[] moneyType = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5 };

		for (int i = 0; i < 9; i++) {
			num = coinCalc(moneyType[i], num);
		}
		System.out.print("1원권 " + num + "매");

	}

	static int coinCalc(int money, int num) {
		String moneyStr="";
		if (money < 1000) {
			moneyStr = "원";
		} else {
			moneyStr = "원권";
		}
		System.out.print(money + moneyStr + " " + (int) (num / money) + "매, ");
		return num % money;
	}

}
