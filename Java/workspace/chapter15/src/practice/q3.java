package practice;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		String str = sc.next();

		if (checkStr(str)) {
			int num = Integer.parseInt(str);
			checkInt(num);
		} else {
			System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
		}

	}

	static boolean checkStr(String str) {
		for (int i = 0; i < str.length(); i++) {
			char cur = str.charAt(i);
			char zero = '0';
			char nine = '9';
			if (cur < zero || cur > nine) {
				return false;
			}
		}
		return true;
	}

	static void checkInt(int num) {
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
