package exam1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();
			if (str.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}

			StringTokenizer st = new StringTokenizer(str, ",");
			System.out.println("어절 개수는 " + st.countTokens());

		}

		sc.close();

	}

}
