package practice1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		StringTokenizer st = new StringTokenizer(input, "+");

		int result = 0;
		
		while(st.hasMoreTokens()) {
			result+=Integer.parseInt(st.nextToken().trim());
		}
		System.out.println("합은 "+result);

	}

}
