package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections3 {

	public static void main(String[] args) {

		//---------------------Comparator----------------------------------------------
		
		List<Integer> aList = new ArrayList<>();

		aList.add(71209);
		aList.add(10001);
		aList.add(3310);
		aList.add(12);
		
		//lambda expression can implement functional interfaces
		Comparator<Integer> com = (n1,n2)->{
			return n1%10 > n2%10 ? 1 : -1;
		};
			
		//sorts the list based on the last digit
		Collections.sort(aList,com);
		
		for(int i : aList) {
			System.out.println(i);
		}
		
		//---------------------------Comparable-----------------------------------
		
		List<State> sList = new ArrayList<>();
		
		sList.add(new State("NY",123456));
		sList.add(new State("LA",123455));
		sList.add(new State("BV",123459));
		sList.add(new State("DC",123451));
		
		Collections.sort(sList);
		
		for(State s : sList) {
			System.out.println(s);
		}
	}

}

class State implements Comparable<State> {

	String name;
	int zip;

	public State(String name, int zip) {
		this.name = name;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", zip=" + zip + "]";
	}

	@Override
	public int compareTo(State s) {
		return zip<s.zip?1:-1;
	}
	
}
