package practice;

import java.util.Arrays;

public class q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] strArr = new String[9][9];
		for (int i = 0; i < 9; i++) {
			Arrays.fill(strArr[i], " ");

			for (int j = 0; j < 9; j++) {
				if (i + j >= 4 && i + j <= 12 && i - j <= 4 && j - i <= 4) {
					strArr[i][j] = "*";
				}
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();

		}

	}

}
