package chapter2;

public class ClassesAndObjects {

	public static void main(String[] str) {
		
		Hello h1 = new Hello();
		
		Hello h2 = null;
		
		//h2.calc1();
		
		h2 = new Hello();
		
		Hello h3 = new Hello();
		
		Hello h4 = h3;
		
		//Accessing elements from class Hello
		h1.calc1(); // 300
		h1.calc2(); // 600
		
		int x_val = h1.x;
		int y_val = h1.y;
		
		System.out.println(x_val);
		System.out.println(y_val);
		
		//h1.Hello();
		//h1.display(100, null);
	}
}

//class ClassesAndObjects end

class Hello {
	
	//Hello h = new Hello();
	
	//Class variable / global variable
	int x = 100 , y = 200;
	
	//Function definitions
	public void calc1() {
		
		System.out.println(x+y);
	}	
	
	/*int d;
	Thread t1; */
	
	public void calc2() {
		
		int z = 300; //local variable
		System.out.println(x+y+z);
		//h.calc1();
		/*int xc = 300;
		Thread t = new Thread();
		d = 500;
		t1 = new Thread(); */
	}
	
	public void display(int x1, Thread t1) {
		t1.checkAccess();
	}
	
}

//class Hello end