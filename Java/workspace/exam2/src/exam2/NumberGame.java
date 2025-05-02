package exam2;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		int computer = rand.nextInt(99) + 1;
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		if (computer % 2 == 0) {
			System.out.println("힌트는 짝수입니다.");
		} else {
			System.out.println("힌트는 홀수입니다.");
		}
		int count = 0;
		while (true) {
			try {
				System.out.print("1~100 사이의 값을 입력 >> ");
				int guess = sc.nextInt();
				count++;
				if (guess > computer) {
					System.out.println("더 작은 수입니다.");
				} else if (guess < computer) {
					System.out.println("더 큰 수입니다.");
				} else {
					System.out.println(count + "회 만에 맞췄습니다.");
					break;
				}
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
			}
		}

		System.out.println("=== 게임을 종료합니다. ===");
		sc.close();

	}

}
