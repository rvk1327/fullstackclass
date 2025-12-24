package chapter2;

public class PolymorphismDemo {

	public static void main(String[] str) {
		
		Poly2 p2 = new Poly2();
		p2.display(100, 200);
		p2.display(45.00);
	}
}

//class PolymorphismDemo end

class Poly1 {
	
	public void display(int x , int y) {
		System.out.println(x+y);
	}
}

//class Poly1 end

class Poly2 extends Poly1 {
	
	public void display(double x) {
		System.out.println(x+50);
	}
}

//class Poly2 end
