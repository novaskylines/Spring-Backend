package chapter5;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// println: 문자열 출력 후 엔터를 쳐주는 메서드
		System.out.println("String I'd love to print");
		System.out.println("Second row");
		// print: 문자열을 출력하고 엔터를 치지 않음
		System.out.print("안녕하세요. ");
		System.out.print("오늘은 4월 10일입니다. ");
		
		String name = "홍길동";
		int age = 20;
		double height = 175.5;
		// 더하기 연산자를 이용한 변수 출력
		// 보기도, 작성하기도 조금 힘들지만 가독성 면에서 매우 큰 강점을 가지는 방식.
		System.out.println(name+"의 나이는 "+age+"이고, 키는 "+height+"입니다.");
		
		// printf: 포맷을 이용한 변수 출력
		System.out.printf("%s의 나이는 %d이고, 키는 %.1f입니다.", name, age, height);

	}

}
