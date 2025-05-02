package chapter2;

public class EX01_VariableType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바스크립트와는 다르게 모든 변수의 앞에 자료형의 이름을 적어서 선언해야 함.
		// 1. Integer type
		// byte -128 ~ 127
		byte b = 127;
		// short -32,768 ~ 32,767
		short s = 32767;		
		// int -2,147,483,648 ~ 2,147,483,647
		int i = 2147483647;
		// long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		// long 선언의 경우 뒤에 영어 L/l을 붙여줘야 함.
		long l = 9223372036854775807L;
		// byte와 short는 거의 쓰이지 않고 기본은 int.
		// 21억보다 더 큰 값의 경우 long을 사용
		
		// 2. Text type
		// char : 한 글자만 저장하는 자료형
		char c = 'c'; // 작은따옴표를 사용!!
		System.out.println(c);
		c = 727; // 정수를 넣음으로서 아스키코드, 혹은 유니코드로 저장할 수 있음.
		System.out.println(c);
		// String : 여러 글자를 저장하는 자료형
		// 소문자 자료형들은 기본 자료형
		// 대문자 자료형(String 등)은 클래스 자료형
		String str = "안녕하세요";
		// 클래스 자료형의 경우 .을 이용하여 여러가지 기능을 사용 가능
		System.out.println(str.length());
		// 각 기본 자료형에 해당하는 클래스 자료형이 있으나, String은 유이하게 기본 자료형이 없음.
		Byte by = 'a'; // a가 정수로 전환
		Short sh = 35;
		Integer in = 21; // int만이 클래스 자료형과 이름이 다름
		Long lo = 98L;
		Float fl = 3.14F;
		Double Dou = 3.14;
		
		// 3. Real number type
		float f = 3.14F; // 소숫점 아래 7자리까지
		// 두 배의 정보를 저장할 수 있는 double을 주로 사용.
		double d = 3.14; // 소숫점 아래 15자리까지
		// 컴퓨터는 소숫점 아래 계산을 제대로 할 수가 없다. 다른 언어도 동일.
		double num1 = 1.0000001;
		System.out.println(num1);
		double num2 = 2.0000001;
		System.out.println(num2);
		double result = num1+num2;
		System.out.println(result);

	}

}
