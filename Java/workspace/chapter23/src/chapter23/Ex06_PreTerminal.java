package chapter23;

import java.util.stream.IntStream;

public class Ex06_PreTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = IntStream.of(1,2,5,7,9).sum();
		long count = IntStream.of(1,2,5,7,9).count();
		
		System.out.println("sum = "+sum);
		System.out.println("count = "+count);
		
		IntStream.of(1,2,5,7,9)
		.max()
		.ifPresent(max-> System.out.println("max = "+max));
		
		IntStream.of(1,2,5,7,9)
		.min()
		.ifPresent(min-> System.out.println("min = "+min));

	}

}
