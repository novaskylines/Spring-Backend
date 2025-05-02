package practice;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 열개 입력하세요>>");
		int[] intArr = new int[10];
		for (int i = 0; i < 10; i++) {
			intArr[i] = sc.nextInt();
		}
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 3 == 0) {
				System.out.print(intArr[i] + " ");
			}
		}

	}

}
