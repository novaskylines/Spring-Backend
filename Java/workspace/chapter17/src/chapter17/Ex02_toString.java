package chapter17;

class Book {

	String name;
	String author;
	
	void Book(String name, String author) {
		this.name=name;
		this.author=author;
	}

	// Override로 toString() 메서드가 메모리주소 대신에 name을 리턴하도록 설정
	@Override
	public String toString() {
		return this.name+", "+this.author;
	}

}

public class Ex02_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.lang: 기본 클래스들이 들어있는 패키지 이름
		// Object: 최상위 클래스로 기본 메서드를 제공
		Ex02_toString ex02 = new Ex02_toString();
		// 메서드 없이 출력하려고 하면 기본적으로 toString 메서드를 사용한 것과 같이 출력
		// toString 메서드를 오버라이딩하여 내용을 변경하지 않으면 아래의 내용이 출력
		// 패키지명.클래스명@16진수 메모리주소
		System.out.println(ex02.toString());
		Object obj = new Object();
		// Object는 모든 클래스가 상속받고 있으며 직접 만든 클래스의 경우에도 컴파일 시 상속을 추가
		// Object에 있는 모든 메서드는 어떤 클래스든 사용이 가능

		Book book1 = new Book();
		book1.name = "자바 프로그래밍";
		book1.author = "홍길동";
		System.out.println(book1.toString());
		System.out.println(book1);

	}

}
