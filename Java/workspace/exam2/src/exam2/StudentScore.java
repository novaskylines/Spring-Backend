package exam2;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores = { { 80, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };

		System.out.println("학생번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("================================================");
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번 학생:\t");
			int sum = 0;
			for (int j : scores[i]) {
				System.out.print(j + "\t");
				sum += j;
			}
			System.out.print(sum + "\t");
			System.out.print(String.format("%.1f", ((double) sum * 10 / 3) / 10) + "\t");
			System.out.println();
		}

	}

}
