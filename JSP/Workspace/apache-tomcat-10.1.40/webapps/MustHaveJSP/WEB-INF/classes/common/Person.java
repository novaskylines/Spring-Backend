// 반드시 패키지 안에 설정
package common;

public class Person {
	// 변수 설정 시 반드시 private
	private String name;
	private int age;
	// 기본생성자 필수
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// 각 멤버변수의 getter/setter 반드시 작성
	// 실수하지 않도록 자동완성으로 (source 탭에서 Generate Getter and Setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
