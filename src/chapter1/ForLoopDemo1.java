package chapter1;

public class ForLoopDemo1 {

	public static void main(String[] str) {	
		
		
		for(int x = 1; x <= 10; x++) {
			
			System.out.println(x);
		}
		
		for(int x = 15; x <= 20; x++) {
			
			System.out.println(x);
		}
		
		//Method #1
		
		for(int i=1; i<=20; i++) {
			
			if(i%2 == 0) {
				
				System.out.println(i);
			}
		}
		
		//Method #2
		
		for(int i=20; i <= 40; i = i+3) {
			
			System.out.println(i);
		}
		
		//Decrement
		
		for(int x = 50; x >= 40; x--) {
			
			System.out.println(x);
		}
		
		//Character
		for(char c='A'; c<='Z'; c++) {
			
			System.out.println(c);
		}		
		
	}
}


