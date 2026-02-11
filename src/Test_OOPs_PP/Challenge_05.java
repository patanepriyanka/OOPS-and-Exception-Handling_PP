package Test_OOPs_PP;

public class Challenge_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.makeSound();
		cat.makeSound();
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
		System.out.println("Dog says: Woof! Woof!");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Cat says: Meow! Meow!");
	}
}
