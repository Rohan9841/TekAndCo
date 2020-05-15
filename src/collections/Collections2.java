package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections2 {

	public static void main(String[] args) {
		
		System.out.println("------------------------ArrayList--------------------------");
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.set(2,"Mango");
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------------------LinkedList---------------------------");
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		
		for(String fruit: linkedList) {
			System.out.println(fruit);
		}
		
		System.out.println("-----------------------TreeSet---------------------------");
		
		Set<String> treeSet =  new TreeSet<>();
		treeSet.add("USA");
		treeSet.add("China");
		treeSet.add("Rome");
		treeSet.add("China");
		
		Iterator<String> treeSetIterator =  treeSet.iterator();
		
		while(treeSetIterator.hasNext()) {
			System.out.println(treeSetIterator.next());
		}
		
		System.out.println("-------------------------LinkedHashSet-------------------------");
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("USA");
		linkedHashSet.add("China");
		linkedHashSet.add("Rome");
		linkedHashSet.add("China");
		
		for(String country: linkedHashSet) {
			System.out.println(country);
		}
		
		System.out.println("---------------------HashSet-----------------------------");
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("USA");
		hashSet.add("China");
		hashSet.add("Rome");
		hashSet.add("China");
		
		for(String country: hashSet) {
			System.out.println(country);
		}
		
		System.out.println("---------------------TreeMap-----------------------------");
		
		Map<Integer,String> treeMap = new TreeMap<>();
		treeMap.put(35, "AZ");
		treeMap.put(49, "LA");
		treeMap.put(1, "NJ");
		
		for(Map.Entry<Integer,String> map : treeMap.entrySet()) {
			System.out.println(map.getKey()+ " "+  map.getValue());
		}
		
		System.out.println("-------------------LinkedHashMap-------------------------------");
		
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(35, "AZ");
		linkedHashMap.put(49, "LA");
		linkedHashMap.put(1, "NJ");
		
		for(Map.Entry<Integer,String> map : linkedHashMap.entrySet()) {
			System.out.println(map.getKey()+ " "+ map.getValue());
		}
		
		System.out.println("-------------------HashMap-------------------------------");
		
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(35, "AZ");
		hashMap.put(49, "LA");
		hashMap.put(1, "NJ");
		
		for(Map.Entry<Integer,String> map : hashMap.entrySet()) {
			System.out.println(map.getKey()+" "+ map.getValue());
		}
		
		
		
	}
}
