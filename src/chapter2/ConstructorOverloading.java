package chapter2;

public class ConstructorOverloading {

	public static void main(String[] str) {
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(2021);
	}
}

//class ConstructorOverloading end

class Vehicle {
	
	public Vehicle() {
		
		System.out.println("This is default constructor");
	}
	
	public Vehicle(int model) {
		
		System.out.println("Model " + model);
	}
}
