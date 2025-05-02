package chapter6;

public class Ex02_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90 80 70 60 / A B C D F
		int score = 99;
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		int num1 = 11;
		if((num1%2)==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		int num2 = -30;
		int result = num2+20;
		if (result<0) {
			System.out.println(0);
		}else if (result>255) {
			System.out.println(255);
		}else {
			System.out.println(result);
		}
		
	}

}
