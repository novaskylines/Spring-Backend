package chapter15;

class BoxA4 {
	public String name;
	public int age;

	BoxA4(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Ex04_BoxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 클래스명[] 이름 = new 클래스명[크기]
		// Box Array는 기본값이 Null
		BoxA4[] ar = new BoxA4[4];
		// 데이터 저장시 반드시 new를 사용
		ar[0] = new BoxA4("홍길동", 20);
		ar[1] = new BoxA4("전우치", 25);
		ar[2] = new BoxA4("손오공", 30);
		// new를 쓰지 않았을 경우 객체가 생성되지 않아 null.name, null.age를 생성하지 못함
//		ar[3].name = "이순신";
//		ar[3].age = 35;

		System.out.println(ar[0].name + ", " + ar[0].age);
		System.out.println(ar[1].name + ", " + ar[1].age);
		System.out.println(ar[2].name + ", " + ar[2].age);
//		System.out.println(ar[3].name + ", " + ar[3].age);

	}

}
