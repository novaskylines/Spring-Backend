package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex05_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("apple","banana","orange");
		list.stream()
			// map: 각 데이터에 코드를 실행 후 stream으로 저장하는 중간연산 메서드
			.map(s -> s.toUpperCase())
			.forEach(n -> System.out.print(n+"\t"));
		System.out.println();
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5);
		numList.stream()
			   .map(n->2*n)
			   .forEach(n -> System.out.print(n+"\t"));
		System.out.println();

	}

}
