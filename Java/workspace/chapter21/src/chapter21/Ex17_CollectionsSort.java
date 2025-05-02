package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringDesc implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

public class Ex17_CollectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "멀린");
		list = new ArrayList<>(list);
		
		System.out.println(list);
		// sort: 오름차순 정렬, 직접 만든 클래스의 경우 Comparable을 상속받아야 사용 가능
		Collections.sort(list);
		System.out.println(list);
		// Collections.reverseOrder: 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		// 직접 만든 클래스 변수 (1)
		StringDesc cmp = new StringDesc();
		Collections.sort(list, cmp);
		System.out.println(list);

		// 직접 만든 클래스 변수 (2)
		Collections.sort(list, new StringDesc());
		System.out.println(list);
		
		// 직접 만든 Lambda 함수
		Collections.sort(list, (a,b)->b.length()-a.length());
		System.out.println(list);
		
		
		

	}

}
