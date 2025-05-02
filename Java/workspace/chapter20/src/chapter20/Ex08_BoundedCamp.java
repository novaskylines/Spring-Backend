package chapter20;

// T extends Number: Number를 상속받는 클래스만 제네릭을 사용 가능하도록 만듦
class Camp8<T extends Number>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class Ex08_BoundedCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camp8<Integer> iBox = new Camp8<>();
		iBox.set(24);
		
		Camp8<Double> dBox = new Camp8<>();
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());

	}

}
