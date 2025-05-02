package chapter17;

class Book2 {
	String name;
	String author;

	Book2(String name, String author) {
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return name+", "+author;
	}

	@Override
	public boolean equals(Object obj) {
		// 이 인스턴스의 toString이랑 다른 인스턴스의 toString이 같은지 반환
		String str = this.toString();
		return str.equals(obj.toString());
	}
}

public class Ex05_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equals: Object 클래스에 있는 메서드로 인스턴스끼리 비교할때 사용
		// 오버라이딩하지 않으면 메모리주소끼리 비교하며, ==으로 비교하는 것과 같음
		Book2 book1 = new Book2("자바 프로그래밍", "이재환");
		Book2 book2 = new Book2("HTML", "이재환");
		Book2 book3 = new Book2("HTML", "이재환");
		System.out.println(book1.equals(book2));
		System.out.println(book1 == book2);
		System.out.println(book2.equals(book3));
		System.out.println(book2 == book3);
	}

}
