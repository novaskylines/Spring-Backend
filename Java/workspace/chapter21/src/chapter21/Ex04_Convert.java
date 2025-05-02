package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매개변수를 사용한 리스트 객체는 요소를 추가하거나 삭제할 수 없음
		List<String> list = Arrays.asList("홍길동","전우치","손오공","전우치");
		// 수정을 원하면 다시 리스트를 만들어야함
		list = new ArrayList<>(list);
		list.add("해리포터");
		
		// 증강식을 생략하고 초기문과 조건문만 사용
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
			System.out.print(itr.next()+'\t');
		}
		System.out.println();
		
		// ArrayList -> LinkedList
		list = new LinkedList<>(list);
		
		for(String s: list) {
			System.out.print(s+'\t');
		}
		System.out.println();

	}

}
