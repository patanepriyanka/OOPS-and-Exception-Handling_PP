package Test_OOPs_PP;

public class Challenge_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
		Employee e1 = new Employee(1, "John Doe", 50000.0);
		System.out.println("Employee ID: " + e1.getId() + " Employee Name: " + e1.getName() + " Employee Salary: " + e1.getSalary());
	}

}

class Employee {
	private int id;
	private String name;
	private double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
