package chapter12;

class Unit {
	String name;
	int hp;

	void printUnit() {
		System.out.println("이름: " + name);
		System.out.println("이름: " + hp);
	}

	void doMove() {
		System.out.println("이동속도 10으로 이동");
	}
}

class Marine extends Unit {
	int attack;

	void printMarine() {
		printUnit();
		System.out.println("공격력: " + attack);
	}
	
	// 오버라이드 어노테이션: 오버라이딩이 정상적으로 작성되었는지 확인하는 어노테이션
	// 오버라이드 문법에 맞지 않으면 에러를 발생시키는 어노테이션
	// 컴파일러가 오버라이드된 메서드라는 것을 알려줌
	@Override
	// 오버라이딩: 부모랑 같은 메소드를 선언했기 때문에, 부모의 함수 대신 이 함수가 항상 불려온다.
	// 부모의 메소드랑 같은 자로형의 매개변수를 가지고 있어야 한다.
	void doMove() {
		// 부모의 함수를 가져오기 위해서는 super 사용
		super.doMove();
		System.out.println(attack + " 공격");
	}
}

class Medic extends Unit {
	int heal;

	void printMedic() {
		printUnit();
		System.out.println("치유량: " + heal);
	}

	@Override
	void doMove() {
		System.out.println("이동속도 8으로 이동");
		System.out.println(heal + " 치유");
	}
}

public class MyTerran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine unit1 = new Marine();
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack = 20;

		Medic unit2 = new Medic();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;

		unit1.printMarine();
		System.out.println();
		unit2.printMedic();
		System.out.println();
		unit1.doMove();
		System.out.println();
		unit2.doMove();
	}

}
