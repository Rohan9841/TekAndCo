package collections;

import java.util.HashSet;
import java.util.Set;

public class Collections4 {

	String name;
	int age;

	public Collections4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int prime = 17;
		int result = 2;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Collections4)) {
			return false;
		}

		Collections4 c4 = (Collections4) o;
		return c4.hashCode() == this.hashCode();
	}
	
	public static void main(String[] args) {
		
		Set<Collections4> aSet = new HashSet<>();
		aSet.add(new Collections4("Alex",14));
		aSet.add(new Collections4("Ralph",23));
		aSet.add(new Collections4("Brandon",22));
		
		for(Collections4 c : aSet) {
			if(c.equals(new Collections4("Brandon",22))) {
				System.out.println(c.getName()+" "+c.getAge());
			}
		}
		
		
	}
}
