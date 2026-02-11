package Test_OOPs_PP;

public class Challenge_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implement exception handling for a program that divides two numbers and catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: Cannot divide by zero");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: Invalid number format");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
		}
	}

}
