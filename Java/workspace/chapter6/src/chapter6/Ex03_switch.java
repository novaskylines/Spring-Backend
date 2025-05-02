package chapter6;

public class Ex03_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		switch(n%3) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println(0);
			break;
		}
		
		String str = "banana";
//		banana, apple, mango, melon / potato, carrot
		switch(str) {
		case "banana":
			System.out.println("fruit");
			break;
		case "apple":
			System.out.println("fruit");
			break;
		case "mango":
			System.out.println("fruit");
			break;
		case "melon":
			System.out.println("fruit");
			break;
		case "potato":
			System.out.println("vegetable");
			break;
		case "carrot":
			System.out.println("vegetable");
			break;
		}
		
//		134581012: 31 46911: 30 2:28
		
		int month = 10;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:     
			System.out.println(31);
			break;
		case 2: 
			System.out.println(28);
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println(30);
			break;
		}

	}

}
