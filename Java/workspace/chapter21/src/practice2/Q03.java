package practice2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> precip = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("강수량 입력(0 입력시 종료)>>");
				int input = sc.nextInt();
				if(input==0) {
					System.out.println("\nEnd");
					break;
				}
				System.out.println();
				
				precip.add(input);
				int sum = 0;
				for(int e: precip) {
					System.out.print(e+" ");
					sum+=e;
				}
				
				System.out.println("\n\n현재 평균: "+(sum/precip.size())+"\n");
			} catch (InputMismatchException e) {
				System.out.println("\nInteger 값을 입력해주세요.");
				sc.nextLine();
			}
		}
		

	}

}
