package chapter22;

// 내부 클래스를 사용하는 이유: 클래스 파일의 크기를 줄여 간략하게 하기 위해서
// 작동을 위해 반드시 클래스를 요구하는 이벤트들이 있는데, 이 이벤트들을 위한 클래스들을 모아둔다.

class Outer1{
	private int speed = 10;
	class MemberInner1 {
		// 내부클래스의 선언이 되어야 사용 가능
		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
		}
	}
	public void getMarine() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}

public class Ex01_MemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 out = new Outer1();
		// 외부 클래스의 메서드를 실행해 내부 클레스의 move도 함께 실행
		out.getMarine();
		// 외부 클래스를 선언해야만 내부 클래스를 선언 가능
		Outer1.MemberInner1 inner = out.new MemberInner1();
		inner.move();

	}

}
