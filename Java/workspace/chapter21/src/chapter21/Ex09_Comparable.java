package chapter21;

import java.util.Set;
import java.util.TreeSet;

// 클래스에 오름차순/내림차순 정렬시 사용하는 compareTo 메서드를 추가해주는 인터페이스
// 클래스마다 1가지 방식으로만 정렬 가능
// Comparable을 상속하고 클래스를 수정해야만 정렬방식을 설정할 수 있음
// 결론: 기본 정렬 방식 설정
class Student3 implements Comparable<Student3> {
	private String name;
	private int age;

	public Student3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
		return this.age - o.age; // 오름차순
//		return o.age - this.age; // 내림차순
//		return this.name.compareTo(o.name); // 텍스트 오름차순
//		return o.name.compareTo(this.name); // 텍스트 내림차순
	}
}

public class Ex09_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student3> tree = new TreeSet<>();
		tree.add(new Student3("홍길동",30));
		tree.add(new Student3("전우치",40));
		tree.add(new Student3("손오공",20));
		
		for(Student3 s: tree) {
			System.out.println(s);
		}
		

	}

}
