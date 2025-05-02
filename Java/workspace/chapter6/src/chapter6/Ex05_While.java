package chapter6;

public class Ex05_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1;
		while(start<=10) {
			System.out.println(start+"번 실행했습니다.");
			start++;
		}
		
		// 사용자 인풋을 받아야 하는 경우: 아이디/비밀번호 입력 (틀리면 반복)
		int start2 = 0;
		do {
			System.out.println(start2+"번 실행했습니다.");
			start2++;
		}while(start2<=10);
		

	}

}
