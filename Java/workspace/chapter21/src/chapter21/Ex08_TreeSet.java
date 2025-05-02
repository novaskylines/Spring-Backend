package chapter21;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex08_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<>();
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("손오공");
		tree.add("멀린");
		tree.add("손오공");
		tree.add("가");
		tree.add("나");
		tree.add("다");
		tree.add("a");
		tree.add("b");
		tree.add("c");
		tree.add("1");
		tree.add("2");
		tree.add("3");
		// 중복 허용 X, 대신에 출력값이 자동으로 정렬됨. 오름차순 기준으로 객체 참조.
		System.out.println("객체 수: " + tree.size());

		for (Iterator<String> itr = tree.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + '\t');
		}
		System.out.println();
		
		
		TreeSet<Integer> tree2 = new TreeSet<>();
		tree2.add(6);
		tree2.add(2);
		tree2.add(4);
		tree2.add(7);
		tree2.add(3);
		tree2.add(8);
		tree2.add(1);
		tree2.add(5);
		for(int t: tree2) {
			System.out.print(t+"\t");
		}

	}

}
