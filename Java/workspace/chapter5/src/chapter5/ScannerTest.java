package chapter5;

// import: 특정 기능을 사용하기 위해 클래스를 추가
// import 단축키: ctrl + shift + o
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 클래스 선언 부분
		// System.in : 콘솔창에 입력한 내용을 읽는 스캐너로 설정
		Scanner sc = new Scanner(System.in);
		// nextInt(): 콘솔창에서 입력한 숫자를 num1에 저장한다
		System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");
		// nextInt는 공백/줄바꿈을 인식할 때 마다 다음 변수로 취급 (1 2 3은 1,2,3으로 인식)
		// 공백을 이용하여 여러개의 변수에 한번에 값을 저장할 수 있음
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("num1의 값 "+num1);
		System.out.println("num2의 값 "+num2);
		System.out.println("num3의 값 "+num3);
		System.out.println("문자열을 홍길동 전우치 손오공 이렇게 입력하고 엔터를 입력하세요.");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		System.out.println("str1의 값 "+str1);
		System.out.println("str2의 값 "+str2);
		System.out.println("str3의 값 "+str3);
		
		// nextLine() : 공백과 상관없이 엔터키를 입력하기 전 모든 문자열을 저장
		sc.nextLine(); // 값을 저장하지 않고, 이전 엔터를 소모하는 용도
		String str4 = sc.nextLine();
		String str5 = sc.nextLine();
		String str6 = sc.nextLine();
		System.out.println("str4의 값 "+str4);
		System.out.println("str5의 값 "+str5);
		System.out.println("str6의 값 "+str6);
		
		
		

	}

}
