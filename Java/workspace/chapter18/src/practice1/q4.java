package practice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int player = 0;
		int computer = 0;
		String[] move = { "가위", "바위", "보" };

		while (true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) >> ");
			try {
				player = sc.nextInt();
				System.out.println();
				
				if (player == 4) {
					System.out.println("게임을 종료합니다...");
					break;
				} else if (!(player == 1 || player == 2 || player == 3)) {
					System.out.println("1~4 사이의 숫자를 입력해주세요.");
					System.out.println();
					continue;
				}
				
				computer = (int) Math.ceil(Math.random() * 3);

				System.out.println("사용자 " + move[player - 1] + " : 컴퓨터 " + move[computer - 1]);
				System.out.println();

				int result = player - computer;
				if (result == 0) {
					System.out.println("사용자가 비겼습니다.");
				} else if (result == 1 || result == -2) {
					System.out.println("사용자가 이겼습니다.");
				} else {
					System.out.println("사용자가 졌습니다.");
				}
				System.out.println();

			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("1~4 사이의 숫자를 입력해주세요.");
				System.out.println();
				sc.next();
				continue;
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("예외가 발생했습니다.");
				continue;
			}

		}

	}

}
