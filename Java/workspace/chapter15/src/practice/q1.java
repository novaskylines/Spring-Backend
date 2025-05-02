package practice;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String str = sc.next();
		char ch = str.charAt(0);
//		System.out.println(ch);
//		System.out.println((int) ch);

		for (int i = 97; i <= (int) ch; i++) {
			String result = "";
			for (int l = i; l <= (int) ch; l++) {
				result += (char) l;
			}
			System.out.println(result);
		}

	}

}
