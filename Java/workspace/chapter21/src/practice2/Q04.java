package practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Student {
	String name;
	String subject;
	int id;
	double score;
	public Student(String name, String subject, int id, double score) {
		this.name = name;
		this.subject = subject;
		this.id = id;
		this.score = score;
	}
}

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		HashMap<String, Student> studentMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점을 입력하세요.");
		System.out.println();
		
		while(studentList.size()<5) {
			try {
				System.out.print(">> ");
				Student input = new Student(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
				studentList.add(input);
				studentMap.put(input.name, input);
				
				System.out.println();
			} catch(InputMismatchException e) {
				System.out.println("이름, 학과는 String으로, 학번, 학점은 Integer로 입력해주세요.");
			}
		}
		
		System.out.println("----------------------------------------");
		
		Set<String> studentks = studentMap.keySet();
		
		List<String> studentks2 = new ArrayList<>();
		
		for(Student student: studentList) {
			studentks2.add(student.name);
			System.out.println("\n이름 : "+student.name);
			System.out.println("\n학과 : "+student.subject);
			System.out.println("\n학번 : "+student.id);
			System.out.println("\n학점 : "+student.score);
			System.out.println("\n-----------------------------");
		}
		
		for(String name: studentks) {
			Student student = studentMap.get(name);
			System.out.println("\n이름 : "+student.name);
			System.out.println("\n학과 : "+student.subject);
			System.out.println("\n학번 : "+student.id);
			System.out.println("\n학점 : "+student.score);
			System.out.println("\n-----------------------------");
		}
		
		System.out.println();
		sc.nextLine();
		
		while(true) {
			try {
				System.out.print("학생 이름 >> ");
				String name = sc.nextLine();
				if(name=="그만") {
					break;
				} else if(!(studentks.contains(name))) {
					System.out.println("학생이 존재하지 않습니다.\n");
					continue;
				} else if(studentks2.indexOf(name)==-1) {
					System.out.println("학생이 존재하지 않습니다.\n");
					continue;
				}
				for(Student student: studentList) {
					if(student.name.equals(name)) {
						System.out.println("\n"+student.name+", "+student.subject+", "+student.id+", "+student.score);
						break;
					}
				}
				Student student = studentMap.get(name);
				System.out.println("\n"+student.name+", "+student.subject+", "+student.id+", "+student.score+"\n");			
			} catch(InputMismatchException e) {
				System.out.println("\n\n학생의 이름을 String으로 입력해주시기 바랍니다.");
				sc.nextLine();
			}
		}
		

	}

}
