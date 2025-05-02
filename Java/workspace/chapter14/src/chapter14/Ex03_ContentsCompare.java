package chapter14;

public class Ex03_ContentsCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Apple");
		String str2 = new String("apple");
		String str3 = new String("Banana");
		// 안에 저장되어있는 문자열이 같은지 확인
		if (str1.equals(str3)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열을 다릅니다.");
		}
		// str1 - str2 비교. 사전순으로 누가 앞에 있는지 비교하며, 앞에 있는 글자를 우선으로 비교
		int cmp = str1.compareTo(str2);
		System.out.println(cmp);
		if (cmp == 0) {
			System.out.println("두 문자열은 일치합니다.");
		} else if (cmp < 0) {
			System.out.println("사전의 앞에 위치하는 문자: " + str1);
		} else {
			System.out.println("사전의 앞에 위치하는 문자: " + str2);
		}
		// 대소문자를 무시하고 비교
		if(str1.compareToIgnoreCase(str2)==0) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열을 다릅니다.");
		}

	}

}
