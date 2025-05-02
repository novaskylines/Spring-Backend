package chapter12_4;

// 인터페이스
// 클래스 생성시의 구조 지정
// 메서드의 이름, 호출 방식, 매개변수를 작성하나 실제 코드는 없음
interface Greet {
	void greet();
}
interface Talk {
	void talk();
}
// 인터페이스 상속
// implements를 사용, 여러 인터페이스를 상속할 수 있음
class Morning implements Greet, Talk{
	public void greet() {
		System.out.println("안녕하세요");
	}
	public void talk() {
		System.out.println("좋은 아침입니다.");
	}
}


public class Ex01_Meet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morning morning = new Morning();
		morning.greet();
		morning.talk();

	}

}
