package chapter20;

class MyData {
	public static <T> T showData (T data) {
		if (data instanceof String) {
			System.out.println("String");
		} else if (data instanceof Integer) {
			System.out.println("Integer");
		} else if (data instanceof Double)
			System.out.println("Double");
		return data;
	}
}

public class Ex09_GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <T> 생략 가능; 입력되는 값의 형을 기반으로 형을 파악하거나 추론
		MyData.<String>showData("Hellow World");
		MyData.showData(1);
		MyData.showData(1.0);
	}

}
