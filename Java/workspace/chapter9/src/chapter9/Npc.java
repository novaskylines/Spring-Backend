package chapter9;

// 클래스란: 객체와 관련된 데이터와 처리동작을 한데 모은 코드 뭉치
// 인스턴스 변수 메서드 -> 인스턴스 생성 코드(설계도)
public class Npc {
// 멤버 변수
	private String name;
	private int hp;

// 멤버 변수에 값을 설정하는 메서드: set메서드, setter
	void setHp(long amount) {
		if (amount < 1) {
			amount = 1;
		} else if (amount > 100) {
			amount = 100;
		}
		this.hp = (int) amount;
	}

	void setName(String name) {
		// this: 자기 자신(인스턴스)
// this와 .을 이용하여 메서드, 멤버변수를 사용할 수 있음.
// 멤버변수 = 매개변수;
		if (name.length() < 2) {
			System.out.println("두 글자 이상 입력해 주세요");
			this.name = "재설정필요";
		} else if (name.length() > 10) {
			System.out.println("열 글자 이하 입력해 주세요");
			this.name = "재설정필요";
		} else {
			this.name = name;
		}

	}

// setter 자동완성하기
// 1. source탭 열기 -> 2. Generate Getters and Setters 항목 클릭하기

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void say() {
		System.out.println("안녕하세요. 제 이름은 " + this.name + "입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 클래스를 이용한 인스턴스 생성
// 클래스 인스턴스명 =
		Npc n = new Npc();
// 클래스에 데이터 설정
// 각 변수에 맞는 setter를 사용하여 데이터 설정
		n.setHp(100);
		n.setName("경비");
// 클래스에서 데이터 꺼내쓰기
// 직접적으로 변수명을 사용하는 방식
		System.out.println("이름:" + n.name);
		System.out.println("hp:" + n.hp);
// getter를 사용하는 방식
		System.out.println("이름:" + n.getName());
		System.out.println("hp:" + n.getHp());
		n.say();

	}
}
