package chapter1;

public class MultiDimetionalArray {

	public static void main(String[] str) {
		
		int[][] x = new int[4][2];
		
		x[0][0] = 10;
		x[0][1] = 20;
		
		x[1][0] = 30;
		x[1][1] = 40;
		
		x[2][0] = 50;
		x[2][1] = 60;
		
		x[3][0] = 70;
		x[3][1] = 80;
		
		
		int lenx = x.length;
		System.out.println(lenx);
		
		int leny = x[2].length;
		System.out.println(leny);
		
		System.out.println(x[3][1]);
		
		//Iterate for accessing all elements
		for(int row=0; row<x.length; row++) {
			
			for(int col=0; col < x[row].length; col++) {
				
				System.out.print(x[row][col] +"\t");
			}
			
			System.out.println();
		}
		
		
	}
}











