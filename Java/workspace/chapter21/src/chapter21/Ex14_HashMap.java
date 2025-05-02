package chapter21;

import java.util.HashMap;

class Student5 {
	int studno;
	String name;
	String id;
	int grade;
}

public class Ex14_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map은 키와 value값을 가진 자료구조
		// key: value를 꺼내기 위해 하는 id, Primary Key 값을 쓰는 경우가 많음
		// HashMap<key, value> name = new HashMap<>();
		HashMap<String, String> map = new HashMap<>();
		// 데이터 추가 메서드
		map.put("홍길동", "010-1234-1443");
		map.put("전우치", "010-4321-1446");
		map.put("손오공", "010-9876-1443");
		
		System.out.println(map.get("홍길동"));
		System.out.println(map.get("전우치"));
		System.out.println(map.get("손오공"));
		
		// .remove(key);로 삭제 
		map.remove("손오공");
		// 삭제된 데이터는 null을 반환
		System.out.println("손오공: "+map.get("손오공"));
		
		// value가 여러개일 경우 value를 하나의 객체로 모아서 만듦
		// PK를 기준으로 검색하는 속도를 Map을 사용하면 훨씬 빠르게 검색 가능
		// 데이터의 추가/삭제가 빠르다
		HashMap<Integer, Student5> studMap = new HashMap<>();

	}

}
