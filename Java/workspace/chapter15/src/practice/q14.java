package practice;

import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String str = sc.next();
		char ch = str.charAt(0);

		for (int i = ch; i >= 'a'; i--) {
			String result = "";
			for (int l = 'a'; l <= i; l++) {
				result += (char) l;
			}
			System.out.println(result);
		}

	}

}
