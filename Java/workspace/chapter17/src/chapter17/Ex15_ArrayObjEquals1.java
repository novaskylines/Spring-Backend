package chapter17;

import java.util.Arrays;

class INum1{
	private int num;
	public INum1(int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((INum1)obj).num ) {
			return true;
		}else {
			return false;
		}
	}
}

public class Ex15_ArrayObjEquals1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INum1[] arr1 = new INum1[2];
		INum1[] arr2 = new INum1[2];
//		arr1 = {1,2}
//		arr2 = {1,2}
		arr1[0] = new INum1(1);
		arr2[0] = new INum1(1);
		
		arr1[1] = new INum1(2);
		arr2[1] = new INum1(2);
		
		System.out.println(Arrays.equals(arr1, arr2));
	}

}







