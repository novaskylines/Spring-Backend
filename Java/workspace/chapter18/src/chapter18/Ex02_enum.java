package chapter18;


enum Human2 {MAN,WOMAN}

enum Machine2{TANK, AIRPLANE}

public class Ex02_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		createUnit(Machine2.TANK);
		createUnit(Machine2.AIRPLANE);
		
//		createUnit(Human2.MAN);
		
		System.out.println("Machine2.TANK: "+Machine2.TANK);
		System.out.println("Machine2.AIRPLANE: "+Machine2.AIRPLANE);
		// TANK랑 같음
		System.out.println("Machine2.TANK.name: "+Machine2.TANK.name());
		System.out.println("Machine2.TANK.toString(): "+Machine2.TANK.toString());
		// TANK가 몇번째에 저장되어 있는지
		System.out.println("Machine2.TANK.ordinal(): "+Machine2.TANK.ordinal());
		System.out.println("Machine2.AIRPLANE.ordinal(): "+Machine2.AIRPLANE.ordinal());
		// 메모리주소
		System.out.println("Machine2.TANK.TANK.values(): "+Machine2.TANK.TANK.values());
		System.out.println("Machine2.values(): "+Machine2.values());
		

	}

	public static void createUnit(Machine2 kind) {
		switch (kind) {
		case TANK:
			System.out.println("탱크를 만듭니다.");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}

	}
}
