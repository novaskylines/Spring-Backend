package forpractice;

public class forpractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i>=0;i--) {
			for(int j=1;j<=7;j++) {
				if(j<=i||j>7-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
