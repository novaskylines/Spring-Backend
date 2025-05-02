package chapter11;

import java.util.Random;

public class Ex02_Preload {
// static은 프로그램 실행시 모두 로드되기 때문에 main보다 먼저 실행된다
	static int num;
	static {
		Random rand = new Random();
		num = rand.nextInt(100);
		
	}
// static 사용시 단점
// 프로그램이 켜질 때 시간이 오래걸림
// 프로그램이 켜져있을 때 메모리를 계속해서 소모
// 객체지향 프로그래밍의 원칙에 위배된다

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num);

	}

}
