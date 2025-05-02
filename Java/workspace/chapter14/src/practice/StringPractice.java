package practice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1
		// 주민등록번호의 연월일을 각각 변수에 저장
		String str1 = "250417-1234567";
		String year = "20"+str1.substring(0,2);
		String month = str1.substring(2,4);
		String day = str1.substring(4,6);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		// 문제 2
		// a/b/c/d를 a:b:c:d로 변환
		String str2 = "a/b/c/d";
		str2 = str2.replace("/", ":");
		System.out.println(str2);

	}

}
