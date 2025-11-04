package chapter1;

public class ControlStructures {

	public static void main(String[] str) {
		
		int x = 100, y = 300;
		
		//IF Statement
		
		if (x > 50) { // 10 > 50 : false
			
			System.out.println("X is greater than 50");
		}
		
		//IF ELSE Statement
		
		if (x > y) { // 300 > 300 : false
			
			System.out.println("X is greater than Y");
		
		}else {
			
			System.out.println("Y is greater than X");
		}
		
		
		// ELSE IF Ladder
		
		if (x > y) {
			
			System.out.println("X is greater than Y");
		
		}else if(y > x) {
			
			System.out.println("Y is greater than X");
		
		}else {
			
			System.out.println("Both values are equal");
		}
		
		//Switch statement
		
		char z = 'R';
		
		switch(z) {
		
		case 't':
			
			System.out.println("Triangle");
			break;
			
		case 'r':
			
			System.out.println("Rectangle");
			break;
			
		case 's':
			
			System.out.println("Square");
			break;
			
		default: //optional
			
			System.out.println("Invalid Input");
			break;
			
		}
		
		
		
	}
}
