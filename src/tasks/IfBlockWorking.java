package tasks;

public class IfBlockWorking {

	public static void main(String[] str) {
		
		int x = 101;
		
		if( ( (x >= 10) &&  (x <= 100) ) || (x > 50) ) { // true && false = false || true = true
			
			System.out.println("True block");
	
		}else {
			
			System.out.println("False block");
		}
		
	}
}
