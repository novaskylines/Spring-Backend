package practice;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("1~99까지의 정수를 입력하세요:");
		int num = sc.nextInt();
		int count = 0;
		while (num >= 1) {
			int num2 = num % 10;
			if (num2 != 0 && num2 % 3 == 0) {
				count++;
			}
			num = (int) (num / 10);
		}
		if (count == 1) {
			System.out.println("박수짝");
		} else if (count == 2) {
			System.out.println("박수짝짝");
		}

	}

}
