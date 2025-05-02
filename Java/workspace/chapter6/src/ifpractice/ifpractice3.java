package ifpractice;

import java.util.Scanner;

public class ifpractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x 값을 입력하세요 >> ");
		int x = sc.nextInt();
		int y = x*x-3*x+7;
		System.out.println("x="+x+",y="+y);

	}

}
