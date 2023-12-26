package section10_Inheritance_and_polymorphism;

import section10_Inheritance_and_polymorphism.entities.Account;

public class class_41 {

    public static void main(String[] args) {

	Account acc1 = new Account(1001, "Alex", 1000.0);
	acc1.withdraw(200.0);
	System.out.println(acc1.getBalance());
	
	
	Account acc2 = new Account(1002, "Maria", 0.01);
	acc2.withdraw(200.0);
	System.out.println(acc2.getBalance());
	
	Account acc3 = new Account(1003, "Bob", 500.0);
	acc3.withdraw(200.0);
	System.out.println(acc3.getBalance());
    }

}
