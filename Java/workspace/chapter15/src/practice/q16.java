package practice;

import java.util.Arrays;
import java.util.Random;

public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		int[] intArr1 = new int[20];
		int[] intArr2 = new int[20];
		int[] intArr3 = new int[20];

		for (int i = 0; i < 20; i++) {
			intArr1[i] = rand.nextInt(200) - 100;
			intArr2[i] = rand.nextInt(200) - 100;
			intArr3[i] = rand.nextInt(200) - 100;
		}
		System.out.println(Arrays.toString(intArr1));
		
		// 선택 정렬
		for (int i = 0; i < intArr1.length; i++) {
			int min = i;
			for (int l = i + 1; l < intArr1.length; l++) {
				if (intArr1[l] < intArr1[min]) {
					min = l;
				}
			}
			shiftInt(intArr1, i, min);
			System.out.println(Arrays.toString(intArr1));
		}
		System.out.println();
		
		// 삽입 정렬
		for (int i = 1; i < intArr2.length; i++) {
			for (int l = 0; l < i; l++) {
				if (intArr2[l] > intArr2[i]) {
					shiftInt(intArr2, l, i);
					break;
				}
			}
			System.out.println(Arrays.toString(intArr2));
		}
		System.out.println();
		
		// 버블 정렬
		for (int i = 1; i < intArr3.length; i++) {
			for (int l = 0; l < intArr3.length - i; l++) {
				if (intArr3[l] > intArr3[l + 1]) {
					switchInt(intArr3, l, l + 1);
				}
			}
			System.out.println(Arrays.toString(intArr3));
		}

	}

	static int[] switchInt(int[] intArr, int i1, int i2) {
		int tempInt = intArr[i1];
		intArr[i1] = intArr[i2];
		intArr[i2] = tempInt;
		return intArr;
	}

	static int[] shiftInt(int[] intArr, int i1, int i2) {
		int tempInt = intArr[i2];
		for (int i = i2; i > i1; i--) {
			intArr[i] = intArr[i - 1];
		}
		intArr[i1] = tempInt;
		return intArr;
	}

}
