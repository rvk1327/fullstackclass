package chapter2;

public class ConstructorDemo {

	public static void main(String[] str) {
		
		Car c = new Car();
		
		c.specification();
		
		//Features of constructor
		
		//Feature #1: Call constructor without creating an object
		
		new Car();
		
		//Feature #2 : Call normal function using constructor
		
		new Car().specification();
		
		//Feature #3 : Dynamic function creation
		
		new Car() {
			
			public void additionSpecification() {
				
				System.out.println("Model : 2024");
				System.out.println("Gear Type : Manual");
			}
		
		}.additionSpecification();
		
		
		Motor m = new Motor("1500CC",2021);
		
		new Motor("1200CC",2022);
	}
}

//class ConstructorDemo end

class Car {
	
	public Car() {
		
		System.out.println("Car Name : Honda City");
	}
	
	public void specification() {
		
		System.out.println("Fuel Type : Petrol");
		System.out.println("Fuel Capacity : 45L");
	}
}

//class Car end

class Motor {

	public Motor(String motor_name, int year) {
		
		System.out.println(motor_name);
		System.out.println(year);
	}
	
}







