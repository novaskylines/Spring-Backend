package chapter9;
class Book {
	String title;
	int price;
	int num=0;
	// 생성자를 따로 작성한다면 디폴트 생성자는 만들어지지 않음
	Book() {
		this.title = "자바 프로그래밍";
		this.price = 30000;
	}
	// 생성자 자동완성: source 탭의 Generate Constructor using fields... 
	public Book(String title, int price, int num) {
		// 상위 클래스 실행
		// super();
		this.title = title;
		this.price = price;
		this.num = num;
	}
	// 생성자 오버로딩
	Book(String t, int p) {
		this.title = t;
		this.price = p;
	}
	void print() {
		System.out.println("제목: "+title);
		System.out.println("가격: "+price);
		System.out.println("주문수량: "+num);
		System.out.println("합계금액: "+price*num);
	}
}
public class ConstructorUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new연산자를 이용해 실행하는 메서드를 생성자
		// 인스턴스를 생성할때 기본적으로 실행되어야 하는 코드를 작성하는 부분
		Book book1 = new Book();
		book1.print();
		
		Book book2 = new Book("자바 디자인패턴", 35000);
		book2.num=10;
		book2.print();
		
		Book book3 = new Book("HTML,CSS,JavaScript",2500,5);
		book3.print();

	}

}
