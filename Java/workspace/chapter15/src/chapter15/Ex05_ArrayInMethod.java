package chapter15;

import java.util.Arrays;

public class Ex05_ArrayInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = makeIntArray(5);
		int sum = sumOfArray(arr);
		System.out.println(sum);
		String str = "010-1234-5678";
		String[] strSplit = str.split("-");
		System.out.println(Arrays.toString(strSplit));
	}

	public static int[] makeIntArray(int len) {
		// len 매개변술 arr배열의 길이 설정
		int[] arr = new int[len];
		// 0부터 len까지의 반복문 실행
		for (int i = 0; i < len; i++) {
			// 0부터 len까지의 배열에 i 데이터 저장
			arr[i] = i;
		}
		return arr;
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		// 매개변수 arr의 길이만큼 반복문 실행
		for (int i = 0; i < arr.length; i++) {
			// sum 변수에 arr의 각 값을 더하기
			sum += arr[i];
		}
		return sum;
	}

}
