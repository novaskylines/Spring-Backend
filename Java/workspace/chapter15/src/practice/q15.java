package practice;

import java.util.Arrays;

public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = new int[10];
		
		for(int i=0;i<10;i++) {
			int j=1;
			while(j%3!=0 || checkArr(intArr, j)) {
				j = (int)(Math.random()*100);
			}
			intArr[i]=j;
		}
		System.out.println(Arrays.toString(intArr));

	}

	static boolean checkArr(int[] intArr, int num) {
		for (int i = 0; i < intArr.length; i++) {
			if (num == intArr[i]) {
				return true;
			}
		}
		return false;
	}

}
