package chapter2;

public class MultiLevelInheritance {

	public static void main(String[] str) {
		
		MultiC mc = new MultiC();
		mc.display1();
		mc.display2();
		mc.display3();
		
		MultiB mb = new MultiB();
		mb.display1();
		mb.display2();
		
		MultiA ma = new MultiA();
		ma.display1();
	}
}

//class MultiLevelInheritance end

class MultiA {
	
	public void display1() {
		
		System.out.println("Class Multi-A");
	}
}

//class MultiA end

class MultiB extends MultiA {
	
	public void display2() {
		
		System.out.println("Class Multi-B");
	}
}

//class MultiB end

class MultiC extends MultiB {
	
	public void display3() {
		
		System.out.println("Class Multi-C");
	}
}

//class MultiC end
