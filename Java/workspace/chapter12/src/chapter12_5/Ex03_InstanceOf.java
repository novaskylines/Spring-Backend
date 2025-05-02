package chapter12_5;

interface Cry {
	void cry();
}

class Cat implements Cry {
	@Override
	public void cry() {
		System.out.println("야옹~");
	}
}

class Dog implements Cry {
	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
}

class Bird implements Cry {
	@Override
	public void cry() {
		System.out.println("삐약삐약!");
	}
}

public class Ex03_InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cry test1 = new Cat();

		if (test1 instanceof Cat) {
			test1.cry();

		} else if (test1 instanceof Dog) {
			System.out.println("고양이가 아닙니다.");
		}
	}

}
