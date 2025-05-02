package chapter15;

import java.util.Arrays;

public class Ex12_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[10];
		int[] arr2 = new int[8];
		// arr1의 모든 값을 3으로
		Arrays.fill(arr1, 3);
		// arr1의 0에서부터 값을 arr2의 3에서부터 값으로 4개만큼 복사
		System.arraycopy(arr1, 0, arr2, 3, 4);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// arr2의 2에서 5까지의 값을 arr3으로 복사
		int[] arr3 = Arrays.copyOfRange(arr2, 2, 5);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		int[] arr4 = {1,2,3,4};
		// 변수를 정의할 때 변수를 대입할 경우 메모리 주소를 통째로 복사하는 현상 발생.
		int[] arr5 = arr4;
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		// 메모리 주소가 같은 두 변수 중 하나의 값을 바꿀 경우 다른 하나도 변화
		arr4[0] = 1000;
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		// String은 대입해도 메모리 주소가 바뀌지 않음
		String a = "a";
		String b = a;
		b = "b";
		System.out.println(a);
		

	}

}
