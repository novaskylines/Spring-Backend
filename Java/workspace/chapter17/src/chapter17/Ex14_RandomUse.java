package chapter17;

import java.util.Random;

public class Ex14_RandomUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1 = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(rand1.nextInt(10) + " ");
		}
		System.out.println();

		// 발표 등 특정 상태를 재현해야 할 때 시드를 사용하면 좋음
		Random rand2 = new Random(22);
		for (int i = 0; i < 10; i++) {
			System.out.print(rand2.nextInt(10)+ " ");
		}
		System.out.println();

	}

}
