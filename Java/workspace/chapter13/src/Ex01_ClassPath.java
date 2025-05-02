import com.study.Banana;
// https://docs.oracle.com/en/java/javase/11/docs/api/index.html 등 사아트에서 버전에 맞는 라이브러리 찾을 수 있음

public class Ex01_ClassPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 같은 패키지에 있는 클래스는 어렵지 않게 쓸 수 있음
		Apple apple = new Apple();
		apple.showName();
		
		// 다른 패키지에 있는 클래스를 불러오는 방법
		// 패키지명을 클래스 앞에 직접 적는 방식
		com.study.Banana banana = new com.study.Banana();
		banana.showName();
		
		// class 선언부 위에 import를 사용하여 패키지명을 적는 방식
		Banana banana2 = new Banana();
		banana2.showName();
		

	}

}
