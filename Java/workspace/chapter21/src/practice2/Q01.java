package practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> grade1 = new ArrayList<>();
		grade1.add("A");
		grade1.add("B");
		grade1.add("C");
		grade1.add("D");
		grade1.add("F");
		List<Double> score1 = new ArrayList<>();
		score1.add(4.0);
		score1.add(3.0);
		score1.add(2.0);
		score1.add(1.0);
		score1.add(0.0);

		HashMap<String, Double> grade2 = new HashMap<>();
		grade2.put("A", 4.0);
		grade2.put("B", 3.0);
		grade2.put("C", 2.0);
		grade2.put("D", 1.0);
		grade2.put("F", 0.0);

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Input Grade >> ");
			String grade = sc.next();

			if (grade1.indexOf(grade) == -1) {
				System.out.println("A,B,C,D,F의 대문자만을 입력하시기 바랍니다.");
			} else {
				System.out.println(grade + " : (ArrayList) " + score1.get(grade1.indexOf(grade)));
				System.out.println(grade + " : (HashMap) " + grade2.get(grade));
			}

		} catch (InputMismatchException e) {
			System.out.println("A,B,C,D,F의 대문자만을 입력하시기 바랍니다.");
		}

	}

}
