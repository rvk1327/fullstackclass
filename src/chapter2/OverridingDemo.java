package chapter2;

public class OverridingDemo {

	public static void main(String[] str) {
		
		Over2 ovr = new Over2();
		ovr.display();
		System.out.println(ovr.x);
	}
}

//class OverridingDemo end

class Over1 {
	
	int x = 100;
	
	public void display() {
		
		System.out.println("This is class Over-1");
	}	

}

//class Over1 end

class Over2 extends Over1 {
	
	int x = 500;
	
	public void display() {
		
		System.out.println("This is class Over-2");
	}
}

//class Over2 end
