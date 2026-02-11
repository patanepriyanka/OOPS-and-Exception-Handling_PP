package Test_OOPs_PP;

public class Challenge_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
		Person p1 = new Person("John", 25);
		Person p2 = new Person("Alice", 30);
		p1.displayDetails();
		p2.displayDetails();

}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayDetails() {
		System.out.println("Name: " + name + " Age: " + age);
			}
}
