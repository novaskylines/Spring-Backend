package chapter10;

import java.util.Scanner;

public class Ex01_MemoryInStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student1 student1 = new Student1();		
		// TODO Auto-generated method stub
		// 디버그 모드 사용방법
		// 1. 확인하고 싶은 코드에 브레이크 포인트 설정 (원하는 줄을 더블클릭)
		// 2. 벌레모양 버튼으로 디버그 모드 실행
		// 3. step into, step over, step return 버튼을 이용하여 코드 확인하기
		// 4. 확인이 끝나면 terminate나 resume 버튼으로 종료하기
		int num1=10;
		int num2=20;
		adder(num1,num2);
		System.out.println("--------------");
	}
	public static int adder(int n1, int n2) {
		int result = n1+n2;
		return result;
	}

}
