package tasks;

public class MovingAllZeroestToEnd {

	public static void main(String[] str) {
		
		int[] x = {95,84,0,75,0,95,70,80,0,94,0};
		
		int[] y = new int[x.length];
		
		int pos = 0;
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i] != 0) {
				
				y[pos] = x[i];
				
				pos++;
			}
		}
		
		//Print result
		for(int i=0; i<y.length; i++) {
			
			System.out.println(y[i]);
		}
	}
}
