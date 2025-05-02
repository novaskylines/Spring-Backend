package chapter6;

public class Ex04_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(초기값; 조건식; 증감식) {
//			
//		}
		for(int i=0; i<10; i++) {
			System.out.println(i+"번 실행했습니다.");
		}
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("Sum is "+sum);
		
		int dan=5;
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}

	}

}
