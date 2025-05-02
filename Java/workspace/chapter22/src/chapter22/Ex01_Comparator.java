package chapter22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
	int studno;
	String name;
	String dept;
	Student(int studno, String name, String dept) {
		this.studno = studno;
		this.name = name;
		this.dept = dept;
	}
}

class StudentList{
	private List<Student> students = new ArrayList<>();
	public StudentList() {
		this.students.add(new Student(2,"홍길동", "컴공"));
		this.students.add(new Student(3,"전우치","영어"));
		this.students.add(new Student(1,"손오공","중국어"));
	}
	public void showList() {
		for(Student stu: students) {
			System.out.println(stu.studno+","+stu.name+","+stu.dept);
		}
	}
	public void AscList() {
		students.sort(new SortComparator());
	}
	public void DescList() {
		students.sort(new DescComparator());
	}
	private class SortComparator implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.studno - o2.studno;
		}
	}
	private class DescComparator implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o2.studno - o1.studno;
		}
		
	}
}

public class Ex01_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentList s1 = new StudentList();
		
		s1.showList();
		s1.AscList();
		s1.showList();
		s1.DescList();
		s1.showList();

	}

}
