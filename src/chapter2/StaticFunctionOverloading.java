package chapter2;

public class StaticFunctionOverloading {

	public static void main(String[] str) {
		
		Laptop.show("Lenova Thinkpad");
		Laptop.show(75000.00);
	}
}

//class StaticFunctionOverloading end

class Laptop {
	
	public static void show(String laptop_name) {
		
		System.out.println("Laptop Name : " + laptop_name);
	}
	
	public static void show(double price) {
		
		System.out.println("Price : " + price);
	}
}
