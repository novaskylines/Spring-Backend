package chapter14;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex09_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringTokenizer(문자열): 공백을 기준으로 분리(공백 생략)
		StringTokenizer st1 = new StringTokenizer("a b c");
		// hasMoreTokens: 다음 토큰이 있는지 확인하고 있으면 true, 없으면 false 반환
		while (st1.hasMoreTokens()) {
			// nextToken: 다음 토큰을 반환
			System.out.println(st1.nextToken());
		}
		// StringTokenizer(문자열, 구분문자): 구분문자를 기준으로 분리(구분문자 생략)
		// StringTokenizer(문자열, 구분문자): 구분문자도 함께 분리(구분문자 포함)
		
		// iterator 클래스: has 메서드로 확인하고 next 메서드로 데이터를 꺼냄
		// 예) StringTokenizer는 hasMoreTokens로 확인하고 nextTokens로 출력하는 iterator 클래스
		
		// split() : StringTokenizer처럼 문자열을 분리. String 객체 안에 존재하는 자체 메서드라는게 특징
		String str = "010-1234-5678";
		// split 결과를 String[] 타입으로 저장
		String[] parts = str.split("-");
		System.out.println(Arrays.toString(parts));
		for(int i=0; i<parts.length; i++) {
			System.out.println(parts[i]);
		}
		

	}

}
