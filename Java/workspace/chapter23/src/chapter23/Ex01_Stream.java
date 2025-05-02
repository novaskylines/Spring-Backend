package chapter23;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		IntStream stm1 = Arrays.stream(arr);
		// filter(매개변수->조건식): 조건식에서 true만 나오는 데이터만 스트림에 저장
		IntStream stm2 = stm1.filter(n->n%2==1);
		int sum= stm2.sum();
		System.out.println(sum);
		
		// 파이프라인: .을 이용해 메서드의 실행을 계속해서 하는 방식
		int sum2 = Arrays.stream(arr).filter(n->n%2==1).sum();
		System.out.println(sum2);
		

	}

}
