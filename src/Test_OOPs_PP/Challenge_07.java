package Test_OOPs_PP;

public class Challenge_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
		Emp emp1 = new Emp("Alice", 30000.0);
		Manager mgr1 = new Manager("Manager", 60000.0, 10000.0);
		Developer dev1 = new Developer("Developer", 7000.0, 1000.0);
		System.out.println("Manager Salary: " + mgr1.calculateSalary());
		System.out.println("Developer Salary: " + dev1.calculateSalary());
	}

}

class Emp {
	String name;
	double baseSalary;

	Emp(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}

	double calculateSalary() {
		return baseSalary;
	}
}

class Manager extends Emp {
	double bonus;

	Manager(String name, double baseSalary, double bonus) {
		super(name, baseSalary);
		this.bonus = bonus;
	}

	@Override
	double calculateSalary() {
		return baseSalary + bonus;
	}
}

class Developer extends Emp {
	double projectAllowance;

	Developer(String name, double baseSalary, double projectAllowance) {
		super(name, baseSalary);
		this.projectAllowance = projectAllowance;
	}

	@Override
	double calculateSalary() {
		return baseSalary + projectAllowance;
	}
}