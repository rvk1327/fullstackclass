package tasks;

public class TwoSumProblem {

	public static void main(String[] str) {
		
		int[] x = {5,8,7,3,9,10};
		
		int target = 12;
		
		for(int i=0; i<x.length; i++) {
			
			for(int j=i+1; j<x.length; j++) {
				
				if(target == x[i]+x[j]) {
					
					System.out.println("(" + x[i] + "," + x[j] + ")");
				}
			}
		}
	}
}
