package chapter2;

public class StaticFunctionDemo {

	public static void main(String[] str) {   //StaticFunctionDemo.main()
		
		StaticFunction sf = new StaticFunction();
		
		sf.display1(); //Normal function called using an object
		
		StaticFunction.display2(); //Static function called using a class
		
		sf.display2(); //Static function called using an object
		
	}
}

//class StaticFunctionDemo end

class StaticFunction {
	
	//Normal function
	public void display1() {
		
		//static String name = "abc";  //this is not acceptable
		
		System.out.println("This is normal function");
	}
	
	//Static Function
	public static void display2() {
		
		System.out.println("This is static function");
	}
}