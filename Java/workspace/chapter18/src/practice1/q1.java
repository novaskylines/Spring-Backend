package practice1;

class Mypoint {
	int a;
	int b;
	Mypoint(int a, int b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Mypoint("+a+","+b+")";		
	}
}

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint a = new Mypoint(3,20);
		System.out.println(a);
	}

}
