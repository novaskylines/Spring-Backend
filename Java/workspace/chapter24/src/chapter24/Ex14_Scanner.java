package chapter24;

import java.io.File;
import java.util.Scanner;

class Student {

	public Student(String name, int age, int height, int weight, String location) {
		
	}
	
}

public class Ex14_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(new File("log.txt"))) {
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try (Scanner sc = new Scanner(new File("info.txt"))) {
			while(sc.hasNext()) {
				String name = sc.next();
				int age = sc.nextInt();
				int height = sc.nextInt();
				int weight = sc.nextInt();
				String location = sc.next();
				Student student = new Student(name, age, height, weight, location);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
