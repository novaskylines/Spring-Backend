package chapter17;

public class Ex10_BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer iObj = Integer.valueOf(10);
		Double dObj = Double.valueOf(10.0);
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		
		System.out.println(num1+" "+iObj);
		System.out.println(num2+" "+dObj);
		System.out.println();
		
		

	}

}
