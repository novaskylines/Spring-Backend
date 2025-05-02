package practice1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = "";
		
		while(true) {
			input = sc.nextLine();
			if(input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(input);
			System.out.println("어절 개수는 "+st.countTokens());
		}

	}

}
