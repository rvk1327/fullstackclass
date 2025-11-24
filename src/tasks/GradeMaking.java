package tasks;

public class GradeMaking {

	public static void main(String[] str) {
		
		double tamil = 95.74 , english = 76.23 , maths = 91.74 , science = 85.36 , social = 77.15;
		
		double average = (tamil + english + maths + science + social) / 5;
		
		System.out.println("Average : " + average);
		
		if((average >= 97) && (average <= 100)) {
			
			System.out.println("Grade : A+");
		
		}else if((average >= 93) && (average <= 96)) {
			
			System.out.println("Grade : A");
		
		} else if((average >= 90) && (average <= 92)) {
			
			System.out.println("Grade : A-");
		
		} else if((average >= 87) && (average <= 89)) {
			
			System.out.println("Grade : B+");
		
		} else if((average >= 83) && (average <= 86)) {
			
			System.out.println("Grade : B");
		
		} else if((average >= 80) && (average <= 83)) {
			
			System.out.println("Grade : B-");
		
		} else if((average >= 77) && (average <= 79)) {
			
			System.out.println("Grade : C+");
		
		} else if((average >= 73) && (average <= 76)) {
			
			System.out.println("Grade : C");
		
		} else if((average >= 70) && (average <= 72)) {
			
			System.out.println("Grade : C-");
		
		} else if (average < 70) {
			
			System.out.println("Grade : F");
		}
		
		//get grade for student
	}
}
