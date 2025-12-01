package chapter1;

public class BinarySearchDemo {

	public static void main(String[] str) {
		
		int[] x = {5,7,12,13,15,17,21,25};
		
		int target = 17;
		
		int start = 0;
		
		int end = x.length-1;
		
		
		while(start < end) {
			
			int mid = (start +  end)/2;
			
			if(x[mid] == target) {
				
				System.out.println("Element Found");
				
				return;
			
			}else if (x[mid] < target) {
				
				//Right side
				
				start = mid;
			
			}else if(x[mid] > target) {
				
				//left side
				
				end = mid;
			}
			
		}
		
	}
}
