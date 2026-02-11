package Test_OOPs_PP;

public class Challenge_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods with proper validation.
		BankAccount account = new BankAccount();
		account.deposit(1500.0);
		account.withdraw(200.0);
		System.out.println("Current Balance: " + account.getBalance());
	}

}

class BankAccount {
	private double balance;

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}

	public double getBalance() {
		return balance;
	}
}

