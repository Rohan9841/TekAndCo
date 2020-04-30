package collections;

public class Collections1 {
	
	public static void main(String[] args) {
		
		Object[] objArray = new Object[5];
		
		objArray[0] = "Rohan";
		objArray[1] = 2;
		objArray[2] = 1.999999;
		objArray[3] = true;
		objArray[4] = new StringBuilder().append("Hello");
		
		for(Object obj : objArray) {
			System.out.println(obj);
		}
	}
}
