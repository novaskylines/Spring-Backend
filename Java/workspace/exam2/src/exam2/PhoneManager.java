package exam2;

import java.util.HashMap;
import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	private String address;

	Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	String getName() {
		return name;
	}

	String getTel() {
		return tel;
	}

	String getAddress() {
		return address;
	}
}

public class PhoneManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Phone> phoneMap = new HashMap<String, Phone>();

		System.out.print("인원수 >> ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			try {
				System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
				String name = sc.next(), tel = sc.next(), address = sc.nextLine().trim();
				phoneMap.put(name, new Phone(name, tel, address));
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
				i--;
			}
		}
		System.out.println("저장되었습니다...\n");

		while (true) {
			try {
				System.out.print("검색할 이름 >> ");
				String str = sc.nextLine();
				if (str.equals("exit")) {
					System.out.println("프로그램을 종료합니다...");
					break;
				}
				System.out.println(str + "의 번호와 주소는 " + phoneMap.get(str).getTel() + ", "
						+ phoneMap.get(str).getAddress() + " 입니다.");
			} catch (Exception e) {
				sc.nextLine();
				e.printStackTrace();
			}
		}

		sc.close();

	}

}
