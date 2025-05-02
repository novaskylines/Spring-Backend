package chapter20;

class Npc2 {
	@Override
	public String toString() {
		return "This is a Npc1.";
	}
}

class Camp2 {
	private Object unit;

	public void set(Object unit) {
		this.unit = unit;
	}

	public Object get() {
		return unit;
	}
}

class Tank2 {
	@Override
	public String toString() {
		return "This is a Tank1.";
	}
}

public class Ex02_MyGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camp2 human = new Camp2();
		Camp2 machine = new Camp2();
		
		// Object를 설정함으로서 같은 종류의 인스턴스에 클래스를 대입 
		human.set(new Npc2());
		machine.set(new Tank2());
		
//		human.set("난 공룡");
//		machine.set("난 우주인");
		
		// 객체를 돌려받을때 반드시 형변환
		Object hUnit = (Npc2)human.get();
		Object mUnit = (Tank2)machine.get();
		
		System.out.println(hUnit);
		System.out.println(mUnit);

	}

}
