package section13_Interfaces.exercise_module_13.model.services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dueDate;
	private Double amount;

	public Installment(Date date, Double amount) {
		this.dueDate = date;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
 	}
}