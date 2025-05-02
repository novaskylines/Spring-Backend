package practice2;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> nations = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("나라 이름과 수도를 입력하세요. (예: Korea 서울)");
		System.out.println();
		while (true) {
			try {
				System.out.print("나라 이름, 수도 >> ");
				String nation = sc.next();
				if (nation.equals("그만")) {
					sc.nextLine();
					System.out.println();
					break;
				}
				String capital = sc.nextLine().trim();
				nations.put(nation, capital);
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("(나라 이름) + (수도) 형식으로 입력 바랍니다. (예: Korea 서울)");
				sc.nextLine();
			}
		}
		while (true) {
			try {
				System.out.print("수도 검색 >> ");
				String nation = sc.nextLine();
				System.out.println();
				if (nation.equals("그만")) {
					System.out.println("End");
					break;
				} else if (nations.containsKey(nation)) {
					System.out.println(nation + "의 수도는 " + nations.get(nation));
				} else {
					System.out.println(nation + "의 수도는 존재하지 않습니다.");
				}
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("String의 형식으로 입력해주시기 바랍니다.");
				sc.nextLine();
			}
		}

	}

}
