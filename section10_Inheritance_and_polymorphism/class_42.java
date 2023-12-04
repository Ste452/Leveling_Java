package section13_Inheritance_and_polymorphism;
import section13_Inheritance_and_polymorphism.entities.Account;
import section13_Inheritance_and_polymorphism.entities.SavigsAccount;

public class class_42 {

	public static void main(String[] args) {

		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavigsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
