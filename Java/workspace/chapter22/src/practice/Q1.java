package practice;

@FunctionalInterface
interface Cal {
	public int calc (int x);
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal c1 = x -> {
			int sum = 0;
			for(int i=0; i<=100; i+=x) {
				sum += i;
			}
			System.out.println(sum);
			return sum;
		};
		
		c1.calc(3);
		
		Cal c2 = x -> {
			System.out.println(x*5);
			return x*5;
		};
		
		c2.calc(12);
		
		Cal c3 = x -> {
			System.out.println(x*x-3*x+7);
			return x*x-3*x+7;
		};
		
		c3.calc(10);
		
		Cal c4 = x -> {
			if(x=='A' || x=='B') {
				System.out.println("Excellent");
			} else if(x=='C' || x=='D') {
				System.out.println("Good");
			} else if (x=='F') {
				System.out.println("Bye");
			}
			return 0;
		};
		
		c4.calc('A');

	}

}
