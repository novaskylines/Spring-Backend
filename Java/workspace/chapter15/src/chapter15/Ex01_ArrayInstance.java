package chapter15;

public class Ex01_ArrayInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 배열: 자료형이 동일한 데이터가 같은 변수이름으로 저장되는 자료구조
		// 배열의 선언: 자료형[] 변수이름 = new 자료형[배열의 길이];
		int[] intArr = new int[3]; // int 값을 3개 저장할 수 있는 배열 선언
		double[] doubleArr = new double[3]; // double 값을 3개 저장할 수 있는 배열 선언
		String[] strArr = new String[3]; // String 값을 3개 저장할 수 있는 배열
		
		// length: 배열의 길이 출력, 데이터의 개수가 아님
		System.out.println(intArr.length);
		System.out.println(doubleArr.length);
		System.out.println(strArr.length);
		
		// 배열에 데이터 저장: 배열이름[위치] = 값;
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		
		// 배열의 데이터 출력: 배열이름[위치]
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
//		System.out.println(intArr[3]); // 배열에서 벗어나는 데이터는 에러 발생
		System.out.println(doubleArr[0]); // int는 기본적으로 0, double은 0.0 저장
		System.out.println(doubleArr[1]);
		System.out.println(doubleArr[2]);
		System.out.println(strArr[0]); // str는 기본적으로 null 저장
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		
		// 배열의 선언과 데이터의 저장을 동시에
		int[] intArr2 = {90,50,70,30};
		String[] strArr2 = {"국어","영어","수학","과학"};
		System.out.println(intArr2[0]);
		System.out.println(intArr2[1]);
		System.out.println(strArr2[0]);
		System.out.println(strArr2[1]);
		

	}

}
