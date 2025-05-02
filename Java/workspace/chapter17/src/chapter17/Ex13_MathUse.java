package chapter17;

public class Ex13_MathUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("4의 제곱근: "+Math.sqrt(4));
		System.out.println("log2(8): "+baseLog(8,2));
		System.out.println("2의 3제곱: "+Math.pow(2, 3));
		
		System.out.println("원주율: "+Math.PI);
		System.out.println("원주율에 대한 각도: "+Math.toDegrees(Math.PI));
		System.out.println("2원주율에 대한 각도: "+Math.toDegrees(Math.PI));
		System.out.println();
		
		double radian45 = Math.toRadians(45);
		System.out.println("Sin45: "+Math.sin(radian45));
		System.out.println("Cos45: "+Math.cos(radian45));
		System.out.println("Tan45: "+Math.tan(radian45));
		

	}
	
	public static double baseLog(double a, double b) {
		return Math.log(a)/Math.log(b);
	}

}
