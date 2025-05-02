package chapter18;


public class Ex03_VarArgs {

	public static void helloEveryBody(String... vargs) {
		for(String s: vargs) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가변인수 - 여러개 적을 수 있는 변수... 많이 쓰이지는 않음
		helloEveryBody("홍길동");
		helloEveryBody("홍길동", "전우치");
		helloEveryBody("홍길동", "전우치", "손오공");
		// 배열로 선언했을 경우에도 정상적으로 포함
		String[] strArr = {"홍길동", "전우치", "손오공"};
		helloEveryBody(strArr);
	}
	
	

}
