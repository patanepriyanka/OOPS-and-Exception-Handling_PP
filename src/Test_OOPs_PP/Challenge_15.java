package Test_OOPs_PP;

public class Challenge_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.
		int age;
		try {
			age = 15; // Example age
			if (age < 18) {
				throw new InvalidAgeException("Age must be at least 18. Provided age: " + age);
			} else {
				System.out.println("Valid age: " + age);
			}
		} catch (InvalidAgeException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
		
		
	}
}
	
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}