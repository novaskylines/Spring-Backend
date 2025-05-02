package chapter22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface Unit3 {
	void move();
}

class HumanCamp3 {
	private int speed = 10;
	public Unit3 getMarine() {
//		class Marine3 implements Unit3 {
//			@Override
//			public void move() {
//				// TODO Auto-generated method stub
//				System.out.println("인간형 유닛이 "+speed+" 속도로 움직입니다.");
//			}
//		}
//		return new Marine3();
		return new Unit3() {
			// 익명 내부 클래스 방식: 클래스 이름을 선언하지 않고 내부 클래스를 만듦
			@Override
			public void move() {
				// TODO Auto-generated method stub
				System.out.println("인간형 유닛이 "+speed+" 속도로 움직입니다.");
			}
			
		};
	}
}

public class Ex03_AnonymousInner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanCamp3 hc = new HumanCamp3();
		Unit3 unit = hc.getMarine();
		unit.move();
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		System.out.println(list);
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		System.out.println(list);
	}

}
