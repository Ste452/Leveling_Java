package section6_Constructors_this_word_overloading_encapsulation.exercise_module6_Constructors_and_word_this.entities;

public class methods_Banking_Account {
	private String holder;
	private int number;
	private double balance;
	
	public methods_Banking_Account(int number, String holder) {
		super();
		this.holder = holder;
		this.number = number;
	}
	
	public methods_Banking_Account(int number, String holder, double initialDeposity) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposity);
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
	    return "Account: " 
	           + number
	           +", Holder: "  
	           + holder 
	           +", Balance: $ " 
	           + String.format("%.2f%n", balance);
	}
}
