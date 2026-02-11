package Test_OOPs_PP;

public class Challenge_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
		Animal d1 = new Dog();
		Animal c1 = new Cat();
		d1.makeSound();
		c1.makeSound();
	}

}

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}
