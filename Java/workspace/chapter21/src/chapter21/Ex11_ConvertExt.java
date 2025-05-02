package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex11_ConvertExt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 초기값을 가질 수 있지만 크기가 고정된 배열
		List<String> fixedSizeList = Arrays.asList("홍길동", "전우치", "전우치", "손오공");
		
		// 크기를 조정할 수 있는 배열
		ArrayList<String> list = new ArrayList<>(fixedSizeList);
		
		for(String s: list) {
			System.out.print(s.toString()+"\t");
		}
		System.out.println();
		
		// HashSet로 바꾸면서 자연스럽게 모든 중복 요소를 삭제
		HashSet<String> set = new HashSet<>(list);
		// 그 후 다시 ArrayList로 변환
		list = new ArrayList<>(set);
		
		for(String s : list) {
			System.out.print(s.toString()+"\t");
		}
		System.out.println();
		

	}

}
