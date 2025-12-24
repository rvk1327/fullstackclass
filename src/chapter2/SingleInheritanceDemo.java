package chapter2;

public class SingleInheritanceDemo {

	public static void main(String[] str) {
		
		SingleB sb = new SingleB();
		sb.displayClassName(); //this function comes from class Single-A
		System.out.println(sb.class_name);
		
		sb.displayTopics(); //this function belongs to class Single B
		System.out.println(sb.topics);
		
		SingleA sa = new SingleA();
		sa.displayClassName();
		
		SingleB.calculation(100, 200); //static function also be inherited
	}
}

//class SingleInheritanceDemo end

class SingleA {
	
	//class Variable
	String class_name  = "Full Stack Java Class";
	
	public SingleA() {
		System.out.println("This is Constructor from Class Single-A");
	}
	
	//Class Member / Functions
	public void displayClassName() {
		
		System.out.println("Class Name : " + class_name);
	}
	
	//static function
	public static void calculation(int x, int y) {
		System.out.println(x+y);
	}
}

//class SingleA end


class SingleB extends SingleA{
	
	String topics = "Inheritance";
	
	public SingleB() {
		System.out.println("This is constructor from class Single-B");
	}
	
	public void displayTopics() {
		
		System.out.println("Topics : " + topics);
	}
}


//class SingleB end





