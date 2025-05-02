package chapter21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex19_CollectionsSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		
		// 정렬하고 검색하자
		Collections.sort(list);
		
		int idx1 = Collections.binarySearch(list, "홍길동");
		System.out.println(idx1);
		
		int idx2 = Collections.binarySearch(list, "멀린");
		System.out.println(idx2);
		
		// 특정 데이터를 검색을 해야하는 상황이면 Map이 좋음
		Map<String,Integer> map = new HashMap<>();
		map.put("홍길동",1);
		map.put("전우치",2);
		map.put("손오공",3);
		
	}

}
