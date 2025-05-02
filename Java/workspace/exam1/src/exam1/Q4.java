package exam1;

import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> drinks = new HashMap<String, Integer>();

		drinks.put("밀키스", 700);
		drinks.put("코카콜라", 800);
		drinks.put("펩시", 1000);
		drinks.put("칠성사이다", 1200);

		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");

		while (true) {
			try {
				System.out.print("선택 >> ");
				String str = sc.nextLine();
				if (str.equals("그만")) {
					System.out.println("종료합니다...");
					break;
				}
				System.out.println(str + "는 " + drinks.get(str) + "원 입니다.");
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
			}
		}

		sc.close();
	}

}
