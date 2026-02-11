package Test_OOPs_PP;

public class Challenge_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to demonstrate method overloading by creating multiple "add" methods with different parameters.
		Calculator calc = new Calculator();
		System.out.println("Integer Addition: " + calc.add(2, 6));
		System.out.println("Double addition: " + calc.add(2.4, 3.8));
		System.out.println("Three integers addition: " + calc.add(1, 2, 3));
		
	}

}

class Calculator {
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}
