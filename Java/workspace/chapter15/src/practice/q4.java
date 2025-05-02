package practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("정수를 열개 입력하세요>>");
		int[] intArr = new int[10];
		for (int i = 0; i < 10; i++) {
//			intArr[i] = sc.nextInt();
			intArr[i] = rand.nextInt(200) - 100;
		}

		for (int i = 1; i < intArr.length; i++) {
			for (int l = 0; l < intArr.length - i; l++) {
				if (intArr[l] > intArr[l + 1]) {
					pushInt(intArr, l, l + 1);
				}
			}
			System.out.println(Arrays.toString(intArr));
			if (checkSorted(intArr)) {
				break;
			}
		}

//		while(!checkSorted(intArr)) {
//			for(int i=0; i<intArr.length-1; i++) {
//				if(intArr[i]>intArr[i+1]) {
//					pushInt(intArr, i, i+1);
//				}
//			}
//			System.out.println(Arrays.toString(intArr));
//		}

	}

	static boolean checkSorted(int[] intArr) {
		for (int i = 0; i < intArr.length - 1; i++) {
			if (intArr[i] <= intArr[i + 1]) {
				continue;
			} else {
//				System.out.println(intArr[i]+" "+intArr[i+1]+" False");
				return false;
			}
		}
		return true;
	}

	static int[] pushInt(int[] intArr, int i1, int i2) {
		// i1 < i2. push the integer in i2 to i1, and push all other integers by +1
		// index.
		int tempInt = intArr[i2];
		for (int i = i2; i > i1; i--) {
			intArr[i] = intArr[i - 1];
		}
		intArr[i1] = tempInt;
		return intArr;
	}

}
