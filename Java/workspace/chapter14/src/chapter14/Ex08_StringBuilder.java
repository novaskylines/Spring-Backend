package chapter14;

public class Ex08_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String의 단점
		// 객체를 저장하는 클래스 자료형, String의 내용을 바꿀 때마다 객체를 생성해 비효율적임 -> 연산속도 늦어짐
		// StringBuilder는 이 문제를 해결
		StringBuilder buf = new StringBuilder("동해물과");
		
		
		// append
		buf.append("백두산이");
		System.out.println(buf.toString());
		buf.append(12345);
		System.out.println(buf.toString());
		
		// delete
		buf.delete(0, 4); // -동해물과
		System.out.println(buf.toString());
		
		// replace
		buf.replace(4, 8, "ABC"); // 1234 -> ABC
		System.out.println(buf.toString());
		// reverse
		buf.reverse();
		System.out.println(buf.toString());
		
		// 1970년 1월 1일부터 현재까지의 시간을 ms로
		long startTime = System.currentTimeMillis();
		String str = "";
		for(int i=0; i<100000; i++) {
			str+="apple";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("연산시간: "+(endTime-startTime));
		
		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("");
		for(int i=0; i<100000; i++) {
			str2.append("apple");
		}
		endTime = System.currentTimeMillis();
		System.out.println("연산시간: "+(endTime-startTime));
		
		// StringBuilder & StringBuffer
		// 두개의 클래스가 실행하는 내용은 같으나 스레드 사용시 StringBuilder는 깨져서 나옴
		// 대신 StringBuilder는 스레드 동기화를 하지 않기 때문에 더 빠름
		
		
		

	}

}
