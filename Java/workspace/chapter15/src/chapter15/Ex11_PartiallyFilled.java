package chapter15;

public class Ex11_PartiallyFilled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// {}: 배열 - {} 안에 {}은 2차원 배열
		int[][] arr = { { 11 }, { 22, 33 }, { 44, 55, 66 } };

		
		for (int i = 0; i < arr.length; i++) {
			// arr.length가 각 1, 2, 3
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][][] arr3 = new int[3][3][3];
		
		arr3[0][0][0] = 1;
		arr3[0][0][1] = 2;
		arr3[0][0][2] = 3;
		arr3[0][1][0] = 4;
		arr3[0][1][1] = 5;
		arr3[0][1][2] = 6;
		arr3[0][2][0] = 7;
		arr3[0][2][1] = 8;
		arr3[0][2][2] = 9;
		arr3[1][0][0] = 10;
		arr3[1][0][1] = 11;
		arr3[1][0][2] = 12;
		arr3[1][1][0] = 13;
		arr3[1][1][1] = 14;
		arr3[1][1][2] = 15;
		arr3[1][2][0] = 16;
		arr3[1][2][1] = 17;
		arr3[1][2][2] = 18;
		arr3[2][0][0] = 19;
		arr3[2][0][1] = 20;
		arr3[2][0][2] = 21;
		arr3[2][1][0] = 22;
		arr3[2][1][1] = 23;
		arr3[2][1][2] = 24;
		arr3[2][2][0] = 25;
		arr3[2][2][1] = 26;
		arr3[2][2][2] = 27;
		int[][][] arr4 = {{{1},{2},{3}},{{4},{5},{6}},{{7},{8},{9}},{{1},{2},{3}},{{4},{5},{6}},{{7},{8},{9}},{{1},{2},{3}},{{4},{5},{6}},{{7},{8},{9}}};
		for(int[][] e: arr3) {
			for(int[] f: e) {
				for(int g: f) {
					System.out.print(g+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
