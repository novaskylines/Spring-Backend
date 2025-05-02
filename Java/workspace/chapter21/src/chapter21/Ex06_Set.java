package chapter21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("orange");
		// hashCode(): 객체를 숫자로 변환해 반환
		// hashCode가 일치하면 중복 데이터로 취급한다
		System.out.println("orange".hashCode());
		set.add("apple");
		System.out.println("apple".hashCode());
		set.add("banana");
		System.out.println("banana".hashCode());
		set.add("apple");
		// 중복이 제거되고 저장된 순서가 아닌 다른 순서로 출력 (hashCode와는 상관이 없음)
		// Set은 인덱스가 존재하지 않기 때문에 .get() 사용 불가 
		System.out.println(set.size());
		
		// 순서가 존재하지 않기 때문에 인덱스로 반복문은 불가능하고, Iterator or foreach 만이 가능함
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next()+'\t');
		}
		// 인덱스가 아닌 데이터를 기준으로 삭제
		set.remove("banana");
		for(String s: set) {
			System.out.print(s+'\t');
		}
		System.out.println();

	}

}
