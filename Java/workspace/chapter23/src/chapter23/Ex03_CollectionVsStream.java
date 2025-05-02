package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03_CollectionVsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,3,2,4};
		List<Integer> list = new ArrayList<>();
		for(int i: arr) {
			if (i%2==1) {
				list.add(i);
			}
		}
		Collections.sort(list);
		for(int i: list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		Arrays.stream(arr)
		.filter(n->n%2==1)
		.sorted()
		.forEach(n -> System.out.print(n + "\t")); // forEach로 각 요소 프린트
		System.out.println();

	}

}
