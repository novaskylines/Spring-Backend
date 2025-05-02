package practice;

import java.util.Arrays;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		System.out.println(numbers.stream()
				.reduce(0, (n1,n2) -> n1+n2));
		
		String[] strArr = {"Java", "Stream", "API"};
		System.out.println(Arrays.stream(strArr)
				.reduce("", (s1,s2) -> s1+s2));
		
		List<Integer> numList = Arrays.asList(5,10,15);
		System.out.println(numList.stream()
				.reduce(1, (n1,n2) -> n1*n2));

	}

}
