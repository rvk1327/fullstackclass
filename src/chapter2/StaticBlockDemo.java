package chapter2;

public class StaticBlockDemo {
	
	static int x = 500;

	public static void main(String[] str) {
		
		System.out.println("Welcome " + x);
	}
	
	static {
		
		System.out.println("Java" + x);
	}
	
	static {
		
		System.out.println("hello");
	}
	
}
