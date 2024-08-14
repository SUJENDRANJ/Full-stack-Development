package SUJE;
//5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals 
//if the account balance falls below one hundred.

class BankAccount1 {
	void deposit(int amt) {
		System.out.print("Amount deposited Rs."+amt);
	}
	void withdraw(int amt) {
		System.out.println("Ammount Withdrawn Rs." +amt);
	}
}

class SavingsAccount extends BankAccount1{
	void withdraw(int amt) {
		if(amt>99) {
			System.out.println("Ammount Withdrawn Rs." +amt);
		}
		else {
			System.out.println("Failed to Withdraw Rs." +amt);
		}
	}
}

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount obj = new SavingsAccount();
		
		obj.deposit(10000);
		System.out.println();
		obj.withdraw(56);
	}

}
