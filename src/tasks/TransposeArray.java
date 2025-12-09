package tasks;

public class TransposeArray {

	public static void main(String[] str) {
		
		int[][] in = 	{
							{10,20,30},
							{40,50,60},
							{70,80,90}
						};
		
		System.out.println("Original Array...");
		
		for(int i=0; i<in.length; i++) {
			
			for(int j=0; j<in[i].length; j++) {
				
				System.out.print(in[i][j]+"\t");
			}
			
			System.out.println();
			
		}
		
		System.out.println("Transpose Array ...");
			
		//create new array for storing resultant array
		int[][] out = new int[in.length][in[0].length];
		
		for(int i=0; i<in.length; i++) {
			
			for(int j=0; j<in[i].length; j++) {
				
				out[j][i] = in[i][j];
			}
		}
		
		
		//Print result array
		
		for(int i=0; i<out.length; i++) {
			
			for(int j=0; j<out[i].length; j++) {
				
				System.out.print(out[i][j]+ "\t");
			}
			
			System.out.println();
		}
 			
			
		
	}
}
