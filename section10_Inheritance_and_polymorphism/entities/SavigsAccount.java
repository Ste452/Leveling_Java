package section13_Inheritance_and_polymorphism.entities;

public final class SavigsAccount extends Account {

    private Double interestRate;

    public SavigsAccount() {
	super();
    }

    public SavigsAccount(Integer number, String holder, Double balance, Double interestRate) {
	super(number, holder, balance);
	this.interestRate = interestRate;
    }

    public Double getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(Double interestRate) {
	this.interestRate = interestRate;
    }

    public void updateBalance() {
	balance += balance * interestRate;
    }
     
    @Override
    public void withdraw(double amount) {
	balance -= amount;
    }

}
