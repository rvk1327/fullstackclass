package chapter2;

public class NormalFunctionOverloading {

	public static void main(String[] str) {
		
		Company c = new Company();
		c.display("laptop", 50000.00);
		c.display("Pendrive",800.00, "S-1");
		c.display(10, 40000.00);
	}
}

//class Normal Function overloading end

class Company {
	
	public void display(String prod_name , double price) {
		
		System.out.println("Product Name : " + prod_name);
		System.out.println("Price : " + price);
	}
	
	public void display(String sales_prod_name, double total_price, String sales_id) {
		
		System.out.println("Sales ID : " + sales_id);
		System.out.println("Sales Product Name : " + sales_prod_name);
		System.out.println("Total Price : " + total_price);
	}
	
	public void display(int qty , double price) {
		
	}
	
	public void display(double price , String prod_name) {
		
	}
	
	
}
