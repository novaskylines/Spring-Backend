package chapter21;

import java.util.LinkedList;
import java.util.Queue;

public class Ex12_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que= new LinkedList<>();
		
		// .offer(); -> add
		que.offer("A");
		que.offer("B");
		que.offer("C");
		// .size()
		System.out.println(que.size());
		// .peek()
		System.out.println(que.peek());
		// .poll() 출력, 데이터 사이즈가 줄어듬
		System.out.println(que.poll());
		System.out.println(que.size());
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que.size());
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que.size());

	}

}
