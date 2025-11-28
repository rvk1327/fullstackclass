package tasks;

public class Pattern4 {

	public static void main(String[] gowtham) {
	
		for(int x=1; x<=4; x++) {
			
			for(int y=1; y<=4; y++) {
				
				if((x==1) || (x==4) || (y==1) || (y==4)) {
					
					System.out.print(" * ");
				
				}else {
					
					System.out.print("   ");
				}
			}
			
			System.out.println();
		}
	}
}
