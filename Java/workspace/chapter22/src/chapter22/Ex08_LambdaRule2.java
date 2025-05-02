package chapter22;

@FunctionalInterface
interface Unit8 {
	void move(String s);
	// @FunctionalInterface를 사용해 메서드를 하나만 작성하게 할 수 있음
	// 두 개 이상 작성 시 에러
}

interface Unit9 {
	int calc(int a, int b);
}

public class Ex08_LambdaRule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit8 unit;
		unit = (String s) -> {System.out.println(s);};
		unit.move("Lambda: 줄임 없는 표현: 앞 예제 동일");
		// 실행코드가 1줄 -> 중괄호 생략
		unit = (String s) -> System.out.println(s);
		unit.move("Lambda: 중괄호 생략");
		// 매개변수 형이 하나 -> 매개변수의 형 생략
		unit = (s) -> System.out.println(s);
		unit.move("Lambda: 매개변수형 생략");
		// 매개변수가 하나 -> 매개변수의 소괄호 생략
		unit = s -> System.out.println(s);
		unit.move("Lambda: 매개변수 소괄호 생략");
		
		Unit9 unit2;
		unit2 = (a,b) -> {return a+b;}; 
//		unit2 = a,b -> {return a+b;}; // 매개변수가 둘 -> 소괄호 생략 불가
//		unit2 = (a,b) -> return a+b; // return 문은 중괄호 생략 불가
		unit2 = (a,b) -> a+b; // return을 생략할 경우 중괄호 생략 가능
		
		// 헷갈릴 수 있기 때문에 생략은 최소화해도 좋음: 자료형 정도
	}

}
