package chapter18;

interface Human1 {
	int MAN = 1;
	int WOMAN = 2;
}

interface Machine1 {
	int TANK = 1;
	int AIRPLANE = 2;

}

public class Ex01_Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 넣은 상수의 값만을 계산하기 때문에 모두 똑같은 결과만을 반환
		createUnit(Machine1.TANK);
		createUnit(Human1.MAN);
		// 입력 면에서는 편리하지만 코드를 관리하는 데 있어 매우 효율이 나쁨
		createUnit(1);

	}
	
	public static void createUnit(int kind) {
		switch(kind) {
		case Machine1.TANK:
			System.out.println("탱크를 만듭니다.");
			break;
		case Machine1.AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}
		
	}

}
