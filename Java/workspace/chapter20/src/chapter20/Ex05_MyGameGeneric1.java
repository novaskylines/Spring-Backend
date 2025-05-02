package chapter20;

class Npc5 {
	@Override
	public String toString() {
		return "This is a Npc1.";
	}
}

// Generic 설정: 클래스명 뒤 <T> 작성
// 다른 대문자도 사용 가능, 보편적으로 사용하는 문자는 E(Element) K(Key) N(Number) T(Type) V(Value)
// 어떤 자료형이 들어올지 모르는 부분에 T를 넣어 코드 작성
class Camp5<T>{
	// 변수 unit의 자료형을 T로 설정
	private T unit;
	// unit의 데이터 설정시 필요한 매내변수의 타입을 T로 설정
	public void set(T unit) {
		this.unit = unit;
	}

	public T get() {
		return unit;
	}
}

class Tank5 {
	@Override
	public String toString() {
		return "This is a Tank1.";
	}
}

public class Ex05_MyGameGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camp5<Npc5> human = new Camp5<>();
		Camp5<Tank5> machine = new Camp5<>();
		Camp5<String> str = new Camp5<>();
		Camp5<Integer> i = new Camp5<>();
		// 제네릭에는 기초자료형은 사용 불가능: int, double, long 사용 불가
		// 대신 Wrapper 클래스는 사용 가능: Integer, Double, Long, String 사용 가능
		
		// 인스턴스를 만들때 제네릭으로 정의한 자료형만이 가능
		human.set(new Npc5());
		machine.set(new Tank5());
		
		
		Npc5 hUnit = human.get();
		Tank5 mUnit = machine.get();
		
		System.out.println(hUnit);
		System.out.println(mUnit);

	}

}
