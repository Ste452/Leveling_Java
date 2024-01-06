package section10_Inheritance_and_polymorphism;

import section10_Inheritance_and_polymorphism.entities.Account;
import section10_Inheritance_and_polymorphism.entities.BusinessAccount;
import section10_Inheritance_and_polymorphism.entities.SavigsAccount;

public class class_40 {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Steve", 0.0);
		acc.withdraw(100.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		acc1.withdraw(40.00);
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavigsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.00);

		// BusinessAccount acc5 = (BusinessAccount) acc3;

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavigsAccount) {
			SavigsAccount acc5 = (SavigsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
