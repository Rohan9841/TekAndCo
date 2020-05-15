package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections3 {

	public static void main(String[] args) {

		List<State> aList = new ArrayList<>();

		aList.add(new State("Louisiana", 71209));
		aList.add(new State("NewYork", 10001));
		aList.add(new State("Miami", 33101));

		Collections.sort(aList);
		
		for(State state : aList) {
			System.out.println(state.name + " "+state.zip);
		}
	}

	public static class State implements Comparable<State> {

		String name;
		int zip;

		public State(String name, int zip) {
			this.name = name;
			this.zip = zip;
		}

		@Override
		public int compareTo(State state) {
			// TODO Auto-generated method stub
			if (zip == state.zip)
				return 0;
			else if (zip > state.zip)
				return 1;
			else
				return -1;
		}

	}
}
