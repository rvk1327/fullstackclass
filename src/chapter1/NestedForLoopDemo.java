package chapter1;

public class NestedForLoopDemo {

	public static void main(String[] str) {
		
		for(int x=1; x<=5; x++) { //outer loop
			
			for(int y=1; y<=5; y++) { //inner loop
				
				System.out.print(y);
			}
			
			System.out.println();
		}
	}
}
