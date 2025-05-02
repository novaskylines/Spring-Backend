package chapter2;

public class EX02_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언하기
		// 자료형 변수이름 = 자료형에 맞는 값;
		int number = 10;
		System.out.println(number);
		number = 20;
		System.out.println(number);
		String str = "안녕하세요";
		// 변수 선언 시 주의사항
		// 1. 변수 이름은 중복하면 안됨.
		// 2. 카멜표기법을 사용하여 변수명 작성
		// 3. 변수명만 보고도 의미가 통하도록 작성
		// 4. 예약어(자료형, 조건문, 반복문)은 변수 이름으로 지정 불가.
		
		// 상수 선언하기
		// 상수: 한번 데이터를 저장하면 더 이상 바꿀 수 없는 저장공간
		// 상수 선언과 값 대입을 동시에 실행하기
		final int MAX_NUM = 10;
//		MAX_NUM = 20; 값을 변경할 수 없음
		
		// 상수 선언과 대입을 따로 실행하기
		final int MIN_NUM;
		MIN_NUM = 6;//값을 대입할 수 있음
//		MIN_NUM = 3;  값을 변경할 수 없음
		// 상수 선언 시 주의점
		// 1. 한 번 대입을 하면 두번째 대입은 불가능.
		// 2. 언더스코어 표기법으로 상수 이름 설정(ABC_DEF_G)
		// 3. 변수명만 보고도 의미가 통하도록 작성
		// 4. 예약어(자료형, 조건문, 반복문)은 상수 이름으로 지정 불가.
		
		// 자동 형 변환: 자료형이 자동으로 변경되어 저장되는 것
		// 숫자를 직접적으로 적으면 int타입이 만들어지고, 이를 byte에 저장 시 byte타입으로 자동 형 변환이 이루어진다
		byte a = 127;
//		byte b = 128; 자동 형 변환이 안 되는 값을 넣으면 에러가 발생 (byte에 128 이상의 정수를 넣는 등)
		long c = 1; // int타입을 long에 저장할 때 int로 충분히 표시 가능한 값은 뒤에 L을 적지 않아도 대입 가능
//		long d = 2147483648; // 반면 int로 표시할 수 없는 값은 뒤에 L을 적어 long으로 바꿔야만 대입 가능
		long d = 2147483648L; 
		
		// 실수를 적으면 기본이 double 자료형. 그러나 double이 더 큰 자료형이므로 double을 float에 저장 불가.
		float f = 3.14F;
		double db = 3.14;
		// 자동 형 변환으로 인한 문제를 방지하기 위해 int, long, double만을 우선해서 사용
		
		// 연산 시 자동 형 변환
		int num1 = 10;
		byte num2 = 20;
//		byte result1 = num1 + num2; // int + byte에서 int를 byte로 자동 형 변환 불가
		int result2 = num1 + num2; // int + byte에서 byte를 int로 자동 형 변환이 이루어진 후 계산됨
		
		// 수동 형 변환(cast) 또는 강제 형 변환
		byte result3 = (byte)(num1 + num2); // num2가 자동 형 변환으로 int가 되어 계산되고, num1 + num2를 강제로 byte로 형 변환 시킨다.
		
		// 산술연산자: +,-,*,/,%
		// 대입연산자: =,+=,-=,*=,/=
		// 비교연산자: ==,!=,<,<=,>,>=
		// 논리연산자: &&(and), ||(or), !(not)
		// 삼항연산자: [조건식] ? true : false
		
		
	}

}
