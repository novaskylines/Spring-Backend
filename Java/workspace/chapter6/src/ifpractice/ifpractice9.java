package ifpractice;

import java.util.Scanner;

public class ifpractice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("가위, 바위, 보 중에 입력해주세요 >> ");
		String player = sc.next();
		int computer = (int)(Math.random()*3);
		int player1=0;
		String result;
		switch(player) {
		case "가위":
			player1 = 0;
			break;
		case "바위":
			player1 = 1;
			break;
		case "보":
			player1 = 2;
			break;
		}
		if(player1==computer) {
			result="무승부";
		} else if(player1-computer==1 || (player1==0 && computer==2)) {
			result="승리";
		} else {
			result="패배";
		}
		System.out.println(result);

	}

}
