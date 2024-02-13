package section13_Interfaces.exercise_module_13.model.entities;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
}