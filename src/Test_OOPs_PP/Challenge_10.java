package Test_OOPs_PP;

public class Challenge_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create interfaces "Flyable" and "Swimmable" with appropriate methods. Implement both in a "Duck" class.
		Duck duck = new Duck();
		duck.fly();
		duck.swim();
	}

}

class Duck implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("Duck is flying in the sky!");
	}

	@Override
	public void swim() {
		System.out.println("Duck is swimming in the water!");
	}
}
