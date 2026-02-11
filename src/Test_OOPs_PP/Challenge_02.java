package Test_OOPs_PP;

public class Challenge_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.
		Student s1 = new Student("Bob", 101, "A");
		s1.displayStudent();
	}

}

class Student {
	String name;
	int rollNo;
	String section;

	Student(String name, int rollNo, String section) {
		this.name = name;
		this.rollNo = rollNo;
		this.section = section;
	}

	void displayStudent() {
		System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Section: " + section);
		
	}
}
