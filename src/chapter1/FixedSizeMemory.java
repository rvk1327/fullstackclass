package chapter1;

public class FixedSizeMemory {

	public static void main(String[] str) {
		
		int[] x = new int[3];
		
		x[1] = 10;
		
		x[2] = 30;
		
		//Functionalities of an array
		
		//Length of an Array
		
		int lenx = x.length;
		
		System.out.println("Length of an Array : " + lenx);
		
		//Accessing every elements (Traversing an array)
		
		for(int index=0; index < lenx; index++) {
			
			System.out.println(x[index]);
		}
		
	}
}
