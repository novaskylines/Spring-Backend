package chapter12_4;

abstract class Building {
	int health;

	abstract void doBuild();
}


//디폴트 메서드: 인터페이스에 일반 메서드를 구현하는 기능
//인터페이스에는 기본적으로 추상 메서드만 사용 가능했으나 메서드가 추가되었을때 수정이 힘들었음
// 추상메서드를 추가하면 기존에 인터페이스를 사용하는 모든 클래스에서 에러가 발생
// 추상메서드는 반드시 구현해야하지만 동일한 내용이라면 추가하는 것이 매우 비효율적

interface Fly {
	void flyBuilding();
}

class Barracks extends Building implements Fly {
	void doBuild() {
		System.out.println("인간형 유닛 생산 건물을 짓습니다.");
	}

	void doMakeMarine() {
		System.out.println("총쏘는 유닛을 생산합니다.");
	}

	public void flyBuilding() {
		System.out.println("건물이 날아서 이동하게 합니다.");
	}
}

class Factory extends Building implements Fly {
	void doBuild() {
		System.out.println("기갑형 유닛 생산 건물을 짓습니다.");
	}

	void doMakeTank() {
		System.out.println("탱크 유닛을 생산합니다.");
	}

	public void flyBuilding() {
		System.out.println("건물이 날아서 이동하게 합니다.");
	}
}

class Bunker extends Building {
	void doBuild() {
		System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");
		System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");
	}
}

public class Ex02_Starcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barracks barracks = new Barracks();
		barracks.doBuild();
		barracks.doMakeMarine();
		barracks.flyBuilding();

		Factory factory = new Factory();
		factory.doBuild();
		factory.doMakeTank();
		factory.flyBuilding();

		Bunker bunker = new Bunker();
		bunker.doBuild();
		bunker.doBuild();

	}

}
