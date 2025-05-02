package practice1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 열개 입력하세요>>");
		List<Integer> intList = new LinkedList<>();
		
		for(int i=0; i<=100; i+=3) {
			// autoboxing - int -> Integer
			intList.add(i);
		}
		System.out.println(intList);
		
		List<Integer> year = new LinkedList<>();
		for(int i=1900; i<=2025; i++) {
			if((i%4==0 && i%100!=0) || i%400==0) {
				year.add(i);
			}
		}
		System.out.println(year);
		

	}

}
