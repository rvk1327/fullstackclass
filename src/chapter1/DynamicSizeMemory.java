package chapter1;

public class DynamicSizeMemory {

	public static void main(String[] str) {
		
		int[] y = {10,20,30,40,50,60};
		
		int leny = y.length;
		
		System.out.println("Length of Y : " + leny);
		
		for(int i=0; i<leny; i++) {
			
			System.out.println(y[i]);
		}
		
		System.out.println(y[2]);
	}
}
