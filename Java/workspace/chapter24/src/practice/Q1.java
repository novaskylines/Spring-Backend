package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@FunctionalInterface
interface test1 {
	String calc(int a, int b);
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. gugudan.txt 파일에 구구단 작성
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("gugudan.txt"))){
			for(int i=2;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					String str = i+" * "+j+" = "+(i*j);
					bw.write(str, 0, str.length());
					bw.newLine();
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// year.txt 파일에 1900~2025년까지의 윤년을 출력
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("year.txt"))){
			for(int i=1900;i<=2025;i++) {
				if((i%4==0&&i%100!=0)||i%400==0) {
					bw.write(i+"", 0, (i+"").length());
					bw.newLine();
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		// 가위바위보 게임의 결과를 log.txt파일에 출력
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt"))){
			int win=0;
			int lose=0;
			int draw=0;
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("가위(1), 바위(2), 보(3) 중에 선택해주세요>>");
				int player = sc.nextInt();
				int computer = (int) Math.floor(Math.random()*3+1);
				int result = player-computer;
				System.out.print("플레이어: "+(player==1 ? "가위" : player==2 ? "바위" : "보")+" vs "+
											(computer==1 ? "가위" : computer==2 ? "바위" : "보")+" :컴퓨터 ");
				if(result==-2||result==1) {
					win++;
					System.out.println("승리");
				} else if(result == 0) {
					draw++;
					System.out.println("비김");
				} else {
					lose++;
					System.out.println("패배");
				}
				System.out.println("승리: "+win+"/5, 패배: "+lose+", 비김: "+draw);
				System.out.println();
				
				bw.write("가위(1), 바위(2), 보(3) 중에 선택해주세요>>"+player);
				bw.newLine();
				bw.write("플레이어: "+(player==1 ? "가위" : player==2 ? "바위" : "보")+" vs "+
											(computer==1 ? "가위" : computer==2 ? "바위" : "보")+" :컴퓨터 ");
				bw.newLine();
				bw.write("승리: "+win+"/5, 패배: "+lose+", 비김: "+draw);
				bw.newLine();
				bw.newLine();

				if(win==5) {
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
