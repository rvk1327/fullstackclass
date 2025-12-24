package chapter2;

public class HierarchyInheritanceDemo {

	public static void main(String[] str) {
	
		LastBench1 l1 = new LastBench1();
		l1.prepareNotes();
		l1.studyAndTare();
		
		LastBench2 l2 = new LastBench2();
		l2.prepareNotes();
		l2.studyAndTare();
	}
}

//class HierarchyInheritanceDemo end

class ClassTopper {
	
	public void prepareNotes() {
		
		System.out.println("Subject Name : JAVA");
		System.out.println("Chapters : 10");
	}
}

//class ClassTopper end

class LastBench1 extends ClassTopper {
	
	public void studyAndTare() {
		
		System.out.println("Not Finish all chapters only first 2 chapters");
	}
}

//class LastBench1 end

class LastBench2 extends ClassTopper {
	
	public void studyAndTare() {
		
		System.out.println("Not Finish all chapters only enjoying the day");
	}
}

//class LastBench2 end
