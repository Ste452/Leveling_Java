package section13_Interfaces.exercise_module_13.model.entities;

import java.util.Calendar;
import java.util.Date;

import section13_Interfaces.exercise_module_13.model.services.Contract;
import section13_Interfaces.exercise_module_13.model.services.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota =  updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            contract.addInstallment(new Installment(date, fullQuota));
        }
	}

	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}