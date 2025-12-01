package chapter1;

public class LinearSearchDemo {

	public static void main(String[] str) {
		
		int[] x = {5,7,12,13,15,17,21,25};
		
		int target = 19;
		
		for(int i=0; i<x.length; i++) {  // i < 8
			
			if(x[i]== target) {
				
				System.out.println("Element Found with  " + i + " position");
				
				return;
			}
		}
	}
}
