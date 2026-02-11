package Test_OOPs_PP;

public class Challenge_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to demonstrate method overriding by creating parent and child classes with the same method signature.
		C1 parent = new C1();
		C2 child = new C2();
		parent.display();
		child.display();
		
	}

}

class C1 {
	void display() {
		System.out.println("Parent class display method.");
	}
}

class C2 extends C1 {
	@Override
	void display() {
		System.out.println("Child class display method.");
	}
}

class C3 extends C1 {
	@Override
	void display() {
		System.out.println("This is another child class method, also overriding the parent method.");
	}
}