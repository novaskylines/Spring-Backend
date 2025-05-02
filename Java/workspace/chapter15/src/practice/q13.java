package practice;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mulArray = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int l = 0; l < 9; l++) {
				mulArray[i][l] = (i + 1) * (l + 1);
			}
		}
		System.out.println("  |  1  2  3  4  5  6  7  8  9");
		System.out.println("--+---------------------------");
		for (int i = 0; i < 9; i++) {
			String result = (i + 1) + " |";
			for (int l = 0; l < 9; l++) {
				if (mulArray[i][l] > 9) {
					result += " " + mulArray[i][l];
				} else {
					result += "  " + mulArray[i][l];
				}
			}
			System.out.println(result);
		}

	}

}
