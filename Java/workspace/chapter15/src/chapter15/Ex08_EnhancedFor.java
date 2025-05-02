package chapter15;

public class Ex08_EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		// 자료형 변수이름: 배열 -> For
		for(int e:arr) {
			System.out.print(e+" ");
		}
		System.out.println();
		int sum = 0;
		for(int e:arr) {
			sum += e;
			System.out.print(sum+" ");
		}
		System.out.println();
	}

}
