package chapter21;

import java.util.HashSet;
import java.util.Set;

class Student2{
	int studentNum;
	String name;
	int age;
	Student2(int StudentNum, String name, int age) {
		this.studentNum = StudentNum;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		// hashCode is studentNum
		return this.studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		// hashCode를 비교하도록 설정
		return this.studentNum == ((Student2)obj).studentNum;
	}
}

public class Ex07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student2> set = new HashSet<Student2>();
		// new로 만들어진 객체는 전부 다르게 인식 - "메모리 주소" 때문
		set.add(new Student2(1, "홍길동",20));
		set.add(new Student2(1, "전우치",20));
		set.add(new Student2(2, "홍길동",25));
		
		System.out.println("객체 수: "+set.size());
		
		for(Student2 s:set) {
			System.out.print(s.toString()+'\t');
		
		System.out.println();
		}
		

	}

}
