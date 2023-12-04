package exercise_module6_Constructors_and_word_this.main.src;

import java.util.Locale;
import java.util.Scanner;

import exercise_module6_Constructors_and_word_this.entities.methods_Banking_Account;

public class register_Banking_Account {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner (System.in);
	    methods_Banking_Account account;
	    
	    System.out.print("Enter account number: ");
	    int number = sc.nextInt();
	    
	    System.out.print("Enter account holder: ");
	    sc.nextLine();
	    String holder = sc.nextLine();
	    
	    System.out.print("Is there na initial deposit (y/n)? ");
	    char response = sc.next().charAt(0);
	    
	    if (response == 'y') {
	    	System.out.print("Enter initial deposit value: ");
	    	double initialDeposit = sc.nextDouble();
	    	account = new methods_Banking_Account(number, holder, initialDeposit);
	    } else {
	    	account = new  methods_Banking_Account(number, holder);
	    }
	    
	    System.out.println();
	    System.out.println("Account data:");
	    System.out.println(account);
	    
	    System.out.print("Enter a deposit value: ");
	    double depositvalue = sc.nextDouble();
	    account.deposit(depositvalue);
	    System.out.println();
	    System.out.println("Updated account data: ");
	    System.out.println();
	    System.out.println(account);
	    
	    System.out.println();
	    System.out.println("Account data:");
	    System.out.println(account);
	    
	    System.out.print("Enter a withdraw value: ");
	    double withdrawValue = sc.nextDouble();
	    account.withdraw(withdrawValue);
	    System.out.println();
	    System.out.println("Updated account data: ");
	    System.out.println(account);
	    
	    sc.close();
	}

}
