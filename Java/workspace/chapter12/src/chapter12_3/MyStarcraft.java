package chapter12_3;
// 추상 클래스: 추상 메서드가 있는 클래스
abstract class Unit {
	// 추상 메서드: 메서드의 이름 호출방식만 작성한 메서드
	String name;
	int hp;
	abstract void doMove();
	void printUnit() {
		System.out.println(name);
		System.out.println(hp);
	}
}
// 추상 클래스 사용방법
// 추상 메서드 상속 후 구현
class Marine extends Unit {
	
	// Unit의 abstract void doMove 추상클래스를 가져옴
	// 이는 하위 클래스에서 오버라이드 가능
	@Override
	void doMove() {
		System.out.println("마린은 두발로 걸어간다");
	}
}

class Zergling extends Unit {
	@Override
	void doMove() {
		System.out.println("저글링은 네발로 걸어간다");
	}
}


public class MyStarcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine unit1 = new Marine();
		unit1.hp=100;
		unit1.name="마린";
		unit1.printUnit();
		unit1.doMove();
		Zergling unit2 = new Zergling();
		unit2.hp=45;
		unit2.name="저글링";
		unit2.printUnit();
		unit2.doMove();

	}

}
