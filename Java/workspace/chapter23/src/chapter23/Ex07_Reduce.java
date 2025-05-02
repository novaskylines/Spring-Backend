package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex07_Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("홍길동","전우치","손오공");
		// name1: stream이 끝난 후 데이터를 담을 변수
		// reduce: 기본값 "이순신", (첫번쨰, 두 번째) -> 두 값이 사라지고 반환값으로 대체
		String name1 = list1.stream()
				.reduce("이순신", (s1,s2)->
				s1.length() > s2.length() ? s1 : s2);
		System.out.println(name1);
		
		List<String> list2 = Arrays.asList("홍길동","멀린","해리포터");
		String name2 = list2.stream()
				.reduce("이순신", (s1,s2) ->
				s1.length() > s2.length() ? s1 : s2);
		System.out.println(name2);
	}

}
