package chapter6;

public class StringSwitchAndIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		switch(name) {
		case "홍길동":
			System.out.println("제 이름은 홍길동 입니다.");
			break;
		case "전우치":
			System.out.println("제 이름은 전우치 입니다.");
			break;
		case "손오공":
			System.out.println("제 이름은 손오공 입니다.");
			break;
		default:
			System.out.println("같은 이름이 없습니다.");
			break;
		}
		// if문의 경우 문자열 비교시 ==를 사용해 비교할 수 없음. 대신에 메모리 주소 사용
		String name2 = "홍길동"; // name1과 같은 값 지정공간에 저장됨
		String name3 = new String("홍길동"); //new를 사용함으로서 1와 2과는 다른 곳에 값이 저장됨
		System.out.println(name == name2); // true, 상황에 따라 false도 가능
		System.out.println(name == name3); // 메모리 주소가 다르기 때문에 false
		// equals을 이용한 비교 
		System.out.println(name2.equals(name3));
//		equals() : String의 경우 클래스 자료형이 때문에 equals로 비교해야 결과 정상적으로 출력됨
		System.out.println(name2.equals(name3)); // true
		if(name2.equals(name3)) {
			System.out.println("name2와 name3은 같습니다.");
		}

//기초자료형 : byte,short,int,long,float,double,boolean,char 는 == 으로 비교
//클래스자료형 : Byte,Short,Integer,Long,Float,Double,Boolean,Character는 equals로 비교
	}

}
