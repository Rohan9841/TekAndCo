package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Collections5 {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("Apple");
		aList.add("Banana");
		aList.add("Mango");
		
		System.out.println("--------------------Simple Foreach-------------------------");
		
		aList.forEach(fruit -> {
			System.out.println(fruit);
		});
		
		System.out.println("-------------------Stream+map+collect--------------------------");
		
		List<String> list2 = aList.stream()
								.map(x->x+x)
								.collect(Collectors.toList());
		
		list2.forEach(s->System.out.println(s));
		
		System.out.println("-------------------Stream+filter+foreach--------------------------");
		
		aList.stream()
			.filter(s->s.startsWith("A"))
			.forEach(x->System.out.println(x));
		
		System.out.println("-------------------Stream+sorted+forEach--------------------------");
		
		aList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(x->System.out.println(x));
		
		}
}
