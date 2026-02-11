package Test_OOPs_PP;

public class Challenge_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		car.start();
		bike.start();
	}

}

class Vehicle {
	void start() {
		System.out.println("Vehicle is starting...");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car engine starts with a roar!");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Bike engine starts with a purr!");
	}
}
