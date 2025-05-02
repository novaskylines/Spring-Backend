package chapter18;

interface Unit5{
	// Deprecated 메서드는 컴파일 시 알림이 옴
	/**
	 * 언젠가는 삭제될 메서드 입니다.
	 * 대신 run 메서드를 사용해 주세요.
	 * @param str
	 */
	@Deprecated
	public void move(String str);
	public void run(String str);
	public int test(String str);
}
class Human5 implements Unit5{
	@Override
	@SuppressWarnings("deprecation")
	public void move(String str) {
		System.out.println(str);
	}
	@Override
	public void run(String str) {
		System.out.println(str);
	}
	/**
	 * 매개변수인 str을 Integer타입으로 반환하는 메서드 입니다.
	 * @param str
	 * @return str을 Integer로 변경하여 반환
	 * @author 임혜동
	 * @see 참고자료
	 * @throws inputMismatchException
	 * @exception inputMismatchException
	 */
	@Override
	public int test(String str_ ) {
		return Integer.parseInt(str_);
	}
}


public class Ex05_Deprecated {
	
	// suppresswarnings: 경고 억제
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit5 unit = new Human5();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 이동합니다.");
		int num1 = unit.test("5");
		System.out.println(num1);
	}

}








