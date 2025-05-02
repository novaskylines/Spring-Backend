package chapter7;

public class Ex02_VariableScope {
// 클래스 변수(멤버 변수): 클래스 이름 아래에(안에) 작성하는 static 변수
	// 클래스 변수는 클래스 안에 존재하는 main을 제외한 모든 곳에서 사용 가능
// 인스턴스 변수(멤버 변수) : 클래스 이름 아래에 작성하는 static이 아닌 변수 
// 지역 변수(로컬 변수) : 메서드 이름 아래에 작성하는 변수
// 매개 변수(파라미터) : 메서드 선언부, 메서드의 이름 뒤 괄호에 적는 변수
	
// main메서드는 프로그램을 실행하는 메서드로 작성되어있는 클래스와 상관이 없음
	// 클래스 안에서 main 자체가 고정된 문구이기 때문에, 코드를 실행할때 우선으로 실행됨.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main 어디서든 사용 가능한 변수
		boolean myState = true;
		int num1 = 11;
		if(myState) {
			num1++;
			System.out.println(num1);
		}
		{
			// 중괄호 안에서 사용 가능한 변수
			// 아무 의미 없이 중괄호를 쓰지 말자
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
		// for문 안에서 사용 가능한 변수
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}

	}

}
