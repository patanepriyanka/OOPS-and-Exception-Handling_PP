package Test_OOPs_PP;

public class Challenge_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.start();
		v2.start();
	}

}

class Vehicle {
	void start() {
		System.out.println("Vehicle starts");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car starts with a key");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Bike starts with a kick");
	}
}