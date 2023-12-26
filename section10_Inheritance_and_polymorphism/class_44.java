package section10_Inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import section10_Inheritance_and_polymorphism.entities.Account;
import section10_Inheritance_and_polymorphism.entities.BusinessAccount;
import section10_Inheritance_and_polymorphism.entities.SavignsAccount;

public class class_44 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();
        
        list.add(new SavignsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Bob", 1000.0, 0.01));
        list.add(new SavignsAccount(1004, "Maria", 300.0, 0.01)); 
        list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
        
        double sum = 0;
        
        for (Account acc : list) {
        	sum += acc.getBalance();
        }
        
        System.out.printf("TOTAL BALANCE: %.2f%n", sum);
        
        for (Account acc : list) {
        	acc.deposit(10.0);
        }
        
        for (Account acc : list) {
        	System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
	}

}
