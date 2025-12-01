package tasks;

public class ShapeY {	
		
		public static void main(String[] args)
		{
			for(int x=1; x<=6; x++)
			{
			 for(int y=1; y<=6; y++)
			 {
				 if((x==6) || (y==1) || (y==6)) {
					 
					 System.out.print(" * ");
				 
				 }else {
					 
					 System.out.print("   ");
				 }
			 }
			 System.out.println(" ");
			}
			
			
			for(int x=1; x<=6; x++)
			{
			 for(int y=1; y<=6; y++)
			 {
				 if((x==6) ||(y==6)) {
					 
					 System.out.print(" * ");
				 
				 }else {
					 
					 System.out.print("   ");
				 }
			 }
			 System.out.println(" ");
			}
		}
	}
