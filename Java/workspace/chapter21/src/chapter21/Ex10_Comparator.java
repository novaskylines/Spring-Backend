package chapter21;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class Ex10_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MyComparator 클래스를 만들어 글자수를 기준으로 비교
		// 이미 만들어진 String 클래스의 정렬 기준 변경 가능
//		Set<String> tree = new TreeSet<>();
//		Set<String> tree = new TreeSet<>(new MyComparator()); // 글자 수를 비교. 글자 수가 같을 경우 추가되지 않으므로, 2/3/4글자 단어 하나씩만이 등장
//		Set<String> tree = new TreeSet<>(Comparator.reverseOrder()); // 내림차순 정렬
//		Set<String> tree = new TreeSet<>(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.length() - o2.length();
//			}
//		}); // 선언에 바로 클래스 작성
		Set<String> tree = new TreeSet<>((o1,o2)->o1.length()-o2.length()); // 람다식: 메서드를 더 쉽게 작성하는 방법
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("손오공");
		tree.add("멀린");
		tree.add("해리포터");
		
		for(String s: tree) {
			System.out.print(s.toString()+"\t");
		System.out.println();
		
		}

	}

}
