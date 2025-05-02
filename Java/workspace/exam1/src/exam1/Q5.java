package exam1;

import java.util.HashMap;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			nations.put(sc.next(), sc.nextInt());
		}

		int min = -1;
		String minName = "";
		for (String s : nations.keySet()) {
			if (min == -1 || min > nations.get(s)) {
				min = nations.get(s);
				minName = s;
			}
		}

		System.out.println("제일 인구가 적은 나라는 (" + minName + ", " + min + ")");

		sc.close();
	}

}
