package practice;

import java.util.Arrays;
import java.util.List;

class Customer {
	String name;
	int age;
	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(-3,-1,0,2,5,-10,7);
		numbers.stream()
		.filter(n -> n>0)
		.sorted()
		.forEach(n -> System.out.print(n+"\t"));
		// methodReference: 원하는 메서드를 적으면 자동으로 매개변수를 작성해주는 방식
		// 간단한 내용에 대해서만 사용 가능
		// forEach(System.out::print) = forEach(n->System.out.print(n))
		// Math::abs = n->Math.abs(n)
		// String::toUpperCase = s->str.toUpperCase()
		// User::new = c->new User(c)
		// String[]::new = size->new String[size]
		System.out.println();
		
		List<String> strings = Arrays.asList("Java", "HTML", "CSS", "JavaScript");
		strings.stream()
		.forEach(n -> System.out.print(n.length()+"\t"));
		System.out.println();
		
		String sentence = "The quick Brown Fox";
		
		Arrays.stream(sentence.split(" "))
		.forEach(n -> System.out.print(n.length()+"\t"));
		System.out.println();
		
		List<Customer> customers = Arrays.asList(
			    new Customer("alice", 22),
			    new Customer("bob", 17),
			    new Customer("charlie", 25),
			    new Customer("david", 19),
			    new Customer("eve", 30)
		);
		
		customers.stream()
		.filter(a -> a.age>=20)
		.sorted((a1, a2) -> {return a1.name.compareTo(a2.name);})
		.map(a -> a.name.toUpperCase())
		.forEach(n -> System.out.print(n+"\t"));

	}

}
