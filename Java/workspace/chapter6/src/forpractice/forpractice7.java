package forpractice;

public class forpractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i+j>=5
						&&i+j<=11
						&&i-j<=3
						&&j-i<=3) {
					System.out.print("*");					
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
