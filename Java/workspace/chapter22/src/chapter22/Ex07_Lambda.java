package chapter22;

interface Unit7 {
	void move(String s);
}

public class Ex07_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 람다식은 인터페이스 안의 하나의 메서드를 구현 가능
		// 인터페이스 안에 미구현 메서드가 2개 이상 있는 경우 람다식 사용 불가
		// 람다를 사용해 각종 메서드 작성 문법을 생략 가능
		// 매개변수 -> 실행할 코드
		Unit7 unit = (s) -> {
			System.out.println(s);
			};
		unit.move("Lambda: Unit7");
		Unit7 unit2 = new Unit7() {
			@Override
			public void move(String s) {
				System.out.println(s);
			}
		};
		unit2.move("익명 내부 클래스로 실행");
	}

}
