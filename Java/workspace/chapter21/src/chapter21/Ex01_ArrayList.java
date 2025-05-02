package chapter21;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+'\t');
		}
		list.remove(0);
		System.out.println();
		// foreach를 사용한 출력: 리스트 안 데이터의 타입 + 변수명: 리스트 이름
		for(String str: list) {
			// get() 없이 데이터를 출력할 수 있음
			System.out.print(str+'\t');
		}

	}

}
