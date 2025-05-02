package chapter15;

import java.util.Arrays;
import java.util.Collections;

public class Ex14_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,2,4};
		Double[] arr2 = {4.4,3.3,2.2,1.1};
		String[] arr3 = {"홍길동","전우치","손오공","멀린"};
		// Collections.reverseOrder로 내림차순 정렬.
		// int/double은 내림차순 불가. Integer/Double 등은 오름차순 가능
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		Arrays.sort(arr3);
		
		for (int n: arr1) {
			System.out.println(n+"\t");
		}
		System.out.println();
		for (double n: arr2) {
			System.out.println(n+"\t");
		}
		System.out.println();
		for (String n: arr3) {
			System.out.println(n+"\t");
		}
		System.out.println();

	}

}
