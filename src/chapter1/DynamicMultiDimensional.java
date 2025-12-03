package chapter1;

public class DynamicMultiDimensional {

	public static void main(String[] str) {
		
		int[][] y = {
						{100,200,300,400},
						{500,600,700},
						{800,900,1000,1100}
					};
		
		
		for(int row=0; row<y.length; row++) {
			
			for(int col=0; col < y[row].length; col++) {
				
				System.out.print(y[row][col] +"\t");
			}
			
			System.out.println();
		}
		
	}
}
