package ifpractice;

import java.util.Scanner;

public class ifpractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요 >> ");
		int money = sc.nextInt();
		System.out.println("오만원"+(money/50000)+"개, 만원"
		+(money%50000/10000)+"개, 천원"
		+(money%10000/1000)+"개, 500원"
		+(money%1000/500)+"개, 100원"
		+(money%500/100)+"개, 10원"
		+(money%100/10)+"개, 1원"
		+(money%10)+"개");
		

	}

}
