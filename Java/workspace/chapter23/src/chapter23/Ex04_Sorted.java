package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex04_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍길동", "멀린", "해리포터");
		list.stream()
			.sorted()
			.forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		
		list.stream()
			// Comparator와 함께 람다식을 사용해 정렬 방식 변경
			.sorted((s1, s2) -> s1.length() - s2.length())
			.forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
	}

}
