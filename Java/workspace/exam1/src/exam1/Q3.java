package exam1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> accountMap = new HashMap<String, Integer>();

		System.out.println("<< 통장 관리 시스템입니다 >>");

		while (true) {
			try {
				System.out.print("이름과 금액 입력>>");
				String str = sc.nextLine();
				if (str.equals("exit")) {
					System.out.println("프로그램을 종료합니다...");
					break;
				}

				StringTokenizer st = new StringTokenizer(str);
				String inputName = st.nextToken();
				int inputMoney = Integer.parseInt(st.nextToken());

				if (accountMap.containsKey(inputName)) {
					accountMap.replace(inputName, accountMap.get(inputName) + inputMoney);
				} else {
					accountMap.put(inputName, inputMoney);
				}

				for (String s : accountMap.keySet()) {
					System.out.print("(" + s + ">" + accountMap.get(s) + "원)");
				}
				System.out.println();
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
			}

		}

		sc.close();

	}

}
