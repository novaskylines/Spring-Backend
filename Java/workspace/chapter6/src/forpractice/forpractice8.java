package forpractice;

import java.util.Scanner;

public class forpractice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int win=0;
		int lose=0;
		
		do{
			System.out.print("가위(1), 바위(2), 보(3) 중에 선택해주세요. >> ");
			int player = sc.nextInt();
			int computer= (int)(Math.random()*3)+1;
			String playerStr = checkNum(player);
			String computerStr = checkNum(computer);
			System.out.println("플레이어 "+playerStr+" vs "+computerStr+" 컴퓨터");
			if(player==computer) {
				System.out.println("무승부");
			} else if(player-computer==1
					||(player==1&computer==3)) {
				System.out.println("승리");
				win++;
			} else {
				System.out.println("패배");
				lose++;
			}
			System.out.println("승리 : "+win+" , 패배 : "+lose);
		}while(win<5);
		

	}
	
	public static String checkNum(int num) {
		String result = "";
		if(num==1) {
			result = "가위";
		} else if(num==2) {
			result = "바위";
		} else if(num==3) {
			result = "보";
		} 
		return result;
	}

}
