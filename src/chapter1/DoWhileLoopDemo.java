package chapter1;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] str) {
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "";
		
		do {
			
			System.out.println("Enter Roll No : ");
			
			String rollno = sc.nextLine();
			
			System.out.println("Roll No : " + rollno);
			
			System.out.println("Enter Choice : ");
			
			choice = sc.nextLine();
		
		}while(choice.equals("y"));
	}
}
