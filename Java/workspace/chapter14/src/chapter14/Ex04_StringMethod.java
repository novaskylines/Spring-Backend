package chapter14;

public class Ex04_StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// indexOf("문자열")
		String str = "AppleBananaOrange";
		System.out.println(str.indexOf("a")); // 6번째에 첫 a
		System.out.println(str.indexOf("Banana")); // 5번째에 첫 Banana
		System.out.println(str.indexOf("na")); // 7번째에 첫 na
		System.out.println(str.indexOf("na",7)); // 7번째부터 시작해 7번째에 첫 na
		System.out.println(str.indexOf("na",8)); // 8번째부터 시작해 9번째에 첫 na
		if(str.indexOf("Banana")>0) {
			System.out.println("문자열 안에 바나나가 있습니다.");
		}
		// substring: 시작~종료위치까지 문자열을 돌려주는 메서드
		System.out.println(str.substring(0,5));
		System.out.println(str.substring(5,str.indexOf("Orange")));
		// 시작위치만 적어도 가능
		System.out.println(str.substring(str.indexOf("Orange")));
		
		// length()
		System.out.println(str.length());
		
		// charAt(문자위치) - 문자 위치에 있는 문자
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		// valueOf(값) - 다른 타입의 자료형을 String으로 변환
		double e = 2.718281;
		String se = String.valueOf(e);
		System.out.println(se);
		// toString(값) - 객체 자료형을 String으로 변환
		Double e2 = 2.718281;
		System.out.println(e2.toString());
		
		// 대문자 -> 소문자
		System.out.println(str.toLowerCase());
		// 소문자 -> 대문자
		System.out.println(str.toUpperCase());
		
		// 앞뒤 공백 제거
		System.out.println("  trim  ".trim());
		
		// 문자열 연산하기
		// concat(더하고 싶은 문자열): 문자열을 더해주는 함수
		System.out.println(str.concat("Berry"));
		System.out.println(str+"Melon");
		
		str += "Melon";
		
		

	}

}
