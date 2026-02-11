package Test_OOPs_PP;

public class Challenge_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a class "Outer" with an inner class "Inner". Access the inner class from the outer class and demonstrate their interaction.
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		outer.display();
		inner.display();
		
	}

}

class Outer {
	int x = 10;
	void display() {
		System.out.println("Outer class variable x: " + this.x);
	}

	class Inner {
		void display() {
			System.out.println("Inner class accessing outer variable " + x);
		}
	}
}
