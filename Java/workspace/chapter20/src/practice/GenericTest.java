package practice;

import java.util.ArrayList;
import java.util.List;

class DeskTop{
	@Override
	public String toString() {
		return "데스크탑을 실행합니다.";
	}
}

class NoteBook{
	@Override
	public String toString() {
		return "노트북을 실행합니다.";
	}
}

class Phone{
	@Override
	public String toString() {
		return "핸드폰을 실행합니다.";
	}
}

class Tablet{
	@Override
	public String toString() {
		return "태블릿을 실행합니다.";
	}
}

class Computer<T> {
	private List<T> device = new ArrayList<>();
	
	public void set(T t1, T t2, T t3) {
		device.add(t1);
		device.add(t2);
		device.add(t3);
	}
	
	public List<T> get() {
		return device;
	}
	
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭을 사용하여 위에 작성한 클래스를 3개 저장할 수 있는 배열을 가진 Computer 클래스를 작성
		Computer<DeskTop> deskTop = new Computer<>();
		Computer<NoteBook> noteBook = new Computer<>();
		Computer<Phone> phone = new Computer<>();
		Computer<Tablet> tablet = new Computer<>();
		
		deskTop.set(new DeskTop(), new DeskTop(), new DeskTop());
		System.out.println(deskTop.get());
		

	}

}
